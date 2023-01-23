(ns problems.selfdev.protocols)

(defprotocol WhichType
  (foo [obj]))

(extend-protocol WhichType
  nil
  (foo [_] (str "foo-A!"))
  String
  (foo [s] (str "foo-A-" (.toUpperCase s))))

(defrecord Person [name age]
  WhichType
  (foo [_] "I am a Person!"))

(foo "String")

(foo nil)

(foo (Person. "Jan" 24))


