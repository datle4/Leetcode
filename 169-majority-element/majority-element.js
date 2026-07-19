/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let res = 0;
    let majority = 0;

    for (const number of nums) {
        if (majority === 0)
            res = number;

        majority += number === res ? 1 : -1;
    }

    return res;
};