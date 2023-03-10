(ns problems.hard.092)

(comment "Read Roman numerals")


(comment "Roman numerals are easy to recognize,
but not everyone knows all the rules necessary to work with them.
Write a function to parse a Roman-numeral string
and return the number it represents.

You can assume that the input will be well-formed,
in upper-case, and follow the subtractive principle.
You don't need to handle any numbers greater than MMMCMXCIX (3999),
the largest number representable with ordinary letters.")


(defn solution
  [& args])


(assert (and (= 14 (solution "XIV"))
             (= 827 (solution "DCCCXXVII"))
             (= 3999 (solution "MMMCMXCIX"))
             (= 48 (solution "XLVIII"))))
