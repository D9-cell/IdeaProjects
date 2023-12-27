const marvel_heros = ["Thor","Hulk","SpiderMan","Captain America"];
const dc_heros = ["SuperMan","BatMan","Wonder Women"]

// marvel_heros.push(dc_heros)
// console.log(marvel_heros)

// const allHeros = marvel_heros.concat(dc_heros) // concat returns a new array
// console.log(allHeros)

const newAllHeros = [...marvel_heros, ...dc_heros] //This is spread
console.log(newAllHeros)

const anotherArray = [1,2,3,[4,5,6],7,[6,7,[4,5]]]
const realAnotherArray = anotherArray.flat(Infinity)
console.log(realAnotherArray)

console.log(Array.isArray("Deepon"))
console.log(Array.from("DeepoN"))
console.log(Array.from({name: "Deepon"})) //Interesting

let scoreOne = 100
let scoreTwo = 200
let scoreThree = 300

console.log(Array.of(scoreOne,scoreTwo,scoreThree))

