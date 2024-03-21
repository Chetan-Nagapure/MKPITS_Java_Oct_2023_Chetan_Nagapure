//Replace one character from  string name
let name = prompt("Enter your name");
console.log("userinput : " +name);

let character=prompt("Which character do you want to replace?");
let index=prompt("enter the index value");

let name1=name.replaceAt(name[index],character.charAt());
alert("after replacement: "+name1);


// let  Newname = name.replace(name[2],"s");

// alert(Newname);
// console.log("after replacing the character : " +Newname);

