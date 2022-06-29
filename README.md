# adventofcode

A Clojure library designed to ... well, that part is up to you.

## Usage

Share some tips and knowledge that I'm acquiring in Clojure through a 25-step challenge proposed through the website https://adventofcode.com/2019

## Day 1: The Tyranny of the Rocket Equation
### Parte One:
- It is necessary to create a logic to calculate the fuel needed for a space ship to take off, being calculated by module of the ship and then the total needed.
    
**Logic:**
    I created two functions one to separately calculate the fuel per module and then through `reducer` I did the general calculation and save the data in a temporary list.

### Parte Two:
-   It is necessary to create a logic to calculate the fuel needed for a spacecraft to take off, being calculated by module of the spacecraft and then the total needed considering the fuel as a mass that also requires fuel. 

**Logic:**
I created one more function `calc-math-floor` to just calculate the fuel required, then I used this return in recursive calls while the function has values `>` bigger then zero.
''
The reducer applies a function to all elements of a list and returns the result, in this case the function applied was `+` i.e. for every element it is added to the next value of the input list.
