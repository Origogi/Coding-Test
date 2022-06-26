// Contains Duplicate

//  https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
/**
 * @param {number[]} nums
 * @return {boolean}
 */

var containsDuplicate = function (nums) {
  const memory = {};
  for (let i = 0; i < nums.length; i++) {
    if (memory[nums[i]] == true) {
      return true;
    }
    memory[nums[i]] = true;
  }

  return false;
};
