(ns problems.hard.127)

(comment "Love Triangle")


(comment "Everyone loves triangles,
and it’s easy to understand why —
they’re so wonderfully symmetric
(except scalenes, they suck).

Your passion for triangles has led you to become a miner
(and part-time Clojure programmer) where you work all day
to chip out isosceles-shaped minerals from rocks
gathered in a nearby open-pit mine.
There are too many rocks coming from the mine to harvest them all
so you’ve been tasked with writing a program
to analyze the mineral patterns of each rock,
and determine which rocks have the biggest minerals.

Someone has already written a computer-vision system for the mine.
It images each rock as it comes into the processing centre
and creates a cross-sectional bitmap of mineral (1)
and rock (0) concentrations for each one.

You must now create a function which
accepts a collection of integers,
each integer when read in base-2
gives the bit-representation of the rock
(again, 1s are mineral and 0s are worthless scalene-like rock).
You must return the cross-sectional area of
the largest harvestable mineral from the input rock, as follows:

The minerals only have smooth faces when
sheared vertically or horizontally from the rock’s cross-section
The mine is only concerned with harvesting
isosceles triangles (such that one or two sides can be sheared)
If only one face of the mineral is sheared,
its opposing vertex must be a point
(ie. the smooth face must be of odd length),
and its two equal-length sides must intersect
the shear face at 45° (ie. those sides must cut even-diagonally)
The harvested mineral may not contain any traces of rock
The mineral may lie in any orientation in the plane
Area should be calculated as the sum of 1s that comprise the mineral
Minerals must have a minimum of three measures of area to be harvested
If no minerals can be harvested from the rock,
your function should return nil")


(defn solution
  [& args])


(assert (and (= 10 (solution [15 15 15 15 15]))
             (= 15 (solution [1 3 7 15 31]))
             (= 3 (solution [3 3]))
             (= 4 (solution [7 3]))
             (= 6 (solution [17 22 6 14 22]))
             (= 9 (solution [18 7 14 14 6 3]))
             (= nil (solution [21 10 21 10]))
             (= nil (solution [0 31 0 31 0]))))
