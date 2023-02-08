# Dockerfile이란 도커 이미지를 만들기 위한 자동화된 스크립트
FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]