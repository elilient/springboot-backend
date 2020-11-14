FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/*.jar

# Port
EXPOSE 8080

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} springboot-backend-0.0.1-SNAPSHOT.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","springboot-backend-0.0.1-SNAPSHOT.jar"]