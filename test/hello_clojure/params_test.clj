(ns hello-clojure.params-test
  (:require [clojure.test :refer :all]
            [hello-clojure.params :refer :all]))

(deftest param-parsing
  (testing "HTTP Query Parameter Parsing echoes parameters back."
  (is (= "lang=Clj" (params/parse "lang=clj")))))
