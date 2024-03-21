let numArr = [1,2,3,4,5];
console.log(numArr);

let numArr1 = numArr.map((value,index,array)=>
{
    return {key:index , value:value*value}
    
});
console.log(numArr1);