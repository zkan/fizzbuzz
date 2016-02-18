<?php

class FizzBuzz {
    function take( $number ) {
        if ( 0 == $number % 3 ) {
            return "Fizz";
        } elseif ( 5 == $number ) {
            return "Buzz";
        }
    }
}
