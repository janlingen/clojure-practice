(ns problems.elementary.057)

(comment "Simple Recursion")


(comment "A recursive function is a function which calls itself.
This is one of the fundamental techniques
used in functional programming.")


(def solution [5 4 3 2 1])

(assert (and (= solution ((fn foo [x] 
                            (when (> x 0) 
                              (conj (foo (dec x)) x))) 5))))
