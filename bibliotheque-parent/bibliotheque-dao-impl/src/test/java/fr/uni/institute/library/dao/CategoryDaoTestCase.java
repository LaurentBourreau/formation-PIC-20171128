<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>fr.uni.institute.library</groupId>
  <artifactId>bibliotheque-parent</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>pom</packaging>
  <name>bibliotheque-parent</name>
  <description>Le projet parent qui assure l'heritage de la conf pour l'ensemble des sous modules</description>
   
  
  <reporting>   
  <plugins>  
  			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>cobertura-maven-plugin</artifactId>
				<version>2.7</version>
			</plugin>  
  </plugins>
  
  
  </reporting>
  
  
  
  
   <dependencies>  
  <!-- https://mvnrepository.com/artifact/log4j/log4j -->
	<dependency>
	    <groupId>log4j</groupId>
	    <artifactId>log4j</artifactId>
	    <version>1.2.16</version>
	</dependency>  
	
	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.12</version>
	    <scope>test</scope>
	</dependency>
	
		
	  
  </dependencies>
  
  
  
  
   <modules>
   	<module>bibliotheque-modele</module>
   	<module>bibliotheque-dao-api</module>
   	<module>bibliotheque-dao-impl</module>
   	<module>bibliotheque-service-api</module>
   	<module>bibliotheque-service-impl</module>
    <module>bibliotheque-web</module>
  </modules>
  
  
  <build>
	  <plugins>
	  	<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.19.1</version>
				<configuration>
					<parallel>methods</parallel>
					<threadCount>10</threadCount>
					<excludes>
						<exclude>**/*ITestCase*</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-failsafe-plugin</artifactId>
				<version>2.19.1</version>
				<executions>
					<execution>
						<id>integration-test</id>
						<goals>
							<goal>integration-test</goal>
						</goals>
					</execution>
					<execution>
						<id>verify</id>
						<goals>
							<goal>verify</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<includes>
						<include>**/*ITestCase*</include>
					</includes>
				</configuration>
</plugin>
	  
	  </plugins>
  
  
  
  
  
  </build>
  
  
</project>