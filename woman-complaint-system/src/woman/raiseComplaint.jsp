<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Raise Complaint - Women Complaint System</title>

    <!-- Bootstrap 4 CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          crossorigin="anonymous"/>
</head>
<body class="bg-light">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-info">
    <a class="navbar-brand" href="index.jsp">Women Complaint System</a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="viewComplaints.jsp">View Complaints</a>
            </li>
        </ul>
    </div>
</nav>

<!-- Complaint Form -->
<div class="container my-5">
    <div class="card shadow p-4">
        <h3 class="text-center text-info mb-4">Raise Complaint</h3>

        <form action="police" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" name="name" id="name" required placeholder="Enter your name">
            </div>

            <div class="form-group">
                <label for="phoneNo">Phone Number:</label>
                <input type="tel" class="form-control" name="phoneNo" id="phoneNo" required placeholder="Enter your phone number">
            </div>

            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" class="form-control" name="location" id="location" required placeholder="Enter location">
            </div>

            <div class="form-group">
                <label for="issue">Issue Description:</label>
                <textarea class="form-control" name="issue" id="issue" rows="3" required placeholder="Describe the issue"></textarea>
            </div>

            <div class="form-group">
                <label for="issueType">Issue Type:</label>
                <select name="issueType" class="form-control" id="issueType" required>
                    <option value="">-- Select Issue Type --</option>
                    <option value="Domestic Violence">Domestic Violence</option>
                    <option value="Physical Assault">Physical Assault</option>
                    <option value="Sexual Harassment">Sexual Harassment</option>
                    <option value="Public Harassment">Public Harassment</option>
                    <option value="Workplace Harassment">Workplace Harassment</option>
                    <option value="Stalking">Stalking</option>
                    <option value="Dowry Harassment">Dowry Harassment</option>
                    <option value="Cyber Crime">Cyber Crime</option>
                    <option value="Online Abuse">Online Abuse</option>
                    <option value="Human Trafficking">Human Trafficking</option>
                    <option value="Kidnapping">Kidnapping</option>
                    <option value="Gold Snatching">Gold Snatching</option>
                    <option value="Chain Snatching">Chain Snatching</option>
                    <option value="Robbery">Robbery</option>
                    <option value="Molestation">Molestation</option>
                    <option value="Blackmailing">Blackmailing</option>
                    <option value="Mental Torture">Mental Torture</option>
                    <option value="Threatening Calls/Messages">Threatening Calls/Messages</option>
                    <option value="Forced Marriage">Forced Marriage</option>
                    <option value="Child Abuse">Child Abuse</option>
                    <option value="Verbal Abuse">Verbal Abuse</option>
                    <option value="Others">Others</option>
                </select>
            </div>

            <button type="submit" class="btn btn-info btn-block text-white">Raise Complaint</button>
        </form>
    </div>
</div>

<!-- Footer -->
<footer class="bg-info text-white text-center p-3 fixed-bottom">
    &copy; 2025 Women Complaint System. All Rights Reserved.
</footer>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        crossorigin="anonymous"></script>

</body>
</html>
