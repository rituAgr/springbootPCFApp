## Springboot app demo for PCF deployment

This is simple springboot app. It run on local with embedded H2 database as well as local mysql.

###For running locally with H2 Database
1. Uncomment the application.properties for h2 database
2. Uncomment the dependency for h2 in build.gradle
3. Also, comment out the sql connector dependency in build.gradle

###For running locally with mysql Database
1. Start the local mysql server.
2. Create database with name ```SpringDB1```.
3. Check that application.properties have required properties uncommented
4. Check that  the dependency for h2 in build.gradle is commented
5. Also, Uncomment out the sql connector dependency in build.gradle


###For PCF deployment via command line
1. Create jar ```gradle clean build```
2. Create mysql service tile with name ```springbootPCFApi-Mysql```
3. Make sure PCF login is successfully done with specified space
4. Bind that mysql service tile to app by ```cf bind-service springbootPCFApp springbootPCFApi-Mysql```
5. Then push and start app in PCF by ```cf push springbootPCFApp -p build/libs/springbootPCFApp-0.0.1-SNAPSHOT.jar```


##For PCF deployment via Manifest.yml
1. Create jar ```gradle clean build```
2. Create mysql service tile with name ```springbootPCFApi-Mysql```
3. Make sure PCF login is successfully done with specified space
4. Refer manifest.yml file for reference.
5. Just do ```cf push```
 

 
