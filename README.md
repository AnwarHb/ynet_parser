# ynet XML to HTML parser 

- the following is a JAVA application that reads the “Breaking News” from YNet news service and parses and Presents the breaking newa XML in an HTML table format.
- A Jenkins CI/CD pipeline was created to build and run the application.

#### Run the code on your machine:
- First, clone the code to your machine 
`git clone https://github.com/AnwarHb/ynet_parser.git`
- move to the directory :
`cd ynet_parser`
- set premesions to the gradlew file:
` chmod +x gradlew`
- build by running the gradle wrapper file:
`./gradlew  build`
- run the jar file:
` java -jar ./build/libs/untitled-1.0-SNAPSHOT.jar`

you can access the application with (http://localhost:8090 )

[![](https://github.com/AnwarHb/ynet_parser/blob/master/application_running.png?raw=true)](https://github.com/AnwarHb/ynet_parser/blob/master/application_running.png?raw=true)


#### Jenkins pipeline:
A jenkins pipline was created to manage the app -

[![](https://github.com/AnwarHb/ynet_parser/blob/master/jenkins.png?raw=true)](https://github.com/AnwarHb/ynet_parser/blob/master/jenkins.png?raw=true)

#### SLACK Notification:
you can set a connection to SLACK to get notified about the job building results.

[![](https://github.com/AnwarHb/ynet_parser/blob/master/slack_notify.png?raw=true)](https://github.com/AnwarHb/ynet_parser/blob/master/slack_notify.png?raw=true)
