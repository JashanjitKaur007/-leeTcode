
var createCounter = function(n) {

    let store = n;

    function call() {
        return store++;
    };

    return call;
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */