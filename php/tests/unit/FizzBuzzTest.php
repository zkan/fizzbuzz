<?php

require_once( "fizzbuzz.php" );

class FizzBuzzTest extends \Codeception\TestCase\Test {
    public function testInputThreeShouldReturnFizz() {
        $fizzbuzz = new FizzBuzz();
        $result = $fizzbuzz->take( 3 );
        $this->assertEquals( "Fizz", $result );
    }
}
