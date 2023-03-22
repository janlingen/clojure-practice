(ns problems.elementary.156)

(comment "Map Defaults")


(comment "When retrieving values from a map, you can specify default
values in case the key is not found:

(= 2 (:foo {:bar 0, :baz 1} 2))

However, what if you want the map itself to contain the default values? Write a
function which takes a default value and a sequence of keys and constructs a map.")


(defn solution
  [x y] 
  (zipmap y (iterate identity x)))


(assert (and (= (solution 0 [:a :b :c]) {:a 0, :b 0, :c 0})
             (= (solution "x" [1 2 3]) {1 "x", 2 "x", 3 "x"})
             (= (solution [:a :b] [:foo :bar]) {:foo [:a :b], :bar [:a :b]})))
