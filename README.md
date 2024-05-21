# JavaProject
# Basic Java Project

We are implementing a Hybrid Testing framework using Java programming language and Selenium is used as an automation tool

In the framework the Maven project is using, in the maven project src main java consists of POM
Classes and src Test java consist of Test Classes. In Pom.xml added the dependencies,
downloaded jar is present in the maven dependencies folder.

Test Base class consists of the code related to opening the browsers which are extended to different test classes using extends keywords.

To design the test class we are using TestNG by TestNg we can generate the Emailable and HTML reports, and we can create test suits of different classes also to execute the classes parallel, compatibility is also possible.

It provides different assertions and also use different annotations like before method, after method, before test, @Test, and after test.

We also created some folders like screenshots, Failed test cases get captured screenshots and save it also in the Test Data Consist of Xcel file for data-driven.

The property file is created to store the important credentials data like UN, Password, URL, and PIN.

Extent reporter is used to generate the report and log4j jar file is used to generate a log.

In the Utility classes, frequently used methods like parameterization, and screenshots are included.

Daily developed code/source code is stored in the GitLab repository.

For continuous integration (CI) we use Jenkins for scheduling.

