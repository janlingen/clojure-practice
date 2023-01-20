(ns problems.easy.038)

(comment "Maximum value")


(comment "Write a function which takes a variable number
of parameters and returns the maximum value.")


(defn solution
  [& args]
  (apply max args))

(solution 1 2 3)

(assert (and (= (solution 1 8 3 4) 8)
             (= (solution 30 20) 30)
             (= (solution 45 67 11) 67)))
