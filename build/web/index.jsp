<%-- 
    Document   : index
    Created on : Jan 10, 2020, 12:04:53 PM
    Author     : chand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/WebApplication1/index.css" type="text/css">
<link rel="stylesheet" href="/WebApplication1/sshow.css" type="text/css">
<link rel="stylesheet" href="/WebApplication1/login.css" type="text/css">

<script src="https://www.gstatic.com/firebasejs/7.6.1/firebase.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-auth.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-database.js"></script>
    <%-- <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?sensor=false">
</script> --%>
   <script>
  // Your web app's Firebase configuration
  var firebaseConfig = {
    apiKey: "AIzaSyClVYk0bADStu9Bz7kiTTcE8v5S43zVzXw",
    authDomain: "fir-ff12d.firebaseapp.com",
    databaseURL: "https://fir-ff12d.firebaseio.com",
    projectId: "fir-ff12d",
    storageBucket: "fir-ff12d.appspot.com",
    messagingSenderId: "321189696292",
    appId: "1:321189696292:web:470c65ec4d2aaef00d19b1"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
</script>

</head>
<body>

    
<div class="header">
  <a href="index11.html"> <img src="images/logo.png"></a>
</div>



<div id="navbar">
  <a class="active" href="javascript:void(0)">Home</a>
<!--  <a href="/PizzaPalace/login.html">Login</a> --> 
	<a id="loginButton" onclick="document.getElementById('id01').style.display='block'">Login</a>
  <a id="SignUpButton" onclick="document.getElementById('id02').style.display='block'">Signup</a>
</div>
  

				<!-- SLIDE SHOW BEGIN -->


<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 4</div>
  <img src="images/a.jpg" style="width:100%">
  <div class="text"></div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 4</div>
  <img src="images/b.jpg" style="width:100%">
  <div class="text"></div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 4</div>
  <img src="images/c.jpg" style="width:100%">
  <div class="text"></div>
</div>

<div class="mySlides fade">
  <div class="numbertext">4 / 4</div>
  <img src="images/d.jpg" style="width:100%">
  <div class="text"></div>
</div>
</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>


				<!-- SLIDE SHOW ENDS -->

				<!-- LOGIN MODAL BEGINS -->
<div id="id01" class="modal">
  
  <form class="modal-content animate" action="loginChecker.jsp" method="post" onsubmit="return validateLoginform()">
    <div class="imgcontainer"> 
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="images/img_avatar.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" id="usename"  >

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" id="pasword">
        
      <button type="submit" >Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
    </div>
  </form>
</div>



				<!--  Login MODAL ENDS -->

				<!-- SignUp Modal STARTS  -->
<div id="id02" class="modal">
  
  <form class="modal-content animate" onsubmit="return validateSignUpform()">
    <div class="imgcontainer"> 
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="images/img_avatar.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname1"><b>Industry Name</b></label>
      <input type="text" placeholder="Enter Name" name="uname1" id="usename1" required>
      
      <label for="mail1"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="mail1" id="email1" required>
      
      <label for="phno"><b>Phone No.</b></label>
      <input type="text" placeholder="Enter Phone No." id="phno" required>

      <label for="psw1"><b>Password</b></label>
      <input type="password" placeholder="*********" name="psw1" id="pasword1" required>
      
      <label for="psw-repeat"><b>Repeat Password</b></label>
      <input type="password" placeholder="Repeat Password" id="psw-repeat" required>
       
      <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
      <button type="submit" onclick="register()" >Register</button>
      
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>
      
    </div>
  </form>
</div>

				<!-- Features Start  -->
<div id="FeatureContainer">
	<div class="features" data-content="Text added on hover" id="F1">
		<img class="fimage" src="images/feature1.png" style="width:100%;">
	</div>
	<div class="features" id="F2">
		<img class="fimage" src="images/feature2.jpg" style="width:100%;">
	</div>
	<div class="features" id="F3">
		<img class="fimage" src="images/feature3.jpg" style="width:100%;">
	</div>
	<div class="features" id="F4">
		<img class="fimage" src="images/feature4.jpg" style="width:100%;">
	</div>
	<div class="features" id="F5">
		<img class="fimage" src="images/feature5.jpg" style="width:100%;">
	</div>
</div>			
			<!-- Features Start  -->
	

				<!-- FOOTER STARTS AND ENDS AT LAST -->


<div class="footer">
<table style="width:100%">
  <tr id="row">
    <td>FARMISTRY</td>
    <td>EXPLORE</td> 
    <td>JOIN US</td>
  </tr>
  <tr>
    <td><a href="">ABOUT US</a></td>
    <td><a href="">BLOG</a></td>
    <td><a href="">FACEBOOK</a></td>
  </tr>
  <tr>
    <td><a href="">CONTACT US</a></td>
    <td><a href="">FAQ</a></td>
    <td><a href="">TWITTER</a></td>
  </tr>
  <tr>
    <td><a href="">POLICIES</a></td>
    <td><a href="">DISCLAIMER</a></td>
  </tr>
</table>
</div>
<div class="footerLast">
<p id="uselessText">� Farmistry, 2019. Any part of the materials available through the
 Farmistry.com site may be copied, photocopied, reproduced, translated or reduced to
  any electronic medium or machine-readable form, in whole or in part, without prior
   written consent of Farmistry.</p>
</div>

 
 
<script>
var latt;
var long;    
    
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
   
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 3500); // Change image every 2 seconds
}
   
window.onscroll = function() {myFunction()};

var navbar = document.getElementById("navbar");
var sticky = navbar.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}


function validateLoginform(){  
	
	  
	var name=document.getElementById("usename");
	var password=document.getElementById("pasword");
	if(name.value=="")
		{
			document.getElementById("usename")
			alert("Please Enter Name");
			return false;
		}
	
	if (password.value=="")
		{
		alert("Please Enter Password");
		return false;
		}
	return true;
	}  
	
function validateSignUpform(){  
	
	  
	var name=document.getElementById("usename1");
	var password=document.getElementById("pasword1");
	var email=document.getElementById("email1");
	if(name.value=="")
		{
		document.getElementById("usename1").style="border:1px solid #ff0000";
			alert("Please Enter Name");
			name.focus();
			return false;
		}
	
	if (password.value=="")
		{
		alert("Please Enter Password");
		return false;
		}
	if(email.value=="")
		{
		alert("Please Enter Mail");
		return false;
		}
	return true;
	}
        
    //LOCATION
    

    	
      /*function callback(position) {
      	var lat=position.coords.latitude;
        var lon=position.coords.longitude;
      	latt = lat;
      	long = lon;
      	}*/
      
//register
/*var lat1=latt;
                var lon1=long;
                alert(lat1);
            
            navigator.geolocation.getCurrentPosition(callback);
           */
var n,phno,email,pwd1,pwd2,uid;
	function register(){

		 n=document.getElementById("usename1").value;
		 phno=document.getElementById("phno").value;
		 email=document.getElementById("email1").value;
		 pwd1=document.getElementById("pasword1").value;
		 pwd2=document.getElementById("psw-repeat").value;
		

			const auth=firebase.auth();
			
			firebase.auth().createUserWithEmailAndPassword(email, pwd1);
			alert("User created successfully");

			 firebase.auth().signInWithEmailAndPassword(email, pwd1).then(function(){
  	alert("login successful");
  }).catch(function(error) {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;

    window.alert("Error : " + errorMessage)
    
    
  });

  firebase.auth().onAuthStateChanged(user=>	{
				if(user){
					alert("user present");
					uid=user.uid;
					alert(uid);
					var ref2=firebase.database().ref().child("Industry_Info").child(uid);
					ref2.set({
						name:n,
						
						phone_no:phno
			});
				}
				else{
					alert("User is not logged in");
				}
			});

}


</script>

</body>
</html>
