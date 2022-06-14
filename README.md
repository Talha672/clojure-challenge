# adventofcode

A Clojure library designed to ... well, that part is up to you.

## Usage

Share some tips and knowledge that I'm acquiring in Clojure through a 25-step challenge proposed through the website https://adventofcode.com/2019

#### Day 1: The Tyranny of the Rocket Equation
-   It is necessary to create a logic to calculate the fuel needed for a space ship to take off, being calculated by module of the ship and then the total needed.

**Logic:**
I created two functions one to separately calculate the fuel per module and then through `reducer` I did the general calculation and save the data in a temporary list.

The reducer applies a function to all elements of a list and returns the result, in this case the function applied was `+` i.e. for every element it is added to the next value of the input list.
