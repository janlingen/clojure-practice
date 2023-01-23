(ns problems.elementary.036)

(comment "Let it Be")

(comment "Can you bind x, y, and z so that these are all true?")

(def z 1)
(def y 3)
(def x 7)

;; solution should be the same in all three instances
(assert (and (= 10 (+ x y))
             (= 4 (+ y z))
             (= 1 z)))
