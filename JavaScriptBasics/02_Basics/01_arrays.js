const myArr = [1,2,3,4,5,6,7,8]
const myHeros = ["Captain America","Thor","IronMan","SpiderMan"]

const myArr2 = new Array(10,20,30,40);
//console.log(myHeros[1])

//Array Methods

myArr.push(7) //insert at the end
myArr.pop() //Delete from the end
myArr.unshift(7) //Insert at the beginning
myArr.shift() //delete from beginning
// console.log(myArr.includes(9)) // return value bool
// console.log(myArr.indexOf(9))

const newArr = myArr.join()
// console.log(myArr)
// console.log(newArr)
// console.log(typeof newArr) // -->  String

/******************     Slice,splice     *******************/
console.log("A",myArr)

const myn1 = myArr.slice(1,4) //Include 1 to 3 but not 4th AND DOESNOT MANIPULATED THE ORIGINAL ARRAY
console.log(myn1)
console.log("B ", myArr)

const myn2 = myArr.splice(1,4) //EXCLUDING 1 TO 4TH INDEX IT EXTRACT OTHER ELEMENTS AND MANIPULATE THE REAL ARRAY
console.log(myn2)
console.log("C ", myArr)