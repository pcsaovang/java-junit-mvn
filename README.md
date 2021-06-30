# Java testing with JUnit and maven

# Getting started

1. [Install Java](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm#JSJIG-GUID-C5F0BF25-3487-4F33-9275-7000C8E1C58C)
2. [Setup JAVA_HOME environment variable on Mac OS X](https://gist.github.com/fabianogoes/bf7aa20b007d8dda1ed2)
3. Check java version
```shell
$ java --version
java 15.0.2 2021-01-19
Java(TM) SE Runtime Environment (build 15.0.2+7-27)
Java HotSpot(TM) 64-Bit Server VM (build 15.0.2+7-27, mixed mode, sharing)
````
```shell
$ javac --version
javac 15.0.2
```
4. Install [Maven](https://maven.apache.org/download.cgi)

- Now we extract the archive to our desired location.
```shell
$ tar -xvf apache-maven-3.3.9-bin.tar.gz -C /usr/local/apache-maven/apache-maven-3.3.9
```
- Adding Maven to the Environment Path
```shell
$ nano ~/.bashrc
```
```shell
export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.9
export M2=$M2_HOME/bin
export MAVEN_OPTS=-Xms256m -Xmx512m
export PATH=$M2:$PATH 
 ```
 ```shell
 $ source ~/.bashrc
 ```
 - Check maven version
 ```shell
 $ mvn -version
 ```
 ```shell
Maven home: /Users/phongtran/Downloads/apache-maven-3.8.1

Java version: 15.0.2, vendor: Oracle Corporation, runtime: /Library/Java/

JavaVirtualMachines/jdk-15.0.2.jdk/Contents/Home

Default locale: en_VN, platform encoding: UTF-8

OS name: "mac os x", version: "10.15.7", arch: "x86_64", family: "mac"
```
5. Build source code
```shell
$ mvn package
```
6. Run test
```shell
# Run all the unit test classes.
$ mvn test

# Run a single test class.
$ mvn -Dtest=TestApp1 test

# Run multiple test classes.
$ mvn -Dtest=TestApp1,TestApp2 test

# Run a single test method from a test class.
$ mvn -Dtest=TestApp1#methodname test

# Run all test methods that match pattern 'testHello*' from a test class.
$ mvn -Dtest=TestApp1#testHello* test

# Run all test methods match pattern 'testHello*' and 'testMagic*' from a test class.
$ mvn -Dtest=TestApp1#testHello*+testMagic* test
```

> [Maven run command](https://maven.apache.org/run.html)

### VSCode extension 
- https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven
- https://marketplace.visualstudio.com/items?itemName=redhat.java