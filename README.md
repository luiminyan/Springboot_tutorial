# Springboot_tutorial
 Followed the introductory tutorial by @amigoscode<br>

 A simple student information management system in RESTful architecture written in Java. The Springboot framework is used in this project. The application is divided into 4 layers: the API layer, the service layer, data access layer and the database.<br>

 ## 01: API layer<br>
 The application interface layer, for the users' usage. The users can send "post"(add new student), "delete"(delete student by ID) and "update"(still in progress) request by web browser.<br>
 The information from "post" request will be proofed by the server to make sure no duplicated student information will be recorded in the database.<br>
 ### Post request<br>
 Store a student data twice: first time success and seconde time expected error reported (id duplication check).<br>
 <img src="images/post-request.gif" alt="postreq"><br>

 ## 02: Service layer<br>
 To provide functions in the API layer and isolate them out of security reasons. <br>

 ## 03: Database layer<br>
 Connect the software with the "student" database.<br>

 ## 04: Database <br>
 The PostgreSql is used here to store the student data.<br>
 
 <image src="https://github.com/luiminyan/Springboot_tutorial/blob/main/images/layers.png" height="400"><br>
