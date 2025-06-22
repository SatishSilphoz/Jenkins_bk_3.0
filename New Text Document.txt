@echo off
echo ================================
echo Running Maven Cucumber Tests...
echo ================================

cd /d "D:\Core Modules\Capium_BK_3.0"

:: Clean, compile and run Cucumber tests
mvn clean test

:: Open Extent Report (if generated)
start "" "target/extent-report/index.html"

pause
