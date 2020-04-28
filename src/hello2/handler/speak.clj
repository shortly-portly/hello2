(ns hello2.handler.speak
  (:require [integrant.core :as ig]))

(defmethod ig/init-key :hello2.handler.speak/say-something [_ {:keys [message]}]
  (fn [_]
    {:status 200
     :headers {}
     :body (str message)}))
