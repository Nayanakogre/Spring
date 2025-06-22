<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.xworkz.woman.complaint.dto.ComplaintDto" %>   <!-- corrected here -->



<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Complaint View</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center text-success"><%= request.getAttribute("message") %></h2>
    <br>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
        <tr>
            <th>Name</th>
            <th>Phone No</th>
            <th>Issue</th>
            <th>Issue Type</th>
            <th>Date Time</th>
            <th>Location</th>
        </tr>
        </thead>
        <tbody>

        <%
        List complList = (List) request.getAttribute("complList");
        if (complList != null) {
        for (int i = 0; i < complList.size(); i++) {
        ComplaintDto dto = (ComplaintDto) complList.get(i);
        %>
        <tr>
            <td><%= dto.getName() %></td>
            <td><%= dto.getPhoneNo() %></td>
            <td><%= dto.getIssue() %></td>
            <td><%= dto.getIssueType() %></td>
            <td><%= dto.getDateTime() %></td>
            <td><%= dto.getLocation() %></td>
        </tr>
        <%
        }
        } else {
        %>
        <tr><td colspan="6" class="text-center">No data found</td></tr>
        <%
        }
        %>

        </tbody>
    </table>
</div>

</body>
</html>
