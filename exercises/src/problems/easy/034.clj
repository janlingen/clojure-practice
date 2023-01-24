(ns problems.easy.034)

(comment "Implement range")


(comment "Write a function which creates a list
of all integers in a given range.")


(defn solution3
  [start end] (range start end))

(defn solution2
  ([start] (lazy-seq (concat [start] (solution2 (inc start)))))
  ([start end] (take-while #(< %1 end) (solution2 start))))

(defn solution [start end] (take-while #(< %1 end) (iterate inc start)))
  

(assert (and (= (solution 1 4) (quote (1 2 3)))
             (= (solution -2 2) (quote (-2 -1 0 1)))
             (= (solution 5 8) (quote (5 6 7)))))
