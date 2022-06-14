(ns adventofcode.darkstar
  (:require [adventofcode.logic.calculator-fuel :as calculador-fuel]
            [adventofcode.data :as data]))

(defn darkstar-checkup
  []
  (calculador-fuel/total-fuel-required (:list-mass-modules data/darkstar-informations)))

