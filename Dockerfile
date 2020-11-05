FROM openjdk:8
EXPOSE 8080
ADD target/aws-cicd-springboot-init-0.0.1-SNAPSHOT.jar aws-cicd-springboot-init-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/aws-cicd-springboot-init-0.0.1-SNAPSHOT.jar"]