# java-checkstyle-spotbugs-sonarqube-template

Template project to demonstrate the following code quality actions in java projects:

- Checkstyle format checks
- SpotBugs code analysis
- SonarScanner / SonarQube static code analysis and code coverage

Configured to fail on findings (for Checkstyle + SpotBugs). For SonarScanner you will be able to see the results in the
SonarQube dashboard.

# Prerequisites

To perform SonarScanner actions, you must have running instance present locally.
To start a local instance, run:
> docker-compose up -d

## Run checks

### Run all checks

> ./mvnw clean verify

### Run Checkstyle manually

> ./mvnw clean checkstyle:check

### Run SpotBugs manually

> ./mvnw clean spotbugs:check

### Run SonarScanner manually

> ./mvnw clean sonar:sonar  
Browse http://localhost:9000 to see results of analysis.

## Configurations

### Checkstyle configuration

see: https://checkstyle.sourceforge.io/config.html

### SpotBugs configuration

see: https://spotbugs.readthedocs.io/en/latest/maven.html

### SonarScanner configuration

see: https://docs.sonarqube.org/latest/analyzing-source-code/scanners/sonarscanner-for-maven/  
see: https://docs.sonarqube.org/latest/

## IDE support

### IntelliJ IDEA checkstyle plugin

see: https://plugins.jetbrains.com/plugin/1065-checkstyle-idea

### IntelliJ SonarLint plugin

see: https://plugins.jetbrains.com/plugin/7973-sonarlint

### IntelliJ IDEA SpotBugs plugin

see: https://plugins.jetbrains.com/plugin/14014-spotbugs