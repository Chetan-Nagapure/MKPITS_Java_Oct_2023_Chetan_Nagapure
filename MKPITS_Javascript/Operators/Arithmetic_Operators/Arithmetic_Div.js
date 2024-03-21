//JavaScript airthmetic division operator is used to find the quotient of operands. 
//The left operator is treated as a dividend and the right operator is treated as a divisor.
//syntax: a/b

//simple division of two numbers.
let a = 10;
let b = 20;
let div = (a/b);
console.log(div);//0.5

//If we try to divide infinity by zero, it will give us Infinity value because mathematically there is no limit to how much you can// Infinity 
console.log(Infinity / 0);

//If we try to divide infinity by -zero, it will give us Infinity value because mathematically there is no limit to how much you can// Infinity 
console.log(Infinity / -0);

//we will perform a division operation on a string/non-numbers.
//The string is converted to its corresponding number type.
let c = "100";
let d = 20;
let div1 = (c/d);
console.log(div1);//5

//The string which does not contain any number is converted to NaN.
let e = "Hello";
let f = 20;
let div2 = (e/f);
console.log(div2);//NaN
