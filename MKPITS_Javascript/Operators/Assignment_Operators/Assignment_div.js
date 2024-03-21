//JavaScript Division Assignment Operator in JavaScript is represented by “/=”.
//This operator is used to divide the value of the variable by the value of the right operand and that result is going to be assigned to the variable.
//This can also be explained as dividing the value of the variable by an expression and assigning that result to the variable.

//Syntax:a /= b

let a = 10;
a /= 2;
console.log(a); // Output: 5

//the result of 10/2 = 5 now this result is divide by next variable i,e a /= 5.
//next operation is performed as (result / 5) which gives the value 1.
a /= 5;
console.log(a); // Output:1

//the result of 5/5 = 1 now this result is divide by next variable i,e a /= 0.
//next operation is performed as (result / 0) which gives the value infinity.
a /= 0;
console.log(a); // Output : Infinity


   
let b = 18;
b /= 3;
console.log(b);//6

b /= "Hello world";
console.log(b);//NaN