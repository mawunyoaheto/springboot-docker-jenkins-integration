FROM openjdk:11
EXPOSE 8000
ADD target/springboot-jenkins-docker-integration.jar springboot-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/springboot-jenkins-docker-integration.jar"]