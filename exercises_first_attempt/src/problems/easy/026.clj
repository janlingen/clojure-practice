(ns problems.easy.026)

(comment "Fibonacci Sequence")


(comment "Write a function which returns
the first X fibonacci numbers.")


(defn solution 
  ([] (solution 1 1))
  ([x] (take x (solution)))
  ([x1 x2] (lazy-seq (cons x1 (solution x2 (+ x1 x2))))))

(assert (and (= (solution 3) (quote (1 1 2)))
             (= (solution 6) (quote (1 1 2 3 5 8)))
             (= (solution 8) (quote (1 1 2 3 5 8 13 21)))))
