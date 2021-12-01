(ns giggin.fb.init
  (:require ["firebase/app" :refer (initializeApp)]
            ["firebase/database"]
            ["firebase/auth"]))

(defn firebase-init
  []
  (initializeApp
   #js {:apiKey "your-config-here"
        :authDomain "your-config-here"
        :databaseURL "your-config-here"
        :projectId "your-config-here"
        :storageBucket "your-config-here"
        :messagingSenderId "your-config-here"
        :appId "your-config-here"}))
