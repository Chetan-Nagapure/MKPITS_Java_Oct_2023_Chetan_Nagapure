//JavaScript remainder assignment operator (%=) assigns the remainder to the variable after dividing a variable by the value of the right operand.

//Syntax:
//Operator: x %= y
//Meaning:  x  = x % y

// Given number is divisible by 4 or if it’s an even or odd number.
let num = 16;

// Test if its divisible by 4
if(num % 4 == 0)
{
    console.log(true)
}

// Test for even number
if(num % 2 == 0)
{
    console.log(true)
}
else
{
console.log(false)
}

// Test for odd number
if(!(num % 2 == 0))
{
    console.log(true)
}
else
{
console.log(false)
}

//Given number is divisible by 2, 0, and world.
let Number1 = 3;

console.log((Number1 %= 2));

console.log((Number1 %= 0));

console.log((Number1 %= "world"));