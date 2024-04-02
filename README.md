# Gradle Project Setup

This README file contains the necessary information for setting up and executing your Gradle project, specifically for
the task `gradle clean build test`. We also recommend using Gradle version 7.0 and provide instructions for changing the
default Firefox browser configuration to run your project with Chrome or Edge.

## Commands

- `gradle clean build test`: Executes the Gradle build tasks, cleans, compiles, and tests your project.

## Recommendations

- Use Gradle version 7.0 for compatibility and optimal performance.

## Changing Device 

1. Open the `serenity.properties` file in the `src/test/resources` directory.
2. Select your platform and comment or comment the selected (iOS or Android)
3. Change the capabilities `appium.deviceName` and `appium.platformVersion` with yours capabilities
