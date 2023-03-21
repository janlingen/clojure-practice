(ns problems.hard.079)

(comment "Triangle Minimal Path")


(comment "Write a function which calculates
the sum of the minimal path through a triangle.
The triangle is represented as a vector of vectors.
The path should start at the top of the triangle
and move to an adjacent number on the next row
until the bottom of the triangle is reached.")


(defn solution
  [& args])


(assert (and (= (solution [[1] [2 4] [5 1 4] [2 3 4 5]]) (+ 1 2 1 3) 7)
             (= (solution [[3] [2 4] [1 9 3] [9 9 2 4] [4 6 6 7 8] [5 7 3 5 1 4]]) (+ 3 4 3 2 7 1) 20)))
