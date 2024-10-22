#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def testEspacio(self):
        t = cgi_decode("+")
        self.assertEqual(" ", t)

    def test1(self):
        t = cgi_decode("%01")
        self.assertEqual("\x01", t)

    def test2(self):
        self.assertRaises(ValueError, cgi_decode, "%GG")

    def test3(self):
        self.assertRaises(ValueError, cgi_decode, "%1G")

    def test4(self):
        t = cgi_decode("Hello World")
        self.assertEqual("Hello World", t)

