# Task 1.3.1

Examine `libs.versions.toml` and `module.yaml` to see how this project has
been configured with dependencies.

Examine the two `.kt` files in the `src` subdirectory to see how those
dependencies are used.

Compile and run the program with

    ./kotlin run

Bundle it with its dependencies as an 'executable JAR' file like this:

    ./kotlin package

See the Kotlin Programming Guide for more details.


**_Notes: The whole point of this is to get one .jar file with the full program that does 
not have any dependencies, and you can move it wherever you want without the need to move
any of the other files. It's like the program fully compacted._**