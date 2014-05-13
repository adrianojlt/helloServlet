
$(document).ready(function() {
	console.log('ready');
	
	$('#btn-add-repetition').on('click', function(event) {

		evento = event;

		$target = $(event.target);
		//$target.parents();
		destination = $target.parents('.col-md-4.exercice');
		origin = $target.parents('.row.row-exercice');
		clone = origin.clone();
		origin.find('button span').removeClass('glyphicon-plus').addClass('glyphicon-minus');
		destination.append(clone);
		//console.log(event);
	});

	$('.musclegroupSelect').on('change', function(event) {
		console.log('m01changed');
	});
	$('.exerciceSelect').on('change', function(event) {
		console.log('e01changed');
	});
});
