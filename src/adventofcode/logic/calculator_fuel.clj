(ns adventofcode.logic.calculator-fuel)

(defn calc-math-floor
  [value]
  (- (int (Math/floor (/ value 3))) 2))

(defn fuel-by-mass
  [mass]
  (let [fuel-required (calc-math-floor mass)]
    (if (< (calc-math-floor fuel-required) 0)
      fuel-required
      (+ (fuel-by-mass fuel-required) fuel-required))))

(defn total-fuel-required
  [list-of-mass]
  (let [calculated-modules (map #(fuel-by-mass %1) list-of-mass)]
    (reduce + calculated-modules)))
