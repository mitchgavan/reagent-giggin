(ns giggin.core
  (:require [reagent.dom :refer [render]]
            [giggin.components.header :refer [header]]
            [giggin.components.footer :refer [footer]]
            [giggin.components.gigs :refer [gigs]]
            [giggin.components.orders :refer [orders]]
            [giggin.api :as api]
            ["@chakra-ui/react" :refer [ChakraProvider]]))

(defn app
  []
  [:> ChakraProvider
   [:div.container
    [header]
    [gigs]
    [orders]
    [footer]]])

(defn ^:export main
  []
  (api/fetch-gigs)
  (render
   [app]
   (.getElementById js/document "app")))
