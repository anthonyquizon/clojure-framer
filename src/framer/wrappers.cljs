(ns framer.wrappers
  (:require))

(defonce layers (atom []))

(defn addLayer [attributes]
  (let [layer (js/Layer.)]
    ;;TODO set attributes
    (swap! layers conj layer)
    layer
    ))

(defn setLayer [attributes]
  ;;TODO
  )

(defn appendDOM []
  ;;TODO
  )

(defn cleanup []
  (doseq [l @layers] (.destroy l))
  (reset! layers []))
