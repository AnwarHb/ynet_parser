# Build using gradle

FROM openjdk:17.0.2-oraclelinux8  as build

COPY /ynet_parser /ynet_parser

RUN cd /ynet_parser \
    && chmod +x gradlew \
    && ./gradlew build


# run the jar file

FROM openjdk:17.0.2-oraclelinux8

# copy the jar artifact from the build stage

COPY --from=build ynet_parser/build/libs/untitled-1.0-SNAPSHOT.jar .
# application runs on port 8090
EXPOSE 8090

CMD ["java","-jar", "untitled-1.0-SNAPSHOT.jar"]
