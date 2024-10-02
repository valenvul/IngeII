package org.autotest.generated;
import org.autotest.MutationAnalysisRunner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() { return false; }

    public static boolean debug = false;

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2201");
        org.autotest.Stack stackAr0 = createStack();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.Stack stackAr10 = createStack();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr5.isFull();
        java.lang.Object obj14 = stackAr5.pop();
        stackAr0.push((java.lang.Object) stackAr5);
        org.autotest.Stack stackAr17 = createStack((int) '4');
        stackAr17.push((java.lang.Object) (-1L));
        stackAr0.push((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr22 = createStack((int) 'a');
        boolean boolean24 = stackAr22.equals((java.lang.Object) (-1.0f));
        boolean boolean26 = stackAr22.equals((java.lang.Object) "");
        org.autotest.Stack stackAr27 = createStack();
        boolean boolean28 = stackAr27.isFull();
        stackAr22.push((java.lang.Object) stackAr27);
        org.autotest.Stack stackAr31 = createStack((int) 'a');
        boolean boolean32 = stackAr31.isFull();
        boolean boolean33 = stackAr31.isEmpty();
        int int34 = stackAr31.size();
        boolean boolean35 = stackAr27.equals((java.lang.Object) int34);
        org.autotest.Stack stackAr37 = createStack((int) 'a');
        boolean boolean39 = stackAr37.equals((java.lang.Object) (-1.0f));
        boolean boolean41 = stackAr37.equals((java.lang.Object) "");
        org.autotest.Stack stackAr42 = createStack();
        boolean boolean43 = stackAr42.isFull();
        stackAr37.push((java.lang.Object) stackAr42);
        java.lang.Class<?> wildcardClass45 = stackAr37.getClass();
        boolean boolean46 = stackAr27.equals((java.lang.Object) stackAr37);
        java.lang.String str47 = stackAr27.toString();
        boolean boolean48 = stackAr27.isEmpty();
        stackAr0.push((java.lang.Object) boolean48);
        int int50 = stackAr0.size();
        java.lang.Class<?> wildcardClass51 = stackAr0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2202");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean6 = stackAr3.isFull();
        boolean boolean8 = stackAr3.equals((java.lang.Object) "hi!");
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        org.autotest.Stack stackAr12 = createStack();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        stackAr10.push((java.lang.Object) boolean15);
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean19 = stackAr18.isFull();
        boolean boolean20 = stackAr10.equals((java.lang.Object) boolean19);
        java.lang.String str21 = stackAr10.toString();
        java.lang.Object obj22 = stackAr10.top();
        boolean boolean23 = stackAr3.equals((java.lang.Object) stackAr10);
        boolean boolean24 = stackAr3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[false]" + "'", str21, "[false]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2203");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr5 = createStack((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        boolean boolean14 = stackAr0.isFull();
        java.lang.String str15 = stackAr0.toString();
        int int16 = stackAr0.size();
        org.autotest.Stack stackAr18 = createStack((int) '4');
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isEmpty();
        stackAr18.push((java.lang.Object) "[[],true]");
        stackAr0.push((java.lang.Object) "[[],true]");
        java.lang.Object obj25 = stackAr0.top();
        org.autotest.Stack stackAr27 = createStack((int) (short) 0);
        int int28 = stackAr27.size();
        boolean boolean29 = stackAr0.equals((java.lang.Object) int28);
        java.lang.Object obj30 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "[[],true]" + "'", obj25, "[[],true]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "[[],true]" + "'", obj30, "[[],true]");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2204");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr3 = createStack();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        int int8 = stackAr1.size();
        java.lang.Object obj9 = null;
        stackAr1.push(obj9);
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2205");
        org.autotest.Stack stackAr1 = createStack((int) (byte) 0);
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2206");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.Object obj16 = stackAr3.top();
        java.lang.Object obj17 = null;
        stackAr3.push(obj17);
        java.lang.Object obj19 = stackAr3.top();
        org.autotest.Stack stackAr21 = createStack((int) '4');
        java.lang.String str22 = stackAr21.toString();
        java.lang.String str23 = stackAr21.toString();
        org.autotest.Stack stackAr24 = createStack();
        boolean boolean25 = stackAr24.isFull();
        boolean boolean27 = stackAr24.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr29 = createStack((int) '4');
        boolean boolean30 = stackAr24.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr32 = createStack((int) 'a');
        boolean boolean34 = stackAr32.equals((java.lang.Object) (-1.0f));
        boolean boolean36 = stackAr32.equals((java.lang.Object) "");
        boolean boolean37 = stackAr24.equals((java.lang.Object) "");
        boolean boolean38 = stackAr24.isFull();
        boolean boolean39 = stackAr21.equals((java.lang.Object) stackAr24);
        java.lang.Object obj40 = null;
        stackAr24.push(obj40);
        java.lang.Object obj42 = stackAr24.top();
        boolean boolean43 = stackAr24.isEmpty();
        boolean boolean44 = stackAr24.isEmpty();
        int int45 = stackAr24.size();
        boolean boolean46 = stackAr24.isEmpty();
        stackAr3.push((java.lang.Object) stackAr24);
        int int48 = stackAr3.size();
        java.lang.Object obj49 = stackAr3.pop();
        java.lang.Object obj50 = stackAr3.top();
        boolean boolean51 = stackAr3.isFull();
        boolean boolean52 = stackAr3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[null]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2207");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) -1);
        int int10 = stackAr0.size();
        org.autotest.Stack stackAr12 = createStack((int) '4');
        org.autotest.Stack stackAr14 = createStack((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr12.equals((java.lang.Object) stackAr14);
        java.lang.String str17 = stackAr14.toString();
        stackAr0.push((java.lang.Object) str17);
        org.autotest.Stack stackAr20 = createStack((int) 'a');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (-1.0f));
        boolean boolean24 = stackAr20.equals((java.lang.Object) "");
        org.autotest.Stack stackAr25 = createStack();
        boolean boolean26 = stackAr25.isFull();
        stackAr20.push((java.lang.Object) stackAr25);
        org.autotest.Stack stackAr29 = createStack((int) '4');
        org.autotest.Stack stackAr31 = createStack((int) '4');
        java.lang.String str32 = stackAr31.toString();
        boolean boolean33 = stackAr29.equals((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr34 = createStack();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        java.lang.String str38 = stackAr34.toString();
        boolean boolean40 = stackAr34.equals((java.lang.Object) 10L);
        java.lang.String str41 = stackAr34.toString();
        stackAr31.push((java.lang.Object) stackAr34);
        stackAr20.push((java.lang.Object) stackAr34);
        org.autotest.Stack stackAr45 = createStack((int) (short) 0);
        boolean boolean46 = stackAr45.isEmpty();
        boolean boolean47 = stackAr45.isFull();
        org.autotest.Stack stackAr49 = createStack((int) '4');
        org.autotest.Stack stackAr51 = createStack((int) '4');
        java.lang.String str52 = stackAr51.toString();
        boolean boolean53 = stackAr49.equals((java.lang.Object) stackAr51);
        org.autotest.Stack stackAr55 = createStack((int) '4');
        stackAr55.push((java.lang.Object) (-1L));
        java.lang.Object obj58 = stackAr55.pop();
        stackAr49.push((java.lang.Object) stackAr55);
        boolean boolean60 = stackAr45.equals((java.lang.Object) stackAr49);
        stackAr34.push((java.lang.Object) stackAr49);
        boolean boolean62 = stackAr34.isEmpty();
        java.lang.Object obj63 = stackAr34.pop();
        java.lang.String str64 = stackAr34.toString();
        int int65 = stackAr34.size();
        stackAr0.push((java.lang.Object) int65);
        java.lang.String str67 = stackAr0.toString();
        int int68 = stackAr0.size();
        org.autotest.Stack stackAr69 = createStack();
        boolean boolean70 = stackAr69.isFull();
        boolean boolean72 = stackAr69.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr74 = createStack((int) '4');
        boolean boolean75 = stackAr69.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr77 = createStack((int) 'a');
        boolean boolean79 = stackAr77.equals((java.lang.Object) (-1.0f));
        boolean boolean81 = stackAr77.equals((java.lang.Object) "");
        boolean boolean82 = stackAr69.equals((java.lang.Object) "");
        boolean boolean83 = stackAr69.isFull();
        boolean boolean84 = stackAr69.isFull();
        int int85 = stackAr69.size();
        boolean boolean86 = stackAr69.isFull();
        stackAr0.push((java.lang.Object) stackAr69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = stackAr69.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "[[]]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[[],0]" + "'", str67, "[[],0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2208");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr9 = createStack((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.Object obj23 = stackAr4.top();
        org.autotest.Stack stackAr24 = createStack();
        stackAr24.push((java.lang.Object) 0.0f);
        stackAr24.push((java.lang.Object) true);
        stackAr4.push((java.lang.Object) stackAr24);
        boolean boolean30 = stackAr4.isEmpty();
        java.lang.Object obj31 = stackAr4.pop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[0.0,true]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[0.0,true]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[0.0,true]");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2209");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.Object obj16 = stackAr3.top();
        java.lang.Object obj17 = null;
        stackAr3.push(obj17);
        java.lang.Object obj19 = stackAr3.top();
        java.lang.String str20 = stackAr3.toString();
        java.lang.String str21 = stackAr3.toString();
        java.lang.Object obj22 = stackAr3.top();
        boolean boolean23 = stackAr3.isFull();
        java.lang.String str24 = stackAr3.toString();
        int int25 = stackAr3.size();
        java.lang.Object obj26 = stackAr3.top();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[[],null]" + "'", str20, "[[],null]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[[],null]" + "'", str21, "[[],null]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[[],null]" + "'", str24, "[[],null]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2210");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) 0);
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        org.autotest.Stack stackAr16 = createStack();
        boolean boolean17 = stackAr16.isFull();
        stackAr11.push((java.lang.Object) stackAr16);
        org.autotest.Stack stackAr20 = createStack((int) '4');
        org.autotest.Stack stackAr22 = createStack((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr20.equals((java.lang.Object) stackAr22);
        org.autotest.Stack stackAr25 = createStack();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean28 = stackAr25.equals((java.lang.Object) (byte) -1);
        java.lang.String str29 = stackAr25.toString();
        boolean boolean31 = stackAr25.equals((java.lang.Object) 10L);
        java.lang.String str32 = stackAr25.toString();
        stackAr22.push((java.lang.Object) stackAr25);
        stackAr11.push((java.lang.Object) stackAr25);
        boolean boolean35 = stackAr11.isEmpty();
        boolean boolean36 = stackAr0.equals((java.lang.Object) stackAr11);
        int int37 = stackAr0.size();
        java.lang.Class<?> wildcardClass38 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2211");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr10.isEmpty();
        int int13 = stackAr10.size();
        boolean boolean14 = stackAr6.equals((java.lang.Object) int13);
        int int15 = stackAr6.size();
        java.lang.Object obj16 = null;
        stackAr6.push(obj16);
        java.lang.Object obj18 = stackAr6.top();
        boolean boolean19 = stackAr6.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2212");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean6 = stackAr3.isFull();
        boolean boolean8 = stackAr3.equals((java.lang.Object) "hi!");
        org.autotest.Stack stackAr10 = createStack((int) 'a');
        boolean boolean11 = stackAr10.isFull();
        org.autotest.Stack stackAr12 = createStack();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        stackAr10.push((java.lang.Object) boolean15);
        org.autotest.Stack stackAr18 = createStack((int) 'a');
        boolean boolean19 = stackAr18.isFull();
        boolean boolean20 = stackAr10.equals((java.lang.Object) boolean19);
        java.lang.String str21 = stackAr10.toString();
        java.lang.Object obj22 = stackAr10.top();
        boolean boolean23 = stackAr3.equals((java.lang.Object) stackAr10);
        java.lang.Object obj24 = stackAr10.pop();
        boolean boolean25 = stackAr10.isFull();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[false]" + "'", str21, "[false]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2213");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        int int2 = stackAr1.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = stackAr1.equals(obj3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2214");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean2 = stackAr0.equals((java.lang.Object) 1.0f);
        org.autotest.Stack stackAr4 = createStack((int) '4');
        int int5 = stackAr4.size();
        int int6 = stackAr4.size();
        java.lang.String str7 = stackAr4.toString();
        boolean boolean8 = stackAr0.equals((java.lang.Object) str7);
        java.lang.String str9 = stackAr0.toString();
        org.autotest.Stack stackAr11 = createStack((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        org.autotest.Stack stackAr16 = createStack();
        boolean boolean17 = stackAr16.isFull();
        stackAr11.push((java.lang.Object) stackAr16);
        org.autotest.Stack stackAr20 = createStack((int) '4');
        org.autotest.Stack stackAr22 = createStack((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr20.equals((java.lang.Object) stackAr22);
        org.autotest.Stack stackAr25 = createStack();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean28 = stackAr25.equals((java.lang.Object) (byte) -1);
        java.lang.String str29 = stackAr25.toString();
        boolean boolean31 = stackAr25.equals((java.lang.Object) 10L);
        java.lang.String str32 = stackAr25.toString();
        stackAr22.push((java.lang.Object) stackAr25);
        stackAr11.push((java.lang.Object) stackAr25);
        boolean boolean35 = stackAr11.isEmpty();
        java.lang.Object obj36 = stackAr11.top();
        org.autotest.Stack stackAr38 = createStack((int) 'a');
        boolean boolean39 = stackAr38.isFull();
        boolean boolean40 = stackAr38.isEmpty();
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (-1.0f));
        boolean boolean46 = stackAr42.equals((java.lang.Object) "");
        org.autotest.Stack stackAr47 = createStack();
        boolean boolean48 = stackAr47.isFull();
        stackAr42.push((java.lang.Object) stackAr47);
        java.lang.String str50 = stackAr42.toString();
        boolean boolean51 = stackAr38.equals((java.lang.Object) stackAr42);
        boolean boolean52 = stackAr11.equals((java.lang.Object) stackAr38);
        int int53 = stackAr38.size();
        stackAr0.push((java.lang.Object) int53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[[]]" + "'", str50, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2215");
        org.autotest.Stack stackAr1 = createStack((int) '#');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr3 = createStack();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = stackAr3.toString();
        boolean boolean8 = stackAr3.isFull();
        org.autotest.Stack stackAr10 = createStack((int) '4');
        org.autotest.Stack stackAr12 = createStack((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr16 = createStack((int) '4');
        stackAr16.push((java.lang.Object) (-1L));
        java.lang.Object obj19 = stackAr16.pop();
        stackAr10.push((java.lang.Object) stackAr16);
        stackAr3.push((java.lang.Object) stackAr10);
        int int22 = stackAr3.size();
        boolean boolean23 = stackAr3.isFull();
        java.lang.Object obj24 = stackAr3.top();
        int int25 = stackAr3.size();
        stackAr1.push((java.lang.Object) stackAr3);
        boolean boolean27 = stackAr3.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[[]]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2216");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr10 = createStack((int) '4');
        org.autotest.Stack stackAr12 = createStack((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr15 = createStack();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.Stack stackAr26 = createStack((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.Stack stackAr30 = createStack((int) '4');
        org.autotest.Stack stackAr32 = createStack((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.Stack stackAr36 = createStack((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        org.autotest.Stack stackAr44 = createStack((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        int int46 = stackAr44.size();
        int int47 = stackAr44.size();
        stackAr30.push((java.lang.Object) stackAr44);
        org.autotest.Stack stackAr49 = createStack();
        boolean boolean50 = stackAr49.isEmpty();
        boolean boolean51 = stackAr30.equals((java.lang.Object) stackAr49);
        java.lang.Object obj52 = null;
        boolean boolean53 = stackAr30.equals(obj52);
        boolean boolean54 = stackAr30.isFull();
        boolean boolean55 = stackAr30.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2217");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.equals((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2218");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr10 = createStack((int) '4');
        org.autotest.Stack stackAr12 = createStack((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr15 = createStack();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        boolean boolean25 = stackAr15.isFull();
        boolean boolean27 = stackAr15.equals((java.lang.Object) (short) 10);
        java.lang.Object obj28 = null;
        stackAr15.push(obj28);
        boolean boolean30 = stackAr15.isEmpty();
        org.autotest.Stack stackAr32 = createStack((int) '4');
        org.autotest.Stack stackAr34 = createStack((int) '4');
        java.lang.String str35 = stackAr34.toString();
        boolean boolean36 = stackAr32.equals((java.lang.Object) stackAr34);
        org.autotest.Stack stackAr37 = createStack();
        boolean boolean38 = stackAr37.isFull();
        boolean boolean40 = stackAr37.equals((java.lang.Object) (byte) -1);
        java.lang.String str41 = stackAr37.toString();
        boolean boolean43 = stackAr37.equals((java.lang.Object) 10L);
        java.lang.String str44 = stackAr37.toString();
        stackAr34.push((java.lang.Object) stackAr37);
        stackAr34.push((java.lang.Object) (short) 100);
        boolean boolean48 = stackAr15.equals((java.lang.Object) stackAr34);
        org.autotest.Stack stackAr49 = createStack();
        java.lang.Object obj50 = null;
        boolean boolean51 = stackAr49.equals(obj50);
        int int52 = stackAr49.size();
        org.autotest.Stack stackAr54 = createStack((int) '4');
        int int55 = stackAr54.size();
        java.lang.String str56 = stackAr54.toString();
        boolean boolean57 = stackAr54.isFull();
        boolean boolean58 = stackAr54.isFull();
        org.autotest.Stack stackAr60 = createStack((int) (short) 0);
        int int61 = stackAr60.size();
        stackAr54.push((java.lang.Object) stackAr60);
        boolean boolean63 = stackAr49.equals((java.lang.Object) stackAr60);
        stackAr34.push((java.lang.Object) stackAr49);
        java.lang.Class<?> wildcardClass65 = stackAr49.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2219");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        boolean boolean6 = stackAr1.equals((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr1.isFull();
        int int8 = stackAr1.size();
        boolean boolean9 = stackAr1.isEmpty();
        org.autotest.Stack stackAr11 = createStack((int) '4');
        boolean boolean12 = stackAr11.isFull();
        int int13 = stackAr11.size();
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.String str15 = stackAr1.toString();
        java.lang.Object obj16 = stackAr1.top();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[]]" + "'", str15, "[[]]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2220");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2221");
        org.autotest.Stack stackAr0 = createStack();
        stackAr0.push((java.lang.Object) 0.0f);
        org.autotest.Stack stackAr4 = createStack((int) (byte) 100);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr0.equals((java.lang.Object) stackAr4);
        java.lang.String str8 = stackAr0.toString();
        java.lang.Object obj9 = stackAr0.top();
        boolean boolean10 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0.0]" + "'", str8, "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2222");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        java.lang.Object obj4 = stackAr1.pop();
        stackAr1.push((java.lang.Object) (-1));
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.Stack stackAr9 = createStack((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.Stack stackAr14 = createStack();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        boolean boolean17 = stackAr9.isFull();
        java.lang.Object obj18 = stackAr9.pop();
        boolean boolean19 = stackAr1.equals(obj18);
        java.lang.String str20 = stackAr1.toString();
        int int21 = stackAr1.size();
        int int22 = stackAr1.size();
        java.lang.Object obj23 = stackAr1.pop();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[-1]" + "'", str20, "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1) + "'", obj23, (-1));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2223");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack((int) (short) 0);
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean6 = stackAr4.isFull();
        org.autotest.Stack stackAr8 = createStack((int) '4');
        org.autotest.Stack stackAr10 = createStack((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr8.equals((java.lang.Object) stackAr10);
        org.autotest.Stack stackAr14 = createStack((int) '4');
        stackAr14.push((java.lang.Object) (-1L));
        java.lang.Object obj17 = stackAr14.pop();
        stackAr8.push((java.lang.Object) stackAr14);
        boolean boolean19 = stackAr4.equals((java.lang.Object) stackAr8);
        org.autotest.Stack stackAr21 = createStack((int) '4');
        int int22 = stackAr21.size();
        java.lang.String str23 = stackAr21.toString();
        int int24 = stackAr21.size();
        boolean boolean25 = stackAr21.isEmpty();
        boolean boolean26 = stackAr8.equals((java.lang.Object) boolean25);
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean28 = stackAr1.isFull();
        java.lang.Object obj29 = stackAr1.top();
        boolean boolean30 = stackAr1.isFull();
        boolean boolean31 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[[]]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2224");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.Stack stackAr3 = createStack();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) false);
        boolean boolean7 = stackAr3.isEmpty();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean9 = stackAr3.isEmpty();
        org.autotest.Stack stackAr10 = createStack();
        boolean boolean12 = stackAr10.equals((java.lang.Object) 1.0f);
        boolean boolean13 = stackAr10.isEmpty();
        boolean boolean14 = stackAr3.equals((java.lang.Object) boolean13);
        int int15 = stackAr3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2225");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr5 = createStack((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr8 = createStack((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        boolean boolean13 = stackAr0.isFull();
        boolean boolean14 = stackAr0.isFull();
        java.lang.Object obj15 = stackAr0.top();
        java.lang.Object obj16 = stackAr0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[0]");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2226");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr7 = createStack((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.String str12 = stackAr7.toString();
        boolean boolean13 = stackAr7.isFull();
        int int14 = stackAr7.size();
        int int15 = stackAr7.size();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2227");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        boolean boolean7 = stackAr3.equals((java.lang.Object) "[]");
        boolean boolean8 = stackAr3.isFull();
        boolean boolean10 = stackAr3.equals((java.lang.Object) (byte) 1);
        boolean boolean11 = stackAr3.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2228");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        org.autotest.Stack stackAr6 = createStack((int) 'a');
        boolean boolean8 = stackAr6.equals((java.lang.Object) (-1.0f));
        boolean boolean10 = stackAr6.equals((java.lang.Object) "");
        org.autotest.Stack stackAr11 = createStack();
        boolean boolean12 = stackAr11.isFull();
        stackAr6.push((java.lang.Object) stackAr11);
        org.autotest.Stack stackAr15 = createStack((int) '4');
        org.autotest.Stack stackAr17 = createStack((int) '4');
        java.lang.String str18 = stackAr17.toString();
        boolean boolean19 = stackAr15.equals((java.lang.Object) stackAr17);
        org.autotest.Stack stackAr20 = createStack();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        java.lang.String str24 = stackAr20.toString();
        boolean boolean26 = stackAr20.equals((java.lang.Object) 10L);
        java.lang.String str27 = stackAr20.toString();
        stackAr17.push((java.lang.Object) stackAr20);
        stackAr6.push((java.lang.Object) stackAr20);
        org.autotest.Stack stackAr31 = createStack((int) (short) 0);
        boolean boolean32 = stackAr31.isEmpty();
        boolean boolean33 = stackAr31.isFull();
        org.autotest.Stack stackAr35 = createStack((int) '4');
        org.autotest.Stack stackAr37 = createStack((int) '4');
        java.lang.String str38 = stackAr37.toString();
        boolean boolean39 = stackAr35.equals((java.lang.Object) stackAr37);
        org.autotest.Stack stackAr41 = createStack((int) '4');
        stackAr41.push((java.lang.Object) (-1L));
        java.lang.Object obj44 = stackAr41.pop();
        stackAr35.push((java.lang.Object) stackAr41);
        boolean boolean46 = stackAr31.equals((java.lang.Object) stackAr35);
        stackAr20.push((java.lang.Object) stackAr35);
        org.autotest.Stack stackAr49 = createStack((int) (short) 0);
        boolean boolean50 = stackAr49.isFull();
        int int51 = stackAr49.size();
        int int52 = stackAr49.size();
        stackAr35.push((java.lang.Object) stackAr49);
        java.lang.String str54 = stackAr35.toString();
        org.autotest.Stack stackAr56 = createStack((int) '4');
        java.lang.String str57 = stackAr56.toString();
        java.lang.Class<?> wildcardClass58 = stackAr56.getClass();
        stackAr35.push((java.lang.Object) stackAr56);
        java.lang.String str60 = stackAr35.toString();
        java.lang.String str61 = stackAr35.toString();
        java.lang.String str62 = stackAr35.toString();
        int int63 = stackAr35.size();
        org.autotest.Stack stackAr65 = createStack((int) '4');
        java.lang.String str66 = stackAr65.toString();
        org.autotest.Stack stackAr67 = createStack();
        boolean boolean68 = stackAr67.isFull();
        boolean boolean70 = stackAr67.equals((java.lang.Object) false);
        boolean boolean71 = stackAr67.isEmpty();
        boolean boolean72 = stackAr65.equals((java.lang.Object) stackAr67);
        boolean boolean73 = stackAr67.isEmpty();
        org.autotest.Stack stackAr74 = createStack();
        boolean boolean76 = stackAr74.equals((java.lang.Object) 1.0f);
        boolean boolean77 = stackAr74.isEmpty();
        boolean boolean78 = stackAr67.equals((java.lang.Object) boolean77);
        boolean boolean79 = stackAr35.equals((java.lang.Object) boolean77);
        stackAr1.push((java.lang.Object) boolean77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1L) + "'", obj44, (-1L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[[],[]]" + "'", str54, "[[],[]]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[[],[],[]]" + "'", str60, "[[],[],[]]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[[],[],[]]" + "'", str61, "[[],[],[]]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[[],[],[]]" + "'", str62, "[[],[],[]]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[]" + "'", str66, "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2229");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        org.autotest.Stack stackAr5 = createStack((int) '4');
        int int6 = stackAr5.size();
        java.lang.String str7 = stackAr5.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) str7);
        java.lang.String str9 = stackAr1.toString();
        org.autotest.Stack stackAr11 = createStack((int) '4');
        int int12 = stackAr11.size();
        stackAr11.push((java.lang.Object) 0);
        org.autotest.Stack stackAr16 = createStack((int) '4');
        int int17 = stackAr16.size();
        int int18 = stackAr16.size();
        boolean boolean19 = stackAr16.isEmpty();
        stackAr16.push((java.lang.Object) "[[],true]");
        boolean boolean22 = stackAr11.equals((java.lang.Object) "[[],true]");
        boolean boolean23 = stackAr11.isFull();
        stackAr1.push((java.lang.Object) boolean23);
        int int25 = stackAr1.size();
        boolean boolean26 = stackAr1.isFull();
        boolean boolean27 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2230");
        org.autotest.Stack stackAr1 = createStack((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean6 = stackAr5.isFull();
        org.autotest.Stack stackAr7 = createStack();
        boolean boolean8 = stackAr7.isFull();
        boolean boolean10 = stackAr7.equals((java.lang.Object) (byte) -1);
        stackAr5.push((java.lang.Object) boolean10);
        org.autotest.Stack stackAr12 = createStack();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        java.lang.String str16 = stackAr12.toString();
        boolean boolean18 = stackAr12.equals((java.lang.Object) 10L);
        java.lang.String str19 = stackAr12.toString();
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        org.autotest.Stack stackAr26 = createStack();
        boolean boolean27 = stackAr26.isFull();
        stackAr21.push((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr30 = createStack((int) '4');
        org.autotest.Stack stackAr32 = createStack((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.Stack stackAr35 = createStack();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr35.toString();
        boolean boolean41 = stackAr35.equals((java.lang.Object) 10L);
        java.lang.String str42 = stackAr35.toString();
        stackAr32.push((java.lang.Object) stackAr35);
        stackAr21.push((java.lang.Object) stackAr35);
        boolean boolean45 = stackAr12.equals((java.lang.Object) stackAr35);
        boolean boolean46 = stackAr5.equals((java.lang.Object) stackAr35);
        org.autotest.Stack stackAr48 = createStack((int) 'a');
        boolean boolean50 = stackAr48.equals((java.lang.Object) (-1.0f));
        boolean boolean52 = stackAr48.equals((java.lang.Object) "");
        org.autotest.Stack stackAr53 = createStack();
        boolean boolean54 = stackAr53.isFull();
        stackAr48.push((java.lang.Object) stackAr53);
        boolean boolean56 = stackAr48.isFull();
        java.lang.Object obj57 = stackAr48.pop();
        stackAr35.push((java.lang.Object) stackAr48);
        java.lang.Object obj59 = stackAr35.top();
        org.autotest.Stack stackAr61 = createStack((int) (short) 0);
        boolean boolean62 = stackAr61.isEmpty();
        org.autotest.Stack stackAr64 = createStack((int) '4');
        stackAr64.push((java.lang.Object) (-1L));
        java.lang.Object obj67 = stackAr64.pop();
        stackAr64.push((java.lang.Object) (-1));
        boolean boolean70 = stackAr64.isEmpty();
        org.autotest.Stack stackAr72 = createStack((int) 'a');
        boolean boolean74 = stackAr72.equals((java.lang.Object) (-1.0f));
        boolean boolean76 = stackAr72.equals((java.lang.Object) "");
        org.autotest.Stack stackAr77 = createStack();
        boolean boolean78 = stackAr77.isFull();
        stackAr72.push((java.lang.Object) stackAr77);
        boolean boolean80 = stackAr72.isFull();
        java.lang.Object obj81 = stackAr72.pop();
        boolean boolean82 = stackAr64.equals(obj81);
        java.lang.Class<?> wildcardClass83 = obj81.getClass();
        boolean boolean84 = stackAr61.equals(obj81);
        boolean boolean85 = stackAr35.equals(obj81);
        java.lang.String str86 = stackAr35.toString();
        boolean boolean87 = stackAr1.equals((java.lang.Object) stackAr35);
        java.lang.String str88 = stackAr35.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "[]");
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1L) + "'", obj67, (-1L));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[[]]" + "'", str86, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "[[]]" + "'", str88, "[[]]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2231");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr9 = createStack((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.Object obj23 = stackAr4.top();
        org.autotest.Stack stackAr24 = createStack();
        stackAr24.push((java.lang.Object) 0.0f);
        stackAr24.push((java.lang.Object) true);
        stackAr4.push((java.lang.Object) stackAr24);
        int int30 = stackAr24.size();
        java.lang.String str31 = stackAr24.toString();
        int int32 = stackAr24.size();
        org.autotest.Stack stackAr34 = createStack((int) (short) 0);
        boolean boolean35 = stackAr34.isFull();
        int int36 = stackAr34.size();
        int int37 = stackAr34.size();
        boolean boolean38 = stackAr34.isEmpty();
        boolean boolean39 = stackAr24.equals((java.lang.Object) boolean38);
        boolean boolean40 = stackAr24.isEmpty();
        java.lang.Object obj41 = stackAr24.top();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[0.0,true]" + "'", str31, "[0.0,true]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + true + "'", obj41, true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2232");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.push((java.lang.Object) 1);
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2233");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr5 = createStack((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr8 = createStack((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.Stack stackAr15 = createStack((int) '#');
        boolean boolean16 = stackAr0.equals((java.lang.Object) '#');
        boolean boolean17 = stackAr0.isEmpty();
        boolean boolean18 = stackAr0.isFull();
        int int19 = stackAr0.size();
        int int20 = stackAr0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2234");
        org.autotest.Stack stackAr1 = createStack((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        java.lang.String str4 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2235");
        org.autotest.Stack stackAr0 = createStack();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.Stack stackAr10 = createStack();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr5.isFull();
        java.lang.Object obj14 = stackAr5.pop();
        stackAr0.push((java.lang.Object) stackAr5);
        int int16 = stackAr0.size();
        java.lang.Object obj17 = stackAr0.pop();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2236");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr9 = createStack((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        org.autotest.Stack stackAr23 = createStack(0);
        boolean boolean24 = stackAr4.equals((java.lang.Object) 0);
        boolean boolean25 = stackAr4.isFull();
        org.autotest.Stack stackAr26 = createStack();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) 10);
        org.autotest.Stack stackAr31 = createStack((int) '4');
        java.lang.String str32 = stackAr31.toString();
        java.lang.String str33 = stackAr31.toString();
        org.autotest.Stack stackAr34 = createStack();
        boolean boolean35 = stackAr34.isFull();
        boolean boolean37 = stackAr34.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr39 = createStack((int) '4');
        boolean boolean40 = stackAr34.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr42 = createStack((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (-1.0f));
        boolean boolean46 = stackAr42.equals((java.lang.Object) "");
        boolean boolean47 = stackAr34.equals((java.lang.Object) "");
        boolean boolean48 = stackAr34.isFull();
        boolean boolean49 = stackAr31.equals((java.lang.Object) stackAr34);
        java.lang.Object obj50 = null;
        stackAr34.push(obj50);
        java.lang.Object obj52 = stackAr34.top();
        java.lang.String str53 = stackAr34.toString();
        java.lang.Object obj54 = stackAr34.pop();
        boolean boolean55 = stackAr26.equals(obj54);
        java.lang.String str56 = stackAr26.toString();
        org.autotest.Stack stackAr57 = createStack();
        stackAr57.push((java.lang.Object) 0.0f);
        java.lang.String str60 = stackAr57.toString();
        org.autotest.Stack stackAr62 = createStack((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        boolean boolean66 = stackAr62.equals((java.lang.Object) "");
        org.autotest.Stack stackAr67 = createStack();
        boolean boolean68 = stackAr67.isFull();
        stackAr62.push((java.lang.Object) stackAr67);
        boolean boolean70 = stackAr62.isFull();
        java.lang.Object obj71 = stackAr62.pop();
        stackAr57.push((java.lang.Object) stackAr62);
        stackAr26.push((java.lang.Object) stackAr62);
        java.lang.Object obj74 = null;
        boolean boolean75 = stackAr62.equals(obj74);
        stackAr4.push((java.lang.Object) boolean75);
        boolean boolean77 = stackAr4.isFull();
        java.lang.Object obj78 = stackAr4.pop();
        boolean boolean79 = stackAr4.isEmpty();
        java.lang.String str80 = stackAr4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[null]" + "'", str53, "[null]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[0.0]" + "'", str60, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + false + "'", obj78, false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[null]" + "'", str80, "[null]");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2237");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.Stack stackAr4 = createStack();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr9 = createStack((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr12 = createStack((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        boolean boolean23 = stackAr4.isEmpty();
        java.lang.String str24 = stackAr4.toString();
        java.lang.String str25 = stackAr4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[null]" + "'", str25, "[null]");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2238");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        int int5 = stackAr1.size();
        org.autotest.Stack stackAr7 = createStack((int) '4');
        java.lang.String str8 = stackAr7.toString();
        stackAr7.push((java.lang.Object) 0);
        java.lang.Object obj11 = stackAr7.top();
        boolean boolean12 = stackAr7.isEmpty();
        java.lang.Object obj13 = stackAr7.pop();
        org.autotest.Stack stackAr15 = createStack((int) (short) 10);
        boolean boolean16 = stackAr15.isFull();
        stackAr15.push((java.lang.Object) 'a');
        java.lang.String str19 = stackAr15.toString();
        org.autotest.Stack stackAr20 = createStack();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr25 = createStack((int) '4');
        boolean boolean26 = stackAr20.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr28 = createStack((int) '4');
        int int29 = stackAr28.size();
        stackAr28.push((java.lang.Object) 0);
        stackAr20.push((java.lang.Object) stackAr28);
        boolean boolean33 = stackAr20.isFull();
        boolean boolean34 = stackAr15.equals((java.lang.Object) boolean33);
        stackAr7.push((java.lang.Object) boolean33);
        stackAr1.push((java.lang.Object) stackAr7);
        int int37 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[a]" + "'", str19, "[a]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2239");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr5 = createStack((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr8 = createStack((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        boolean boolean13 = stackAr0.isEmpty();
        org.autotest.Stack stackAr15 = createStack((int) 'a');
        boolean boolean17 = stackAr15.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr15.equals((java.lang.Object) "");
        org.autotest.Stack stackAr20 = createStack();
        boolean boolean21 = stackAr20.isFull();
        stackAr15.push((java.lang.Object) stackAr20);
        org.autotest.Stack stackAr24 = createStack((int) '4');
        org.autotest.Stack stackAr26 = createStack((int) '4');
        java.lang.String str27 = stackAr26.toString();
        boolean boolean28 = stackAr24.equals((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr29 = createStack();
        boolean boolean30 = stackAr29.isFull();
        boolean boolean32 = stackAr29.equals((java.lang.Object) (byte) -1);
        java.lang.String str33 = stackAr29.toString();
        boolean boolean35 = stackAr29.equals((java.lang.Object) 10L);
        java.lang.String str36 = stackAr29.toString();
        stackAr26.push((java.lang.Object) stackAr29);
        stackAr15.push((java.lang.Object) stackAr29);
        boolean boolean39 = stackAr29.isFull();
        boolean boolean41 = stackAr29.equals((java.lang.Object) (short) 10);
        org.autotest.Stack stackAr43 = createStack((int) (short) 0);
        boolean boolean44 = stackAr43.isFull();
        java.lang.String str45 = stackAr43.toString();
        java.lang.String str46 = stackAr43.toString();
        boolean boolean47 = stackAr29.equals((java.lang.Object) stackAr43);
        stackAr0.push((java.lang.Object) stackAr29);
        org.autotest.Stack stackAr50 = createStack((int) (short) 10);
        boolean boolean51 = stackAr50.isEmpty();
        boolean boolean52 = stackAr29.equals((java.lang.Object) boolean51);
        org.autotest.Stack stackAr53 = createStack();
        boolean boolean54 = stackAr53.isFull();
        boolean boolean56 = stackAr53.equals((java.lang.Object) (byte) -1);
        org.autotest.Stack stackAr58 = createStack((int) '4');
        boolean boolean59 = stackAr53.equals((java.lang.Object) '4');
        org.autotest.Stack stackAr61 = createStack((int) 'a');
        boolean boolean63 = stackAr61.equals((java.lang.Object) (-1.0f));
        boolean boolean65 = stackAr61.equals((java.lang.Object) "");
        boolean boolean66 = stackAr53.equals((java.lang.Object) "");
        java.lang.String str67 = stackAr53.toString();
        int int68 = stackAr53.size();
        stackAr29.push((java.lang.Object) int68);
        org.autotest.Stack stackAr70 = createStack();
        boolean boolean71 = stackAr70.isFull();
        boolean boolean73 = stackAr70.equals((java.lang.Object) (byte) -1);
        java.lang.String str74 = stackAr70.toString();
        boolean boolean76 = stackAr70.equals((java.lang.Object) 10L);
        java.lang.String str77 = stackAr70.toString();
        boolean boolean79 = stackAr70.equals((java.lang.Object) (byte) -1);
        java.lang.String str80 = stackAr70.toString();
        org.autotest.Stack stackAr82 = createStack(100);
        boolean boolean83 = stackAr82.isEmpty();
        java.lang.Class<?> wildcardClass84 = stackAr82.getClass();
        stackAr70.push((java.lang.Object) stackAr82);
        java.lang.Object obj86 = stackAr70.top();
        java.lang.Object obj87 = stackAr70.top();
        boolean boolean88 = stackAr29.equals((java.lang.Object) stackAr70);
        java.lang.Object obj89 = stackAr29.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[]" + "'", str74, "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[]" + "'", str77, "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[]" + "'", str80, "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj86), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "[]");
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "[]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0 + "'", obj89, 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2240");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr7 = createStack((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        int int12 = stackAr1.size();
        java.lang.Object obj13 = stackAr1.top();
        boolean boolean14 = stackAr1.isFull();
        java.lang.Object obj15 = stackAr1.pop();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2241");
        org.autotest.Stack stackAr0 = createStack();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        org.autotest.Stack stackAr5 = createStack((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = stackAr5.equals((java.lang.Object) "");
        org.autotest.Stack stackAr10 = createStack();
        boolean boolean11 = stackAr10.isFull();
        stackAr5.push((java.lang.Object) stackAr10);
        boolean boolean13 = stackAr5.isFull();
        java.lang.Object obj14 = stackAr5.pop();
        stackAr0.push((java.lang.Object) stackAr5);
        int int16 = stackAr0.size();
        org.autotest.Stack stackAr17 = createStack();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        java.lang.String str21 = stackAr17.toString();
        boolean boolean23 = stackAr17.equals((java.lang.Object) 10L);
        java.lang.String str24 = stackAr17.toString();
        org.autotest.Stack stackAr26 = createStack((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        org.autotest.Stack stackAr31 = createStack();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr35 = createStack((int) '4');
        org.autotest.Stack stackAr37 = createStack((int) '4');
        java.lang.String str38 = stackAr37.toString();
        boolean boolean39 = stackAr35.equals((java.lang.Object) stackAr37);
        org.autotest.Stack stackAr40 = createStack();
        boolean boolean41 = stackAr40.isFull();
        boolean boolean43 = stackAr40.equals((java.lang.Object) (byte) -1);
        java.lang.String str44 = stackAr40.toString();
        boolean boolean46 = stackAr40.equals((java.lang.Object) 10L);
        java.lang.String str47 = stackAr40.toString();
        stackAr37.push((java.lang.Object) stackAr40);
        stackAr26.push((java.lang.Object) stackAr40);
        boolean boolean50 = stackAr17.equals((java.lang.Object) stackAr40);
        org.autotest.Stack stackAr52 = createStack((int) (short) 0);
        boolean boolean53 = stackAr52.isFull();
        java.lang.Class<?> wildcardClass54 = stackAr52.getClass();
        boolean boolean55 = stackAr40.equals((java.lang.Object) wildcardClass54);
        java.lang.String str56 = stackAr40.toString();
        boolean boolean57 = stackAr40.isFull();
        boolean boolean58 = stackAr0.equals((java.lang.Object) stackAr40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = stackAr40.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2242");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (short) 0);
        int int8 = stackAr7.size();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean10 = stackAr7.isFull();
        java.lang.Class<?> wildcardClass11 = stackAr7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2243");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        java.lang.String str2 = stackAr0.toString();
        java.lang.String str3 = stackAr0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2244");
        org.autotest.Stack stackAr1 = createStack(1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.Stack stackAr4 = createStack((int) '4');
        org.autotest.Stack stackAr6 = createStack((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr4.equals((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr10 = createStack((int) '4');
        stackAr10.push((java.lang.Object) (-1L));
        java.lang.Object obj13 = stackAr10.pop();
        stackAr4.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj16 = stackAr1.pop();
        boolean boolean17 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2245");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isEmpty();
        org.autotest.Stack stackAr3 = createStack((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr3.equals((java.lang.Object) "");
        org.autotest.Stack stackAr8 = createStack();
        boolean boolean9 = stackAr8.isFull();
        stackAr3.push((java.lang.Object) stackAr8);
        org.autotest.Stack stackAr12 = createStack((int) '4');
        org.autotest.Stack stackAr14 = createStack((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr12.equals((java.lang.Object) stackAr14);
        org.autotest.Stack stackAr17 = createStack();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        java.lang.String str21 = stackAr17.toString();
        boolean boolean23 = stackAr17.equals((java.lang.Object) 10L);
        java.lang.String str24 = stackAr17.toString();
        stackAr14.push((java.lang.Object) stackAr17);
        stackAr3.push((java.lang.Object) stackAr17);
        java.lang.Object obj27 = stackAr3.pop();
        boolean boolean28 = stackAr0.equals((java.lang.Object) stackAr3);
        java.lang.String str29 = stackAr3.toString();
        org.autotest.Stack stackAr31 = createStack((int) '#');
        org.autotest.Stack stackAr33 = createStack((int) 'a');
        boolean boolean35 = stackAr33.equals((java.lang.Object) (-1.0f));
        boolean boolean37 = stackAr33.equals((java.lang.Object) "");
        org.autotest.Stack stackAr38 = createStack();
        boolean boolean39 = stackAr38.isFull();
        stackAr33.push((java.lang.Object) stackAr38);
        java.lang.Class<?> wildcardClass41 = stackAr33.getClass();
        boolean boolean42 = stackAr31.equals((java.lang.Object) wildcardClass41);
        boolean boolean43 = stackAr31.isFull();
        boolean boolean44 = stackAr3.equals((java.lang.Object) stackAr31);
        org.autotest.Stack stackAr46 = createStack((int) (short) 0);
        boolean boolean47 = stackAr46.isFull();
        java.lang.String str48 = stackAr46.toString();
        boolean boolean49 = stackAr46.isEmpty();
        org.autotest.Stack stackAr51 = createStack((int) '4');
        org.autotest.Stack stackAr53 = createStack((int) '4');
        java.lang.String str54 = stackAr53.toString();
        boolean boolean55 = stackAr51.equals((java.lang.Object) stackAr53);
        org.autotest.Stack stackAr56 = createStack();
        boolean boolean57 = stackAr56.isFull();
        boolean boolean59 = stackAr56.equals((java.lang.Object) (byte) -1);
        java.lang.String str60 = stackAr56.toString();
        boolean boolean62 = stackAr56.equals((java.lang.Object) 10L);
        java.lang.String str63 = stackAr56.toString();
        stackAr53.push((java.lang.Object) stackAr56);
        boolean boolean65 = stackAr56.isFull();
        boolean boolean66 = stackAr46.equals((java.lang.Object) stackAr56);
        java.lang.Class<?> wildcardClass67 = stackAr46.getClass();
        stackAr31.push((java.lang.Object) stackAr46);
        org.autotest.Stack stackAr69 = createStack();
        boolean boolean70 = stackAr69.isFull();
        boolean boolean72 = stackAr69.equals((java.lang.Object) false);
        java.lang.String str73 = stackAr69.toString();
        boolean boolean74 = stackAr69.isEmpty();
        org.autotest.Stack stackAr76 = createStack((int) (short) 0);
        boolean boolean77 = stackAr76.isFull();
        boolean boolean78 = stackAr76.isFull();
        org.autotest.Stack stackAr80 = createStack((int) '4');
        org.autotest.Stack stackAr82 = createStack((int) '4');
        java.lang.String str83 = stackAr82.toString();
        boolean boolean84 = stackAr80.equals((java.lang.Object) stackAr82);
        int int85 = stackAr80.size();
        boolean boolean86 = stackAr80.isFull();
        org.autotest.Stack stackAr88 = createStack((int) (short) 0);
        boolean boolean89 = stackAr88.isEmpty();
        boolean boolean90 = stackAr88.isEmpty();
        stackAr80.push((java.lang.Object) stackAr88);
        boolean boolean92 = stackAr76.equals((java.lang.Object) stackAr88);
        java.lang.String str93 = stackAr88.toString();
        stackAr69.push((java.lang.Object) str93);
        boolean boolean95 = stackAr31.equals((java.lang.Object) stackAr69);
        boolean boolean96 = stackAr31.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[[]]" + "'", str29, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[]" + "'", str63, "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[]" + "'", str83, "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "[]" + "'", str93, "[]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2246");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr7 = createStack((int) (short) 0);
        int int8 = stackAr7.size();
        stackAr1.push((java.lang.Object) stackAr7);
        org.autotest.Stack stackAr10 = createStack();
        boolean boolean11 = stackAr10.isFull();
        boolean boolean13 = stackAr10.equals((java.lang.Object) (byte) -1);
        java.lang.String str14 = stackAr10.toString();
        boolean boolean16 = stackAr10.equals((java.lang.Object) 10L);
        java.lang.String str17 = stackAr10.toString();
        boolean boolean19 = stackAr10.equals((java.lang.Object) (byte) 0);
        org.autotest.Stack stackAr21 = createStack((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        boolean boolean25 = stackAr21.equals((java.lang.Object) "");
        org.autotest.Stack stackAr26 = createStack();
        boolean boolean27 = stackAr26.isFull();
        stackAr21.push((java.lang.Object) stackAr26);
        org.autotest.Stack stackAr30 = createStack((int) '4');
        org.autotest.Stack stackAr32 = createStack((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.Stack stackAr35 = createStack();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) (byte) -1);
        java.lang.String str39 = stackAr35.toString();
        boolean boolean41 = stackAr35.equals((java.lang.Object) 10L);
        java.lang.String str42 = stackAr35.toString();
        stackAr32.push((java.lang.Object) stackAr35);
        stackAr21.push((java.lang.Object) stackAr35);
        boolean boolean45 = stackAr21.isEmpty();
        boolean boolean46 = stackAr10.equals((java.lang.Object) stackAr21);
        boolean boolean47 = stackAr1.equals((java.lang.Object) stackAr10);
        org.autotest.Stack stackAr49 = createStack((int) '4');
        org.autotest.Stack stackAr51 = createStack((int) '4');
        java.lang.String str52 = stackAr51.toString();
        boolean boolean53 = stackAr49.equals((java.lang.Object) stackAr51);
        stackAr51.push((java.lang.Object) (-1));
        boolean boolean56 = stackAr51.isFull();
        java.lang.Object obj57 = stackAr51.top();
        java.lang.String str58 = stackAr51.toString();
        org.autotest.Stack stackAr59 = createStack();
        stackAr59.push((java.lang.Object) 0.0f);
        int int62 = stackAr59.size();
        stackAr51.push((java.lang.Object) stackAr59);
        stackAr1.push((java.lang.Object) stackAr59);
        java.lang.Object obj65 = stackAr1.top();
        java.lang.String str66 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1) + "'", obj57, (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[-1]" + "'", str58, "[-1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "[0.0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "[0.0]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[[],[0.0]]" + "'", str66, "[[],[0.0]]");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2247");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        boolean boolean5 = stackAr1.isFull();
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean12 = stackAr1.isFull();
        org.autotest.Stack stackAr14 = createStack((int) '4');
        int int15 = stackAr14.size();
        stackAr14.push((java.lang.Object) 0);
        org.autotest.Stack stackAr19 = createStack((int) '4');
        int int20 = stackAr19.size();
        int int21 = stackAr19.size();
        boolean boolean22 = stackAr19.isEmpty();
        stackAr19.push((java.lang.Object) "[[],true]");
        boolean boolean25 = stackAr14.equals((java.lang.Object) "[[],true]");
        boolean boolean26 = stackAr14.isFull();
        java.lang.Object obj27 = stackAr14.pop();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr14);
        boolean boolean29 = stackAr1.isEmpty();
        int int30 = stackAr1.size();
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj33 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2248");
        org.autotest.Stack stackAr0 = createStack();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        stackAr0.push((java.lang.Object) (byte) 100);
        boolean boolean7 = stackAr0.equals((java.lang.Object) 100L);
        boolean boolean8 = stackAr0.isEmpty();
        boolean boolean9 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2249");
        org.autotest.Stack stackAr1 = createStack((int) '4');
        org.autotest.Stack stackAr3 = createStack((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.Stack stackAr7 = createStack((int) 'a');
        boolean boolean9 = stackAr7.equals((java.lang.Object) (-1.0f));
        boolean boolean11 = stackAr7.equals((java.lang.Object) "");
        org.autotest.Stack stackAr12 = createStack();
        boolean boolean13 = stackAr12.isFull();
        stackAr7.push((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr16 = createStack((int) '4');
        org.autotest.Stack stackAr18 = createStack((int) '4');
        java.lang.String str19 = stackAr18.toString();
        boolean boolean20 = stackAr16.equals((java.lang.Object) stackAr18);
        org.autotest.Stack stackAr21 = createStack();
        boolean boolean22 = stackAr21.isFull();
        boolean boolean24 = stackAr21.equals((java.lang.Object) (byte) -1);
        java.lang.String str25 = stackAr21.toString();
        boolean boolean27 = stackAr21.equals((java.lang.Object) 10L);
        java.lang.String str28 = stackAr21.toString();
        stackAr18.push((java.lang.Object) stackAr21);
        stackAr7.push((java.lang.Object) stackAr21);
        org.autotest.Stack stackAr32 = createStack((int) (short) 0);
        boolean boolean33 = stackAr32.isEmpty();
        boolean boolean34 = stackAr32.isFull();
        org.autotest.Stack stackAr36 = createStack((int) '4');
        org.autotest.Stack stackAr38 = createStack((int) '4');
        java.lang.String str39 = stackAr38.toString();
        boolean boolean40 = stackAr36.equals((java.lang.Object) stackAr38);
        org.autotest.Stack stackAr42 = createStack((int) '4');
        stackAr42.push((java.lang.Object) (-1L));
        java.lang.Object obj45 = stackAr42.pop();
        stackAr36.push((java.lang.Object) stackAr42);
        boolean boolean47 = stackAr32.equals((java.lang.Object) stackAr36);
        stackAr21.push((java.lang.Object) stackAr36);
        org.autotest.Stack stackAr50 = createStack((int) (short) 0);
        boolean boolean51 = stackAr50.isFull();
        int int52 = stackAr50.size();
        int int53 = stackAr50.size();
        stackAr36.push((java.lang.Object) stackAr50);
        java.lang.String str55 = stackAr36.toString();
        boolean boolean56 = stackAr3.equals((java.lang.Object) str55);
        org.autotest.Stack stackAr57 = createStack();
        boolean boolean58 = stackAr57.isFull();
        boolean boolean60 = stackAr57.equals((java.lang.Object) (byte) -1);
        java.lang.String str61 = stackAr57.toString();
        boolean boolean63 = stackAr57.equals((java.lang.Object) 10L);
        java.lang.String str64 = stackAr57.toString();
        org.autotest.Stack stackAr66 = createStack((int) 'a');
        boolean boolean68 = stackAr66.equals((java.lang.Object) (-1.0f));
        boolean boolean70 = stackAr66.equals((java.lang.Object) "");
        org.autotest.Stack stackAr71 = createStack();
        boolean boolean72 = stackAr71.isFull();
        stackAr66.push((java.lang.Object) stackAr71);
        org.autotest.Stack stackAr75 = createStack((int) '4');
        org.autotest.Stack stackAr77 = createStack((int) '4');
        java.lang.String str78 = stackAr77.toString();
        boolean boolean79 = stackAr75.equals((java.lang.Object) stackAr77);
        org.autotest.Stack stackAr80 = createStack();
        boolean boolean81 = stackAr80.isFull();
        boolean boolean83 = stackAr80.equals((java.lang.Object) (byte) -1);
        java.lang.String str84 = stackAr80.toString();
        boolean boolean86 = stackAr80.equals((java.lang.Object) 10L);
        java.lang.String str87 = stackAr80.toString();
        stackAr77.push((java.lang.Object) stackAr80);
        stackAr66.push((java.lang.Object) stackAr80);
        boolean boolean90 = stackAr57.equals((java.lang.Object) stackAr80);
        boolean boolean91 = stackAr80.isEmpty();
        stackAr3.push((java.lang.Object) stackAr80);
        java.lang.Object obj93 = stackAr3.top();
        boolean boolean94 = stackAr3.isFull();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[[],[]]" + "'", str55, "[[],[]]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[]" + "'", str64, "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[]" + "'", str78, "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[]" + "'", str84, "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[]" + "'", str87, "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertEquals(obj93.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "[]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test2250");
        org.autotest.Stack stackAr1 = createStack((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.Stack stackAr6 = createStack();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.Stack stackAr10 = createStack((int) '4');
        org.autotest.Stack stackAr12 = createStack((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.Stack stackAr15 = createStack();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        boolean boolean25 = stackAr15.isFull();
        boolean boolean27 = stackAr15.equals((java.lang.Object) (short) 10);
        org.autotest.Stack stackAr29 = createStack((int) (short) 0);
        boolean boolean30 = stackAr29.isFull();
        java.lang.String str31 = stackAr29.toString();
        java.lang.String str32 = stackAr29.toString();
        boolean boolean33 = stackAr15.equals((java.lang.Object) stackAr29);
        org.autotest.Stack stackAr35 = createStack((int) '4');
        java.lang.String str36 = stackAr35.toString();
        stackAr35.push((java.lang.Object) 0);
        java.lang.Object obj39 = stackAr35.top();
        boolean boolean40 = stackAr15.equals((java.lang.Object) stackAr35);
        org.autotest.Stack stackAr41 = createStack();
        boolean boolean42 = stackAr41.isEmpty();
        org.autotest.Stack stackAr44 = createStack((int) 'a');
        boolean boolean46 = stackAr44.equals((java.lang.Object) (-1.0f));
        boolean boolean48 = stackAr44.equals((java.lang.Object) "");
        org.autotest.Stack stackAr49 = createStack();
        boolean boolean50 = stackAr49.isFull();
        stackAr44.push((java.lang.Object) stackAr49);
        org.autotest.Stack stackAr53 = createStack((int) '4');
        org.autotest.Stack stackAr55 = createStack((int) '4');
        java.lang.String str56 = stackAr55.toString();
        boolean boolean57 = stackAr53.equals((java.lang.Object) stackAr55);
        org.autotest.Stack stackAr58 = createStack();
        boolean boolean59 = stackAr58.isFull();
        boolean boolean61 = stackAr58.equals((java.lang.Object) (byte) -1);
        java.lang.String str62 = stackAr58.toString();
        boolean boolean64 = stackAr58.equals((java.lang.Object) 10L);
        java.lang.String str65 = stackAr58.toString();
        stackAr55.push((java.lang.Object) stackAr58);
        stackAr44.push((java.lang.Object) stackAr58);
        java.lang.Object obj68 = stackAr44.pop();
        boolean boolean69 = stackAr41.equals((java.lang.Object) stackAr44);
        java.lang.Object obj70 = stackAr44.pop();
        stackAr15.push((java.lang.Object) stackAr44);
        java.lang.Object obj72 = stackAr15.pop();
        int int73 = stackAr15.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[]" + "'", str62, "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[]");
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }
}

