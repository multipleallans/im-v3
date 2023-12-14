FROM openjdk:17-jdk-alpine
ADD im-service-provider-v2-1.0-SNAPSHOT.jar /app/im-service-provider-v2-1.0-SNAPSHOT.jar
CMD echo "======dockertest======"
EXPOSE 38088
ENV jvm_opts="--add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.lang.invoke=ALL-UNNAMED --add-opens java.base/java.math=ALL-UNNAMED --add-opens java.base/sun.net.util=ALL-UNNAMED --add-opens java.base/java.io=ALL-UNNAMED --add-opens java.base/java.net=ALL-UNNAMED --add-opens java.base/java.nio=ALL-UNNAMED --add-opens java.base/java.security=ALL-UNNAMED --add-opens java.base/java.text=ALL-UNNAMED --add-opens java.base/java.time=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED"
ENTRYPOINT exec java -jar $jvm_opts /app/im-service-provider-v2-1.0-SNAPSHOT.jar