/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let goal = nums.length-1;
    let i = nums.length-2;

    while (i>=0) {
        if (nums[i] + i >= goal) {
            goal = i;
        }
        i--;
    }

    return (goal === 0);
};