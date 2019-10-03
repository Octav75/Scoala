function interschimbare(){
				var a=parseInt(document.getElementById("operand1").value);
				var b=parseInt(document.getElementById("operand2").value);
				
				a=a+b;
				b=a-b;
				a=a-b;
								
				document.getElementById("aDupaSchimbare").innerHTML=a.toString();
				document.getElementById("bDupaSchimbare").innerHTML=b.toString();
}