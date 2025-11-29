OOP Supervision 2

Note: As I am now using Maven and JUnit, this file is adapted from Marcell's template.

Setup
1. Clone the repository
2. Install Maven (https://maven.apache.org/) (if not already installed) or let IntelliJ handle it automatically.

Running files individually

From IntelliJ (recommended) simply right-click on a file (e.g., inside src/main/java) and select Run.

From the command line
1. Run "mvn install" to compile the code.
2. Run "java -cp target/classes <package_name>.<class_name>"
    * Note: This only works for classes containing a "main" method.
    * Example: java -cp target/classes q4_6.TestShadowing

Running all tests

From IntelliJ
Right-click on src/test/java and select "Run 'All Tests'".

From the command line
Run "mvn verify"