<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Insert Workout</title>
 	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.css" rel="stylesheet">
 	<style>
		.show-grid [class^=col-] {
			border: 1px solid;
		}
	</style>
</head>

<body>

	<div class="container">

		<div class="page-header">
        	<h3>Inserir workout</h1>
      	</div>

		<div class="row show-grid">

			<div class="col-sm-12">
				<label>input data</label>
			</div>
			
		</div>
		
		<div class="row show-grid">
			 	  
			<div class='col-lg-3'></div>

			<div class='col-lg-3'>

				<div class='col-xs-12'>
	                <label class='control-label'>Grupo</label>
			 		<select class="form-control input-md">
						<option>legs</option>
						<option>Arms</option>
					</select>
				</div>

	 			<div class='col-xs-12'>
	                <label class='control-label'>Exercicio</label>
			 		<select class="form-control input-md">
						<option>...</option>
						<option>arm bar</option>
					</select>
				</div>

			</div>

			<div class='col-xs-3'>

		 		<div class='col-xs-6'>
	                <label class='control-label'>Peso</label>
	                <input autocomplete='off' class='form-control card-cvc' placeholder='' size='4' type='text'>
	            </div>
	
	           	<div class='col-xs-6'>
	                <label class='control-label text-center'>Reps</label>
	                <input class='form-control card-expiry-month' placeholder='' size='2' type='text'>
	            </div>
	            
	            <div class='col-xs-6'>
	                <label class='control-label'>Peso</label>
	                <input autocomplete='off' class='form-control card-cvc' placeholder='' size='4' type='text'>
	            </div>
	
	           	<div class='col-xs-6'>
	                <label class='control-label text-center'>Reps</label>
	                <input class='form-control card-expiry-month' placeholder='' size='2' type='text'>
	            </div>
	            
	            <div class='col-xs-6'>
	                <label class='control-label'>Peso</label>
	                <input autocomplete='off' class='form-control card-cvc' placeholder='' size='4' type='text'>
	            </div>
	
	           	<div class='col-xs-6'>
	                <label class='control-label text-center'>Reps</label>
	                <input class='form-control card-expiry-month' placeholder='' size='2' type='text'>
	            </div>
	           

			</div>

			<div class='col-xs-3'></div>

		</div>




		<div class="row show-grid">
			 	  
			<div class='col-lg-3'></div>

			<div class='col-lg-3'>

				<div class='col-xs-12'>
	                <label class='control-label'>Grupo</label>
			 		<select class="form-control input-md">
						<option>legs</option>
						<option>Arms</option>
					</select>
				</div>

	 			<div class='col-xs-12'>
	                <label class='control-label'>Exercicio</label>
			 		<select class="form-control input-md">
						<option>...</option>
						<option>arm bar</option>
					</select>
				</div>

			</div>

			<div class='col-xs-3'>

		 		<div class='col-xs-6'>
	                <label class='control-label'>Peso</label>
	                <input autocomplete='off' class='form-control card-cvc' placeholder='' size='4' type='text'>
	            </div>
	
	           	<div class='col-xs-6'>
	                <label class='control-label text-center'>Reps</label>
	                <input class='form-control card-expiry-month' placeholder='' size='2' type='text'>
	            </div>

	           	<div class='col-xs-12'>
	           		<!--<h4>new button</h4>-->
	           		<button type="button" class="btn btn-default btn-sm">
					<span class="glyphicon glyphicon-plus"></span>
					</button>
	            </div>
	            
			</div>

			<div class='col-xs-3'></div>

		</div>


		<!--
		<div class="row show-grid">
			 	  
			<div class='col-xs-3'></div>

			<div class='col-xs-6'>
		
				<div class='form-row'>

			 		<div class='col-xs-5 form-group'>

		                <label class='control-label'>Grupo</label>
				 		<select class="form-control input-md">
							<option>legs</option>
							<option>Arms</option>
						</select>

		                <label class='control-label'>Exercicio</label>
				 		<select class="form-control input-md">
							<option>...</option>
							<option>arm bar</option>
						</select>

			 		</div>
			 		
			 		

			 		<div class='col-xs-3 form-group'>
	                    <label class='control-label'>Peso</label>
	                    <input autocomplete='off' class='form-control card-cvc' placeholder='' size='4' type='text'>
              		</div>

	             	<div class='col-xs-3 form-group'>
		                <label class='control-label text-center'>Reps</label>
		                <input class='form-control card-expiry-month' placeholder='' size='2' type='text'>
	              	</div>

			 	</div>

			</div>

			<div class='col-xs-3'></div>

		</div>  
		-->
		
	</div>

</body>

</html>