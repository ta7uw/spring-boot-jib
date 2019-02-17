# spring-boot-jib

## How to Use
### Build docker image 
Jib can also build your image directly.

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
docker container  run -p 8080:8080 -it springboot-jib-demo:0.0.1-SNAPSHOT
```
 
```
$ curl http://localhost:8080
> Hello, Jib
```
