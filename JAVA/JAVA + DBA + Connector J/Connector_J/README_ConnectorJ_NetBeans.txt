Connector J for NetBeans 

Project Maven:

1 = Clique com o botão direito do mouse, e vá em Add Dependency

2 = Em Group ID digite: mysql

3 = Em Artifact ID: mysql-connector-java

4 = Em Version: 8.0.29

5 = Em seguida clique em Add. 

######################################################################

Project Ant

1 = Clique com o botão direito em Libraries dentro do projeto, e vá ADD JAR/Folder

2 = Escolha o arquivo e clique em abrir.

Outro Metódo

1 = Clique na raiz do projeto com o botão direito do mouse e clique em Properties

2 = Vá em Libraries, depois clique no sinal de mais em Classpath.

3 = Adicione o arquivo e depois clique em abrir. 

######################################################################


Obs: Para o software Connector 8.0.28 é importante utilizar no código 
Class.forName("com.mysql.cj.jdbc.Driver");  "Com a adição do 'cj'"
Já para as versões antigas como por exemplo mysql-connector-java-5.1.39
é necessário seguir o padrão antigo na declaração do drive no código

Class.forName("com.mysql.jdbc.Driver");