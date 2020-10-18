# remorque-app
a JSF app to manage trailers

      - Run using jetty 
          mvn clean jetty:run
          mvn clean -Dcontainer=jetty-mojarra jetty:run
          Set your browser to http://localhost:8080/remorque-app
      - Run using tomcat
          mvn clean -Dcontainer=tomcat7 tomcat:run
          Set your browser to http://localhost:8080/remorque-app
      - Run war using tomcat
          mvn clean -Dcontainer=tomcat7 tomcat:run-war
          Set your browser to http://localhost:8080/remorque-app
      - Run war using jetty (remove <webApp> config inside plugin config first)
          mvn clean jetty:run-war
          mvn clean -Dcontainer=jetty-mojarra jetty:run-war
          Set your browser to http://localhost:8080
      - Build war and bundle JSF jars 
          mvn clean -Pbundle-myfaces install
          mvn clean -Pbundle-mojarra install
