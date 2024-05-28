FROM openjdk:18
ADD target/student-management-docker.jar student-management-docker.jar
ENTRYPOINT ["java","-jar","/student-management-docker.jar"]