(ns hello-clojure.fizz-buzz-test
  (:require [clojure.test :refer :all]
            [hello-clojure.fizz-buzz :refer [fizz-buzz]]))

(deftest when-number-is-both-fizz-buzz
  (testing "Number is both Fizz and Buzz"
    (is (= "FizzBuzz" (fizz-buzz 15)))))

(deftest when-number-is-only-fizz
  (testing "Number is only Fizz"
    (is (= "Fizz" (fizz-buzz 3)))))

(deftest when-number-is-only-buzz
  (testing "Number is only Buzz"
    (is (= "Buzz" (fizz-buzz 5)))))
