
var createCounter = function(init) {

    let num = init;
    return {
        increment: function () {
            return ++num;
        },
        reset: function () {
            num = init;
            return init;
        },
        decrement: function () {
            return --num;
        }
    }
};
