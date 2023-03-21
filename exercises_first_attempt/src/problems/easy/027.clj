(ns problems.easy.027)

(comment "Palindrome Detector")


(comment "Write a function which returns true
if the given sequence is a palindrome.

Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)")


(defn solution
  [a] (empty? (filter (fn [x] (= false x))
                       (for [x (range (count a))] 
                         (if (= (nth a x) (nth a (- (count a) 1 x))) 
                           true false)))))

(defn solution2 [a] (empty? (filter (fn [y] (= false y))
                                (map (fn [x] (if (= (nth a x) (nth a (- (count a) 1 x))) 
                                                 true false)) (range (count a))))))



(defn solution3 [a] (= (seq a) (reverse a)))

(defn solution4 [x] (every? true? (map #(= (nth x %1) (nth x (- (count x) 1 %1))) (range (count x)))))


(solution4 (quote (1 2 3 4 5)))

(solution2 (quote (1 2 3 4 5)))

(solution3 "racecar")

(assert (and (false? (solution4 (quote (1 2 3 4 5))))
             (true? (solution4 "racecar"))
             (true? (solution4 [:foo :bar :foo]))
             (true? (solution4 (quote (1 1 3 3 1 1))))
             (false? (solution4 (quote (:a :b :c))))))
