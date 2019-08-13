<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%@ taglib prefix ="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cuenta paaa</title>
</head>
<s:head/>
<sx:head/>
<body>
<sx:tabbedpanel id="formCuenta">
		<sx:div label="FORMULARIO AUTENTICA / CUENTA"> 
			<s:form action="autentica.action" method="post">
				<s:textfield key="login"  label="LOGIN"/>	
				<s:password key="password" label="PASSWORD"/>
				<s:submit value="Aceptar"/>
			</s:form>
			
		</sx:div>
				
	</sx:tabbedpanel>
			
</body>
</html>