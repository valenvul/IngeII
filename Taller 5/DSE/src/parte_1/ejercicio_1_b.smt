; Ejercicio 1 b) (x ∧ y) ≡ ¬(¬x ∨ ¬y)
; COMPLETAR
(declare-const x Bool)
(declare-const y Bool)
(assert ( = (and x y) (not (or(not x)(not y)))))
(check-sat)

