(ns problems.easy.122)

(comment "Read a binary number")


(comment "Convert a binary number,
provided in the form of a string,
to its numerical value.")

(defn exp [x n]
     (if (zero? n) 1
         (* x (exp x (dec n)))))


(defn solution
  [a] (map (fn [x y] (if (= x \1) (+ 1 y))) (reverse a) (range (count a))))

(assert (and (= 0 (solution "0"))
             (= 7 (solution "111"))
             (= 8 (solution "1000"))
             (= 9 (solution "1001"))
             (= 255 (solution "11111111"))
             (= 1365 (solution "10101010101"))
             (= 65535 (solution "1111111111111111"))))
