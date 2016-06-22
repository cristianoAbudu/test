jQuery(document).ready(function($) {

	$("#task-form").submit(function(event) {

		// Disble the search button
		enableSearchButton(false);

		// Prevent the form from submitting via the browser.
		event.preventDefault();

		searchViaAjax();

	});

});

function searchViaAjax() {

	var taskCreate = {}
	taskCreate["descricao"] = $("#descricao").val();
	taskCreate["realizada"] = $("#realizada").is(":checked");
	taskCreate["status"] = $("#status").val();
	taskCreate["avaliacao"] = $("input[type='radio']:checked").val();
	
	

	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "task",
		data : JSON.stringify(taskCreate),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			callBack(data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			callBackError(e, taskCreate);
		},
		done : function(e) {
			console.log("DONE");
			enableSearchButton(true);
		}
	});

}

function enableSearchButton(flag) {
	$("#btn-search").prop("disabled", flag);
}

function callBack(data) {
	
	var message = "<pre><h4>"+data.message+"</h4>";
	if(data.errorMessage){
		message+="<br>"+data.errorMessage;
	}
	message+="</pre>";
	$('#feedback').html(message);
	$('#task-form')[0].reset();
	
}

function callBackError(data, taskCreate) {
	var json = "<h4>Erro na Requisicao Ajax</h4><pre>"
			+ "<br>REQUEST:" + JSON.stringify(taskCreate, null, 4)  
			+ "<br>RESPONSE:" + JSON.stringify(data, null, 4) + "</pre>"; 
	$('#feedback').html(json);

}