<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored = "false" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seed Management System</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        body {
            background: url('https://npr.brightspotcdn.com/legacy/sites/vpr/files/201703/Seed-iStock-bo1982-20170316.jpg') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
        }
        .navbar-brand img {
            height: 40px;
        }
        .content {
            padding: 150px 20px 0 20px;
            color: white;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
            text-align: center;
            position: relative;
            min-height: calc(100vh - 150px);
        }
        .left-buttons {
            position: absolute;
            top: 100px;
            left: 20px;
            display: flex;
            gap: 15px;
            z-index: 1;
        }
        .right-search {
            position: absolute;
            top: 100px;
            right: 20px;
            z-index: 1;
        }
        .btn-custom {
            background-color: #FFD700;
            color: #333;
            border: none;
            padding: 8px 16px;
            font-size: 1rem;
            border-radius: 5px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.3);
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-flex;
            align-items: center;
            justify-content: center;
            min-width: 120px;
            height: 40px;
        }
        .btn-custom:hover {
            background-color: #FFC107;
            color: #000;
        }
        footer {
            background-color: #343a40;
            color: white;
            padding: 10px 0;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
        .form-control {
            height: calc(1.8rem + 2px);
            font-size: 1rem;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">
        <img src="https://cdn-icons-png.flaticon.com/512/219/219983.png" alt="Logo">
        Seed Management System
    </a>
</nav>

<!-- Left Buttons -->
<div class="left-buttons">
    <a href="addSeed.jsp" class="btn-custom">Add Seed</a>
    <form action="viewAll" method="get">
        <button type="submit" class="btn-custom">View</button>
    </form>
</div>

<!-- Right Search -->
<div class="right-search">
    <form action="getById" method="get" class="form-inline">
        <input type="number" name="id" class="form-control mr-2" placeholder="Enter id" required>
        <input type="submit" value="Search" class="btn-custom">
    </form>
    <br>
    <form action="getByType" method="get" class="form-inline">
        <input type="text" name="type" class="form-control mr-2" placeholder="Enter Type" required>
        <input type="submit" value="Search" class="btn-custom">
    </form>
</div>

<!-- Main Content -->
<div class="content">
    <div class="welcome-text">
        <h1>Welcome to Seed Management System</h1>
    </div>
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
