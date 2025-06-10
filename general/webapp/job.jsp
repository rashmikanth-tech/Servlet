
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Application</title>
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
        input[type="text"], input[type="email"], input[type="number"] {
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
            <li><a href="#">Contact Us</a></li>
            <li><a href="#">Review</a></li>
        </ul>
        <div id="searchID">
            <input type="text" placeholder="Search here">
            <img src="https://static.vecteezy.com/system/resources/previews/015/337/677/large_2x/transparent-search-icon-free-png.png" class="search-icon" onclick="performSearch()">
        </div>
    </nav>
</header>

<div class="form-container">
    <h2>Job Application Form</h2>
    <form action="JobApplicationServlet" method="post">
        Name: <input type="text" name="nameName"><br>
        Email: <input type="email" name="emailEmail"><br>
        Education: <input type="text" name="eduEducation"><br>
        Skills: <input type="text" name="skillSkill"><br>
        Expected Salary: <input type="number" name="salarySalary"><br>
        Experience: <input type="number" name="expExperiance"><br>
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
