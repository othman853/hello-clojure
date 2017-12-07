(ns hello-clojure.params-test
  (:require [clojure.test :refer :all]
            [hello-clojure.params :refer [parse]]))

(deftest single-param
  (testing "parse returns a vector of vectors of split key and value"
    (is(= [["lang" "clj"] ["runtime" "jvm"]] (parse "lang=clj&runtime=jvm")))))

(deftest empty-str
  (testing "parse returns an empty vector when received argument is empty str"
    (is(= [] (parse "")))))

(deftest no-args
  (testing "parse returns empty vector when no params are received"
    (is(= [] (parse)))))
