<%@ page language="java" import="java.util.*,com.xworkz.seed.dto.SeedInfoDto" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>-->
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Seed Management System - View All</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        body {
            background: url('https://npr.brightspotcdn.com/legacy/sites/vpr/files/201703/Seed-iStock-bo1982-20170316.jpg') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
        }
        .navbar-brand img { height: 40px; }
        footer {
            background-color: #343a40;
            color: white;
            padding: 10px 0;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 30px;
            margin-top: 80px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="#">
        <img src="https://cdn-icons-png.flaticon.com/512/219/219983.png" alt="Logo">
        Seed Management System
    </a>
</nav>

<div class="container">
    <h2 class="mb-4 text-center">Seed Records</h2>

    <table class="table table-bordered table-striped table-hover">
        <thead class="thead-dark">
        <tr>
            <th>Id</th>
            <th>Seed Name</th>
            <th>Type</th>
            <th>Variety</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Created By</th>
            <th>Created At</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <%
        List<SeedInfoDto> seedList = (List<SeedInfoDto>) request.getAttribute("seeds");
            if (seedList != null) {
            for (SeedInfoDto dto : seedList) {
            %>
            <tr>
                <td><%= dto.getId() %></td>
                <td><%= dto.getSeedName() %></td>
                <td><%= dto.getType() %></td>
                <td><%= dto.getVariety() %></td>
                <td><%= dto.getQuantity() %></td>
                <td><%= dto.getPrice() %></td>
                <td><%= dto.getCreatedBy() %></td>
                <td><%= dto.getCreatedAt() %></td>
                <td>
                    <a href="edit?id=<%= dto.getId() %>" class="btn btn-sm btn-primary">Edit</a>

                    <a href="delete?id=<%= dto.getId() %>" class="btn btn-sm btn-danger">Delete</a>
                </td>
            </tr>
            <%
            }
            } else {
            %>
            <tr>
                <td colspan="9" class="text-center">No data available.</td>
            </tr>
            <%
            }
            %>
        </tbody>
    </table>
</div>

<!-- Footer -->
<footer class="text-center">
    <p>&copy; <span id="footerYear"></span> Nayana K J | <span id="footerDatetime"></span></p>
</footer>

<script>
    function updateDateTime() {
        const now = new Date();
        document.getElementById("footerDatetime").textContent = now.toLocaleString();
        document.getElementById("footerYear").textContent = now.getFullYear();
    }
    setInterval(updateDateTime, 1000);
    updateDateTime();
</script>

</body>
</html>
