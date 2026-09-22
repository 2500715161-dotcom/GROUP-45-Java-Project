@echo off
javac src\*.java -d out
if errorlevel 1 (
    echo Compilation failed. Please install a JDK and ensure java and javac are on PATH.
    exit /b 1
)
echo Compilation successful.
