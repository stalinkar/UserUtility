<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Format JSON</title>

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
						href="/EasyUtility/EncodeDecodeServlet">Encoder/Decoder</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/EasyUtility/GeneratePasswordServlet">Generate Password</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div id="json" class="container p-2 my-5 border">

		<form action="/EasyUtility/FormatJSONServlet" method="post">
			<div class="row text-center">
				<div class="col-lg-5">Please enter JSON</div>
				<div class="col-lg-1" style="margin: auto;"></div>
				<div class="col-lg-6">Formated JSON</div>
			</div>
			<div class="row text-center">
				<div class="col-lg-5">
					<textarea class="textarea" id="_strJSON" name="strJSON"
						data-gramm_editor="false" spellcheck="false" autofocus=""
						placeholder="{}" rows="22" cols="70">${strJSON}</textarea>
				</div>
				<div class="col-lg-1" style="margin: auto;">
					<input type="submit" class="btn btn-success"
						value="Parse/Format JSON">
				</div>
				<div class="col-lg-6" style="padding-left: 40px;">
					<textarea class="textarea" id="_strFormatedJSON"
						name="strFormatedJSON" data-gramm_editor="false"
						spellcheck="false" autofocus="" placeholder="{}" rows="22"
						cols="70">${strFormatedJSON}</textarea>
				</div>
			</div>
		</form>
	</div>
</body>
</html>