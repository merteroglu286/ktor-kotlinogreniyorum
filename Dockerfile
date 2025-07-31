# Build aşaması
FROM gradle:7-jdk11 AS build
WORKDIR /home/gradle/src
COPY --chown=gradle:gradle . .
RUN gradle buildFatJar --no-daemon

# Runtime aşaması
FROM openjdk:11
EXPOSE 8080
WORKDIR /app

# Jar dosyasını app içine kopyala
COPY --from=build /home/gradle/src/build/libs/*-fat.jar /app/app.jar

# Uygulamayı başlat
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
