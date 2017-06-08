Standalone source installation
==============================

Windows: "gradlew setupDecompWorkspace"
Linux/Mac OS: "./gradlew setupDecompWorkspace"

For eclipse, run "gradlew eclipse" (./gradlew eclipse if you are on Mac/Linux)
switch your workspace to /eclipse/
OR
Open IDEA, and import project.
Select your build.gradle file and have it import.
"gradlew genIntellijRuns" (./gradlew genIntellijRuns if you are on Mac/Linux)
Restart Intellij

If at any point you are missing libraries in your IDE run "gradlew --refresh-dependencies" to refresh the local cache.
When adding or updating dependencies also run "setupDevWorkspace"

