(declare-const a Int)
(declare-const b Int)
(declare-const c Int)
(assert (not(or (or (<= a 0)(<= b 0))(<= c 0))))
(assert (not(and (and (> (+ a b) c)(> (+ a c) b))(> (+ b c) a))))
(check-sat)
(get-model)