from eclipse-temurin:21-jdk 
expose 8989
workdir /app
copy target/new-place.jar spring-newbasic.jar
entrypoint ["java","-jar","spring-newbasic.jar"]