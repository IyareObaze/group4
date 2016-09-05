<%-- 
    Document   : index
    Created on : Sep 5, 2016, 4:02:12 PM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>JSP Page</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    
     <!-- <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
       -->
  </head>
  <body>
    <header>
      <div class="jumbotron">
        <div class="container well">
          <h1><center>Staff Information</center></h1>
        </div>
        <div class="container">
          <a href="template2.php"><strong>Login</strong></a>
        </div>
      </div>
    </header>
  
      <div class="container well">
        <div class="row">
            
          
          
              <
            <div class="col-lg-6">
                <form method="post" action="validate.php">
              <div class="form-group">
                <label for="fname">First Name</label>
                <input type="textbox" name="fname" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="mname">Middle Name</label>
                <input type="textbox" name="mname" class="form-control" required>
               </div>
                
                <div class="form-group">
                <label for="lname">Last Name</label>
                <input type="textbox" name="mname" class="form-control" required>
               </div>

               <div class="form-group">
                <label for="dob">Date Of Birth</label>
                <input type="date" name="dob" class="form-control" required>
              </div>
                
                <div class="form-group">
                <label for="phone">Gender</label>
                <input type="radio" name="gender"  value="male" required>Male<br>
                <input type="radio" name="gender"  value="female">Female
              </div>

               
            <div class="col-lg-6">
                <hr>
                <p><em><center>Employment Details</center></em></p>
                <hr>

                <div class="form-group">
                <label for="date">Date of Employment</label>
                <input type="date" name="doe-2" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="rank">Rank</label>
                <input type="text" name="rank" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="position">Position</label>
                <input type="text" name="position" class="form-control" required>
               </div>
                
                 <div class="form-group">
                <label for="category">Category</label>
                <input type="text" name="phone-1" class="form-control" required>
              </div>
                
                 <div class="form-group">
                <label for="phone-1">Department ID</label>
                <input type="number" name="deptid" class="form-control" required>
              </div>
              
              <hr>

               <p>  
               <input type="submit"  name="submit" class="btn btn-primary">
               </P>     
              
              </div>
               

                          
              </div>

              <div class="col-lg-6">
                <hr>
                <p><em><center>Contact Details</center></em></p>
                <hr>

                <div class="form-group">
                <label for="mail">Email</label>
                <input type="email" name="mail" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="raddress">Residential Address</label>
                <input type="text" name="raddress" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="paddress">Postal Address</label>
                <input type="textbox" name="paddress" class="form-control" required>
               </div>
                
                 <div class="form-group">
                <label for="phone-1">Phone Number</label>
                <input type="number" name="phone-1" class="form-control" required>
              </div>
              
              <hr>

               
              
              </div>
          </form>
        
        </div>
      </div>
  
        <form method="post" action="validate.php">
        <div class="col-lg-6">
                <hr>
                <p><em><center>Employment Details</center></em></p>
                <hr>

                <div class="form-group">
                <label for="date">Date of Employment</label>
                <input type="date" name="doe-2" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="rank">Rank</label>
                <input type="text" name="rank" class="form-control" required>
              </div>

               <div class="form-group">
                <label for="position">Position</label>
                <input type="text" name="position" class="form-control" required>
               </div>
                
                 <div class="form-group">
                <label for="category">Category</label>
                <input type="text" name="phone-1" class="form-control" required>
              </div>
                
                 <div class="form-group">
                <label for="phone-1">Department ID</label>
                <input type="number" name="deptid" class="form-control" required>
              </div>
              
              <hr>

               <p>  
               <input type="submit"  name="submit" class="btn btn-primary">
               </P>     
              
              </div>
        </form>

    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>