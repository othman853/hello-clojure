(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn parse
  ([url]
    (if (= (count url) 0)
      []
      (map #(split % #"=") (split url #"&"))))
  ([] []))
