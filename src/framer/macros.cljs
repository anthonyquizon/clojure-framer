(ns framer.macros
  (:require))


(defmacro postfix-notation
  [expression]
  (conj (butlast expression) (last expression)))
