const name="Deepon"
const repoCount =90

//console.log(name + repoCount + "Value") --> this is not good
console.log(`Hello my name is ${name} and my repo count is ${repoCount}`);//This is modern

const gameName = new String('DeeponDas')
console.log(gameName[0])
console.log(gameName.__proto__)

console.log(gameName.length)
console.log(gameName.charAt(3))
console.log(gameName.indexOf('p'))
console.log(gameName.toUpperCase())

const newString = gameName.substring(0,4)
console.log(newString)

const anotherString = gameName.slice(-8,4)
console.log(anotherString)

const newStringOne = "      Deepon      "
console.log(newStringOne)
console.log(newStringOne.trim())

const url = "HTTP://deepon.com/deepon%20das"

console.log(url.replace('%20','-'))
console.log(url.includes('epo'))
console.log(gameName.split('e'))