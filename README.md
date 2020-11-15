# springboot-backend

## Prerequisites
Maven

## Build
```mvn spring-boot:build-image```

## Docker
```docker build -t springboot-backend . && docker run -p 8080:8080 --name backend-container --network mynetwork springboot-backend```
