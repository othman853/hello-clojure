(ns hello-clojure.params-test
  (:require [clojure.test :refer :all]
            [hello-clojure.params :refer :all]))

(deftest param-parsing
  (testing "params/parse returns a vector with split key and value"
  (is(= ["lang" "clj"] (hello-clojure.params/parse "lang=clj")))))

(deftest no-args
  (testing "params/parse returns empty vector when no params are received"
    (is(= [] (hello-clojure.params/parse)))))
