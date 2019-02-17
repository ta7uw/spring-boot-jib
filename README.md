# spring-boot-jib

## How to Use
### Build docker image to Docker daemon 
Jib can also build your image directly to a Docker daemon. 

```
$ ./gradlew jibDockerBuild
```

Docker image is created
```
$ docker image ls
REPOSITORY                                 TAG                 IMAGE ID            CREATED             SIZE
springboot-jib-demo                        0.0.1-SNAPSHOT      fcd49c0fb403        11 minutes ago      135MB
```

### Docker Run

```
docker run -p 8080:8080 -d springboot-jib-demo:0.0.1-SNAPSHOT
```
 
```
$ curl http://localhost:8080
> Hello, Jib
```
