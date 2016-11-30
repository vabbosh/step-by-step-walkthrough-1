FROM registry.ng.bluemix.net/vabbosh/base-tomcat:latest
ADD ROOT.war "/usr/local/tomcat/webapps/ROOT.war"
RUN rm -rf "/usr/local/tomcat/webapps/ROOT" && chown -R tomcat:tomcat /usr/local/tomcat && \
    chmod -R u+rwX /usr/local/tomcat && chmod -R go-rwx /usr/local/tomcat
#Give tomcat user ownership of Consul data directory
RUN chown -R tomcat:tomcat /data/consul && chmod -R u+rw /data/consul

#Give tomcat user ownership of /etc/consul.d  directory
RUN chown -R tomcat:tomcat /etc/consul.d && chmod -R u+rw /etc/consul.d

USER tomcat
ENV SERVICE_NAME accounts-savingsdeposits-v1

# launch the catalina-wrapper script. This CMD should be removed later. I am using it for testing purposes now 
CMD ["/usr/local/tomcat/bin/catalina-wrapper.sh", "run"]
