# Add Alumni

Returns data about all alumni from the query "SELECT * from alumni_info".

### URL

/addAlumni

### Method:

POST

##### URL Params

None

##### Data Params

Required: <br>
name: name of the alumni up to 255 characters to be added<br>
address: address of the alumni up to 255 characters<br>
email: email address of the alumni up to 50 characters<br>
graduation_year: year of graduation in 4-digit decimal<br>

### Success Response:

Code: 200 OK 

Content: Rows updated: 1(base)

### Error Response: 

Code: 400 Bad Request if it is given incorrect form of data. 

Code: 500 Server Error if the given graduation_year is more than 4 digits.

### Sample Call:

curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\\"name\\": \\"Debbie Wu\\", \\"address\\": \\"987 Third St.\\", \\"email\\": \\"debbiewu@gmail.com\\", \\"graduation_year\\": 2018}" "http://ec2-52-36-59-1.us-west-2.compute.amazonaws.com:8080/spring-proj-template/addAlumni"