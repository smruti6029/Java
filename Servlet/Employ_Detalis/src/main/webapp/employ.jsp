<%@page import="java.util.List"%>
<%@page import="com.Entity.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Colleague Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+VgAp6izLHXrpR2RpdqI7rxkLrtUVlTkb27rFdg1Nl82dp1" crossorigin="anonymous">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="styles1.css">
</head>
<body>

    <div class="container mt-4">
        <h1 class="text-center">Colleague Information</h1>

        <div class="row mt-4">
            <div class="col-md-8 offset-md-2">
                <%
                List<Emp> colleaguesList = (List<Emp>) session.getAttribute("list");
                if (colleaguesList != null && !colleaguesList.isEmpty()) {
                    %>
                    <table class="table table-striped custom-table">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Date of Birth</th>
                                <th>Employee Code</th>
                                <th>Gender</th>
                                <th>ID</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            for (Emp colleague : colleaguesList) {
                                String name = colleague.getName();
                                String email = colleague.getEmail();
                                String phone = colleague.getPhone();
                                String dob = colleague.getDob();
                                String emp_code = colleague.getEmp_code();
                                String gender = colleague.getGender();
                                int id = colleague.getId();
                                %>
                                <tr>
                                    <td><%= name %></td>
                                    <td><%= email %></td>
                                    <td><%= phone %></td>
                                    <td><%= dob %></td>
                                    <td><%= emp_code %></td>
                                    <td><%= gender %></td>
                                    <td><%= id %></td>
                                </tr>
                                <%
                            }
                            %>
                        </tbody>
                    </table>
                    <%
                } else {
                    %>
                    <p class="text-center">No colleagues found.</p>
                    <%
                }
                session.removeAttribute("list");
                %>
            </div>
        </div>
    </div>

    <!-- Optional: Bootstrap JavaScript library -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-Szi0a8OTmXnFQsGB+QA7MXywy9NlzkLZP+H5G5WzF5sPwWUhKT/8Ck8fZnLbL8hj" crossorigin="anonymous"></script>
</body>
</html>
