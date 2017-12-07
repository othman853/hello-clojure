(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn parse
  ([] [])
  ([url]
    (map #(split % #"=") (split url #"&"))))
