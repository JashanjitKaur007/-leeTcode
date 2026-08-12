/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {

    let store = init;

    return{
        increment: () => {
            return ++ store;
        },

        reset: () => {
            return (store = init);
        },

        decrement: () => {
            return -- store;
        } 
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */