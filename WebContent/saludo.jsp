<%@ page import = "java.util.Calendar"%>

<%
Calendar ahora = Calendar.getInstance();
int hora = ahora.get(Calendar.HOUR_OF_DAY);
if ((hora > 20) || (hora < 6)) {
%>
	buenas noches
<% } else if ((hora >= 6) && (hora <= 12)) { %>
	buenos días
<% } else { %>
	buenas tardes
<% } %>