// document.getElementById("demo").innerHTML+="Hello"
// document.getElementById("demo").innerText+=" Hello"
// document.getElementById("demo").textContent+=" Hello"
// document.writeln("Hello")
// alert("Hello")
// console.log("Hello")
// x=Math.random()
// console.log(x)

const titleElement=document.getElementById("title");
const buttonElement=document.getElementById("generic-btn");
buttonElement.addEventListener("click", function(){
    titleElement.textContent="<p>Hello<p>";
})


const titleElement2=document.getElementById("title");
buttonElement.addEventListener("click", function(){
    titleElement2.innerHTML+="<b>Today</b>";
})

const btn1=document.getElementById('btn-1')
btn1.addEventListener("click", function(){
    alert("Helloaaaaaaaa");
})

const image=document.getElementById('image1');
const btn2=document.getElementById('btn-2');
btn2.addEventListener('click', function(){
    image1.src="https://www.harpersbazaararabia.com/wp-content/uploads/sites/7/cloud/2022/08/31/301989876_628900168668197_3709045530888338796_n-e1661926720279.jpg";
})

const btn3=document.getElementById("btn-3")
btn3.addEventListener('click', function(){
    const divElement= document.createElement('div')
    divElement.id='dynamic-div'
    divElement.style.backgroundColor='orange'
    divElement.style.height="200px"
    divElement.innerHTML+="<p>THis is new div</p>"
    document.body.appendChild(divElement)
})

const btn4=document.getElementById("btn-4")
btn4.addEventListener("click", function(){
    const parentDiv=document.getElementById("dynamic-div");
    const newBtn=document.createElement("button");
    newBtn.textContent="New Button";
    parentDiv.appendChild(newBtn)
})


const form1=document.getElementById("form1");
form1.addEventListener("submit", function(event){
    event.preventDefault();
    let name=form1.fullname.value;
    let email=form1.contactEmail.value;
    
})

function submitForm(event){
    event.preventDefault();
    const form2=event.target;
    let name=form1.fullname.value;
    let email=form1.contactEmail.value;

    if(name==="" || email==="" || !email.includes("@") || !email.includes(".") || email.indexOf("@")>email.lastIndexOf(".")){
        alert("Please enter valid details");
        return;
    }
}