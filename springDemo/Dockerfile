FROM amazoncorretto:17
LABEL version ="1.0"
EXPOSE 8080:8080
WORKDIR /app
COPY target/springDemo-0.0.1-SNAPSHOT.jar springDemo.jar
ENTRYPOINT {"java","-jar","springDemo.jar"}