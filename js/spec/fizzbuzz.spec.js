describe("FizzBuzz", function() {
    var app;

    beforeEach(function() {
        app = require("../app/fizzbuzz");
    });

    describe("fizz is returned if input is divisible by 3", function() {
        it("should return fizz if input is 3", function() {
            result = app.fizzbuzz(3);
            expect(result).toBe("fizz");
        });

        it("should return fizz if input is 6", function() {
            result = app.fizzbuzz(6);
            expect(result).toBe("fizz");
        });
    });

    describe("buzz is returned if input is divisible by 5", function() {
        it("should return buzz if input is 5", function() {
            result = app.fizzbuzz(5);
            expect(result).toBe("buzz");
        });

        it("should return buzz if input is 10", function() {
            result = app.fizzbuzz(10);
            expect(result).toBe("buzz");
        });
    });

    describe("fizzbuzz is returned if input is divisible by 3 and 5", function() {
        it("should return fizzbuzz if input is 15", function() {
            result = app.fizzbuzz(15);
            expect(result).toBe("fizzbuzz");
        });

        it("should return fizzbuzz if input is 30", function() {
            result = app.fizzbuzz(30);
            expect(result).toBe("fizzbuzz");
        });
    });

    describe("input itself is returned if input is not divisible by 3 and 5", function() {
        it("should return 2 if input is 2", function() {
            result = app.fizzbuzz(2);
            expect(result).toBe(2);
        });

        it("should return 7 if input is 7", function() {
            result = app.fizzbuzz(7);
            expect(result).toBe(7);
        });
    });
});
