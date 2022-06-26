//   Single Number
//   https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  return nums.reduce((a, b) => a ^ b);
};
