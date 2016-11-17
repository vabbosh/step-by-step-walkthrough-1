FROM artifactorypilot.srv.westpac.com.au:50996/wdp/tomcat-bamboobuild:latest
ADD ROOT.war "/usr/local/tomcat/webapps/ROOT.war"
RUN rm -rf "/usr/local/tomcat/webapps/ROOT" && chown -R tomcat:tomcat /usr/local/tomcat && \
    chmod -R u+rwX /usr/local/tomcat && chmod -R go-rwx /usr/local/tomcat
USER tomcat
ENV SERVICE_NAME accounts-savingsdeposits-v1
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
