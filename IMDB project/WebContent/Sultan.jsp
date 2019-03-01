<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">



<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<title>Insert title here</title>
</head>

<style>
input.star {
	display: none;
}

label.star {
	float: right;
	padding: 10px;
	font-size: 36px;
	color: #444;
	transition: all .2s;
}

input.star:checked ~ label.star:before {
	content: '\f005';
	color: #FD4;
	transition: all .25s;
}

input.star-5:checked ~ label.star:before {
	color: #FE7;
	text-shadow: 0 0 20px #952;
}

input.star-1:checked ~ label.star:before {
	color: #F62;
}

/* label.star:hover { transform: rotate(-15deg) scale(1.3); }
 */
label.star:before {
	content: '\f006';
	font-family: FontAwesome;
}
</style>
<body>
	<div class="jumbotron">

		<img
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4mEsdqUARCud9tgnkmVDAMMJxfvyQKLMWba9H3GcQFZxlAbQI"
			style="width: 100%; height: 250px;">

	</div>


	<div class="container">

		<div class="row">
			<div class="col-sm-6">
				<iframe width="450" height="270"
					src="https://www.youtube.com/embed/wPxqcq6Byq0" frameborder="0"
					allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
					allowfullscreen></iframe>
			</div>
			<div class="col-sm-6">

				<p>Sultan is a 2016 Indian Hindi-language sports drama film
					directed by Ali abbar Zafar. Produced by Aditya Chopra under the
					Yash raj films banner, the film starrer Salman khan as the title
					character opposite Anushka Sharma. The film focuses on Sultan Ali
					Khan, a fictional wrestling champion from Haryana whose successful
					career creates a rift in his personal life</p>
			</div>


		</div>
	</div>
	<div class="stars">
		<form action="">

			<input class="star star-5" id="star-5" type="radio" name="star" /> <label
				class="star star-5" for="star-5"></label> <input class="star star-4"
				id="star-4" type="radio" name="star" /> <label class="star star-4"
				for="star-4"></label> <input class="star star-3" id="star-3"
				type="radio" name="star" /> <label class="star star-3" for="star-3"></label>

			<input class="star star-2" id="star-2" type="radio" name="star" /> <label
				class="star star-2" for="star-2"></label> <input class="star star-1"
				id="star-1" type="radio" name="star" /> <label class="star star-1"
				for="star-1"></label>

		</form>

	</div>
	</div>

	
	<div class="container">

		<form action="Login.jsp" method="post">
			<div class="form-group">



				<br>
				<button type="submit" value="Login to comment" class="required">Login
					to comment</button>
		</form>

	</div>

	</div>


	</div>
	<br>
	<br>
	<br>
<div class="container">
	<footer class="container">
	<div class="row">
	<div class="col-sm-4">
	<h1>Review</h1>
	<p> The review is based on  basis of how audience react to the movie</p>
	
	</div>
	<div class="col-sm-4">
	<h1>About</h1>
	<p> This website is about the movie rating</p>
	
	</div>
	<div class="col-sm-4">
	<h1>Contact us</h1>
	<p> The queries regarding the website</p>
	
		
		
	</div>
</div>
	</footer>
</body>
</body>
</html>
 





