//Singleton --> Object.create()

//const mySymbol = Symbol(key1)

//Object Literals
const jsUser = {
    name:"Deepon",
    "fullName":"Deepon Das", /* for <-- this type of declaration
     we have only one way to access -> jsUser["fullName"]*/
    age:21,
    //[mySymbol] : "myKeyOne", // <-- this is the way how we can use symbol in the object
    location:"kolkata",
    email:"deeponsubhro@gmail.com",
    isLoggedIn:false,
    lastLoginDays:["Monday","Saturday"]
}

/*************      How to access Object      ****************/
console.log(jsUser.email)
console.log(jsUser["email"])
//console.log(jsUser[mySymbol]) // <-- this is the only way we can access symbol declared in object
jsUser.email = "deepon@das.com" // <-- this is the way we override the value

/*Object.freeze(jsUser) /***** <-- this is the way we can freeze an object
 so that further we can't change any value of the object ******/


jsUser.greeting = function (){
    console.log("Hello JS User")
}
jsUser.greetingTwo = function (){
    console.log(`Hello JS User ${jsUser.name}`)
}

console.log(jsUser.greeting())
console.log(jsUser.greetingTwo())