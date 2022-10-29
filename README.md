# Spring Boot Reddit Clone Backend [![CI/CD Pipeline](https://github.com/spencerlepine/spring-reddit-workshop/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/spencerlepine/spring-reddit-workshop/actions/workflows/build.yml)

Reddit clone built using Spring Boot, Spring Security with JPA Authentication, Spring Data JPA with MySQL, Spring MVC. The frontend is built using Angular - You can find the frontend source code here - [https://github.com/spencerlepine/angular-reddit-workshop](https://github.com/spencerlepine/angular-reddit-workshop)

![](./youtube-video.png)

### Links
- YouTube tutorial: [https://www.youtube.com/watch?v=DKlTBBuc32c](https://www.youtube.com/watch?v=DKlTBBuc32c)
- Tutorial Repository Backend: [https://github.com/SaiUpadhyayula/spring-reddit-clone](https://github.com/SaiUpadhyayula/spring-reddit-clone)
- Tutorial Repository Frontend: [https://github.com/SaiUpadhyayula/angular-reddit-clone](https://github.com/SaiUpadhyayula/angular-reddit-clone)

### Helpful Commands

> Created template project on [https://start.spring.io/](https://start.spring.io/)

```sh
# Install Dependencies
$ mvn dependency:resolve
# Test & Build
$ mvn -B test

# Set up IntelliJ IDEA and lombok
# CTRL + SHIFT + A => "Plugins" => search lombok
```

#### Running MySQL Locally with Docker

```shell
$ sudo docker pull mysql/mysql-server:latest
$ sudo docker images
$ docker run -p 3306:3306 -p 33060:33060 --name="reddit-mysql" -d mysql/mysql-server 
# sudo docker run --name=[container_name] -d [image_tag_name]
$ docker logs reddit-mysql 2>&1 | grep GENERATED
# [Entrypoint] GENERATED ROOT PASSWORD: Y@6l#80OuuMhM=Valj&#3?=9405@Wexu
$ docker ps
$ sudo docker exec -it reddit-mysql bash
# sudo docker exec -it [container_name] bash
bash> mysql -uroot -p
mysql> ALTER USER 'root'@'localhost' IDENTIFIED BY '[newpassword]';
# ALTER USER 'root'@'localhost' IDENTIFIED BY 'mysql';
mysql> UPDATE mysql.user set host = '%' where user='root';
# ALTER USER 'root'@'localhost' IDENTIFIED BY 'mysql';
mysql> exit
bash> exit
$ docker restart reddit-mysql
# now accessible on localhost my springboot application
# or MySQL Workbench
```