//avaScript arithmetic modulus operator is used to return the remainder of the operands. 
//Here also the left operator is the dividend and the right operator is the divisor.
//Syntax: a%b

//we will check the remainder with Number and Infinity.
let a = 10;
let b = 20;
let modulus = (a%b);
console.log(modulus);// remainder = 10 

console.log(Infinity%20);//NaN

//we will use the modulus operator on the negative number and NaN.
let c = -10;
let d = 20;
let modulus1 = (c%d);
console.log(modulus1);// remainder = -10 

console.log(NaN % 20);//NaN