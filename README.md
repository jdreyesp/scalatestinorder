# Tricks to execute scala test suites in specific order

Normally you don't need to execute tests in order, because if so you're breaking de FIRST principle in unit tests, 
but sometimes using integration test, you need to ensure everything is ok before executing some specific tests.

Because of that, scalatest offers you several ways to order your tests executions.

In this example, I'm using scalatest_2.11 with ScalaTest Maven plugin.

Tricks implemented here are:

- Using special suite for tests -> This ensure you have the correct execution order of your tests inside a package @see ```TestOrderSuite.scala`
- Using ```wildcardSuites``` property in ScalaTest Maven plugin -> This ensure that you have the correct execution of your tests *between* packages


Run the project with

```mvn clean install```
