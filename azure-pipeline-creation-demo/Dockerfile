# use java 11 version
FROM openjdk:17
# copy jar file from project directory to location /usr/app/ to docker VM
COPY target/demo-0.0.1-SNAPSHOT.jar /usr/app/
# Go to the location /usr/app
WORKDIR /usr/app
# Execute the jar in the WORKDIR location
ENTRYPOINT [ "java","-jar","demo-0.0.1-SNAPSHOT.jar" ]