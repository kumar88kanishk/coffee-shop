(ns coffee-shop.models.user
  (:require [monger.collection :as mc]
            [monger.json]
            [monger.joda-time]
            [coffee-shop.db :refer [connect-db]]))

(defn add-user [user]
  (-> (connect-db "coffee-shop")
      (mc/insert "users" user)))

(defn add-users [users]
  (-> (connect-db "coffee-shop")
      (mc/insert-batch "users" users)))

(defn get-users []
  (-> (connect-db "coffee-shop")
      (mc/find-maps "users")))


