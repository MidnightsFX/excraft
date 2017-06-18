Standalone source installation
==============================

Windows: "gradle setupDecompWorkspace"
Linux/Mac OS: "gradle setupDecompWorkspace"

For eclipse, run "gradle eclipse"
switch your workspace to /eclipse/
OR
Open IDEA, and import project.
Select your build.gradle file and have it import.
"gradle genIntellijRuns"
Restart Intellij

If at any point you are missing libraries in your IDE run "gradle --refresh-dependencies" to refresh the local cache.
When adding or updating dependencies also run "setupDevWorkspace"

