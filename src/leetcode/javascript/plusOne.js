// https://leetcode.com/problems/plus-one/submissions/

var plusOne = function(digits) {

    let result = [...digits];

    result[result.length-1] = result[result.length -1] +1;

    var i = result.length -1;

    while(i > 0 && result[i] >= 10) {
      result[i] -= 10;
      result[i - 1] += 1;
      i--;
    }

    if (result[0] >= 10) {
        result[i] -= 10;
        result = [1,...result];
    }

    return result;
};