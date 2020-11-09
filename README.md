# Practical Test Demo

This is a Practical Task which includes.
* Maven
* Selenium Web Driver
* TestNG
* POM
* Selenide 

## Prerequisite:
* Install Java JDK 1.8 / Set Environment Variable 
* Install Mavan / Set Environment Variable
* Install Git / Set Environment Variable

##### Step by Step Guide to Run Test from IDE:
* Clone the repository
* Open project in IntelliJ IDEA
* POM will start downloading the dependencies
* Right click on testNGRunner.XML and click run
* If you got DTD error then goto TestNG Edit Configuration and add `-ea -Dtestng.dtd.http=true` in **VM Options**

##### Step by Step Guide to Run Test from Power Shell:
* Clone the repository
* Goto projct root directory and open Power Shell
* Type `mvn clean` it clears out the existing classes that you compiled from last compile (not require for 1st time)
* Type 'mvn compile' it will compile the source code of the project
* Type 'mvn test' it will execute the default `testNGRunner.xml`
* If you need to execute any separate testNG.xml file then you need to type `mvn test -DsuiteXmlFile="textNGRunner.xml"`

#### Selenide Test:

For Selenide Test I have created a separate class to execute this task just like a small POC, I haven't worked on Selenide Framework officially but have read about it just for the knowledge.

