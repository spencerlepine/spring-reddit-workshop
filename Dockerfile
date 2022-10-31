FROM openjdk:11-jre-slim-buster
MAINTAINER spencerlepine.com
COPY target/demo-0.0.1-SNAPSHOT.jar server-1.0.0.jar
ENTRYPOINT ["java","-jar","/server-1.0.0.jar"]
