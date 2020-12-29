FROM openjdk:8-jdk-alpine
EXPOSE 8050
COPY TripPricer.jar /
ENTRYPOINT ["java", "-jar", "TripPricer.jar"]

