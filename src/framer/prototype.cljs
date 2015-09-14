(ns framer.prototype
  (:require))

;; TODO layer set macros


(defn do [app-state]
  (let [textarea-dom (.createElement js/document "textarea")
        layer (js/Layer.)]
    (print @app-state)
    (set! (.-ignoreEvents layer) false)
    (set! (.-border (.-style textarea-dom)) "none")
    (set! (.-background (.-style layer)) "transparent")
    (set! (.-height (.-style layer)) "1000px")
    (set! (.-width (.-style layer)) "1000px")
    (set! (.-onkeyup textarea-dom) (fn [] (print "hello")))
    
    (.appendChild (.-_element layer) textarea-dom)
    ))
    
    

  
