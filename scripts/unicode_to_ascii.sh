#!/bin/sh

# Usage: ./unicode_to_ascii.sh file1.scala file2.scala filen.scala

for file in *.scala
do
    function r() {
	sed -i '' "s/$1/$2/g" "$file"
    }
    r σ store
    r ρ env
    r ⇒ '=>'
    r → '->'
    r ← '<-'
    r '⌞−⌟' UopMinus
    r '⌞¬⌟' UopNeg
    r '⌜+⌝' BopPlus
    r '⌜−⌝' BopMinus
    r '⌜×⌝' BopMult
    r '⌜÷⌝' BopDiv
    r '⌜∧⌝' BopAnd
    r '⌜∨⌝' BopOr
    r '⌜=⌝' BopEqual
    r '⌜≠⌝' BopNotEqual
    r '⌜≤⌝' BopLessEqual
    r '⌜<⌝' BopLess
    r '⌜::⌝' BopCons
    r × mult
    r ÷ div
    r ≈ equiv
    r ≠ notEquiv
    r ≤ lessEquiv
    r ∧ and
    r ∨ or
done
