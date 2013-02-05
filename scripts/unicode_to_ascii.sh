#!/bin/sh

for file in *.scala
do
    function r() {
	sed -i '' "s/$1/$2/g" "$file"
    }
    r σ store
    r ρ env
    r ⇒ '=>'
    r → '->'
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
    r × mult
    r ÷ div
    r ≈ equiv
    r ≠ notEquiv
    r ≤ lessEquiv
    r ∧ and
    r ∨ or
done
