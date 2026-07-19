/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    if (nums.length === 0) {
        return;
    }

    k %= nums.length;

    const newArray = nums.map(
        (_, index) =>
        nums[(index - k + nums.length) % nums.length]
    );

    for (let index = 0; index < nums.length; index++) {
        nums[index] = newArray[index];
    }
};