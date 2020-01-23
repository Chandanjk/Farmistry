<%-- 
    Document   : newjsp1
    Created on : Jan 12, 2020, 1:21:52 AM
    Author     : chand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-app.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-auth.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-database.js"></script>
    <script src="https://www.gstatic.com/firebasejs/7.6.1/firebase-storage.js"></script>
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

var storageRef = firebase.storage().ref();
         var spaceRef = storageRef.child('sweet_gift/vytcdc.png');
         storageRef.child('All_Image_Uploads').child("1578218610646.jpg").getDownloadURL().then(function(url) {
             var test = url;
             alert(url);
             document.getElementById("foodContainer").innerHTML+="<div id='food1' class='foodItems'><img src='"+url+"'></div>"; 
      

         }).catch(function(error) {

         });
 /*ref.on("value",function(snapshot){
                    document.getElementById("foodContainer").innerHTML="";
		var name1=snapshot.child("All_Image_Uploads_Database").val();
                var ids=Object.keys(name1);
                for(var i=0;i<ids.length;i++)
                {
                    var id=ids[i];
                    alert(id);
                    var img1=snapshot.child("All_Image_Uploads_Database").child(id).child("imageURL").val();
                    alert(img1);
                    document.getElementById("foodContainer").innerHTML+="<div id='food1' class='foodItems'><img src='"+img1+"'></div>";            
                }
	        });*/
            </script>
            <div id="foodContainer">  </div>              
    </body>
</html>
