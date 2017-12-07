(ns hello-clojure.params
  (:require [clojure.string :as string]))

(defn parse
  ([] [])
  ([url]
    (map #(string/split % #"=") (string/split url #"&"))))
