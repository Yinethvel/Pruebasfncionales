# **Description**
Se realiza automatización de pruebas sobre verificación de actualizaciones 
de Php y WordPress.

**Prueba de automatización**

# POM.xml
```console
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>Pruebas.Automatizadas</groupId>
    <artifactId>Pruebas.Automatizadas</artifactId>
    <version>1.0.0</version>
    <name>Pruebas.Automatizadas</name>


    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <serenity.version>2.0.11</serenity.version> <!-- https://bintray.com/serenity/maven/serenity-core/ -->
        <serenity.maven.version>2.0.11</serenity.maven.version>
        <serenity.cucumber.version>1.9.31
        </serenity.cucumber.version> <!-- https://bintray.com/serenity/maven/serenity-cucumber/ -->
        <surefire.plugin.version>2.22.1</surefire.plugin.version>
    </properties>
    <repositories>
        <repository>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            <id>central</id>
            <name>bintray</name>
            <url>http://jcenter.bintray.com</url>
        </repository>
    </repositories>
    <pluginRepositories>
        <pluginRepository>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            <id>central</id>
            <name>bintray-plugins</name>
            <url>http://jcenter.bintray.com</url>
        </pluginRepository>
    </pluginRepositories>
    <dependencies>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>${serenity.version}</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-junit</artifactId>
            <version>${serenity.version}</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay</artifactId>
            <version>${serenity.version}</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-api -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-api</artifactId>
            <version>3.14.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>3.17</version>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>3.17</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-rest-assured</artifactId>
            <version>${serenity.version}</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-cucumber</artifactId>
            <version>${serenity.cucumber.version}</version>
        </dependency>
        <!-- OK -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-simple</artifactId>
            <version>1.7.7</version>
        </dependency>
        <dependency>
            <groupId>org.codehaus.groovy</groupId>
            <artifactId>groovy-all</artifactId>
            <version>1.8.6</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.8.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-all</artifactId>
            <version>1.3</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>2.3.1</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>2.3.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-jvm</artifactId>
            <version>2.0.0</version>
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>net.sourceforge.jtds</groupId>
            <artifactId>jtds</artifactId>
            <version>1.3.1</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>

            <plugin>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>2.21.0</version>
                <configuration>
                    <includes>
                        <include>**/test/**/*.java</include>
                    </includes>
                    <systemPropertyVariables>
                        <webdriver.base.url>${webdriver.driver}</webdriver.base.url>
                        <surefire.security.manager>java.lang.SecurityManager</surefire.security.manager>
                    </systemPropertyVariables>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.maven.version}</version>
                <dependencies>
                    <dependency>
                        <groupId>net.serenity-bdd</groupId>
                        <artifactId>serenity-core</artifactId>
                        <version>${serenity.version}</version>
                    </dependency>
                </dependencies>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```
the pom.xml file for the automation script is as follows:
## Ejecutar el script de automatización
Para ejecutar el script de automatización se debe lanzar el siguiente comando por consola apuntando a la ruta donde se encuentre el proyecto.

```console
mvn clean validate verify  -Dcucumber.options="--tags @AutomatizacionOpenSourcecms"
```
## Report


después de ejecutar el comando, se creará una carpeta donde se almacenará el informe de prueba


la ruta donde se encuentra el informe es [../target/sites/serenity](../target/sites/serenity)

T
Para ver el informe generado, se debe abrir el archivo llamado [index.html](../target/sites/serenity/index.html) 
debe ser abierto por cualquier navegador web.

El informe debe verse de la siguiente manera:
![](../src/test/resources/report.png)
