(ns problems.easy.173)

(comment "Intro to Destructuring 2")


(comment "Sequential destructuring allows you to bind symbols to parts of
sequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete
the bindings so all let-parts evaluate to 3.")


(assert (and (= 3 (let [[f a] [+ (range 3)]] 
                    (apply f a)) 
                (let [[[f a] b] [[+ 1] 2]] (f a b)) (let [[f a] [inc 2]] (f a)))))
