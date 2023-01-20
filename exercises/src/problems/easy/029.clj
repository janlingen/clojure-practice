(ns problems.easy.029)

(comment "Get the Caps")


(comment "Write a function which takes a string
and returns a new string containing only the capital letters.")


(defn solution
  [& args]
  (apply str (filter 
    (fn [x] (if (re-matches #"[A-Z]" (.toString x)) true false)) (first args))))

(solution "HelLo")

(assert (and (= (solution "HeLlO, WoRlD!") "HLOWRD")
             (empty? (solution "nothing"))
             (= (solution "$#A(*&987Zf") "AZ")))
