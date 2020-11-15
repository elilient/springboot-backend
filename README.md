# springboot-backend

## Prerequisites
Maven

## Build
```mvn spring-boot:build-image```

## Docker
```docker build -t springboot-backend . && docker run -p 8080:8080 --name backend-container springboot-backend```

## Functionality
Back-end adds 4 votes to the list by on startup. The rest are added through postVote endpoint.
