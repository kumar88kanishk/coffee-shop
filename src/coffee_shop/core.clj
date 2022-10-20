(ns coffee-shop.core
  (:require [clojure.spec.alpha :as s]))

(s/def :coffee-shop/volume int?)
(s/def :coffee-shop/temp int?)
(s/def :coffee-shop/taste int?)
(s/def :coffee-shop/milk (s/keys :req [:coffee-shop/volume :coffee-shop/temp :coffee-shop/taste]))
(s/def :coffee-shop/espresso (s/keys :req [:coffee-shop/volume :coffee-shop/temp :coffee-shop/taste]))
(s/def :coffee-shop/latte (s/keys :req [:coffee-shop/milk :coffee-shop/espresso]))

(def latte {:coffee-shop/milk {:coffee-shop/volume 100
                               :coffee-shop/temp 100
                               :coffee-shop/taste 100}
            :coffee-shop/espresso {:coffee-shop/volume 100
                                   :coffee-shop/temp 100
                                   :coffee-shop/taste 100}})

(s/conform :coffee-shop/latte latte)













