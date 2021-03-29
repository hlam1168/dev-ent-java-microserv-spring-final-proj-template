Print All Alumni

Returns data about all alumni from the query "SELECT * from alumni_info".

URL

/printAllAlumni

Method:

GET

URL Params

None

Data Params

None

Success Response:

Code: 200
Content: 
SELECT * from alumni_info:
1, John Doe, 123 Main St., johndoe@gmail.com, 2011, 2021-03-28 05:00:16.0
2, Jack Smith, 999 Second St., jacksmith@gmail.com, 2009, 2021-03-29 02:26:40.0

Sample Call:

curl http://ec2-52-36-59-1.us-west-2.compute.amazonaws.com:8080/spring-proj-template/printAllAlumni

-----------------------------------------------------------------------------------------------------------------------------------------------------

Add Alumni

Returns data about all alumni from the query "SELECT * from alumni_info".

URL

/addAlumni

Method:

POST

URL Params

None

Data Params

Required:
name: name of the alumni up to 255 characters to be added
address: address of the alumni up to 255 characters
email: email address of the alumni up to 50 characters
graduation_year: year of graduation in 4-digit decimal

Success Response:

Code: 200 OK
Content: 
Rows updated: 1(base)

Error Response:
Code: 400 Bad Request if it is given incorrect form of data.
Code: 500 Server Error if the given graduation_year is more than 4 digits.

Sample Call:

curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\"name\": \"Debbie Wu\", \"address\": \"987 Third St.\", \"email\": \"debbiewu@gmail.com\", \"graduation_year\": 2018}" "http://ec2-52-36-59-1.us-west-2.compute.amazonaws.com:8080/spring-proj-template/addAlumni"
