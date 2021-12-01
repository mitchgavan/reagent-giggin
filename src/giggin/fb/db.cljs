(ns giggin.fb.db
  (:require ["firebase/database" :refer (getDatabase ref set)]
            [clojure.string :as str]))

(defn db-ref
  [path]
  (ref (getDatabase) (str/join "/" path)))

(defn db-save!
  [path value]
  (set (db-ref path) value))