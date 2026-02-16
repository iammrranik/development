

const btn = document.getElementById("btn");
const box = document.getElementById("box");

btn.addEventListener("click", function () {
	let top = Math.random() * 500;
	let left = Math.random() * 500;


	box.style.top = top + "px";
	box.style.left = left + "px";

})