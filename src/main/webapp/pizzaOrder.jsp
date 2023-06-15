<%--
  Created by IntelliJ IDEA.
  User: madaleinedeffinbaugh
  Date: 6/14/23
  Time: 11:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Let's Order Sum Pizza</h1>
<form action="/pizza-order" method="post">
    <label for="size">Select Size</label>
    <select name="size" id="size">
        <option value="small">10" Small</option>
        <option value="medium">12" Medium</option>
        <option value="large">14" Large</option>
        <option value="xlarge">16" X-Large</option>
    </select>
    <br>
    <br>
    <label for="crust">Select Crust</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="handTossed">Hand Tossed</option>
    </select>
    <br>
    <br>
    <label for="sauce">Select Sauce</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato</option>
        <option value="marinara">Marinara</option>
        <option value="garParm">Garlic Parmesan</option>
    </select>
    <br>
    <br>
    <p style="margin-bottom: 0">Select Toppings</p>
    <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
    <label for="pepperoni"> Pepperoni</label><br>
    <input type="checkbox" id="olives" name="olives" value="olives">
    <label for="olives"> Olives</label><br>
    <input type="checkbox" id="greenPeppers" name="greenPeppers" value="greenPeppers">
    <label for="greenPeppers"> Green Peppers</label><br>
    <input type="checkbox" id="sausage" name="sausage" value="sausage">
    <label for="sausage"> Sausage</label><br>
    <br>
    <label for="deliveryAddress">Delivery Address</label>
    <input type="text" name="deliveryAddress" id="deliveryAddress">
    <br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
