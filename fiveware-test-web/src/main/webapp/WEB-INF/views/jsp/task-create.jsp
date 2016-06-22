<%@page session="false"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Fiveware Task Application</title>
		
		<c:url var="home" value="/" scope="request" />
		
		<spring:url value="/resources/core/css/hello.css" var="coreCss" />
		<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
		<link href="${bootstrapCss}" rel="stylesheet" />
		<link href="${coreCss}" rel="stylesheet" />
		
		<spring:url value="/resources/core/js/jquery.1.10.2.min.js"	var="jqueryJs" />
		<spring:url value="/resources/core/js/task-create.js"	var="taskCreateJs" />
		<script src="${jqueryJs}"></script>
		<script src="${taskCreateJs}"></script>
	
	</head>
	<body>
		<div class="container" style="min-height: 500px">
		
			<div class="starter-template">
				<h1>Criar uma Task</h1>
				<br>
		
				<div id="feedback"></div>
		
				<form class="form-horizontal" id="task-form">
					<div class="form-group form-group-lg">
						<label class="col-sm-2 control-label">Descrição</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="descricao">
						</div>
					</div>
					
					<div class="form-group form-group-lg">
						<label class="col-sm-2 control-label">Realizada?</label>
						<div class="col-sm-10">
							<input type="checkbox" class="form-control" id="realizada">
						</div>
					</div>
					
					<div class="form-group form-group-lg">
						<label class="col-sm-2 control-label">Status</label>
						<div class="col-sm-10">
							<form:select path="status" items="${status}" class="form-control" id="status"/>
						</div>
					</div>
					
					<div class="form-group form-group-lg">
						<label class="col-sm-2 control-label">Avaliação</label>
						<div class="col-sm-10">
							<form:radiobuttons path="avaliacao" items="${avaliacao}" class="form-control" />
						</div>
					</div>
		
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" id="bth-criar"
								class="btn btn-primary btn-lg">Criar</button>
						</div>
					</div>
				</form>
		
			</div>
		
		</div>
	</body>
</html>