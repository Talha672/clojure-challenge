(ns adventofcode.unit.calculator-fuel-test
  (:require [clojure.test :refer :all]
            [adventofcode.logic.calculator-fuel :as calculator-fuel]
            [adventofcode.data :as data]))

(deftest calc-math-floor-test
  (testing "Should return the value: 654"
    (is (= (calculator-fuel/calc-math-floor 1969) 654))))

(deftest fuel-by-mass-test
  (testing "Should return the value: 966"
    (is (= (calculator-fuel/fuel-by-mass 1969) 966))))

(deftest total-fuel-required-test
  (testing "Should return the value: 5132018"
    (let [list-modules (:list-mass-modules data/darkstar-informations)]
      (is (= (calculator-fuel/total-fuel-required list-modules) 5132018)))))