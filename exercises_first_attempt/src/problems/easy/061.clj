(ns problems.easy.061)

(comment "Map Construction")


(comment "Write a function which takes a vector of keys
and a vector of values and constructs a map from them.")


(defn solution
  [x y] (zipmap x y))

(defn solution2 
  [x y] (into (hash-map) (mapv (fn [a b] {a b}) x y)))


(assert (and (= (solution2 [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
             (= (solution2 [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
             (= (solution2 [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))
