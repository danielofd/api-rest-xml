FROM openjdk:17.0.2-jdk
EXPOSE 8081
RUN mkdir /app
ADD build/libs/api-rest-xml-0.0.1-SNAPSHOT.jar /app/api-rest-xml-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/app/api-rest-xml-0.0.1-SNAPSHOT.jar" ]