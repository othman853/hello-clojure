(ns hello-clojure.params
  (:require [clojure.string :as string]))

(defn parse
  ([] [])
  ([url] (string/split url #"=")))
