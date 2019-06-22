FROM openjdk:8-jdk-alpine
RUN mkdir -p /app/
ADD build/libs/myfoodweek-0.0.1-SNAPSHOT.jar /app/myfoodweek.jar
ENTRYPOINT ["java", "-jar", "/app/myfoodweek.jar"]
