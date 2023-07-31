
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <style>
        body {
            background-color: #f0f0f0;
            font-family: Arial, sans-serif;
        }

        .container {
            margin-top: 30px;
           
        }

        .card {
            border: none;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .card-header {
            background-color: #007bff;
            color: #fff;
            font-size: 24px;
            padding: 15px;
            text-align: center;
        }

        .form-label {
            font-weight: bold;
        }

        .form-control {
            border-radius: 0;
        }

        .form-outline {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 10px;
        }

        .btn-primary {
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            width: 100%;
            padding: 10px;
        }

        .btn-primary:hover {
            background-color: #0056b3;
        }

        .form-error {
            color: red;
            font-size: 12px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3 mt-3" >
                <div class="card">
                    <div class="card-header">Emp Register</div>
                    <div class="card-body">
                        <%-- Display any registration error message here --%>
                        <%
                        String msg = (String) session.getAttribute("msg");
                        if (msg != null) {
                        %>
                        <p class="text-center fs-4 form-error">
                            <%=msg%>
                        </p>
                        <%
                        }
                        session.removeAttribute("msg");
                        %>
                        <form method="post" action="register">
                            <div class="mb-3 form-outline">
                                <label for="name" class="form-label">Name</label>
                                <input type="text" class="form-control" name="name" required>
                            </div>
                            <div class="mb-3 form-outline">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" name="email" required>
                            </div>
                            <div class="mb-3 form-outline">
                                <label for="phone" class="form-label">Phone no</label>
                                <input type="text" class="form-control" name="phone" required>
                            </div>
                            <div class="mb-3 form-outline">
                                <label for="gender" class="form-label">Gender</label>
                                <div>
                                    <input type="radio" name="gender" value="male" required> MALE
                                    <input type="radio" name="gender" value="female" required> FEMALE
                                </div>
                            </div>
                            <div class="mb-3 form-outline">
                                <label for="dob" class="form-label">DOB</label>
                                <input type="date" class="form-control" name="dob" required>
                            </div>
                            <div class="mb-3 form-outline">
                                <label for="dob" class="form-label">Employee Code</label>
                                <input type="text" class="form-control" name="emp_code" required>
                            </div>
                            <div class="mb-3 form-outline">
                                <label for="password" class="form-label">Password</label>
                                <input type="password" class="form-control" name="password" required>
                            </div>
                            <button type="submit" class="btn btn-primary">Register</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
