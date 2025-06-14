<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>College Fest Registration</title>

    <!-- Bootstrap 4 CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body style="background-color: #ffffff;">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">College Fest</a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Home</a>
            </li>
        </ul>
    </div>
</nav>

<!-- Registration Form -->
<div class="container d-flex justify-content-center align-items-center" style="min-height: 100vh;">
    <div class="col-md-6 bg-light p-5 rounded shadow">
        <h2 class="text-center mb-4">Competition Registration</h2>

        <form action="college" method="post">
            <div class="form-group">
                <label for="name">Participant Name:</label>
                <input type="text" class="form-control" name="name" id="name" required />
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" name="email" id="email" required />
            </div>

            <div class="form-group">
                <label for="contact">Contact Number:</label>
                <input type="text" class="form-control" name="contact" id="contact" required />
            </div>

            <div class="form-group">
                <label for="competition">Select Competition:</label>
                <select class="form-control" name="competition" id="competition" required>
                    <option value="">--Select--</option>
                    <option value="Coding">Coding</option>
                    <option value="Debate">Debate</option>
                    <option value="Dance">Dance</option>
                    <option value="Singing">Singing</option>
                    <option value="Photography">Photography</option>
                </select>
            </div>

            <div class="form-group">
                <label for="college">College Name:</label>
                <input type="text" class="form-control" name="college" id="college" required />
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary px-4">Register</button>
            </div>
        </form>
    </div>
</div>

<!-- Footer -->
<footer class="bg-dark text-white text-center py-3 fixed-bottom">
    &copy; 2025 College Fest. All rights reserved.
</footer>

<!-- Bootstrap JS CDN -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
