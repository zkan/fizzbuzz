describe("FizzBuzz", function() {
    var app;

    beforeEach(function() {
        app = require("../app/fizzbuzz");
    });

    it("should return fizz if input is 3", function() {
        result = app.fizzbuzz(3);
        expect(result).toBe("fizz");
    });

    it("should return fizz if input is 6", function() {
        result = app.fizzbuzz(6);
        expect(result).toBe("fizz");
    });

    it("should return buzz if input is 5", function() {
        result = app.fizzbuzz(5);
        expect(result).toBe("buzz");
    });

    it("should return buzz if input is 10", function() {
        result = app.fizzbuzz(10);
        expect(result).toBe("buzz");
    });

    it("should return fizzbuzz if input is 15", function() {
        result = app.fizzbuzz(15);
        expect(result).toBe("fizzbuzz");
    });

    it("should return fizzbuzz if input is 30", function() {
        result = app.fizzbuzz(30);
        expect(result).toBe("fizzbuzz");
    });
});
