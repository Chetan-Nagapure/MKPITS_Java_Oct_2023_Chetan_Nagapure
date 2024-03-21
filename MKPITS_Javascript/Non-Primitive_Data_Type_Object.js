//'Object' is the Non-primitive data type in JavaScript.
//Objects is the collection of values.
//It can hold key value pairs where each key is associated with a value.
//we declare object with 'let' and 'const' also.

const student = {
  name: "chetan", //key: value
  age: 24,
  rollNo: 1,
  ispass: true,
};
console.log(student); //{ name: 'chetan', age: 24, rollNo: 1, ispass: true }
console.log(typeof student); // type is 'object'.

console.log(student["name"]);
console.log(student.name);

//if we have to add new rollNo
student["rollNo"] = student["rollNo"] + 1;
console.log(student["rollNo"]);

console.log(student); // update the rollNo value.
