(ns adventofcode.logic.calculator-fuel)

(defn fuel-by-mass
  [mass]
  (- (int (Math/floor (/ mass 3))) 2))

(defn total-fuel-required
  [list-of-mass]
  (let [calculated-modules (map #(fuel-by-mass %1) list-of-mass)]
    (reduce + calculated-modules)))
