<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Women Complaint System - Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" crossorigin="anonymous">

    <style>
        html, body {
            height: 100%;
        }
        .wrapper {
            min-height: 100%;
            display: flex;
            flex-direction: column;
        }
        .content {
            flex: 1;
        }
    </style>
</head>

<body class="bg-light">
<div class="wrapper">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <a class="navbar-brand" href="index.jsp">Women Complaint System</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewComplaint.jsp">View Complaints</a>
                </li>
                <li class="nav-item">
                    <a class="btn btn-light text-primary" href="raiseComplaint.jsp">Raise Complaint</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Content -->
    <div class="container content mt-5 text-center">
        <h1>Welcome to Women Complaint System</h1>
        <p class="lead mt-3">
            You can safely report your issues and track your complaints here.
        </p>

        <!-- Form with action police -->
        <form action="police" method="post">
<!--            <button type="submit" class="btn btn-success btn-lg mt-3">Submit To Police</button>-->
        </form>
    </div>

    <!-- Footer -->
    <footer class="bg-primary text-white text-center py-3">
        <p>© 2025 Women Complaint System. All rights reserved.</p>
        <p>Contact: support@womencomplaint.com | Helpline: 1800-123-456</p>
    </footer>

</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.2.1/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
