let numArr=[11,15,30,45,61,];
console.log(numArr);

let numArr1 = numArr.filter((value,index,array)=>{
    return value > 20
});
console.log(numArr1);

