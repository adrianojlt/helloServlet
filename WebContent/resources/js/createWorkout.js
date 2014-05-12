
$(document).ready(function() {
	console.log('ready');
	
	$('#btn-add-repetition').on('click', function(event) {

		evento = event;

		$target = $(event.target);
		//$target.parents();
		destination = $target.parents('.col-md-4.exercice');
		row2copy = $target.parents('.row.row-exercice').clone();
		//row2copy.find('button span').removeClass('glyhicon-plus').addClass('glyhicon-minus')
		destination.append(row2copy);
		//console.log(event);
	});
});
