(ns coffee-shop.system
  (:require [com.stuartsierra.component :as component]
            [org.httpkit.server :refer [run-server]]
            [coffee-shop.routes :refer [app]]))

(defn start-server [handler port]
  (let [server (run-server handler {:port port})]
    (println "Server running at port" port)
    server))

(defn stop-server [server]
  (when server
    (server)))

(defrecord CoffeeShop []
  component/Lifecycle
  (start [component]
    (assoc component :server (start-server #'app 3000)))
  (stop [component]
    (stop-server (:server component))
    (dissoc component :server)))

(defn create-system []
  (CoffeeShop.))

(defn -main []
  (.start (create-system)))