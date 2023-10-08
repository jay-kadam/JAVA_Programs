<%@ page language="java" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>JSP Program</title>
</head>
<body>

    <form method="post">

        <h3>Enter a number:</h3>
        <input type="number" name="number" required>

        <br><br>

        <input type="submit" name="square" value="Find Square">
        <input type="submit" name="prime" value="Check Prime">
        <input type="submit" name="date" value="Current Date">
        <input type="submit" name="evenodd" value="Even or Odd">

    </form>

    <br><br>

    <%-- Processing user input --%>
    <% 
        if (request.getParameter("square") != null) {
            int num = Integer.parseInt(request.getParameter("number"));
            int square = num * num;
            out.println("Square of " + num + " is " + square);
        } else if (request.getParameter("prime") != null) {
            int num = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                out.println(num + " is a prime number");
            } else {
                out.println(num + " is not a prime number");
            }
        } else if (request.getParameter("date") != null) {
            Date date = new Date();
            out.println("Current date is " + date);
        } else if (request.getParameter("evenodd") != null) {
            int num = Integer.parseInt(request.getParameter("number"));
            if (num % 2 == 0) {
                out.println(num + " is an even number");
            } else {
                out.println(num + " is an odd number");
            }
        }
    %>

</body>
</html>