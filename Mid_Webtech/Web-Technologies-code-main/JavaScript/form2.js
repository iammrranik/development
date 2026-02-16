function submitScore(event) {
	event.preventDefault();

	const score = event.target.score.value;
	const msg = document.getElementById("msg")

	if(score < 50) {
		msg.textContent = "You need at least 50 points to qualify!";
	}
	else if(score >= 50 && score <= 80)
	{
		msg.textContent = "You are eligible for the beginner level!";
	}
	else if (score > 80)
	{
		msg.textContent = "You qualify for the advanced level!";
		msg.style.color = "green";
	}

}
