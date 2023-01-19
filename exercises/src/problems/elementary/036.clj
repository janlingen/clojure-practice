(ns problems.elementary.036)

(comment "Let it Be")

(comment "Can you bind x, y, and z so that these are all true?")

;; solution should be the same in all three instances
(assert (and (= 10 (let [x 0 y 10] (+ x y)))
             (= 4 (let [y 0 z 4] (+ y z)))
             (= 1 (let [z 1] z))))
