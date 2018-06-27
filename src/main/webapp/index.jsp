<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="images/avatar.png">

<title>Signin Template for Admin</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link rel="stylesheet" href="/WebApp/css/bootstrap.css">
<link rel="stylesheet" href="/WebApp/css/bootstrap-theme.css">
<link rel="stylesheet" href="/WebApp/css/bootstrap-theme.css.map">
<link rel="stylesheet" href="/WebApp/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/WebApp/css/signin.css">    

<!-- Custom styles for this template -->
<link href="/WebApp/css/index.css" rel="stylesheet">
</head>

<body class="text-center">
	<form class="Controller" method="post">
		<img class="mb-4"
			src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg"
			alt="" width="72" height="72">
		<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
		<label for="inputEmail" class="sr-only">Email address</label> <input
			type="email" id="inputEmail" class="form-control"
			placeholder="Email address" required autofocus> <label
			for="inputPassword" class="sr-only">Password</label> <input
			type="password" id="inputPassword" class="form-control"
			placeholder="Password" required>
		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit" name="action" value="login">
		Signin</button>
			<a href="Register.jsp">Register Here.</a>
		<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
	</form>
</body>
</html>
