(ns hello-clojure.params-test
  (:require [clojure.test :refer :all]
            [hello-clojure.params :refer [parse]]))

(deftest single-param
  (testing "parse returns a hash-map of all search params"
    (is(= {"lang" "clj" "runtime" "jvm"} (parse "lang=clj&runtime=jvm")))))

(deftest empty-str
  (testing "parse returns an nil when received argument is empty str"
    (is(= nil (parse "")))))
