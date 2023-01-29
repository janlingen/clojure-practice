(ns problems.easy.066)

(comment "Greatest Common Divisor")


(comment "Given two integers, write a function which
returns the greatest common divisor.")


(defn solution
  [x y] (if (= (rem (max x y) (min x y)) 0) (min x y)
           (solution (min x y) (rem (max x y) (min x y)))))


(assert (and (= (solution 2 4) 2)
             (= (solution 10 5) 5)
             (= (solution 5 7) 1)
             (= (solution 1023 858) 33)))
