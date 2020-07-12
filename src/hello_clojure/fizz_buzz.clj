(ns hello-clojure.fizz-buzz)

(defn is-divisible-by [d]
  (fn [x]
    (= 0 (mod x d))))

(def fizz (is-divisible-by 3))
(def buzz (is-divisible-by 5))

(defn fizz-buzz
  [n]
  (cond
    (and (fizz n) (buzz n)) "FizzBuzz"
    (fizz n) "Fizz"
    (buzz n) "Buzz"
    :else (str n)))

