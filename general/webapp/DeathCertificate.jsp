
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Birth Certificate</title>
    <link rel="stylesheet" href="navbar.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .form-container {
            max-width: 600px;
            margin: 40px auto;
            padding: 30px;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        input[type="text"], input[type="email"], input[type="number"],input[type="datetime-local"],select[name="hospitalName"],select[name="hospitalType"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background: #007bff;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        nav.navClass {
            display: flex;
            justify-content: space-between;
            background-color: #343a40;2
            padding: 10px 20px;
        }
        nav.navClass ul {
            list-style: none;
            display: flex;
            gap: 20px;
            margin: 0;
            padding: 0;
        }
        nav.navClass ul li a {
            color: white;
            text-decoration: none;
        }
        #searchID {
            display: flex;
            align-items: center;
            gap: 10px;
        }
        .search-icon {
            width: 20px;
            height: 20px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<header>
    <nav class="navClass">
        <ul>
            <li><a href="index.jsp" target="_blank">Home</a></li>
            <li><a href="job.jsp">Job Application</a></li>
            <li><a href="Passport.jsp">Passport Form</a></li>
            <li><a href="#">Review</a></li>
        </ul>
        <div id="searchID">
            <input type="text" placeholder="Search here">
            <img src="https://static.vecteezy.com/system/resources/previews/015/337/677/large_2x/transparent-search-icon-free-png.png" class="search-icon" onclick="performSearch()">
        </div>
    </nav>
</header>


<div class="form-container">
    <h2>Death Certificate Application</h2>
    <form action="DeathCertificateServlet" method="post">
        <label>Full Name of Deceased:</label>
        <input type="text" name="deceasedName" required><br>

        <label>Cause of Death:</label>
        <input type="text" name="causeOfDeath" required><br>

        <label>Date of Death:</label>
        <input type="date" name="dateOfDeath" required><br>

        <label>Time of Death:</label>
        <input type="time" name="timeOfDeath" required><br>

        <label>Age at Death:</label>
        <input type="number" name="ageAtDeath" required><br>

        <label>Certified By:</label>
        <input type="text" name="certifiedBy" required><br>

        <label>Hospital Name:</label>
        <input type="text" name="hospitalName" required><br>

        <label>Manner of Death:</label>
        <select name="mannerOfDeath" required>
            <option value="">Select</option>
            <option value="Natural">Natural</option>
            <option value="Accident">Accident</option>
            <option value="Suicide">Suicide</option>
            <option value="Homicide">Homicide</option>
            <option value="Undetermined">Undetermined</option>
        </select><br>

        <label>Gender:</label>
        <select name="gender" required>
            <option value="">Select</option>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br>

        <label>Identifiable Marks (if any):</label>
        <input type="text" name="marks"><br>

        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
