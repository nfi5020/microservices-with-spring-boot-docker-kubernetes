# Adding open JDK 17 for our application
FROM openjdk:17-jdk-slim

# Who owns/maintains it
MAINTAINER github.com/nfi5020

# Where is the jar located so it can be added to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar ./accounts-0.0.1-SNAPSHOT.jar


# When a container gets created it uses this command to start the application in the container
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]


# ====================================================================
# This command helps with building the image
# . will look for the Dockerfile
# -t helps with tag (s4 is the tag)

# docker build . -t najrulbiplob/accounts:s4
# docker run -p 8081:8080 najrulbiplob/accounts:s4