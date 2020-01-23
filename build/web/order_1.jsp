<%-- 
    Document   : order.jsp
    Created on : Jan 4, 2020, 2:29:21 PM
    Author     : chand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/SIH/order.css" type="text/css">

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<title>Orders</title>

</head>
<body>
    
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-app.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-auth.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-database.js"></script>
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
 var ref=firebase.database().ref();
</script>



<!-- Side Bar -->
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="#">About</a>
  <a href="#">Services</a>
  <a href="#">Clients</a>
  <a href="#">Contact</a>
</div>
<!--  Side Bar ends -->
<div id="main"  class="asdf">
<div class="header">
  <a> <img src="images/logo.png"></a>
</div>

<div id="navbar">
        <a id="homeButton">Orders</a>
	<a id="logoutButton" onclick="logout()">Logout</a>
        <a id="logoutButton" onclick="document.getElementById('id01').style.display='block'">Request</a>
        <a id="logoutButton" onclick="document.getElementById('id02').style.display='block'">Responses</a>
        <a id="shoppingCart" onclick="openNav()">About</a>
        <div class="search-container">
            <input type="text" placeholder="Search.." id="searchit" name="search" >
            <!--<button type="submit"><i class="fa fa-search"></i></button>-->  
        </div>
</div>
    <div id="foodContainer"></div>
</div>

        <!--              ----------------------- ORDERS--------------------                 -->
            <script>   
                
                ref.on("value",function(snapshot){
                    document.getElementById("foodContainer").innerHTML="";
		var name1=snapshot.child("farmer").val();
                var ids=Object.keys(name1);
                for(var i=0;i<ids.length;i++)
                {
                    var id=ids[i];
                    var var1=snapshot.child(id).val();
                    var orders=Object.keys(var1);
                    console.log("here");
                    console.log(var1);
                    for(var j=0;j<orders.length;j++)
                    {
                        var order=orders[j];
                        var crop=snapshot.child(id).child(order).child("crop").val();
                        var quant=snapshot.child(id).child(order).child("quantity").val();
                        var mail=snapshot.child("farmer").child(id).child("Email").val();
                        var name=snapshot.child("farmer").child(id).child("Name").val();
                        var lat=snapshot.child("farmer").child(id).child("lat").val();
                        var lon=snapshot.child("farmer").child(id).child("lon").val();
                        var phone=snapshot.child("farmer").child(id).child("phone_no").val();
                        document.getElementById("foodContainer").innerHTML+="<div id='food1' class='foodItems'><div class='foodImage'><img src='images/foodItems/food1.jpg' alt=stolen food picture 1></div><div class='foodText'><div class='foodName'> "+crop+"</div><div class='foodPrice'> "+quant+" </div><div class='foodDescription'>"+name+"</div><button id='myBtn' class='addButton' onClick='openAddOns(\""+ id +"\",\""+order+"\")'>More </button></div></div>";
                    }                                                
                                
                }
	        });
            </script>
   <script type="text/javascript">

    $(document).ready(function(){
        $("#searchit").on("keyup", function() {
          var value = $(this).val().toLowerCase();
          $("#foodContainer .foodItems").filter(function() {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1);
          });
        });
      });

  </script>                    
            
        
             
 
<!--              ----------------------- more information about order--------------------                 -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content animate" >
      <span class="close">&times;</span>
     <div class="holemat">
        <div class ="col1">
            <div class="row1">
		     <img src="images/foodItems/food1.jpg" alt="stolen food picture 1">
            </div>
            <div class="row2">
                <p><strong>About Farmer</strong></p>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Name : </strong></div><div style="display:inline" id="name2"></div><br>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Phone no. : </strong></div><div style="display:inline" id="phone"></div><br>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Email : </strong></div><div style="display:inline" id=mail></div><br>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Crop : </strong></div><div style="display:inline" id="crop"></div><br>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Quantity : </strong></div><div style="display:inline" id="quantity"></div><br>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Latitude : </strong></div><div style="display:inline" id="lat"></div><br>
                <div style="display:inline;color: rgb(167, 245, 142)"><strong>Longitude : </strong></div><div style="display:inline" id="lon"></div><br>
            </div>
        </div>
        <div class ="col2">
            <div class="row3">
                <p><strong>Information</strong></p>
                <p>Sapibulumnibh phasellus bsyuf gyug shjfhhfhjffhb sdfhdsh fhd shjf dsh fhdsj fz hdh fdzfjdh hjd zfnulla egestibulum enim pretium elit tincidunt estiquam ultrisque donectetur. Sedcondimentumsan odio hendrerit proin vitae dignis nibh ac justo id congue. Amesintesque vel curabitae volutpat donec alique nasceleifendimentesque montesque rhoncus quis eros. Vestnunc nonummy</p>
            </div>
            <div class="row4">
                
                <a id="shoppingCart" onclick="">Buy</a>
                <a id="shoppingCart" onclick="openForm()">Chat</a>
            </div>
            <div class="chat-popup" id="myForm">
                <form  class="form-container">
                    <h4 style="align:"center">Chat</h4>
                    <div class="msg_container"><ul id="messages"></ul></div>
                    <input type="text" id="message" placeholder="Type message.." name="msg" required>
                    <button type="button" class="btn" onclick="return sendMessage();">Send</button>
                    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
                </form>
            </div>
        </div>
    </div>
  </div>

</div>

<div id="id01" class="modal">
  
  <form class="modal-content animate" >
      
    <div class="container">
        <table id="cont1">
            <tr>
                <td><label for="iname" ><b>Industry Name</b></label></td>
                <td><input type="text" placeholder="Enter Industry Name" name="iname" id="iname"  ></td>
            </tr>
            <tr>
                <td><label for="email"><b>Email</b></label></td>
                <td><input type="text" placeholder="Enter Email" name="email" id="email"></td>
            </tr>
            <tr>
                <td><label for="phno"><b>phone no.</b></label></td>
                <td><input type="text" placeholder="Enter Number" name="phno" id="phno"></td>
            </tr>
            <tr>
                <td><label for="cropname"><b>Crop</b></label></td>
                <td><input type="text" placeholder="Enter crop" name="cropname" id="cropname"></td>
            </tr>
            <tr>
                <td><label for="desc"><b>Description</b></label></td>
                <td><textarea rows="4" cols="50" name="comment" form="usrform" placeholder="Description" id="desc"></textarea></td>
            </tr>
            <tr>
                <td><label for="quantity"><b>Quantity</b></label></td>
                <td><input type="text" placeholder="Enter Quantity" name="quantity" id="quanti"></td>
            </tr>
            <tr>
                <td><label for="cost"><b>Price</b></label></td>
                <td><input type="text" placeholder="Enter price" name="cost" id="cost"></td>
            </tr>
            <tr>
                <td><label for="transport"><b>Transport</b></label></td>
                <td>
                    <select id="transport" name="transport">
                        <option value="yes">Yes</option>
                        <option value="no">No</option>
                    </select>
                </td>
            </tr>
        </table>
      
      <button type="button" onclick="request1()">Request</button>
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
    </div>
  </form>
</div>
<div id="id02" class="modal">

  <!-- Modal content -->
    <div class="modal-content animate" >
        <a onclick="document.getElementById('id02').style.display='none'" class="close">&times;</a>
        <div class="container">
            <div id="foodContainer">
                <div id="food1" class="foodItems">
		<div class="foodImage">
			<img src="images/foodItems/food1.jpg" >
		</div>
		<div class="foodText">
			<p class="foodName"> crop #1</p>
			<p class="foodPrice"> Rs. 500 </p>
			<p class="foodDescription">name 1</p>
			<button id="myBtn" class="addButton" onClick="openAddOns()">More</button>
		</div>
	</div>
	
	<div id="food2" class="foodItems">
		<div class="foodImage">
			<img src="images/foodItems/food1.jpg" >
		</div>
		<div class="foodText">
			<p class="foodName"> crop #2</p>
			<p class="foodPrice"> Rs. 400 </p>
			<p class="foodDescription">name 2</p>
			<button class="addButton" onClick="openAddOns()">More</button>
		</div>
	</div>
	
	<div id="food3" class="foodItems">
		<div class="foodImage">
			<img src="images/foodItems/food1.jpg" >
		</div>
		<div class="foodText">
			<p class="foodName"> crop #3</p>
			<p class="foodPrice"> Rs. 650 </p>
			<p class="foodDescription">name 3</p>
			<button class="addButton" onClick="openAddOns()">More</button>
		</div>
	</div>
	
	<div id="food4" class="foodItems">
		<div class="foodImage">
			<img src="images/foodItems/food1.jpg" >
		</div>
		<div class="foodText">
			<p class="foodName"> crop #4</p>
			<p class="foodPrice"> Rs. 300 </p>
			<p class="foodDescription">name 4</p>
			<button class="addButton" onClick="openAddOns()">More</button>
		</div>
	</div>
	
	<div id="food4" class="foodItems">
		<div class="foodImage">
			<img src="images/foodItems/food1.jpg" >
		</div>
		<div class="foodText">
			<p class="foodName"> crop #5</p>
			<p class="foodPrice"> Rs. 300 </p>
			<p class="foodDescription"> name 5</p>
			<button class="addButton" onClick="openAddOns()">More</button>
		</div>
	</div>
	
	<div id="food4" class="foodItems">
		<div class="foodImage">
			<img src="images/foodItems/food1.jpg" >
		</div>
		<div class="foodText">
			<p class="foodName"> crop #6</p>
			<p class="foodPrice"> Rs. 300 </p>
			<p class="foodDescription"> name 6</p>
			<button class="addButton" onClick="openAddOns()">More</button>
		</div>
	</div>
	
            </div>
        </div>

    </div>				<!-- FOOTER STARTS AND ENDS AT LAST -->
</div>	

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
<p id="uselessText">© Farmistry, 2019. Any part of the materials available through the
 Farmistry.com site may be copied, photocopied, reproduced, translated or reduced to
  any electronic medium or machine-readable form, in whole or in part, without prior
   written consent of Farmistry.</p>
</div>


<script>

//===================FOR THE SIDEBAR===================
var myName;

function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
  document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
  document.body.style.backgroundColor = "white";
}


//======================================================
	
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

// Get the modal-----------------------------------------------------------------------------------------------
var modal = document.getElementById('myModal');

// Get the button that opens the modal

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal-------------------------------------------------------------------- 
function openAddOns(id,order) {
  modal.style.display = "block";
  //document.getElementById("crop").innerHTML=name1;
 
                ref.on("value",function(snapshot){
                    
                    console.log(order);
                    var crop=snapshot.child(id).child(order).child("crop").val();
                    var quant=snapshot.child(id).child(order).child("quantity").val();
                    var mail=snapshot.child("farmer").child(id).child("Email").val();
                    var name=snapshot.child("farmer").child(id).child("Name").val();
                    var lat=snapshot.child("farmer").child(id).child("lat").val();
                    var lon=snapshot.child("farmer").child(id).child("lon").val();
                    var phone=snapshot.child("farmer").child(id).child("phone_no").val();
                            document.getElementById("crop").innerHTML=crop;
                            document.getElementById("name2").innerHTML=name;
                            document.getElementById("mail").innerHTML=mail;
                            document.getElementById("phone").innerHTML=phone;
                            document.getElementById("quantity").innerHTML=quant;
                            document.getElementById("lat").innerHTML=lat;
                            document.getElementById("lon").innerHTML=lon;
                /*var name2=snapshot.child("products").val();
                var cropkeys=Object.keys(name2);
                for(var i=0;i<cropkeys.length;i++)
                {
                    var crop=cropkeys[i];
                    var name1=snapshot.child("products").child(crop).val();
                    var farmerkeys=Object.keys(name1);
                    for(var j=0;j<farmerkeys.length;j++)
                    {
                        var farmer=farmerkeys[j];                      
		        var name=snapshot.child("products").child(crop).child(farmer).child("name").val(); 
                        var price=snapshot.child("products").child(crop).child(farmer).child("price").val();
                        var quantity=snapshot.child("products").child(crop).child(farmer).child("quantity").val();
                        var loc=snapshot.child("products").child(crop).child(farmer).child("location").val();
                        if(name==para)
                        {
                            var name3=name;
                            var price1=price;
                            var quant=quantity;
                            var loc1=loc;
                            var crop1=crop;
                              document.getElementById("crop").innerHTML=crop1;
                              document.getElementById("name2").innerHTML=name3;
                              document.getElementById("price").innerHTML=price1;
                              document.getElementById("quantity").innerHTML=quant;
                              document.getElementById("loc").innerHTML=loc1;
                        }
                    }
                }
              */
	        });
  
}
//Request from industry--------------------------------------------------------------------------------------

var n,l,phno,email,pwd1,uid,la,lo;

function request1()
{
    alert("function opened");
    n=document.getElementById("iname").value;
    em=document.getElementById("email").value;
    phno=document.getElementById("phno").value;
    cr=document.getElementById("cropname").value;
    d=document.getElementById("desc").value;
    q=document.getElementById("quanti").value;
    co=document.getElementById("cost").value;
    tr=document.getElementById("transport").value;
    alert(n);
    firebase.auth().onAuthStateChanged(user=>	{
				if(user){
					alert("user present");
					var e=user.email;
					//if(e!=email){
					alert(e);
					uid=user.uid;
					alert(uid);
                                        /*ref.on("value",function(snapshot){
                                                la=snapshot.child("Industry_Info").child(uid).child(lat).val();
                                                lo=snapshot.child("Industry_Info").child(uid).child(lon).val();
                                                alert(la);
                                                alert(lo);
                                         });
                                        alert(la);
                                        alert(lo);*/
					
				//}
					
				}
				else{
					alert("User is not logged in");
				}
			});
                        setTimeout(function(){ 
                                                alert("Outside")
                                                alert(uid);
                                                ref.on("value",function(snapshot){
                                                la=snapshot.child("Industry_Info").child(uid).child("lat").val();
                                                lo=snapshot.child("Industry_Info").child(uid).child("lon").val();
                                            });
                                        var ref2=firebase.database().ref().child("Industry").child(uid);
					ref2.set({
                                                Id:uid,
                                                crop:cr,
                                                description:d,
                                                email:em,
                                                lat:la,
                                                lon:lo,
						name:n,
						phone_no:phno,
                                                price:co,
                                                quantity:q,
                                                transport:tr,
                                                flag:"0"
                                                });
                                            }, 6000);
                        
}

//LOGOUT-------------------------------------------------------------------------------------

function logout(){
    firebase.auth().signOut().then(function() {
                    // Sign-out successful.
                    alert("signed out successfully");
                    setTimeout(function(){ 
                                        window.location.replace("index.html"); 
                                        }, 3000);
                    }, function(error) {
                    // An error happened.
                    alert("error");
                            });
}
//=-----------------------------------------------------------------------------------------
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
} 
 
//for chatting---------------------------------------------------------------------------


function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}



function sendMessage() {
    // get message
    var message = document.getElementById("message").value;
    // save in database
    /*firebase.database().ref("messages").push().set({
      //sender: myName,
      "message": message
    });

    // prevent form from submitting
    return false;
  }
  firebase.database().ref("messages").on("child_added", function (snapshot) {
    var html = "";
    // give each message a unique ID
    html += "<li id='message-" + snapshot.key + "'>";
    // show delete button if message is sent by me
    if (snapshot.val().sender == myName) {
      html += "<button data-id='" + snapshot.key + "' onclick='deleteMessage(this);'>";
        html += "Delete";
      html += "</button>";
    }
    html += snapshot.val().sender + ": " + snapshot.val().message;
    html += "</li>";

    document.getElementById("messages").innerHTML += html;
  });*/
        }
 
</script>

</body>
</html>
