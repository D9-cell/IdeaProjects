let score="33abc";

console.log(typeof score); // number
console.log(typeof(score));// number

let valueInScore  = Number(score)
console.log(typeof valueInScore) //=> number
console.log(valueInScore) // => NaN(Not a Number)

let num = null
console.log(typeof num)    // object
let valueInNumber = Number(num)
console.log(typeof valueInNumber) //number
console.log(valueInNumber)  //0

let numUndefined = undefined
console.log(typeof numUndefined)    // undefined
let valueInUndefined = Number(num)
console.log(typeof valueInUndefined) //number
console.log(valueInUndefined)  //undefined

let numBoolean = true
console.log(typeof numBoolean)    // boolean
let valueInBoolean = Number(num)
console.log(typeof valueInBoolean) //number
console.log(valueInBoolean)  //1

let isLoggedIn = "Deepon"
let booleanIsLoggedIn = Boolean(isLoggedIn)
console.table([booleanIsLoggedIn,typeof booleanIsLoggedIn])
/* Converting Using Boolean()
   1=> true
*  0 => false
*  "Deepon" => true
*  "" => false
*  */