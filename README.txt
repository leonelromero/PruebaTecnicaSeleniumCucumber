Proyecto de Automatización E2E
Este proyecto es una automatización de pruebas end-to-end (E2E) utilizando Selenium, Cucumber, Maven e IntelliJ IDEA.

Prerrequisitos
Asegúrate de tener instalados los siguientes componentes en tu máquina:

- Java JDK 11 o superior: Descargar e instalar JDK
- Maven: Instalar Maven
- IntelliJ IDEA: Descargar IntelliJ IDEA
- Git: Instalar Git

Clonar el Proyecto
Sigue estos pasos para clonar el repositorio:
-Abre tu terminal o consola de comandos.
-Ejecuta el siguiente comando para clonar el repositorio:
-git clone https://github.com/leonelromero/PruebaTecnicaSeleniumCucumber.git

Navega al directorio del proyecto:
cd PruebaTecnicaSeleniumCucumber

Importar el Proyecto en IntelliJ IDEA
-Abre IntelliJ IDEA.
-Selecciona File > Open....
-Navega hasta la carpeta donde clonaste el proyecto y selecciona el archivo pom.xml.
-IntelliJ IDEA detectará automáticamente el proyecto Maven y lo configurará.

Ejecutar las Pruebas
-Puedes ejecutar las pruebas de las siguientes maneras:

Usando IntelliJ IDEA
-Navega al archivo Testrunner.java dentro de la siguiente ruta ./src/test/java/runner/Testrunner.java
-Haz clic derecho sobre el archivo y selecciona Run 'Runner'.

Usando Maven
-Abre tu terminal y navega a la raíz del proyecto.
-Ejecuta el siguiente comando:
-mvn clean test

Resultados
Los resultados de las pruebas se generarán en el directorio ./resources/report-Cucumber/report.html. Puedes abrir los archivos .html para ver un reporte detallado.

Problemas Comunes
Error de configuración de Java: Asegúrate de que la variable de entorno JAVA_HOME esté configurada correctamente.
Error al resolver dependencias: Ejecuta mvn clean install para descargar todas las dependencias necesarias.