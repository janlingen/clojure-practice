(ns problems.selfdev.matrix)

(def identity-matrix [[1 0 0] [0 1 0] [0 0 1]])
(def matrix2 [[1 0 0 1] [0 1 0 1] [0 0 1 1]])

(defn p! [x] (map println x))

(defn trans [x] 
  (for [y (range (count (first x)))] 
    (for [z x] (get z y))))

(p! identity-matrix)
(p! matrix2)

(p! (trans identity-matrix))
(p! (trans matrix2))