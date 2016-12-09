First time build and install dgCommon jar in maven repository
	ant -buildfile ../dgCommon/build.xml cleandgCommon
	ant -buildfile ../dgCommon/build.xml  builddgCommon
	mvn install:install-file -Dfile=../dgCommon/dgcommon.jar -DgroupId=com.dataguise -DartifactId=dgcommon -Dversion=1.0.0 -Dpackaging=jar

Build project WAR
	mvn clean package -Dspring.profiles.active=test

Run using jetty
	java -Dspring.profiles.active=prod -jar target/dependency/jetty-runner.jar target/*.war
	
Build as jetty runnable using dg-jetty-embeded project
	ant -f buildJettyEmbeded.xml build-dgSaasUsersManager
	

Add this as JavaOption:"-Dspring.profiles.active=prod" for production and "-Dspring.profiles.active=test" for testing


http://localhost:8092/dgSaasUsersManager/user/addUser
POST- application/json
{"id":0,"userName":"aa","lastName":"dd","firstName":"ss","emailAddress":"test@aa.com","otherInfo":"dd"}


http://localhost:8080/products/getDataPlatforms?platformId=0

http://localhost:8080/products/getDataSolutions?solutionId=0