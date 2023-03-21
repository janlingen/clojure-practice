(ns problems.selfdev.records)

(defrecord Person [name age])

(def jan (Person. "Jan" 24)) ; interop java version

(def frank (->Person "Frank" 24))

(:age jan)
(.age frank) ; interop java version

(:name jan)
(get frank :name)

(assoc jan :degree "CS")

(defprotocol Say
  (greeter [x])
  (my-age [x]))

(defrecord Person2 [name age]
  Say
  (greeter [x] (str (:name x) " is my Name!"))
  (my-age [x] (str "I am " (:age x) " years old.")))

(def dirk (Person2. "Dirk" 50)) 

(greeter dirk)
(my-age dirk)





