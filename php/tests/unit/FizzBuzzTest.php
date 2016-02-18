<?php

require_once( "fizzbuzz.php" );

class FizzBuzzTest extends \Codeception\TestCase\Test {
    private $fizzbuzz;

    protected function _before() {
        $this->fizzbuzz = new FizzBuzz();
    }

    public function testInputThreeShouldReturnFizz() {
        $result = $this->fizzbuzz->take( 3 );
        $this->assertEquals( "Fizz", $result );
    }

    public function testInputSixShouldReturnFizz() {
        $result = $this->fizzbuzz->take( 6 );
        $this->assertEquals( "Fizz", $result );
    }

    public function testInputFiveShouldReturnBuzz() {
        $result = $this->fizzbuzz->take( 5 );
        $this->assertEquals( "Buzz", $result );
    }
}
