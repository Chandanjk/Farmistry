package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/SIH/order.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("<title>Orders</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/7.6.1/firebase-app.js\"></script>\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/7.6.1/firebase-auth.js\"></script>\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/7.6.1/firebase-database.js\"></script>\n");
      out.write("   <script>\n");
      out.write("  // Your web app's Firebase configuration\n");
      out.write("  var firebaseConfig = {\n");
      out.write("    apiKey: \"AIzaSyClVYk0bADStu9Bz7kiTTcE8v5S43zVzXw\",\n");
      out.write("    authDomain: \"fir-ff12d.firebaseapp.com\",\n");
      out.write("    databaseURL: \"https://fir-ff12d.firebaseio.com\",\n");
      out.write("    projectId: \"fir-ff12d\",\n");
      out.write("    storageBucket: \"fir-ff12d.appspot.com\",\n");
      out.write("    messagingSenderId: \"321189696292\",\n");
      out.write("    appId: \"1:321189696292:web:470c65ec4d2aaef00d19b1\"\n");
      out.write("  };\n");
      out.write("  // Initialize Firebase\n");
      out.write(" firebase.initializeApp(firebaseConfig);\n");
      out.write(" var ref=firebase.database().ref();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Side Bar -->\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("  <a href=\"#\">About</a>\n");
      out.write("  <a href=\"#\">Services</a>\n");
      out.write("  <a href=\"#\">Clients</a>\n");
      out.write("  <a href=\"#\">Contact</a>\n");
      out.write("</div>\n");
      out.write("<!--  Side Bar ends -->\n");
      out.write("<div id=\"main\"  class=\"asdf\">\n");
      out.write("<div class=\"header\">\n");
      out.write("  <a> <img src=\"images/logo.png\"></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"navbar\">\n");
      out.write("        <a id=\"homeButton\">Orders</a>\n");
      out.write("\t<a id=\"logoutButton\" onclick=\"logout()\">Logout</a>\n");
      out.write("        <a id=\"logoutButton\" onclick=\"document.getElementById('id01').style.display='block'\">Request</a>\n");
      out.write("        <a id=\"logoutButton\" href=\"response.jsp\">Responses</a>\n");
      out.write("        <a id=\"logoutButton\" onclick=\"payment()\">OL Payment</a>\n");
      out.write("        <a id=\"shoppingCart\" onclick=\"openNav()\">About</a>\n");
      out.write("        <div class=\"search-container\">\n");
      out.write("            <input type=\"text\" placeholder=\"Search..\" id=\"searchit\" name=\"search\" >\n");
      out.write("            <!--<button type=\"submit\"><i class=\"fa fa-search\"></i></button>-->  \n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("    <div id=\"foodContainer\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!--              ----------------------- ORDERS--------------------                 -->\n");
      out.write("            <script>   \n");
      out.write("                \n");
      out.write("                ref.on(\"value\",function(snapshot){\n");
      out.write("                    document.getElementById(\"foodContainer\").innerHTML=\"\";\n");
      out.write("\t\tvar name1=snapshot.child(\"farmer\").val();\n");
      out.write("                var ids=Object.keys(name1);\n");
      out.write("                for(var i=0;i<ids.length;i++)\n");
      out.write("                {\n");
      out.write("                    var id=ids[i];\n");
      out.write("                    //alert(id);\n");
      out.write("                    var var1=snapshot.child(id).val();\n");
      out.write("                    if(var1!=null){\n");
      out.write("                    //alert(var1);\n");
      out.write("                    var orders=Object.keys(var1);\n");
      out.write("                    console.log(\"here\");\n");
      out.write("                    console.log(var1);\n");
      out.write("                    for(var j=0;j<orders.length;j++)\n");
      out.write("                    {\n");
      out.write("                        var order=orders[j];\n");
      out.write("                        var crop=snapshot.child(id).child(order).child(\"crop\").val();\n");
      out.write("                        var quant=snapshot.child(id).child(order).child(\"quantity\").val();\n");
      out.write("                        var mail=snapshot.child(\"farmer\").child(id).child(\"Email\").val();\n");
      out.write("                        var name=snapshot.child(\"farmer\").child(id).child(\"Name\").val();\n");
      out.write("                        var lat=snapshot.child(\"farmer\").child(id).child(\"lat\").val();\n");
      out.write("                        var lon=snapshot.child(\"farmer\").child(id).child(\"lon\").val();\n");
      out.write("                        var phone=snapshot.child(\"farmer\").child(id).child(\"phone_no\").val();\n");
      out.write("                        document.getElementById(\"foodContainer\").innerHTML+=\"<div id='food1' class='foodItems'><div class='foodImage'><img src='images/foodItems/food1.jpg' alt=stolen food picture 1></div><div class='foodText'><div class='foodName'> \"+crop+\"</div><div class='foodPrice'> \"+quant+\" </div><div class='foodDescription'>\"+name+\"</div><button id='myBtn' class='addButton' onClick='openAddOns(\\\"\"+ id +\"\\\",\\\"\"+order+\"\\\")'>More </button></div></div>\";\n");
      out.write("                    }                                                \n");
      out.write("                                \n");
      out.write("                }}\n");
      out.write("\t        });\n");
      out.write("            </script>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#searchit\").on(\"keyup\", function() {\n");
      out.write("          var value = $(this).val().toLowerCase();\n");
      out.write("          $(\"#foodContainer .foodItems\").filter(function() {\n");
      out.write("            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1);\n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("\n");
      out.write("  </script>                    \n");
      out.write("            \n");
      out.write("        \n");
      out.write("             \n");
      out.write(" \n");
      out.write("<!--              ----------------------- more information about order--------------------                 -->\n");
      out.write("<div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("  <!-- Modal content -->\n");
      out.write("  <div class=\"modal-content animate\" >\n");
      out.write("      <span class=\"close\">&times;</span>\n");
      out.write("     <div class=\"holemat\">\n");
      out.write("        <div class =\"col1\">\n");
      out.write("            <div class=\"row1\">\n");
      out.write("\t\t     <img src=\"images/foodItems/food1.jpg\" alt=\"stolen food picture 1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row2\">\n");
      out.write("                <p><strong>About Farmer</strong></p>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Name : </strong></div><div style=\"display:inline\" id=\"name2\"></div><br>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Phone no. : </strong></div><div style=\"display:inline\" id=\"phone\"></div><br>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Email : </strong></div><div style=\"display:inline\" id=mail></div><br>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Crop : </strong></div><div style=\"display:inline\" id=\"crop\"></div><br>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Quantity : </strong></div><div style=\"display:inline\" id=\"quantity\"></div><br>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Latitude : </strong></div><div style=\"display:inline\" id=\"lat\"></div><br>\n");
      out.write("                <div style=\"display:inline;color: rgb(167, 245, 142)\"><strong>Longitude : </strong></div><div style=\"display:inline\" id=\"lon\"></div><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class =\"col2\">\n");
      out.write("            <div class=\"row3\">\n");
      out.write("                <p><strong>Information</strong></p>\n");
      out.write("                <p>Best Quality product is provided by us and we can assure that there will not be any foul quantity provided </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row4\">\n");
      out.write("                \n");
      out.write("                <a id=\"shoppingCart\" onclick=\"\">Buy</a>\n");
      out.write("                <a id=\"shoppingCart\" onclick=\"openForm()\">Chat</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chat-popup\" id=\"myForm\">\n");
      out.write("                <form  class=\"form-container\">\n");
      out.write("                    <h4 style=\"align:\"center\">Chat</h4>\n");
      out.write("                    <div class=\"msg_container\"><ul id=\"messages\"></ul></div>\n");
      out.write("                    <input type=\"text\" id=\"message\" placeholder=\"Type message..\" name=\"msg\" required>\n");
      out.write("                    <button type=\"button\" class=\"btn\" onclick=\"return sendMessage();\">Send</button>\n");
      out.write("                    <button type=\"button\" class=\"btn cancel\" onclick=\"closeForm()\">Close</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"id01\" class=\"modal\">\n");
      out.write("  \n");
      out.write("  <form class=\"modal-content animate\" >\n");
      out.write("      \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <table id=\"cont1\">\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"iname\" ><b>Industry Name</b></label></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Enter Industry Name\" name=\"iname\" id=\"iname\"  ></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"email\"><b>Email</b></label></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Enter Email\" name=\"email\" id=\"email\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"phno\"><b>phone no.</b></label></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Enter Number\" name=\"phno\" id=\"phno\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"cropname\"><b>Crop</b></label></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Enter crop\" name=\"cropname\" id=\"cropname\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"desc\"><b>Description</b></label></td>\n");
      out.write("                <td><textarea rows=\"4\" cols=\"50\" name=\"comment\" form=\"usrform\" placeholder=\"Description\" id=\"desc\"></textarea></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"quantity\"><b>Quantity</b></label></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Enter Quantity\" name=\"quantity\" id=\"quanti\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"cost\"><b>Price</b></label></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Enter price\" name=\"cost\" id=\"cost\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"transport\"><b>Transport</b></label></td>\n");
      out.write("                <td>\n");
      out.write("                    <select id=\"transport\" name=\"transport\">\n");
      out.write("                        <option value=\"yes\">Yes</option>\n");
      out.write("                        <option value=\"no\">No</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("      \n");
      out.write("      <button type=\"button\" onclick=\"request1()\">Request</button>\n");
      out.write("      <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- FOOTER STARTS AND ENDS AT LAST -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("<table style=\"width:100%\">\n");
      out.write("  <tr id=\"row\">\n");
      out.write("    <td>FARMISTRY</td>\n");
      out.write("    <td>EXPLORE</td> \n");
      out.write("    <td>JOIN US</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><a href=\"\">ABOUT US</a></td>\n");
      out.write("    <td><a href=\"\">BLOG</a></td>\n");
      out.write("    <td><a href=\"\">FACEBOOK</a></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><a href=\"\">CONTACT US</a></td>\n");
      out.write("    <td><a href=\"\">FAQ</a></td>\n");
      out.write("    <td><a href=\"\">TWITTER</a></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><a href=\"\">POLICIES</a></td>\n");
      out.write("    <td><a href=\"\">DISCLAIMER</a></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div class=\"footerLast\">\n");
      out.write("<p id=\"uselessText\">© Farmistry, 2019. Any part of the materials available through the\n");
      out.write(" Farmistry.com site may be copied, photocopied, reproduced, translated or reduced to\n");
      out.write("  any electronic medium or machine-readable form, in whole or in part, without prior\n");
      out.write("   written consent of Farmistry.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("//===================FOR THE SIDEBAR===================\n");
      out.write("var myName;\n");
      out.write("\n");
      out.write("function openNav() {\n");
      out.write("  document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("  document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("  document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeNav() {\n");
      out.write("  document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("  document.getElementById(\"main\").style.marginLeft= \"0\";\n");
      out.write("  document.body.style.backgroundColor = \"white\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("//======================================================\n");
      out.write("\t\n");
      out.write("window.onscroll = function() {myFunction()};\n");
      out.write("\n");
      out.write("var navbar = document.getElementById(\"navbar\");\n");
      out.write("var sticky = navbar.offsetTop;\n");
      out.write("\n");
      out.write("function myFunction() {\n");
      out.write("  if (window.pageYOffset >= sticky) {\n");
      out.write("    navbar.classList.add(\"sticky\")\n");
      out.write("  } else {\n");
      out.write("    navbar.classList.remove(\"sticky\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('myModal');\n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks the button, open the modal \n");
      out.write("function openAddOns(id,order) {\n");
      out.write("  modal.style.display = \"block\";\n");
      out.write("  //document.getElementById(\"crop\").innerHTML=name1;\n");
      out.write(" \n");
      out.write("                ref.on(\"value\",function(snapshot){\n");
      out.write("                    \n");
      out.write("                    console.log(order);\n");
      out.write("                    var crop=snapshot.child(id).child(order).child(\"crop\").val();\n");
      out.write("                    var quant=snapshot.child(id).child(order).child(\"quantity\").val();\n");
      out.write("                    var mail=snapshot.child(\"farmer\").child(id).child(\"Email\").val();\n");
      out.write("                    var name=snapshot.child(\"farmer\").child(id).child(\"Name\").val();\n");
      out.write("                    var lat=snapshot.child(\"farmer\").child(id).child(\"lat\").val();\n");
      out.write("                    var lon=snapshot.child(\"farmer\").child(id).child(\"lon\").val();\n");
      out.write("                    var phone=snapshot.child(\"farmer\").child(id).child(\"phone_no\").val();\n");
      out.write("                            document.getElementById(\"crop\").innerHTML=crop;\n");
      out.write("                            document.getElementById(\"name2\").innerHTML=name;\n");
      out.write("                            document.getElementById(\"mail\").innerHTML=mail;\n");
      out.write("                            document.getElementById(\"phone\").innerHTML=phone;\n");
      out.write("                            document.getElementById(\"quantity\").innerHTML=quant;\n");
      out.write("                            document.getElementById(\"lat\").innerHTML=lat;\n");
      out.write("                            document.getElementById(\"lon\").innerHTML=lon;\n");
      out.write("                /*var name2=snapshot.child(\"products\").val();\n");
      out.write("                var cropkeys=Object.keys(name2);\n");
      out.write("                for(var i=0;i<cropkeys.length;i++)\n");
      out.write("                {\n");
      out.write("                    var crop=cropkeys[i];\n");
      out.write("                    var name1=snapshot.child(\"products\").child(crop).val();\n");
      out.write("                    var farmerkeys=Object.keys(name1);\n");
      out.write("                    for(var j=0;j<farmerkeys.length;j++)\n");
      out.write("                    {\n");
      out.write("                        var farmer=farmerkeys[j];                      \n");
      out.write("\t\t        var name=snapshot.child(\"products\").child(crop).child(farmer).child(\"name\").val(); \n");
      out.write("                        var price=snapshot.child(\"products\").child(crop).child(farmer).child(\"price\").val();\n");
      out.write("                        var quantity=snapshot.child(\"products\").child(crop).child(farmer).child(\"quantity\").val();\n");
      out.write("                        var loc=snapshot.child(\"products\").child(crop).child(farmer).child(\"location\").val();\n");
      out.write("                        if(name==para)\n");
      out.write("                        {\n");
      out.write("                            var name3=name;\n");
      out.write("                            var price1=price;\n");
      out.write("                            var quant=quantity;\n");
      out.write("                            var loc1=loc;\n");
      out.write("                            var crop1=crop;\n");
      out.write("                              document.getElementById(\"crop\").innerHTML=crop1;\n");
      out.write("                              document.getElementById(\"name2\").innerHTML=name3;\n");
      out.write("                              document.getElementById(\"price\").innerHTML=price1;\n");
      out.write("                              document.getElementById(\"quantity\").innerHTML=quant;\n");
      out.write("                              document.getElementById(\"loc\").innerHTML=loc1;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("              */\n");
      out.write("\t        });\n");
      out.write("  \n");
      out.write("}\n");
      out.write("//Request from industry\n");
      out.write("var n,l,phno,email,pwd1,uid,la,lo;\n");
      out.write("\n");
      out.write("function request1()\n");
      out.write("{\n");
      out.write("   // alert(\"function opened\");\n");
      out.write("    n=document.getElementById(\"iname\").value;\n");
      out.write("    em=document.getElementById(\"email\").value;\n");
      out.write("    phno=document.getElementById(\"phno\").value;\n");
      out.write("    cr=document.getElementById(\"cropname\").value;\n");
      out.write("    d=document.getElementById(\"desc\").value;\n");
      out.write("    q=document.getElementById(\"quanti\").value;\n");
      out.write("    co=document.getElementById(\"cost\").value;\n");
      out.write("    tr=document.getElementById(\"transport\").value;\n");
      out.write("    //alert(n);\n");
      out.write("    firebase.auth().onAuthStateChanged(user=>\t{\n");
      out.write("\t\t\t\tif(user){\n");
      out.write("\t\t\t\t\t//alert(\"user present\");\n");
      out.write("\t\t\t\t\tvar e=user.email;\n");
      out.write("\t\t\t\t\t//if(e!=email){\n");
      out.write("\t\t\t\t\t//alert(e);\n");
      out.write("\t\t\t\t\tuid=user.uid;\n");
      out.write("\t\t\t\t\t//alert(uid);\n");
      out.write("                                        /*ref.on(\"value\",function(snapshot){\n");
      out.write("                                                la=snapshot.child(\"Industry_Info\").child(uid).child(lat).val();\n");
      out.write("                                                lo=snapshot.child(\"Industry_Info\").child(uid).child(lon).val();\n");
      out.write("                                                alert(la);\n");
      out.write("                                                alert(lo);\n");
      out.write("                                         });\n");
      out.write("                                        alert(la);\n");
      out.write("                                        alert(lo);*/\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t//}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse{\n");
      out.write("\t\t\t\t\t//alert(\"User is not logged in\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("                        setTimeout(function(){ \n");
      out.write("                                                //alert(\"Outside\")\n");
      out.write("                                                //alert(uid);\n");
      out.write("                                                ref.on(\"value\",function(snapshot){\n");
      out.write("                                                la=snapshot.child(\"Industry_Info\").child(uid).child(\"lat\").val();\n");
      out.write("                                                lo=snapshot.child(\"Industry_Info\").child(uid).child(\"lon\").val();\n");
      out.write("                                            });\n");
      out.write("                                        var ref2=firebase.database().ref().child(\"Industry\").child(uid);\n");
      out.write("\t\t\t\t\tref2.set({\n");
      out.write("                                                Id:uid,\n");
      out.write("                                                crop:cr,\n");
      out.write("                                                description:d,\n");
      out.write("                                                email:em,\n");
      out.write("                                                lat:la,\n");
      out.write("                                                lon:lo,\n");
      out.write("\t\t\t\t\t\tname:n,\n");
      out.write("\t\t\t\t\t\tphone_no:phno,\n");
      out.write("                                                price:co,\n");
      out.write("                                                quantity:q,\n");
      out.write("                                                transport:tr,\n");
      out.write("                                                flag:\"0\"\n");
      out.write("                                                });\n");
      out.write("                                            }, 2000);\n");
      out.write("                        \n");
      out.write("}\n");
      out.write("\n");
      out.write("//LOGOUT-------------\n");
      out.write("\n");
      out.write("function logout(){\n");
      out.write("    firebase.auth().signOut().then(function() {\n");
      out.write("                    // Sign-out successful.\n");
      out.write("                    //alert(\"signed out successfully\");\n");
      out.write("                    setTimeout(function(){ \n");
      out.write("                                        window.location.replace(\"index.html\"); \n");
      out.write("                                        }, 3000);\n");
      out.write("                    }, function(error) {\n");
      out.write("                    // An error happened.\n");
      out.write("                    alert(\"error\");\n");
      out.write("                            });\n");
      out.write("}\n");
      out.write("\n");
      out.write("//payment----------------------------------------------------------\n");
      out.write("\n");
      out.write("function payment(){\n");
      out.write("    window.location=\"index1.php\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("span.onclick = function() {\n");
      out.write("  modal.style.display = \"none\";\n");
      out.write("  //document.getElementById(\"raj\").innerHTML=\" Take a bow bitches\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (event.target == modal) {\n");
      out.write("    modal.style.display = \"none\";\n");
      out.write("    //document.getElementById(\"raj\").innerHTML=\" Take a bow bitches\";\n");
      out.write("  }\n");
      out.write("} \n");
      out.write(" \n");
      out.write("//for chatting\n");
      out.write("function openForm() {\n");
      out.write("  document.getElementById(\"myForm\").style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeForm() {\n");
      out.write("  document.getElementById(\"myForm\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function sendMessage() {\n");
      out.write("    // get message\n");
      out.write("    var message = document.getElementById(\"message\").value;\n");
      out.write("    // save in database\n");
      out.write("    /*firebase.database().ref(\"messages\").push().set({\n");
      out.write("      //sender: myName,\n");
      out.write("      \"message\": message\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // prevent form from submitting\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("  firebase.database().ref(\"messages\").on(\"child_added\", function (snapshot) {\n");
      out.write("    var html = \"\";\n");
      out.write("    // give each message a unique ID\n");
      out.write("    html += \"<li id='message-\" + snapshot.key + \"'>\";\n");
      out.write("    // show delete button if message is sent by me\n");
      out.write("    if (snapshot.val().sender == myName) {\n");
      out.write("      html += \"<button data-id='\" + snapshot.key + \"' onclick='deleteMessage(this);'>\";\n");
      out.write("        html += \"Delete\";\n");
      out.write("      html += \"</button>\";\n");
      out.write("    }\n");
      out.write("    html += snapshot.val().sender + \": \" + snapshot.val().message;\n");
      out.write("    html += \"</li>\";\n");
      out.write("\n");
      out.write("    document.getElementById(\"messages\").innerHTML += html;\n");
      out.write("  });*/\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
