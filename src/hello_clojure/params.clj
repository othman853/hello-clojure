(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn separate
  [token]
  #(split % token))

(defn parse
  ([url]
    (if (= (count url) 0)
      []
      (map (separate #"=")
           ((separate #"&") url))))
  ([] []))
