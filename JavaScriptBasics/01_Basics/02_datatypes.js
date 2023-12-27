"use strict";//Treat all js code as newer version

//alert("HEllo");  // We are using NodeJS not browser



//Primitive DataTypes
//Number => 2^53
//BigInt =>
//String => ""
//boolean => true or false
//null => Standalone value
//undefined => value is not defined till now
//symbol => for unique ness


let name = "Deepon"
let age = 18
let isLoggedIn = false
                             // Output
console.log(typeof "Deepon");// String
console.log(typeof null);    // object
console.log(typeof undefined);//undefined
const id = Symbol('123')
const anotherID = Symbol('123')

console.log(id === anotherID)
const bigNumber = 345678987654323456n;


//Reference (Non - Primitive) --> Arrays,Objects,Functions
const heros = ["Superman","Batman","Spiderman"]
let myObj = {
    name:"Deepon",
    age:22,
}

const myFunction = function (){
    console.log("Hello World.")
}