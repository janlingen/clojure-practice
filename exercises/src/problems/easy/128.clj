(ns problems.easy.128)

(comment "Recognize Playing Cards")


(comment "A standard American deck of playing cards has four suits - spades,
hearts, diamonds, and clubs - and thirteen cards in each suit. Two is the lowest rank,
followed by other integers up to ten; then the jack, queen, king, and ace.

It's convenient for humans to represent these cards as suit/rank pairs, such as H5 or DQ:
the heart five and diamond queen respectively. But these forms are not convenient for
programmers, so to write a card game you need some way to parse an input string into
meaningful components. For purposes of determining rank, we will define the cards to
be valued from 0 (the two) to 12 (the ace)

Write a function which converts (for example) the string "SJ" into a map of
{:suit :spade,:rank 9}. A ten will always be represented with the single character
"T", rather than the two characters "10".")


(defn solution
  [& args])


(assert (and (= {:suit :diamond, :rank 10} (solution "DQ"))
             (= {:suit :heart, :rank 3} (solution "H5"))
             (= {:suit :club, :rank 12} (solution "CA"))
             (= (range 13) (map (comp :rank solution str) (quote [S2 S3 S4 S5 S6 S7 S8 S9 ST SJ SQ SK SA])))))
