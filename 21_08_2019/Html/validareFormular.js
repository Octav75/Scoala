var labels=new Array();
	labels[0]="eroareNume";
	labels[1]="eroareEmail";
	labels[2]="eroareParola";
	labels[3]="eroareConfirmare";
	
function validare(){
	var inputs=new Array();
		inputs[0]=document.getElementById("nume").value;
		inputs[1]=document.getElementById("email").value;
		inputs[2]=document.getElementById("parola").value;
		inputs[3]=document.getElementById("confirmare").value;
		
	var erori=new Array();
		erori[0]="<span style='color:red'>Va rog sa inroduceti un nume!</span>";
		erori[1]="<span style='color:red'>Va rog sa inroduceti un email!</span>";
		erori[2]="<span style='color:red'>Va rog sa inroduceti o parola!</span>";
		erori[3]="<span style='color:red'>Va rog sa confirmati parola!</span>";
		
		for(i in inputs){
			var label=labels[i];
			var err=erori[i];
				if(inputs[i]==""){
					document.getElementById(label).innerHTML=err;
					
				}else{
					document.getElementById(label).innerHTML="OK!";
				} else if(i==1){
				var atpos=inputs[i].indexOf("@");
				var dotpos=inputs[i].lastIndexOf(".");
				// 
				if(atpos<1 || dotpos<atpos+2 || dotpos+2>inputs[i].length){
					document.getElementById(label).innerHTML="<span style='color:red'>Va rog sa inroduceti o adresa valida de email!</span>";
				}else{
					document.getElementById(label).innerHTML="OK!";
				}
				}else if(i==3){
					var prim=document.getElementById("parola").value;
					var prim=document.getElementById("confirmare").value;
					if(prim!=doi){
						document.getElementById(label).innerHTML="<span style='color:red'>Va rog sa inroduceti o parola!</span>";
					}else{
						document.getElementById(label).innerHTML="OK!";
					}
				}
		}
}

function validareFinala(){
	var cont=0;
	for(i=0;i<4;i++){
		var label=labels[i];
		if(document.getElementById(labels[i])=="OK!"{
			cont++;
		}
	}
	if(cont==4){
		document.getElementById("validareFinala").innerHTML="Formularul a fost validat!";
	}
}