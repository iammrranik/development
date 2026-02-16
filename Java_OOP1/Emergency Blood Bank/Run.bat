@echo off
:: cd $(CURRENT_DIRECTORY)
:: Start
set mypath=%cd%
:: echo %mypath%
cd %mypath%
DeleteCache.bat
javac Start.java
java Start