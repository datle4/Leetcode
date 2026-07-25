/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function(nums) {
    if (nums.length===0)    
        return 0;

    let currEnd = 0;
    let maxReach = 0;
    let jumps = 0;

    for (let i=0; i<nums.length-1; i++) {
        maxReach = Math.max(maxReach, i + nums[i]);
        
        if (i===currEnd) {
            jumps++;
            currEnd = maxReach;
        }

        if (currEnd >= nums.length-1)
            break;
    }
    
    return jumps;
};