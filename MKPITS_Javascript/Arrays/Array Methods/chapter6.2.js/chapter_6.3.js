let age = prompt("Enter your age");

if (age >= 18)
 {
  alert("you can drive");
} else if (age < 0) 
{
  console.error("you entered negative number");
} else 
{
  alert("you cannot drive");
}
console.log(age);