//The Unary plus(+) operation is a single operand operator (which means it worked with only a single operand preceding or succeeding to it), which is used to convert its operand to a number, if it isn’t already a number. 

//It converts a string into a number. 
const x = "10";
let y;
y = +x;
console.log(y);//10
console.log(typeof y);//number

//a unary method with numbers.  
const a = 100;
const b = -100;
const c = 20;
console.log(+a);//100
console.log(+b);//-100
console.log(+c);//20

//a unary method with non-numbers.
const d = true;
const e = false;
const f = null;
const g = function (x) 
{
  return x;
};
console.log(+d);//1
console.log(+e);//0
console.log(+f);//0
console.log(+g);//NaN
