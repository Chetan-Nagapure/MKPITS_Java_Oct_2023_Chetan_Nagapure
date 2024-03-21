// variable cannot be re-declared (means we cannot write 'let' again) but can be updated(means we write new rollNo value i,e 2 ).A block scope variable.

let name = "Chetan";
let rollNo = 1;
rollNo = 2;

console.log(name);
console.log(rollNo);


let a;
console.log(a); //undefined

a = 10;
console.log(a);// 10

//Block of variable.
{
    // this is the block of code.
    let b = 5;
    b=4;
    console.log(b);
}

//Redefined code
{
    let b = 2;
    console.log(b);
}
