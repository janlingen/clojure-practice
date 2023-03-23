(ns problems.easy.021)

(comment "Nth Element")


(comment "Write a function which returns
the Nth element from a sequence.")


(defn solution
  [x y] (if (= y 0) (first x) (solution (rest x) (dec y))))


(assert (and (= (solution (quote (4 5 6 7)) 2) 6)
             (= (solution [:a :b :c] 0) :a)
             (= (solution [1 2 3 4] 1) 2)
             (= (solution (quote ([1 2] [3 4] [5 6])) 2) [5 6])))
