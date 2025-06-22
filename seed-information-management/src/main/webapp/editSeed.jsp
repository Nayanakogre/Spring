<%@ page language="java" import="com.xworkz.seed.dto.SeedInfoDto" pageEncoding="UTF-8"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Seed</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        body {
            background: #f5f5f5;
            padding: 30px;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        }
    </style>
</head>
<body>

<%
SeedInfoDto dto = (SeedInfoDto) request.getAttribute("seedInfoDto");
if (dto != null) {
%>
<div class="container">
    <h2 class="text-center mb-4">Edit Seed Details</h2>

    <form action="update" method="post">
        <input type="hidden" name="id" value="<%= dto.getId() %>" />

        <div class="form-group">
            <label>Seed Name:</label>
            <input type="text" name="seedName" class="form-control" value="<%= dto.getSeedName() %>" required />
        </div>

        <div class="form-group">
            <label>Type:</label>
            <input type="text" name="type" class="form-control" value="<%= dto.getType() %>" required />
        </div>

        <div class="form-group">
            <label>Variety:</label>
            <input type="text" name="variety" class="form-control" value="<%= dto.getVariety() %>" required />
        </div>

        <div class="form-group">
            <label>Quantity:</label>
            <input type="number" name="quantity" class="form-control" value="<%= dto.getQuantity() %>" required />
        </div>

        <div class="form-group">
            <label>Price:</label>
            <input type="number" step="0.01" name="price" class="form-control" value="<%= dto.getPrice() %>" required />
        </div>

        <div class="form-group">
            <label>Created By:</label>
            <input type="text" name="createdBy" class="form-control" value="<%= dto.getCreatedBy() %>" required />
        </div>

        <input type="submit" value="Update" class="btn btn-success btn-block" />
    </form>
</div>
<%
} else {
%>
<h3 class="text-center text-danger">No seed data found to edit.</h3>
<%
}
%>

</body>
</html>
