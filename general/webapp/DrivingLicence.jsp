<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="DrivingServlet" method="post">
    <div>
        <label for="nameId">Name :</label>
        <input type="text" id="nameId" name="personName" required><br>
        <label for="adressId">Adress :</label>
        <input type="text" id="adressId" name="adessAdress" required><br>
        <label for="mobileId">Mobile :</label>
        <input type="number" id="mobileId" name="mobileNum" required><br>
        <label for="applyId">Applay Date :</label>
        <input type="date" id="applyId" name="applayDate" required><br>
        <label for="vechileId">Vehicle Type :</label>
        <select id="vechileId" name="vehiclVehicle" required>
            <option>1.Two Wheeler</option>
            <option>2. Four Wheeler </option>
            <option>3. Heavy Vechile</option>
            <option>4.Other</option>
        </select><br>
        <input type="submit" value="submit">


    </div>
</form>

</body>
</html>