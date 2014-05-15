<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- 
<sql:query var="musclegroup" dataSource="jdbc/gym">
	select id,name,nome from musclegroup
</sql:query>

<sql:query var="exercice" dataSource="jdbc/gym">
	select id_MuscleGroup, name from exercice
</sql:query>
--%>

<!doctype html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Insert Workout</title>
 	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.css" rel="stylesheet">
 	<style>
		.show-grid [class^=col-] {
			/*border: 1px solid;*/
		}
	</style>
</head>

<body>

	<form name="workout" method="post" action="/helloServlet/gym.do">

	<div id="main-container" class="container">

		<div class="page-header">
        	<!-- <h3>Inserir workout</h3> -->
        	<input type="submit" name="submitButton" value="Cancel" class="btn btn-default" />
        	<input type="submit" name="submitButton" value="Save"   class="btn btn-primary" />
      	</div>
		
		<div class="row show-grid">
			 	  
			<div class='col-md-2'></div>

			<div class='col-md-4'>

				<div class='col-md-12'>
	                <label class='control-label'>Grupo</label>
			 		<select id="musclegroup-01" class="form-control input-md musclegroupSelect" name="musclegroup-01">
						<option value="0">All</option>
						<c:forEach var="row" items="${musclegroup}">
							<option value="${row.id}">${row.name}</option>
						</c:forEach>
					</select>
				</div>

	 			<div class='col-md-12'>
	                <label class='control-label'>Exercicio</label>
			 		<select id="exercice-01" class="form-control input-md exerciceSelect" name="exercice-01">
						<option value="0">...</option>
						<c:forEach var="row" items="${exercices}">
							<option value="${row.id}">${row.name}</option>
						</c:forEach>
					</select>
				</div>

				<div class='col-md-4'>
					<input type="hidden" name="" value="" />
					<button type="button" id="btn-add-exercice" class="btn btn-default btn-sm disabled" style="margin-top: 25px;">
						<span class="glyphicon glyphicon-plus"></span>
					</button>
				</div>

			</div>

			<div class='col-md-4 exercice'>

				<div class="row row-exercice">

			 		<div class='col-xs-4'>
		                <label class='control-label'>Peso</label>
		                <input id="weight-01-01" class='form-control' name="weight-01-01" placeholder='' size='3' type='text' disabled>
		            </div>
		
		           	<div class='col-xs-4'>
		                <label class='control-label text-center'>Reps</label>
		                <input id="reps-01-01" class='form-control' name="reps-01-01" placeholder='' size='2' type='text' disabled>
		            </div>
	
			 		<div class='col-md-4'>
		           		<button type="button" id="btn-add-repetition" class="btn btn-default btn-sm" value="addRepetition" style="margin-top: 25px;" disabled>
							<span class="glyphicon glyphicon-plus"></span>
						</button>
			 		</div>
		 		
		 		</div>
		 		
		 		<!--
		 		<div class="row">

			 		<div class='col-xs-4'>
		                <label class='control-label'>Peso</label>
		                <input class='form-control' name="weight" placeholder='' size='3' type='text'>
		            </div>
		
		           	<div class='col-xs-4'>
		                <label class='control-label text-center'>Reps</label>
		                <input class='form-control' name="reps" placeholder='' size='2' type='text'>
		            </div>
	
			 		<div class='col-md-4'>
		           		<button type="button" id="btn-add-repetition" class="btn btn-default btn-sm" style="margin-top: 25px;">
							<span class="glyphicon glyphicon-plus"></span>
						</button>
			 		</div>
		 		
		 		</div>
		 		-->
	            
			</div>

			<div class='col-md-2'></div>

		</div>

		<div class="row show-grid">
			<div class='col-md-2'></div>
			<div class='col-md-8'><hr></div>
			<div class='col-md-2'></div>
		</div>

	</div>
	
	</form>

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.js"></script>
	<script src="resources/js/createWorkout.js" type="text/javascript"></script>

</body>

</html>

