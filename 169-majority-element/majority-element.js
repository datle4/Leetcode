/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const frequency = new Map();

    for (const number of nums) {
        frequency.set(
            number,
            (frequency.get(number) || 0) + 1
        );
    }
    
    let maxFrequency = 0;
    let maxNumber = 0;

    for (const [number, count] of frequency) {
        if (count > maxFrequency) {
            maxFrequency = count;
            maxNumber = number;
        }
    }

    return maxNumber;
};