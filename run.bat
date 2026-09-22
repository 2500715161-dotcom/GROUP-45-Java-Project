@echo off
if not exist out ( 
    call compile.bat
    if errorlevel 1 exit /b 1
)
java -cp out Main
