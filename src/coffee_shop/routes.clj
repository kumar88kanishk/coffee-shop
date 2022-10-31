(ns coffee-shop.routes
  (:require [compojure.core :refer [defroutes GET]]
            [coffee-shop.controllers.user :as user-controller]))

(defn add-headers [status-code body]
  {:status (case status-code
             "success" 200
             "internal-error" 500
             "not-found" 400)
   :headers {"Content-Type" "text/json"}
   :body    body})

(defroutes app
  (GET "/" [] (add-headers "not-found" (user-controller/get-users))))