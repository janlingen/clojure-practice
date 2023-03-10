(ns problems.hard.119)

(comment "Win at Tic-Tac-Toe")


(comment "As in Problem 73, a tic-tac-toe board
is represented by a two dimensional vector.
X is represented by :x, O is represented by :o,
and empty is represented by :e.
Create a function that accepts a game piece and board as arguments,
and returns a set (possibly empty) of all valid board placements
of the game piece which would result in an immediate win.

Board coordinates should be as in calls to get-in.
For example, [0 1] is the topmost row, center position.")


(defn solution
  [& args])


(assert (and (is (= (solution :x [[:o :e :e] [:o :x :o] [:x :x :e]]) #{[2 2] [0 2] [0 1]}))
             (is (= (solution :x [[:x :o :o] [:x :x :e] [:e :o :e]]) #{[2 2] [2 0] [1 2]}))
             (is (= (solution :x [[:x :e :x] [:o :x :o] [:e :o :e]]) #{[2 2] [2 0] [0 1]}))
             (is (= (solution :x [[:x :x :o] [:e :e :e] [:e :e :e]]) #{}))
             (is (= (solution :o [[:x :x :o] [:o :e :o] [:x :e :e]]) #{[2 2] [1 1]}))))
