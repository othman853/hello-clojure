(ns hello-clojure.params-test
  (:require [clojure.test :refer :all]
            [hello-clojure.params :refer :all]))

(deftest single-param
  (testing "params/parse returns a vector of vectors of split key and value"
  (is(= [["lang" "clj"] ["runtime" "jvm"]] (hello-clojure.params/parse "lang=clj&runtime=jvm")))))

(deftest no-args
  (testing "params/parse returns empty vector when no params are received"
    (is(= [] (hello-clojure.params/parse)))))
