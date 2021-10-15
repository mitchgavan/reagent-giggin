(ns giggin.fb.init
  (:require ["firebase/app" :refer (initializeApp)]
            ["firebase/database"]
            ["firebase/auth"]))

(defn firebase-init
  []
  (initializeApp
   {:apiKey "AIzaSyCeWo47RQ_MEMPd1HQqbbGPPBHWhv82SzU"
    :authDomain "giggin-a946d.firebaseapp.com"
    :projectId "giggin-a946d"
    :storageBucket "giggin-a946d.appspot.com"
    :messagingSenderId "1039419646807"
    :appId "1:1039419646807:web:38695bc99ff772ab67d412"}))
