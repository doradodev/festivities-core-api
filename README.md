# festivities Core RESTful API

[![engine](https://img.shields.io/badge/JDK-v1.8+-yellow.svg)]()
[![gradle](https://img.shields.io/badge/gradle-v2.13+-blue.svg)]()

---

> `Festivities Core RESTful API` 

---

## Sub-projects

* [festivities-commons]()
* [festivities-core-entity]()
* [festivities-core-repository]()
* [festivities-core-service]()
* [festivities-core-api]()
* [festivities-core-starter]()

## Prerequisites

You will need the following things properly installed on your computer.

* [Git](http://git-scm.com/)
* [Java](https://java.com/en/download/)

## Installation

I use [Gradle](http://www.gradle.org), a cross-platform build automation tool that help with our full development flow. If you prefer [install Gradle](http://www.gradle.org/installation) or use a [Gradle wrapper](http://www.gradle.org/docs/current/userguide/gradle_wrapper.html) inside this project.

* `git clone https://github.com/doradodev/festivities-core-api.git` this repository
* change into the new directory `Festivities-CORE-API`

## Build

```bash
./gradlew clean build
```

Take a look on generated artifacts, for instance `festivities-core-starter` subproject:

```bash
ls -1 festivities-core-starter/build/libs/

festivities-core-starter.jar
festivities-core-starter-javadoc.jar
festivities-core-starter-sources.jar
```


### Generate Javadoc

```bash
./gradlew javaDoc
```

## Distribution

`Festivities Core RESTful API` facilitates creating an executable JVM application. It makes it easy to start the application locally during development, and to packaging the application as ZIP including operating system specific start scripts. 

### Locally

```bash
./gradlew clean :festivities-core-starter:distZip
```

Take a look on generated dist zipped file:

```bash
ls -1 festivities-core-starter/build/distributions

festivities-core-starter.tar
festivities-core-starter.zip
```

## Configuration

### Database

`festivities Core RESTful API` uses a [H2](http://www.h2database.com/html/main.html) database embedded to store its data.

The database configuration starts while starting `Festivities Core RESTful API`.


## Run

### Running Core from command line using Gradle

To override default gradle config, please take a look on run task on  [core/festivities-core-starter/build.gradle](core/festivities-core-starter/build.gradle) subproject build file.

```bash
tail -n 20 festivities-core-starter/build.gradle

run {   
    
    environment 'COM_PRODIGIUS_API_PORT', '8080'

    environment 'COM_PRODIGIUS_ENV', 'DEV'
}
```

After that:

```bash
./gradlew clean :festivities-core-starter:run
```

Visit `Festivities Core RESTful API` at [http://localhost:8080/api/*](http://localhost:8080/api).

Visit `Festivities Core RESTful API` Documentation at [http://localhost:8080/docs/index.html](http://localhost:8080/docs/index.html).

## Further reading / Useful links

* [Gradle](http://gradle.org/)
* [Getting started with Gradle](http://gradle.org/getting-started-jvm/)

## Current version

 - 1.0.0

## Getting help

For more info/help, please send email to: *cdorado330@gmail.com*

*Happy coding!*
