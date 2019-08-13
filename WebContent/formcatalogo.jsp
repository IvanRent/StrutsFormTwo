<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%@ taglib prefix ="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head/>
<sx:head/>
<body>
	<sx:tabbedpanel id="formCatalogo">
		<sx:div label="FORMULARIO CATALOGO / CIUDAD">
			<s:radio name="ciudad" label="CIUDAD" list="nombres"/><br>
			<s:checkboxlist name="ciudad" label="CIUDAD" list="nombres" /><br>
			<s:select name="ciudad" label="CIUDAD" list="nombres " headerkey="1" headerValue="SELECCIONA CIUDAD"/><br>
			<sx:autocompleter name="ciudad" label="CIUDAD" list="nombres"/>
			
		</sx:div>
				
	</sx:tabbedpanel>
</body>
</html>