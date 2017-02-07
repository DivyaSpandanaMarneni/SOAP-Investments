=========Compilation and Execution steps for Project1 - SOAP web service=================
This directory contains two sub directories 
	1. Investment-Client
	2. Investment-Server

The Investment-Server directory has packages  with MoveInvestment service and also the supporting business, model and net.webservicex classes

The WSDL link for the MoveInvestment service is :
	http://uml.cs.uga.edu:8080/Divya_Marneni_move/MoveInvestment?wsdl


========User environment setup=====================================
export JBOSS_HOME=/home/grads/marneni/EnterpriseIntegration/Project1/wildfly-10.1.0.Final
export PATH=$JBOSS_HOME/bin:$PATH


export JAVA_OPTS="-XX:+UseCompressedOops -Dprogram.name=standalone.bat -Xms512m -Xmx2014m -server -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.server.base.dir=./wildfly-10.1.0.Final/standalone"

export JAVA_HOME="/usr/"
export CLASSPATH=.:./classes:$HOME/classes
==========end of environment variables setup====================================



===========Compilation steps for executing the Investment-Client (GetInvestmentDetails.java)===============
cd Investment-Client/src

wsconsume.sh -k http://uml.cs.uga.edu:8080/Divya_Marneni_move/MoveInvestment?wsdl
(The .java and .class files related to MoveInvestment service will be formed in the output folder)

javac -cp output -d output ./Client/GetInvestmentDetails.java

cd output
java Client.GetInvestmentDetails

Enter any values like USD, INR, AFA, GBP etc from the Currency class enum values

======The result for 1000 shares of all companies will be returned in the given currency========================


