var createCounter = function(n) {

    // n++ happens only once when createCounter(n) is called.
    // n++;        

    // Your code has one key issue: sum() always returns n + 1, but it doesn't update n.
    // function sum (n) {
    //     return n+1;
    // };

    function sum () {
        // return n + 1;
        return n ++ ;
    }

    // return sum();
    return sum;
};


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */