let myDate = new Date();

console.log(typeof myDate)

console.log(myDate) // --> 2023-10-04T14:03:20.810Z

console.log(myDate.toJSON())   // -->  2023-10-04T14:03:20.810Z

console.log(myDate.toString())   // -->  Wed Oct 04 2023 19:33:20 GMT+0530 (India Standard Time)

console.log(myDate.toDateString()) // -->  Wed Oct 04 2023

console.log(myDate.toLocaleDateString()) // -->  4/10/2023

//let myCreatedDate = new Date(2023,0,20); // -->  Fri Jan 20 2023

//let myCreatedDate = new Date(2023,0,20,5,3); // -->   20/1/2023, 5:03:00 am
let myCreatedDate = new Date("01-10-2023"); // -> 10/1/2023, 12:00:00 am

console.log(myCreatedDate.toLocaleString())

let myTimeStamp = Date.now()
console.log((Math.floor(myTimeStamp/1000)))
console.log(myCreatedDate.getTime())

let newDate =  new Date()
console.log(newDate)
console.log(newDate.getDay())

newDate.toLocaleString('default',{
    weekday:"long",
})