# Print All Alumni

Returns data about all alumni from the query "SELECT * from alumni_info".

### URL

/printAllAlumni

### Method:

GET

##### URL Params

None

##### Data Params

None

### Success Response:

Code: 200 

Content: 

SELECT * from alumni_info: 1, John Doe, 123 Main St., johndoe@gmail.com, 2011, 2021-03-28 05:00:16.0 2, Jack Smith, 999 Second St., jacksmith@gmail.com, 2009, 2021-03-29 02:26:40.0

### Sample Call:

curl http://ec2-52-36-59-1.us-west-2.compute.amazonaws.com:8080/spring-proj-template/printAllAlumni

