<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generate Password</title>
<style type="text/css">

</style>
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
				</ul>
			</div>
		</div>
	</nav>
	<center>
		<h1>
			<b>Password Generator</b>
		</h1>
	</center>
	<div class="container p-2 my-5 border col-lg-5">
		<form action="/EasyUtility/GeneratePasswordServlet" method="post">
			<div id="LogoText"></div>
			<table>
				<tr>
					<td>Please Select Max Password Length:</td>
					<td><select id="pgLength"
						title="Select the length of your password." name="maxlen">
							<optgroup label="Weak">
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
							</optgroup>
							<optgroup label="Strong">
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="13">13</option>
								<option value="14">14</option>
								<option value="15">15</option>
							</optgroup>
					</select></td>
				</tr>
				<tr>
					<td>Special Characters (@#$!):</td>
					<td><input type="checkbox" name="splchar" value="splchar"></td>
				</tr>
				<tr>
					<td>Lower Case Alphabets(a-z):</td>
					<td><input type="checkbox" name="lower" value="lower"></td>
				</tr>
				<tr>
					<td>Upper Case Alphabets(A-Z):</td>
					<td><input type="checkbox" name="upper" value="upper"></td>
				</tr>
				<tr>
					<td>Numerics (0-9):</td>
					<td><input type="checkbox" name="num" value="num"></td>
				</tr>
				<tr class="text-center">
					<td>Please Click Below Button To Generate a Password.</td>
					<td></td>
				</tr>
			</table>
			<div class="text-center"><input type="submit" value="Generate Password" class="btn btn-success btn-sm"></div>
			
		</form>
		<div>
			Your Suggested Password is: <input type="text" class="col-lg-8 text-center"
				value="${strPassword}">
		</div>
	</div>
</body>
</html>