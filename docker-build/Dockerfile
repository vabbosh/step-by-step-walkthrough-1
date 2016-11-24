FROM registry.ng.bluemix.net/vabbosh/wdp-tomcat-base:5
ADD ROOT.war "/usr/local/tomcat/webapps/ROOT.war"
RUN rm -rf "/usr/local/tomcat/webapps/ROOT" && chown -R tomcat:tomcat /usr/local/tomcat && \
    chmod -R u+rwX /usr/local/tomcat && chmod -R go-rwx /usr/local/tomcat
USER tomcat
ENV SERVICE_NAME accounts-savingsdeposits-v1

# launch the catalina-wrapper script. This CMD should be removed later. I am using it for testing purposes now 
CMD ["/usr/local/tomcat/bin/catalina-wrapper.sh", "run"]