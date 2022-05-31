<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Encode/Decode String</title>

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
						href="/EasyUtility/GeneratePasswordServlet">Generate Password</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container p-2 my-5 border col-lg-5">
		<form action="/EasyUtility/EncodeDecodeServlet" method="post">
			<div class="row">
				<div class="col">
					<textarea class="textarea" id="_strEncodeDecode"
						name="strEncodeDecode" data-gramm_editor="false"
						spellcheck="false" autofocus=""
						placeholder="Please enter the text need to be Encoded/Decoded"
						rows="10" cols="82">${strText}</textarea>
				</div>
			</div>
			<div class="row">
				<div class="col-3"></div>
				<div class="col-3">
					Category
					<div class="form-check">
						<input type="radio" id="category-id-1" name="category"
							class="form-check-input" value="Encode" checked required><label
							class="form-check-label">Encode</label>
					</div>
					<div class="form-check">
						<input type="radio" id="category-id-2" name="category"
							class="form-check-input" value="Decode"><label
							class="form-check-label">Decode</label>
					</div>
				</div>
				<div class="col-3">
					Sub-category
					<div class="form-check">
						<input type="radio" id="subcategory-id-1" class="form-check-input"
							name="subcategory" value="Base64" checked required><label
							class="form-check-label">Base64</label>
					</div>
					<div class="form-check">
						<input type="radio" id="subcategory-id-2" class="form-check-input"
							name="subcategory" value="Base64Url"><label
							class="form-check-label">Base64Url</label>
					</div>
					<div class="form-check">
						<input type="radio" id="subcategory-id-3" class="form-check-input"
							name="subcategory" value="URL"><label
							class="form-check-label">URL</label>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col text-center">
					<input type="submit" value="Submit" class="btn btn-success btn-sm">
				</div>
			</div>

			<div>
				<span>Encoded/Decoded String is: </span>
				<div class="text-center">
					<input type="text" class="col-lg-12 text-center"
						value="${strEncodeDecode}">
				</div>
			</div>

		</form>

	</div>
</body>
</html>