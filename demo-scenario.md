# API Service Deploy Pipeline
The API service is built and deployed through 3 different stages:
### **1. Build WAR**
  This build stage clones the code from ![step-by-step-walkthrough Github](https://github.com/containers-a8/step-by-step-walkthrough.git)
  and run `maven` to build the service _WAR_ file. It then copies the _Dockerfile_ to same build folder and rename the _WAR_ file to _ROOT.war_.
  This stage is triggered either manually or when a code change is commited to the Git repository.
### **2. Build image**
  This stage is triggered after the _Build WAR_ stage or manually. It will use the ![_Dockerfile_] to extend
  the ![_tomcat-base_ image](https://github.com/containers-a8/docker-base-image-one-step/blob/master/wdp/Dockerfile), which 
  was already built using another Pipeline.
  It deploys the _ROOT.war_ file and uses a ![_wrapper script_](https://github.com/containers-a8/docker-base-image-one-step/blob/master/wdp/catalina-wrapper.sh) as an entry point.
### **3. Deploy**
  During container deployment, the entry point script will start the _Tomcat_ server to serve API on port **8080** and at the same time
  it registers the service with _Consul_ server.
  The Consul server IP address is passed in to the deployment script through `$CONSUL_IP` property that is defined in the _ENVIRONMENT PROPERTIES_ tab in the *Deploy* stage configuration.
  To test the deployment, a Public IP needs to be assigned to the API Service container. From the browser or `curl` command target this URL:
  http://api-service-IP:8080/accounts/savingsdeposits/v1/accounts/summaryView to get the response:
  ```json
  {"code":4,"type":"ok","message":"magic!"}
  ```
  
