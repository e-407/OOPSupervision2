OOP Supervision 2

Note: As I am now using Maven and JUnit, this file is adapted from Marcell's template.

Setup
1. Clone the repo
2. Install Maven (https://maven.apache.org/) (if not already installed) or let IntelliJ handle it automatically.

Running files individually

From IntelliJ (Recommended)
Simply right-click on a file (e.g., inside src/main/java) and select Run.

From the command line
1. Run "mvn install" to compile the code.
2. Run "java -cp target/classes <your-package-name>.<classname>" to run a specific class.
    * Example: java -cp target/classes questions.q4_2.SecretClass

Running all tests

From IntelliJ
Right-click on src/test/java and select "Run 'All Tests'".

From the command line
Run "mvn verify"