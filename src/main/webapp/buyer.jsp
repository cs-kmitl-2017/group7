<%-- 
    Document   : buyer.jsp
    Created on : Dec 8, 2017, 11:38:05 PM
    Author     : Janezkk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> CS-KMITL: Group 7 | Trade Service Message </title>
        <jsp:include page="shared/header.jsp" />
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-md-center">
                <div class="col-12 col-md-auto">
                    <h1><strong> Trade Service Message </strong></h1>
                    <small> Please choose user type for create e-tax invoice.</small>
                    <hr>
                    <div class="text-center" style="margin-top:50px;">
                        <a href="seller.jsp" type="button" class="btn btn-success">Seller</a>
                        <a href="buyer.jsp" type="button" class="btn btn-warning">Buyer</a> 
                    </div>

                </div>
            </div>
        </div>
        <jsp:include page="shared/script.jsp" />  
    </body>
</html>
