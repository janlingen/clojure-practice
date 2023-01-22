(ns problems.medium.046)

(comment "Flipping out")


(comment "Write a higher-order function which
flips the order of the arguments of an input function.")


(defn solution
  [f]
  (fn [x y] (f y x)))


(assert (and (= 3 ((solution nth) 2 [1 2 3 4 5]))
             (= true ((solution >) 7 8))
             (= 4 ((solution quot) 2 8))
             (= [1 2 3] ((solution take) [1 2 3 4 5] 3))))
