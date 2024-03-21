let num=[1,2,3,4,5];

let fact=num.reduce((acc,cur)=>
{
    return acc*cur;
});
console.log(fact);