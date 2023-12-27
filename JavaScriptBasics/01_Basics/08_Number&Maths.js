const score = 400
console.log(score)

const balance = new Number(100)
console.log(balance)

console.log(balance.toString())
console.log(balance.toString().length)

console.log(balance.toFixed(2))

const otherNumber = 123.8966

console.log(otherNumber.toPrecision(3))

const hundreds = 1000000

console.log(hundreds.toLocaleString('en-IN'))
/*******************************       Maths         ************************************/

console.log(Math.abs(-4)) //Converting -ve value to +ve value
console.log(Math.round(4.9)) //round off number
console.log(Math.ceil(4.2))
console.log(Math.floor(4.9))
console.log(Math.max(5,3,9,7,1))
console.log(Math.min(1,8,5,9))

console.log(Math.random()) // this random() will always give value between 0 and 1
console.log(Math.floor(Math.random()*10)+1) // this will give value between 1 and 10

const min = 30
const max = 40
console.log(Math.floor(Math.random() * (max-min+1))+min)