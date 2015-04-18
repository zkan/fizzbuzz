require_relative "../fizzbuzz"


describe FizzBuzz do
    describe "fizz" do
        it "returns fizz if number is three" do
            fizzbuzz = FizzBuzz.new
            result = fizzbuzz.take(3)
            expect(result).to eq "fizz"
        end
    end
end
