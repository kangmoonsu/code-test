// [문제 링크]: https://www.acmicpc.net/problem/1000

const fs = require('fs');
const inputData = fs.readFileSync(0, 'utf8').toString().split(' ');
​
const A = parseInt(inputData[0]);
const B = parseInt(inputData[1]);
​
console.log(A+B);