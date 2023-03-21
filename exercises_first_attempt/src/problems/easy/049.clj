(ns problems.easy.049)

(comment "Split a sequence")


(comment "Write a function which will
split a sequence into two parts.")


(defn solution
  [x y] [(take x y) (drop x y)] )


(assert (and (= (solution 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
             (= (solution 1 [:a :b :c :d]) [[:a] [:b :c :d]])
             (= (solution 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))
