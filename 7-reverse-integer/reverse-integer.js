/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    const isNegative = x < 0 ? -1 : 1;
    x = Math.abs(x);

    let result = 0;

    while (x>0) {
        result = result*10 + x%10;
        x = Math.trunc(x / 10);
    }

    result = result*isNegative;

    if (result < -(2 ** 31) || result > 2 ** 31 - 1) {
        return 0;
    }

    return result;
};