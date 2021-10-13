(ns giggin.api
  (:require [ajax.core :refer [GET]]))

(defn handler [response]
  (.log js/console response))

(defn error-handler [{:keys [status status-text]}]
  (.log js/console (str "something bad happened: " status " " status-text)))

(defn fetch-gigs
  []
  (GET "https://gist.githubusercontent.com/jacekschae/6f449ccd07d78740c6dcb54b07a3d5bc/raw/c94e3c21ea39248adb5c23636a0f5fe3d9a4f5f9/gigs.json"
    {:handler handler
     :error-handler error-handler
     :response-format :json
     :keywords? true}))