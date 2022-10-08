// https://leetcode.com/problems/length-of-last-word/

var lengthOfLastWord = function(s) {
    let result = 0;
    for (var i = s.length -1; i >=0;i--) {
        if (s[i] === ' ') {
            if (result > 0) {
                break;
            }
        } else {
            result++;
        }
    }
    return result;

};

console.log(lengthOfLastWord('test'));