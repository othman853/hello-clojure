(ns hello-clojure.params-test
  (:require [clojure.test :refer :all]
            [hello-clojure.params :refer :all]))

(deftest param-parsing
  (testing "HTTP Query Parameter Parsing returns a vector with split key and value"
  (is (= ["lang" "clj"] (hello-clojure.params/parse "lang=clj")))))
