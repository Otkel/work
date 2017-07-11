<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Access the bootstrap Css like this,
		Spring boot will handle the resource mapping automcatically -->
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />	
	
<title>Spring Boot Spring MVC - HelloWorld</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript">
setInterval(function(){
	   $('#my_div').load('/newString');
	}, 5000)
</script>
</head>
 
 
<body>
<div id="my_div">
    <h1>${greeting}</h1>
    </div>
</body>
 
 
</html>