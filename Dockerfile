# -------- Stage 1: Build --------
FROM gradle:9.2-jdk17-alpine AS build

# Set working directory
WORKDIR /app

# Author information
LABEL authors="Mehmet Furkan KAYA <mefurkankaya36@gmail.com>"

# Cache dependencies first (for faster rebuilds)
COPY build.gradle settings.gradle ./
COPY gradle/ gradle/
RUN gradle dependencies --no-daemon

# Copy source code and build the application
COPY src ./src
RUN gradle clean build -x test --no-daemon

# -------- Stage 2: Runtime --------
# Use slim JRE for smaller image size
FROM eclipse-temurin:17-jre-alpine

# Set working directory
WORKDIR /app

# Copy JAR from build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]