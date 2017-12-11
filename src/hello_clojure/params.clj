(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn split-by
  [token]
  #(split % (re-pattern token)))

(defn parse
  ([url]
    (when (> (count url) 0)
      (reduce merge
        (map #(apply hash-map %)
          (map (split-by "=")
               ((split-by "&") url))))))
  ([] nil))
