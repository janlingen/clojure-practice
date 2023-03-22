(ns problems.elementary.014)

(comment "Functions")

(comment "Clojure has many different ways to create functions.")

(def solution 8)

(conj (list 1 2 3) 4 5)


(assert (and (= solution ((fn add-five [x] (+ x 5)) 3))
             (= solution ((fn [x] (+ x 5)) 3))
             (= solution ((fn* [p1__4818#] (+ p1__4818# 5)) 3))
             (= solution ((partial + 5) 3))))
