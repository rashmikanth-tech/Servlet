
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
        input[type="text"], input[type="email"], input[type="number"],select[name="passPassport"] {
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
            <li> <a href="%20BirthCertificat.jsp">Birth Certificate</a> </li>
            <li><a href="#">Review</a></li>
        </ul>
        <div id="searchID">
            <input type="text" placeholder="Search here">
            <img src="https://static.vecteezy.com/system/resources/previews/015/337/677/large_2x/transparent-search-icon-free-png.png" class="search-icon" onclick="performSearch()">
        </div>
    </nav>
</header>

<div class="form-container">
    <h2>Passport Form Form</h2>
    <form action="PassportApplicationServlet" method="post">
        Applicant Name: <input type="text" name="nameName"><br>
        Adhar No: <input type="number" name="adharAdhar"><br>
        Address: <input type="text" name="addressAdress"><br>
        PanNo: <input type="text" name="panPan"><br>
        Country : <input type="text" name="countryCountry"><br>
        State: <input type="text" name="stateState"><br>
        City: <input type="text" name="cityCity"><br>
        PinCode: <input type="number" name="pinPin"><br>
        PassportType:
        <select name="passPassport">
            <option value="Domanstic">Domostic</option>
            <option value="International">International</option>
        </select><br>
        Payment Reference No: <input type="number" name="payRefrence"><br>
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
