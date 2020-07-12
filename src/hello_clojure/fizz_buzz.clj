(ns hello-clojure.fizz-buzz)

(defn fizz
  [n]
  (= (mod n 3) 0))

(defn buzz
  [n]
  (= (mod n 5) 0))

(defn fizz-buzz
  [n]
  (cond
    (and (fizz n) (buzz n)) "FizzBuzz"
    (fizz n) "Fizz"
    (buzz n) "Buzz"))

