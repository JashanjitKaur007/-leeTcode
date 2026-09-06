var createCounter = function(n) {
    
    let num = n;

    return function() {
        // num =num + 1;
        return num++;
    };
};