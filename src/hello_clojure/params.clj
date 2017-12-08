(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn split-by
  [token]
  #(split % (re-pattern token)))

(defn parse
  ([url]
    (if (= (count url) 0)
      []
      (map (split-by "=")
           ((split-by "&") url))))
  ([] []))
