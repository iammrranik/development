function validateForm(event) {
	event.preventDefault();

	const form = event.target;

	const pname = form.pname.value;
	const price = form.price.value;
	const stock = form.stock.value;
	const category = form.category.value;
	const date = form.date.value;

	const pdmsg = document.getElementById("pmsg");
	const prmsg = document.getElementById("prmsg");
	const qmsg = document.getElementById("qmsg");
	const cmsg = document.getElementById("cmsg");
	const dmsg = document.getElementById("dmsg");


	// console.log(pname, price, stock, category, date);

	if(pname == "")
	{
		pdmsg.innerHTML = "Product name is required!";
	}

	if(price == "")
	{
		prmsg.innerHTML = "Price name is required!";
	}

	if(stock == "")
	{
		qmsg.innerHTML = "Stock name is required!";
	}

	if(category == "")
	{
		cmsg.innerHTML = "Categroy name is required!";
	}

	if(date == "")
	{
		dmsg.innerHTML = "Date name is required!";
	}

	if(price < 0)
	{
		prmsg.innerHTML = "Price must be more than 0"
	}

	if(typeof stock == "number")
	{
		qmsg.innerHTML = "Stock is should be a number"
	}

	if (category == "")
	{
		cmsg.innerHTML = "One catgeory must be selected!"
	}
}