<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!--<!DOCTYPE html>-->
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Seed Info - Search Result</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>

<h1 class="text-center"> ${message} </h1>
<br><br>

<!-- <h1>${result}</h1>-->

<c:if test="${seedDto != null}">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Seed Name</th>
            <th scope="col">Type</th>
            <th scope="col">Variety</th>
            <th scope="col">Quantity (g)</th>
            <th scope="col">Price (Rs)</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${seedDto.id}</td>
            <td>${seedDto.seedName}</td>
            <td>${seedDto.type}</td>
            <td>${seedDto.variety}</td>
            <td>${seedDto.quantity}</td>
            <td>${seedDto.price}</td>
            <td><a href="/seed-information-management/update?id=${seedDto.id}" >Update</a>
            <a href="/seed-information-management/delete?id=${seedDto.id}" >Detele</a></td>
        </tr>
        </tbody>
    </table>
</c:if>

<c:if test="${seedDto == null}">
    <h3 class="text-danger text-center">No record found for given ID!</h3>
</c:if>

</body>
</html>
