<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Bài 2 - Bảng Sinh Viên</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style> 
    table.custom-table {
      color: white; /* Màu chữ */
      background-color: #007bff; /* Màu nền */
      border: 2px solid #000; /* Màu viền */
    }
    table.custom-table th, table.custom-table td {
      border: 1px solid #000;
    }
  </style>
</head>
<body class="p-5">

  <h2 class="mb-4">Danh sách sinh viên</h2>
  <table class="table custom-table text-center">
    <thead>
      <tr>
        <th>STT</th>
        <th>Mã SV</th>
        <th>Họ và tên</th>
        <th>Quê quán</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>1</td>
        <td>SV001</td>
        <td>Nguyễn Văn A</td>
        <td>Hà Nội</td>
      </tr>
      <tr>
        <td>2</td>
        <td>SV002</td>
        <td>Trần Thị B</td>
        <td>Đà Nẵng</td>
      </tr>
    </tbody>
  </table>

</body>
</html>
