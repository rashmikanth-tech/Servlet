<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
    </style>
</head>
<body>
<header>
    <nav class="navClass">
        <ul>
            <li><a href="index.jsp" target="_blank">Home</a></li>
            <li> <a href="job.jsp">Job Application</a> </li>
            <li> <a href="">Contect US</a> </li>
            <li> <a href    ="">Review</a> </li>
        </ul>
        <div id="searchID">
            <input type="text" placeholder=" Search here">
            <img src="https://static.vecteezy.com/system/resources/previews/015/337/677/large_2x/transparent-search-icon-free-png.png" class="search-icon" onclick="performSearch()">

        </div>
    </nav>
</header>
<div class="form-container">
    <h2>Your Response</h2>
Name: ${getjob.nameName}<br>
Email: ${getjob.emailEmail}<br>
Education: ${getjob.eduEducation}<br>
Skills: ${getjob.skillSkill}<br>
Expected Salary: ${getjob.salarySalary}<br>
Experience: ${getjob.expExperiance}<br>

</body>
</html>
