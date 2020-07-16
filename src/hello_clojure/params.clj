(ns hello-clojure.params
  (:require [clojure.string :refer [split]]))

(defn split-by
  [token]
  (fn [content]
    (split content (re-pattern token))))

(defn parse
  ([url]
   (when (> (count url) 0)
     (->> ((split-by "&") url)
         (map (split-by "="))
         (map #(apply hash-map %))
         (reduce merge)))))
