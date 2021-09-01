# project-service

The project-service service is used to create/update/search/delete and publish the project.

# Prerequisties
kakfa should up and run on 9092


Please use the ENV variable to change the above configurations

# To build the project
Use eclipse/intellij or 

manually build the project using maven -> mvn clean compile package from the project directory

# To start the project manually
java -jar -Dspring.profiles.active=dev ./target/app.jar

# To know more about APIs
use swagger API -> http://localhost:4202/swagger-ui.html

Please use spring profiles to use ENV specific configurations


Also, can download image (santhoshas/project-service:latest) from dokcer hub
