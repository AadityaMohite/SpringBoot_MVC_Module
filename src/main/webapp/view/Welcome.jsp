<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
    table {
        width: 60%;
        margin: 20px auto;
        border-collapse: collapse;
        text-align: center;
    }
    th {
        background-color: #4CAF50;
        color: white;
    }
    th, td {
        border: 1px solid black;
        padding: 10px;
    }
    </style>




<h1 style='text-align:center'> Welcome to my first web App ${Message} </h1>
<h1>${names}</h1>













<table width="100%" border="2" cellspacing="0" cellpadding="8" style='text-align:center'>

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
    </tr>

    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.address}</td>
    </tr>

</table>

</body>
</html>