(defproject coffee-shop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.stuartsierra/component "1.1.0"]
                 [compojure "1.7.0"]
                 [http-kit "2.6.0"]
                 [com.novemberain/monger "3.1.0"]
                 [cheshire "5.1.1"]
                 [clj-time "0.15.2"]]
  :main ^:skip-aot coffee-shop.system
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
