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



