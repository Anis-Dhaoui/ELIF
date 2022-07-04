console.log("hello again javascript");

const arr1 = [1,2,3,4,5];
const arr2 = [6,7,8,9,10];
const arr3 = [11,12,13,14,15];

var sumArr1 = arr1.reduce((prev, curr, index, arr) => prev + curr, 0);

console.log(sumArr1);