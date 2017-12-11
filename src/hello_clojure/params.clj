(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn split-by
  [token]
  #(split % (re-pattern token)))

(defn parse
  ([url]
    (when (> (count url) 0)
      (->> url
        ((split-by "&"))
        (map (split-by "="))
        (map #(apply hash-map %))
        (reduce merge))))
  ([] nil))
