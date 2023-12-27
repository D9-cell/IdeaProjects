/*There is two type of memory in JS.
one is STACK and another is HEAP.
Specially STACK is used for Primitive Data Type and HEAP is used for Non-Primitive Data Type
 */

//Example of STACK or Primitive
let name="DeeponDasYoutube";
let anotherName = name;
anotherName="Chai or Code";

console.log(name)
console.log(anotherName)
//Example of HEAP or Reference

let userOne={
    email:"user@gmail.com",
    upi:"userOne@sbi"
}

let userTwo = userOne

userTwo.email="deepon@gmail.com"
console.log(userOne.email)
console.log(userTwo.email)