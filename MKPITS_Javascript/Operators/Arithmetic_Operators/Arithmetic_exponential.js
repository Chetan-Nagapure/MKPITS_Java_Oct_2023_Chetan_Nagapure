//JavaScript exponentiation(**) operator in JavaScript is represented by “ ** ” and is used to find the power of the first operator raised to the second operator. 
//This operator is equal to Math.pow() but makes the code simpler and can even accept BigInt primitive data type. 
//The exponentiation operator is right associative which means that x**y**z will give the same result as x**(y**z).

//Syntax:a**b
//It returns the result of raising the first operand to the power of the second operand.

//we will use the exponentiation operator on positive numbers.
let a = 2;
let b = 3;
let c = 4;
let d = -2;
console.log(a**b);//(2)^3 = 8
console.log(b**c);//(3)^4 = 81
console.log(c*a); //(4)*2 = 8
console.log(a*c); //(2)*4 = 8
console.log(a*d);//(2)^-2 = -4

//we will try to find the power of NaN
let  e=NaN;
let  f=6;
console.log(e**f)//(NaN)^6 = NaN

let g = NaN;
let  h = 0;
console.log(g**h)//(NaN)^0 = 1