# Alumni API WiKi

### Alumni API Documentation
This project uses a Spring Framework.  Two REST API microservices are created.
1. /printAllAlumni	with GET method
1. /addAlumni	with POST method

For further reference, please refer to the following sections:

* [Print All Alumni](./printAllAlumni.md)
* [Add Alumni](./addAlumni.md)

The microservices interact with a table in MySQL database.

##### Schema of the database:

CREATE DATABASE member_db;<br>
USE member_db;<br>
CREATE TABLE IF NOT EXISTS alumni_info (<br>
> alumni_id INT AUTO_INCREMENT PRIMARY KEY,<br>
> name VARCHAR(255) NOT NULL,<br>
> addr VARCHAR(255),<br>
> email VARCHAR(50),<br>
> graduation_year DECIMAL(4),<br>
> created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP<br>
);

