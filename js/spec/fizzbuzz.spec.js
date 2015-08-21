describe("FizzBuzz", function() {
    it("should return fizz if input is 3", function() {
        app = require("../app/fizzbuzz");
        result = app.fizzbuzz(3);
        expect(result).toBe("fizz");
    });
});
