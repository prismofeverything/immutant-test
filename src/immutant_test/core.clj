(ns immutant-test.core
  (:require
   [immutant.web :as web]))

(defn handler
  [request]
  {:status 200
   :headers {"content-type" "application/json"}
   :body "55"})

(defn start
  []
  (web/run handler :port 53535))

(defn -main
  []
  (start))
