## Jakarta EE Hello Sample Installation


### Links
https://www.youtube.com/watch?v=PAvn_jBNVNE&list=PLFMhxiCgmMR9Pu0v-VjNdEaRLcoUqHLFT
https://glassfish.org/docs/SNAPSHOT/installation-guide.html
https://glassfish.org/docs/SNAPSHOT/quick-start-guide.html#GSQSG


Links

### Install

- Download the actual Glassfish from the Jakarta EE Download page: [https://jakarta.ee/compatibility/download/](https://jakarta.ee/compatibility/download/)
- If not already installed, install the JDK 17
- Unzip the downloaded ZIP file into a directory on your local computer  
  `unzip $HOME/Downloads/glassfish-7.0.0-M8.zip -d $HOME/Services`
- To make the working with Glassfish easier define the following environment variable  
  `export GLASSFISH_HOME="$HOME/Services/glassfish7"`
- Check installation by verifying the version of the administration tool  
  `$GLASSFISH_HOME/bin/asadmin version`
- Starting your domain1 (domain1 is predefined with instance-port 8080 and the admin-port 4850. Therefore I recommended to delete the current installation and create a new version running under port 8081 and 4861,  to have less conflicts with other services already using the common port 8080. See below for the commands.

### Setup own Glassfish domain1 instance


```kotlin
$GLASSFISH_HOME/bin/asadmin stop-domain domain1
$GLASSFISH_HOME/bin/asadmin delete-domain domain1
$GLASSFISH_HOME/bin/asadmin create-domain --instanceport 8081 --adminport 4861 domain1
$GLASSFISH_HOME/bin/asadmin start-domain domain1
```


Verify if the Instance port by accessing [http://localhost:8081](http://localhost:8081)

Hello World Sample

Use the following sample Jakarta EE Hello sample to test your installation [https://github.com/wschaefer42/jakarta-ee-hello.git](https://github.com/wschaefer42/jakarta-ee-hello.git). Clone that Git repository to your local machine and open it with IntelliJ.

Another way is to download the War file and copy into your Glassfish domain1 `autodeploy` folder. We are using wget to download that file.

```Bash
wget https://github.com/wschaefer42/jakarta-ee-hello/blob/master/artefacts/hello-1.0.war \
	-P $GLASSFISH_HOME/glassfish/domains/domain1/autodeploy
```


Open the Hello Web App under URL [http://localhost:8081/hello-1.0/](http://localhost:8081/hello-1.0/)
