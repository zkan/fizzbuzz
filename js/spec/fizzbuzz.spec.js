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
});
