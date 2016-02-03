# Prerequisite

You have followed the 1st tutorial session, or you have forked this project https://github.com/pranav8494/dummyProject


# Architecture

![architecture](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/architecture.PNG)


# Local analysis (hands on !)


### Set-up a local sonar server

 1- Go to http://www.sonarqube.org/downloads/
 
 2- Download the SonarQube 5.1.2.
 
 3- Unzip the downloaded folder in your working directory.
 
 4- Start the server by clicking on StartSonar.bat

![server](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/server.PNG)


 5- If every thing is fine, you should be able to browse http://localhost:9000/.

![localhost](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/localhost.PNG)


### Deploy the project on sonar server 

You should run a first code quality analysis to make sonar server recognize your project.

1- Configure the build.gradle

    * apply plugin: 'org.sonarqube'
    
    * buildscript {
              repositories { 
                maven {
                  url "http://repo1.maven.org/maven2/"
                }
                maven {
                  url "https://plugins.gradle.org/m2/"
                }
                mavenLocal()
              }
              dependencies { 
                classpath 'org.codehaus.sonar.runner:sonar-runner-dist:2.4'
                classpath 'org.ajoberstar:gradle-jacoco:0.1.0'
                classpath 'org.sonarqube.gradle:gradle-sonarqube-plugin:1.0'
              }
    }
    
    * sonarqube {
          properties {
              property "sonar.projectName", "Dummy Project :: Sonar"
              property "sonar.projectVersion", "1.0"
              property "sonar.projectKey", "org.sonarqube:java-gradle-simple"
              property "sonar.jacoco.reportPath", "${project.buildDir}/jacoco/test.exec"
              property "sonar.host.url", "http://localhost:9000"
          }
      } 
 

2- Run (on GitBash) the "sonarqube" gradle task: ```./gradlew sonarqube```

If the task is successful, you shoud see the project now on the sonar server http://localhost:9000/.

![project_on_server](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/project_on_server.PNG)

3- Click on the project 

![magic](http://www.reactiongifs.com/r/mgc.gif)


### Install a sonar scanner (SonarQube plugin) to run the analysis from Eclipse

1- Go to Eclipse > Help > Eclipse Marketplace...
2- Search for sonarqube
3- Install SonarQube 3.5.0

![marketplace](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/marketplace.PNG)

4- Restart Eclipse
5- Check if Eclipse is able to connect to the sonar server : Eclipse > Windows > Preferences > SonarQube > Servers

![connection](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/connection.PNG)

6- Right-click on the project in Package Exlporer view (Eclipse) and select Configure > Associate With SonarQube 

![associate](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/associate.PNG)

7- From now on, you shoud be able to run sonar analysis directly from Eclipse 

![eclipse](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/eclipse.PNG)

8- Check sonar issues in the SonarQube Issues view 

![issues](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/issues.PNG)

9- Let's now try to fix one of these issues.

For example, we will handle thew sonar violation "Standard ouputs should not be used directly to log anything".

For that, we will need to update the ```build.gradle``` with a new dependency ```'org.slf4j:slf4j-api:1.7.12'```

 ```
 dependencies {
    compile([
    	  'org.slf4j:slf4j-api:1.7.12',
       'commons-collections:commons-collections:3.2',
       'joda-time:joda-time:2.6'
    ])
 ```



# Continuous Integration (CI)

### Integration

![integration](https://github.com/pranav8494/dummyProject/blob/ahmed/images/img/architecture.PNG)


### ASR project as an example !

Running sonar analysis on a remote server (on production): https://sonar.1asr.com/.



# References

- http://docs.sonarqube.org/display/SONAR/Documentation
