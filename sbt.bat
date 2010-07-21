set SCRIPT_DIR=%~dp0
java -Xmx512M -XX:MaxPermSize=512M -noverify -javaagent:"C:\Program Files\ZeroTurnaround\JRebel\jrebel.jar" -jar "%SCRIPT_DIR%sbt-launch-0.7.4.jar" %*