ReadMe - CWT Interview Final Step

Please find the associated files for the De-Duplication service as described in the below problem statement.

The project is currently housed in Github as a publicly available project.  

You can clone the project with https://github.com/krbyers/CWTRepo.git

Solution Details:
The solution is created with Java 8, and the Spring Boot framework.  



Build Instructions:
The project is defined by the Maven pom file, pom.xml.  

To build the solution, assure that Maven is installed, and execute the following:
- mvn clean package

The resultant jar is located in the <CLONE_ROOT>/target/, and may be started by executing from either your favorite ide, or a shell command line:
- java -jar DetectDupe-0.0.1-SNAPSHOT.jar

Testing and execution:0
The service is exposed as an HTTP POST request, accepting JSON payload.  The service is currently configured to listen on port 9090.
The following is a sample request

URI:  POST http://localhost:9090/dedup/set

JSON Post Body:  

{
	"integerSet" : [1,2,3,4,5,6,7,1,2,3,4,5,1,3,4,2,3,4,5,6]
} 


The result JSON Response body returned from the above payload is:
{
  "resultMap": {
    "1": 3,
    "2": 3,
    "3": 4,
    "4": 4,
    "5": 3,
    "6": 2
  }
}

The format of the response is interpreted as 
Integer 1 has 3 entries
Integer 2 has 3 entries
Integer 3 has 4 entries
...etc.


Note that any presented integer with only one instance is not reflected in the result, as requested on the requirements.

** I understand that the above is in variance from your specified requrement (see below).  My intention was to provide you a correct solution that captured the requirement in a format that is consistant with REST notation.  Perhaps I misunderstood the requirement.  Please let me know if I can rectify this.
 

 
*******************************************************************************************************
Reference:

# Carlson Wagonlit Travel Hotels Interview Project
#### Description
Create a Service that detects duplicates from a provided collection of Integers.

#### Requirements
+ The service will accept a bounded collection of integers.
+ The service will return a Key/Value store where the key is the duplicated integer and the value is the number of times that integer is duplicated.
+ The return object should not report any single instances of integers.
+ Feel free to choose the language you are most comfortable with

#### Examples
input : 1, 2, 3, 3, 3, 4, 4, 5
output: [3, 3], [4, 2]

input: 1, 2, 3, 4, 5, 6
output: []

#### Deliverables
Please provide a link to your code on Github repo or email us the source code along with the instructions on how to compile, package and run your solution. This is to be completed by Thursday April 27th, 2017 at 5:00pm CST.

#### Questions
Please contact Tony McNevin (anthony.mcnevin@carlsonwagonlit.com) with any questions.
]