cd %~dp0AssetNation
SET CLASSPATH=..\AssetNation\*;
SET PATH=%PATH%;.
echo PATH
cls
call "C:\Program Files\Java\jdk1.8.0_92\bin\java" com.java.RunTest %1
cd..
pause
