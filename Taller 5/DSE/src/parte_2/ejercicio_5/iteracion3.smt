(declare-const a Int)
(declare-const b Int)
(declare-const c Int)
(assert (not(or (or (<= a 0)(<= b 0))(<= c 0))))
(assert (and (and (> (+ a b) c)(> (+ a c) b))(> (+ b c) a)))
(assert (not (and (= a b)(= b c))))
(assert (not (or (or (= a b)(= b c)(= a c)))))
(check-sat)
(get-model)