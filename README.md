# *Teste back-end processo seletivo CINQ.

WebServ em SpringBoot com função RESTful de GET para listar cidades de um país selecionado através de um parâmetros URL.

Para executar o serviço basta ter java instalado no computador e varíavel de ambiente configurada com JAVA_HOME.

Verifique se a variável de ambiente está configurada digitando o seguinte comando no CMD:

**java -version**

**java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)

Caso não esteja, esse é procedimento para a configuração: https://mkyong.com/java/how-to-set-java_home-on-windows-10/

Windows:

Abra o CMD, acesse a pasta onde clonou o projeto utilizando o comando 'cd', 
no meu caso fica na pasta usuários na pasta workspace do eclipe:

>**cd eclipse-workspace/teste-cinq-spring-rest**

Verifique se o arquivo **'target'** está no projeto:

>**dir**

 **O volume na unidade C não tem nome.
 O Número de Série do Volume é FE3E-3F31
 Pasta de C:\Users\tiago.ribeiro.safetycontrol.000\eclipse-workspace\teste-cinq-spring-rest
08/05/2020  14:35    <DIR>          .
08/05/2020  14:35    <DIR>          ..
07/05/2020  13:44             1.268 .classpath
07/05/2020  13:43               333 .gitignore
07/05/2020  13:43    <DIR>          .mvn
07/05/2020  13:44               935 .project
07/05/2020  13:44    <DIR>          .settings
07/05/2020  13:43             1.329 HELP.md
07/05/2020  13:43            10.070 mvnw
07/05/2020  13:43             6.608 mvnw.cmd
08/05/2020  11:30             2.098 pom.xml
08/05/2020  14:36                11 README.md
07/05/2020  13:43    <DIR>          src
08/05/2020  11:22    <DIR>          target
               8 arquivo(s)         22.652 bytes
               6 pasta(s)    1.651.359.744 bytes disponíveis
 
Agora executa o Serviço utilizando o comando Java

**java -jar target\spring-jpa-jersey-2.2.7.RELEASE.jar**

