# Docker Build Stage
#FROM maven:3.8.6-openjdk-11 AS build

# Build Stage
#WORKDIR /opt/app

#COPY ./ /opt/app
#RUN mvn clean install -DskipTests


# Docker Build Stage
FROM openjdk:11.0.16

#COPY --from=build /opt/app/target/*.jar app.jar

ENV PORT 8088
EXPOSE $PORT
ADD target/demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","-Xmx1024M","-Dserver.port=${PORT}","/demo1-0.0.1-SNAPSHOT.jar"]
