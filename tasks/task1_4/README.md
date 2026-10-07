# Task 1.4

Small example of a Gradle-based Kotlin project. Compare this with the
Kotlin Toolchain project in Task 1.3.1.

To run the application, building it first if necessary, do

    ./gradlew run

You would want to use this build system over Kotlin Toolchain. There are a few reasons for you to do that, let's see a few. Gradle is a really good system for complex and bigger programs as it helps you build and manages your program in a better way. The only cons of Gradle is its complexity. Gradle has been used by programmers and it is constantly getting improved by new plug-ins from the programmers. This helps a lot as Kotlin is newer and for example a company has unusual requirements there is a very high chance that Gradle is already capable of it. Gradle has already function which you can use to skip tasks compared to Kotlin Toolchain where you need to execute everything step by step.

The system uses JVM (Java Virtual Machine) to convert the Kotlin to something that the CPU can understand adn execute.

To create a distributable version of the application, do

    ./gradlew distZip
Gradle is smart enough that it will update the current zip File if you do distZip again

To remove all built artifacts, do

    ./gradlew clean 
Delete all the build files so if you used distzip before and want to 
get rid of the files and create a new build later you should delete
the current build using ./gradlew clean.

## Notes

The above instructions assume the use of Linux/macOS. On Windows, invoke
Gradle using `.\gradlew.bat` instead of `./gradlew`.

On a Linux or macOS system, you might see a 'Permission denied' error when
you attempt to run Gradle. If so, fix the script's permissions with

    chmod u+x gradlew
