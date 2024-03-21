//A for-in loop is used to loop through the properties of an object.

//syntax
//for (key in object) 
{
  // code block to be executed
}

// const obj ={x:1,y:2,z:3};
// for(let prop in obj) 
// {
//     console.log(prop + ':' +obj[prop])
// }

const obj1={a:1,b:2,c:3};
for(let key in obj1)
{
    console.log(key + ':' +obj1[key])
}