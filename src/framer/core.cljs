(ns ^:figwheel-always framer.core
    (:require [framer.prototype :as p]))

(enable-console-print!)

(defonce super-layer (js/Layer.))

(defn do-reload [] 
  (let [layers (js->clj (.-siblingLayers super-layer))]
    (print "reloading")
    (set! (.-background (.-style super-layer)) "transparent")
    (doseq [l layers] (.destroy l))))

(do-reload)

(p/do)

(defn on-js-reload [])
