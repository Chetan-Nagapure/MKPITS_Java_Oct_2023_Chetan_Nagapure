let size =parseInt(prompt("Enter the size of array"));
let arr=[];

for(let i = 0;i<size;i++)
{
    let element=parseInt(prompt("enter number"));

if(element!=0){
arr.push(element);
}
else{
    alert("your choice is 0 so program stop addding numbers");
    break;
}
}
console.log(arr);