<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, com.xworkz.seed.dto.SeedInfoDto" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Seed Info - Search Result</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          crossorigin="anonymous">
    <style>
        body {
            background: url('https://npr.brightspotcdn.com/legacy/sites/vpr/files/201703/Seed-iStock-bo1982-20170316.jpg') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.95);
            padding: 30px;
            margin-top: 80px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.3);
        }
        footer {
            background-color: #343a40;
            color: white;
            padding: 10px 0;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>

<div class="container">
    <h2 class="mb-4 text-center">Search Result</h2>

    <%
    List<SeedInfoDto> seedList = (List<SeedInfoDto>) request.getAttribute("seedList");
    if (seedList != null && !seedList.isEmpty()) {
    %>
    <table class="table table-bordered table-striped table-hover">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Seed Name</th>
            <th>Type</th>
            <th>Variety</th>
            <th>Quantity (g)</th>
            <th>Price (Rs)</th>
            <th>Created By</th>
            <th>Created At</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <%
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
                <a href="update?id=<%= dto.getId() %>" class="btn btn-sm btn-primary">Update</a>
                <a href="delete?id=<%= dto.getId() %>" class="btn btn-sm btn-danger">Delete</a>
            </td>
        </tr>
        <%
        }
        %>
        </tbody>
    </table>
    <%
    } else {
    %>
    <h3 class="text-danger text-center">No records found for the given type!</h3>
    <%
    }
    %>
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
