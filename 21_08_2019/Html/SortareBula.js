var a=[];
var n=a.length;

function adauga(){
	var nr=parseInt(document.getElementById("element").value); // am citit elementul (de la tastatura).
	a.push(nr); // am pus elementul in array
	document.getElementById("element").value=''; // am sters elementul din casuta

	console.log(a);
}

function sorteaza(){
	var sortat=true;
	var x=a;
	var n=x.length;
	
	var body=document.getElementsByTagName("body")[0];
	var tb1=document.createElement("table");
	tb1.style.whidth="100%";
	tb1.border=1;
	var tbdy=document.createElement("tbody");
	
	do{
		var tr=tb1.insertRow();
		sortat=true;
		for(var i=0; i<n-1; i++){
			if (a[i]<a[i+1]){
				var temp=parseInt(a[i]);
				a[i]=a[i+1];
				a[i+1]=temp;
				sortat=false;
			}	
		}
		for (var i=0; i<n; i++){
			var td=tr.insertCell();
		td.appendChild(document.createTextNode(x[i].toString()));
		}
	} while(!sortat);
	
	tb1.appendChild(tbdy);
	body.appendChild(tb1);
	
	console.log(x);
}