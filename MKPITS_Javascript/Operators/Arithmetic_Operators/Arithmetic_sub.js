//if we take two numbers for subtraction then it give subtraction result.
let a = 20;
let b = 10;
let sub = a - b;
console.log("subtraction of a and b :" + sub);

//In subtraction the numbers in the string are converted to the corresponding numbers.
let c = "2"; //string number
let d = 1;
let sub1 = c - d;
console.log("subtraction of c and d :" + sub1);

//In subtraction words in the string are converted to NaN.
let e = "hello"; //NaN
let f = 2;
let sub2 = e - f;
console.log("subtraction of e and f :" + sub2);

//we will perform a subtraction operation on the BigInt data type.
console.log(200n - 100n);
console.log(200n - 100); //error
