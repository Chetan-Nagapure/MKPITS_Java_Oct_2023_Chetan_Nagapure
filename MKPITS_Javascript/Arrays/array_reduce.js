let numArr=[15,28,35,43,80,91];
console.log(numArr);

let sum =numArr.reduce((total,value)=>{
    return total + value;
});
console.log(sum);