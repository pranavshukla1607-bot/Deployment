FROM amazoncorretto:17
LABEL version ="1.0"
EXPOSE 8080:8080
WORKDIR /app
COPY target/UserService-0.0.1-SNAPSHOT.jar UserService.jar
ENTRYPOINT {"java","-jar","UserService.jar"}