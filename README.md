# IMDB Core API

[![engine](https://img.shields.io/badge/JDK-v1.8+-yellow.svg)]()
[![gradle](https://img.shields.io/badge/gradle-v2.13+-blue.svg)]()
[![Angular](https://img.shields.io/badge/Angular-v7.2+-red.svg)]()

---

> `Imdb Core RESTful API` 

---

## Sub-projects

* [imdb-core-commons]()
* [imdb-core-entity]()
* [imdb-core-repository]()
* [imdb-core-service]()
* [imdb-core-api]()
* [imdb-core-starter]()

## Prerequisites

You will need the following things properly installed on your computer.

* [Git](http://git-scm.com/)
* [Java](https://java.com/en/download/)

## Installation

I use [Gradle](http://www.gradle.org), a cross-platform build automation tool that help with our full development flow. If you prefer [install Gradle](http://www.gradle.org/installation) or use a [Gradle wrapper](http://www.gradle.org/docs/current/userguide/gradle_wrapper.html) inside this project.

* `git clone https://github.com/doradodev/imdb-core-api.git` this repository
* change into the new directory `imdb-CORE-API`

## Build

```bash
./gradlew clean build
```

Take a look on generated artifacts, for instance `imdb-core-starter` subproject:

```bash
ls -1 imdb-core-starter/build/libs/

imdb-core-starter.jar
imdb-core-starter-javadoc.jar
imdb-core-starter-sources.jar
```


### Generate Javadoc

```bash
./gradlew javaDoc
```

## Distribution

`imdb Core RESTful API` facilitates creating an executable JVM application. It makes it easy to start the application locally during development, and to packaging the application as ZIP including operating system specific start scripts. 

### Locally

```bash
./gradlew clean :imdb-core-starter:distZip
```

Take a look on generated dist zipped file:

```bash
ls -1 imdb-core-starter/build/distributions

imdb-core-starter.tar
imdb-core-starter.zip
```

## Configuration

### Database

`imdb Core RESTful API` uses a [H2](http://www.h2database.com/html/main.html) database embedded to store its data.

The database configuration starts while starting `imdb Core RESTful API`.


## Run

### Running Core from command line using Gradle

To override default gradle config, please take a look on run task on  [core/imdb-core-starter/build.gradle](core/imdb-core-starter/build.gradle) subproject build file.

```bash
tail -n 20 imdb-core-starter/build.gradle

run {   
    
    environment 'COM_LUNATECH_API_PORT', '8080'

    environment 'COM_LUNATECH_ENV', 'DEV'
}
```

After that:

```bash
./gradlew clean :imdb-core-starter:run
```
Web Application is located 
at [http://localhost:8081/imdb/index.html](http://localhost:8081/api).

Visit `imdb Core RESTful API` at [http://localhost:8081/api/*](http://localhost:8081/api).

Visit at [http://localhost:8081/docs/index.html](http://localhost:8081/docs/index.html). Swagger documentation

## Further reading / Useful links

* [Gradle](http://gradle.org/)
* [Getting started with Gradle](http://gradle.org/getting-started-jvm/)

## Current version

 - 1.0.0

## Getting help

For more info/help, please send email to: *cdorado330@gmail.com*

*Happy coding!*
