<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!--<!DOCTYPE html>-->
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seed Management System - Add Seed</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <style>
        body {
            background: url('https://npr.brightspotcdn.com/legacy/sites/vpr/files/201703/Seed-iStock-bo1982-20170316.jpg') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
        }
        .navbar-brand img { height: 40px; }
        .form-container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 30px;
            border-radius: 10px;
            max-width: 600px;
            margin: 80px auto;
        }
        .form-title {
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
        }
        .btn-submit {
            background-color: #28a745;
            color: white;
        }
        .btn-clear {
            background-color: #ffc107;
            color: black;
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

    <!-- external js file -->
    <script src="validation.js"></script>

    <script>
        function updateVariety() {
            const type = document.getElementById("type").value;
            const variety = document.getElementById("variety");
            variety.innerHTML = "";

            let options = [];
            if (type === "Fruit") {
                options = ["Mango", "Apple", "Banana", "Orange"];
            } else if (type === "Flower") {
                options = ["Rose", "Lily", "Tulip", "Marigold"];
            } else if (type === "Vegetable") {
                options = ["Tomato", "Carrot", "Potato", "Onion"];
            } else if (type === "Grain") {
                options = ["Wheat", "Rice", "Corn", "Barley"];
            }

            options.forEach(opt => {
                const option = document.createElement("option");
                option.value = opt;
                option.textContent = opt;
                variety.appendChild(option);
            });
        }

        function updatePrice() {
            const qty = document.getElementById("quantity").value;
            document.getElementById("price").value = qty * 10;
        }
    </script>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">
        <img src="https://cdn-icons-png.flaticon.com/512/219/219983.png" alt="Logo">
        Seed Management System
    </a>
</nav>

<!-- Form -->
<div class="form-container">
    <h2 class="form-title">Add Seed</h2>
    <form action="addSuccess" method="post" >
        <div class="form-group">
            <label for="seedName">Seed Name:</label>
            <input type="text" class="form-control" id="seedName" name="seedName" required>
        </div>
        <div class="form-group">
            <label for="type">Type:</label>
            <select class="form-control" id="type" name="type" onchange="updateVariety()" required>
                <option value="">Select Type</option>
                <option value="Fruit">Fruit</option>
                <option value="Flower">Flower</option>
                <option value="Vegetable">Vegetable</option>
                <option value="Grain">Grain</option>
            </select>
        </div>
        <div class="form-group">
            <label for="variety">Variety:</label>
            <select class="form-control" id="variety" name="variety" required>
                <option value="">Select Variety</option>
            </select>
        </div>
        <div class="form-group">
            <label for="quantity">Quantity (g):</label>
            <select class="form-control" id="quantity" name="quantity" onchange="updatePrice()" required>
                <option value="">Select Quantity</option>
                <option value="10">10g</option>
                <option value="25">25g</option>
                <option value="50">50g</option>
                <option value="100">100g</option>
                <option value="250">250g</option>
                <option value="500">500g</option>
                <option value="750">750g</option>
                <option value="1000">1000g</option>
            </select>
        </div>
        <div class="form-group">
            <label for="price">Price (Rs):</label>
            <input type="text" class="form-control" id="price" name="price" readonly>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-submit">Add</button>
            <button type="reset" class="btn btn-clear">Clear</button>
        </div>
    </form>
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
