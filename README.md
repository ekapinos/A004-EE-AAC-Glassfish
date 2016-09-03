# Java EE - Application Client Container example

## Environment:
 - GlassFish Server 4.1.1
 
## Setup
1. Build `ear` with `Maven`
2. Deploy`ear` into you GlassFish Server

## Run client using `appclient` script (option 1)
1. Download `Client stubs` from GlassFish admin page. It should be zip file with:
  * `A004-EE-AAC-Glassfish-earClient.jar` file 
  * `A004-EE-AAC-Glassfish-earClient` folder.
2. Unzip it
3. Find Glassfish bin directory `cd <path to glassfish>\glassfish4\glassfish\bin`
4. `appclient -client <path to your Clien Stubs>\A004-EE-AAC-Glassfish-earClient.jar`
5. You should see message `TestBean - doSomething - result`

## Run client using `Java Web Start` link (option 2)
1. Download `jnlp` file. https://localhost:8181/A004-EE-AAC-Glassfish-app-client
2. You should see message `TestBean - doSomething - result`
  

## Useful links
* http://stackoverflow.com/questions/25974302/portable-jndi-syntax-lookup-for-ejb-on-glassfish/25985288#25985288
* https://glassfish.java.net/docs/4.0/application-development-guide.pdf (Chapter 10. Developing Java Clients)