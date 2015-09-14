(ns framer.prototype
  (:require))

;;TODO helper functions/marcos for cljs to js


;; (def hello (js/Hello. (js-obj "a" "hello")))
;; (.appendChild (.-_element layer) textarea-dom)

(defn do []
  (let [textarea-dom (.createElement js/document "textarea")
        layer (js/Layer.)]
    
    ;; (set! (.-background (.-style layer)) "transparent")
    (set! (.-height (.-style layer)) "1000px")
    (set! (.-width (.-style layer)) "1000px")
    (.appendChild (.-_element layer) textarea-dom)
    ))
    
    

  
