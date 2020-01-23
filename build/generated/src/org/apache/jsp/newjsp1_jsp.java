package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/7.6.1/firebase-app.js\"></script>\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/7.6.1/firebase-auth.js\"></script>\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/7.6.1/firebase-database.js\"></script>\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/5.9.1/firebase-storage.js\"></script>\n");
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
      out.write("\n");
      out.write("var storageRef = firebase.storage().ref();\n");
      out.write("         var spaceRef = storageRef.child('sweet_gift/vytcdc.png');\n");
      out.write("         storageRef.child('All_Image_Uploads').child(\"1578218610646.jpg\").getDownloadURL().then(function(url) {\n");
      out.write("             var test = url;\n");
      out.write("             alert(url);\n");
      out.write("             document.getElementById(\"foodContainer\").innerHTML+=\"<div id='food1' class='foodItems'><img src='\"+url+\"'></div>\"; \n");
      out.write("      \n");
      out.write("\n");
      out.write("         }).catch(function(error) {\n");
      out.write("\n");
      out.write("         });\n");
      out.write(" /*ref.on(\"value\",function(snapshot){\n");
      out.write("                    document.getElementById(\"foodContainer\").innerHTML=\"\";\n");
      out.write("\t\tvar name1=snapshot.child(\"All_Image_Uploads_Database\").val();\n");
      out.write("                var ids=Object.keys(name1);\n");
      out.write("                for(var i=0;i<ids.length;i++)\n");
      out.write("                {\n");
      out.write("                    var id=ids[i];\n");
      out.write("                    alert(id);\n");
      out.write("                    var img1=snapshot.child(\"All_Image_Uploads_Database\").child(id).child(\"imageURL\").val();\n");
      out.write("                    alert(img1);\n");
      out.write("                    document.getElementById(\"foodContainer\").innerHTML+=\"<div id='food1' class='foodItems'><img src='\"+img1+\"'></div>\";            \n");
      out.write("                }\n");
      out.write("\t        });*/\n");
      out.write("            </script>\n");
      out.write("            <div id=\"foodContainer\">  </div>              \n");
      out.write("    </body>\n");
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
