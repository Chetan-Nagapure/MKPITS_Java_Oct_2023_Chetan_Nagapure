//JavaScript increment(+ +) operator is used to increase the value of the variable by one. 
//The value returned from the operand depends on whether the increment operator was on the left(prefix increment) or right(postfix increment). 
//Syntax: a++ OR ++a

//If the operator is used before the operand then the value is increased by one and then returned. 
let x = 10;
console.log(x++);//10
console.log(x);//11 We can observe that first the value is returned and then incremented.


//If the operator is used after the operand then the value is first returned and then incremented.
let y = 10;
console.log(++y);//11
console.log(y);//11 