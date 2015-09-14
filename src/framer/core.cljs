(ns ^:figwheel-always framer.core
    (:require [framer.prototype :as p]))

(enable-console-print!)

(defonce app-state (atom {}))
(defonce super-layer (js/Layer.))

(defn do-reload [] 
  (let [layers (js->clj (.-siblingLayers super-layer))]
    (print "reloading")
    (set! (.-background (.-style super-layer)) "transparent")
    (doseq [l layers] (.destroy l))))

(do-reload)

(p/do app-state)

(defn on-js-reload [])
