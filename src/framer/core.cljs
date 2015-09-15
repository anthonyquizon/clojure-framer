(ns ^:figwheel-always framer.core
    (:require [framer.prototype :as p]
              [framer.wrappers :as f]))

(enable-console-print!)

(defonce app-state (atom {}))

(f/cleanup)

(def a (f/addLayer {}))
;; (f/addLayer {})

(defn on-js-reload [])
