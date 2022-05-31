<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/EasyUtility">Easy Utility</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link"
						href="/EasyUtility/FormatJSONServlet">JSON Utility</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/EasyUtility/EncodeDecodeServlet">Encoder/Decoder</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/EasyUtility/GeneratePasswordServlet">Generate Password</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid p-3 text-center">
		<h1>Easy User Utility Tool</h1>
		<p>Select your operation</p>
	</div>
	<div class="container text-center">
		<ul class="nav justify-content-center">
			<li class="nav-item"><a href="/EasyUtility/FormatJSONServlet"
				class="nav-link">
					<button class="btn btn-primary">JSON Utility</button>
			</a></li>
			<li class="nav-item"><a href="/EasyUtility/EncodeDecodeServlet"
				class="nav-link">
					<button class="btn btn-primary">Encoder/Decoder</button>
			</a></li>
			<li class="nav-item"><a
				href="/EasyUtility/GeneratePasswordServlet" class="nav-link">
					<button class="btn btn-primary">Generate Password</button>
			</a></li>
			</li>
		</ul>

	</div>
</body>
</html>