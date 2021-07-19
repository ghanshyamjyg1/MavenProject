 <script type="text/javascript">
function validation(){
var res= document.getElementById("fname").value
if(res.length==){
document.getElementById("msg").innerHTML="* First Name field is empty"
document.getElementById("msg").style.color="red"
return false
}
else if(res.length<3){
document.getElementById("msg").innerHTML="* First Name field should have min 3 char"
document.getElementById("msg").style.color="red"
return false
}
else if(res.length?3){
document.getElementById("msg").innerHTML="* First Name field should have max 20 char"
document.getElementById("msg").style.color="red"
return false
}
}
</script>