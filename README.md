# Java EE - Application Client Container example

## Environment:
 - GlassFish Server 4.1.1
 - JRE 7u21 or below (suspected problem with self-signed jnlp. See [discussion](http://stackoverflow.com/questions/26307580/signed-java-web-start-application-with-glassfish-4-1-and-java7). [Download](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html#sjre-7u21-oth-JPR))
 
## Setup
1. Build `ear` with `Maven` (compiler is set to Java 1.7 version)
2. Deploy`ear` into you GlassFish Server

## Run client using `appclient` script (option 1)
1. Download `Client stubs` from GlassFish admin page. It should be zip file with:
  * `A004-EE-AAC-Glassfish-earClient.jar` file 
  * `A004-EE-AAC-Glassfish-earClient` folder.
2. Unzip it
3. Open console
4. Go to Glassfish bin directory `cd <path to glassfish>\glassfish4\glassfish\bin`
5. Run `appclient -client <path to your Client Stubs>\A004-EE-AAC-Glassfish-earClient.jar`
6. You should see message `TestBean - doSomething - result`

## Run client using `Java Web Start` link (option 2, )
1. Download `jnlp` file. https://localhost:8181/A004-EE-AAC-Glassfish-app-client
2. Open console. 
3. Go to JRE 7u21 folder (e.g. `C:\Program Files\Java\jdk1.7.0_21\jre\bin`)
4. Run `Java Control Panel` with `javacpl.exe`
  * Set `Advanced - Java Console - Show Console`
6. `javaws.exe <path to your jnlp>\A004-EE-AAC-Glassfish-app-client.jnlp`
7. You should see message `TestBean - doSomething - result` in separate window with console messages.
  

## Useful links
* http://stackoverflow.com/questions/25974302/portable-jndi-syntax-lookup-for-ejb-on-glassfish/25985288#25985288
* https://glassfish.java.net/docs/4.0/application-development-guide.pdf (Chapter 10. Developing Java Clients)
* https://www.java.com/en/download/help/javaconsole.xml