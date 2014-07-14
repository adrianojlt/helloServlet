
$(document).ready(function() {
	
	var init = function() {
		
	}
	
	var events = function() {
		
	}
	
	init();
	
	$('#btn-add-repetition').on('click', function(event) {

		//evento = event;
		$target = $(event.target);
		//$target.parents();
		destination = $target.parents('.col-md-4.exercice');
		div2copy = $target.parents('.row.row-exercice');
		clone = div2copy.clone();
		div2copy.find('button span').removeClass('glyphicon-plus').addClass('glyphicon-minus');
		destination.append(clone);
		$(this).unbind('click');
	});

	$('#musclegroup-01').on('change', function(event) {

		var self = $(this);
		var id = self.val();
		var text = self.find(":selected").text(); 
		
		if ( !id ) { return false; }
		else {
			
			// activate inputs and button to add new repetition
			
			// select the associated exercice
			
			// activate button to add new exercice
		}

		evento = event;
		console.log('01');
	});

	$('#exercice-01').on('change', function(event) {
		self = $(this);
		evento = event;
		console.log('02');
	});

	$('.musclegroupSelect').on('change', function(event) {
		console.log('m01changed');
	});
	$('.exerciceSelect').on('change', function(event) {
		console.log('e01changed');
	});
});
