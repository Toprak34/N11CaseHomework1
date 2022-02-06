#N11 All Store Name Export Excel File 

##Description of Project
N11 All store export Excel file and The store that starts with the letter 'S' opens.It is seen how many comments there are about the selected store.
This project used Cucumber, Selenium and JUnit and Take into consideration BDD

##How to run test case? 
-Firstly go configuration.properties file and chose browser type.
-And then go to runners-->CukesRunner in src file

##How to run in docker and selenium grid ?
-Open the terminal and 'docker-compose up'
-Go to configuration.properties file and write browser type "remote-browser"
-And then go to runners-->CukesRunner in src file
-Go localhost:4444 and click sesions and  watch test.If it asks for a password, the password is "secret".
-Ctrl+c exit the container.

##How to see Allure Report ?
open terminal and write 'allure serve'

Note: If you use windows, you should download allure 'https://docs.qameta.io/allure/', 
and go environment variables then add to path.
Download the latest version as zip archive from Maven Central.

Unpack the archive to allure-commandline directory.

Navigate to bin directory.

Use allure.bat for Windows or allure for other Unix platforms.

Add allure to system PATH.s
