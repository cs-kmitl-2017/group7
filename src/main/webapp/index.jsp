<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                    <small> Website for help you to create e-tax invoice.</small>
                    <hr>
                    <div class="text-center" style="margin-top:50px;">
                        <a href="taxinvoice.jsp" type="button" class="btn btn-warning">Create!</a> 
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="shared/script.jsp" />  
    </body>
</html>
