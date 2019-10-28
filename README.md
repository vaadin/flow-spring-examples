Vaadin Spring tutorial
======================

This project contains the source code for the tutorial for using Vaadin and Spring together with the help of Spring Boot.

The tutorial can be found [here](https://vaadin.com/docs/v14/flow/spring/tutorial-spring-basic.html).

The topics that are covered in this tutorial project:
* Getting Started with Vaadin Spring for Flow and Spring Boot: the initial `@SpringBootApplication` class.
* Injection and Scopes with Vaadin Spring
* Navigation with Vaadin Spring
* Register VaadinServiceInitListener via the Spring DI mechanism
* Flow template within Spring Boot application
* Use I18N in Spring application

## Running the project from command line

Run `mvn clean install spring-boot:run` in the project root directory. After the server has started point your browser to [http://localhost:8080](http://localhost:8080) to see the resulting application.

## Running the project from your IDE

Navigate to the `org.vaadin.spring.tutorial.TutorialApplication` class and run it as a Java application.
