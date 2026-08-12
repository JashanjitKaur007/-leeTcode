// obj + closure

// var createCounter = function(init) {
//     let store = init;

//     function increment() {
//         return ++store;
//     }
//     function decrement() {
//         return --store;
//     }
//     function reset() {
//         return (store = init);
//     }

//     return {increment, decrement, reset};
// };


var createCounter = function(init) {
    let store = init;

    return {
        increment:() => ++ store,
        decrement:() => -- store,
        reset:() => (store = init),
    }

    // return {increment, decrement, reset};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */