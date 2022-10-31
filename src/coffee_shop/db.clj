(ns coffee-shop.db
  (:require [monger.core :as mg]))

(defn connect-db [db]
  (let [conn (mg/connect)
        db (mg/get-db conn db)]
    db))