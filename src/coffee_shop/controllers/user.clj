(ns coffee-shop.controllers.user
  (:require [coffee-shop.models.user :as user-model]))

(defn get-users []
  (user-model/get-users))