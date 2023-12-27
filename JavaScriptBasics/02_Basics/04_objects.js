const tinderUser = new Object() /**** this declaration makes the singleton object *****/
const facebookUser = {} /***  this is non-singleton object****/

const regulerUser = {
    email:"deepon@karate.com",
    fullName: {UserFullName : {
        firstName: "Deepon",
        lastName: "Das"
        }
    },
}

console.log(regulerUser.fullName.UserFullName)

const obj1 = {1:"A",2:"B"}
const obj2 = {3:"C",4:"D"}

const obj3  = {obj1,obj2} //This will create objects inside object
const obj4 = Object.assign({},obj1,obj2)
console.log(obj3)
console.log(obj4)

const obj5 = {...obj1,...obj2} //<-- this is spread method