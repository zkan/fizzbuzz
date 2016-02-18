<?php

class FizzBuzz {
    function take( $number ) {
        if ( 0 == $number % 3 ) {
            return "Fizz";
        } elseif ( 0 == $number % 5 ) {
            return "Buzz";
        }
    }
}
