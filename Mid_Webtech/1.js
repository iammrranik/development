// document.getElementById('email');
// console.log("Hello world");
// alert();

// var -> old
// let const -> new

// var x=10;
// x="name";

// const y=43;
// y=44;

// console.log(y);


// const test =function (){
//     var a=1;
//     let b=3;
// }

// if(true){
//     var a=2;
//     let b=4;
// }

var b=20;
var b;

console.log(b);


let obj = {
    name:"anik",
    age:21,
    isStudent:true,
    sports: {
        isCricket:true
    }
}

console.log(obj.sports.isCricket);

let demo=function(){
    var a=1;
    let b=2;
    const c=3;
    if(true){
        var a=10; let b=20; const c=30;
        console.log("Inside:",a,b,c);
    }
    console.log("Outside:",a,b,c);
}

demo();

y=[1,2,3,4,5];
// y.forEach({
//     return n;
// });

let x=demo;
console.log(typeof y);

let z=`asd
 a, ${obj.name}`
console.log(5*"10") 
console.log("a"*"a") 

console.log(null!==undefined)
console.log(isNaN(NaN))
let q="", w=0,e= "0", r=[];
console.log(e&&r)
