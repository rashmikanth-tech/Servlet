
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
            <li><a href="Birth"></a>Birth Certificate</li>
            <li><a href="#">Review</a></li>
        </ul>
        <div id="searchID">
            <input type="text" placeholder="Search here">
            <img src="https://static.vecteezy.com/system/resources/previews/015/337/677/large_2x/transparent-search-icon-free-png.png" class="search-icon" onclick="performSearch()">
        </div>
    </nav>
</header>

<div class="form-container">
    <h2>Birth Certificate Form</h2>
    <form action="BirthApplicationServlet" method="post">
        Birth Id: <input type="text" name="birthBirthId"><br>
        Hospital Name:
        <select name="hospitalName">
            <option value="General">General Hospital</option>
            <option value="City">City Hospital</option>
            <option value="St. Marks">St. Mark's Medical Center</option>
            <option value="Community">Community Hospital</option>
        </select><br>

        Father Name: <input type="text" name="fatherName"><br>
        Mother Name: <input type="text" name="motherName"><br>
        Date and Time: <input type="datetime-local" name="dateAndTime"><br>
        Doctor Name: <input type="text" name="doctorName"><br>
        Nurse Name: <input type="text" name="nurseName"><br>
        Hospital Type:
        <select name="hospitalType">
            <option value="1">Public</option>
            <option value="2">Private</option>
            <option value="3">Trust</option>
            <option value="4">Charitable</option>
            <option value="5">Other</option>
        </select><br>

        <input type="submit" value="Submit">
    </form>
</div>

<script>
    function performSearch() {
        const query = document.querySelector('#searchID input').value;
        alert("Search triggered for: " + query);
        // Add search functionality if needed
    }
</script>

</body>
</html>
