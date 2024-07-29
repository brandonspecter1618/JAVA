Connector J for Eclipse 

1 = Clique com o botão direito e vá em Build Path depois Configure Build Path...

2 = Clique no menu acima em Libraries depois clique em Modulepath

3 = Depois Add External JARs...

4 = Em seguida selecione o arquivo desejado mysql-connector-java-8.0.28

Obs: Para o software Connector 8.0.28 é importante utilizar no código 

Class.forName("com.mysql.cj.jdbc.Driver");  "Com a adição do 'cj'"

Já para as versões antigas como por exemplo mysql-connector-java-5.1.39

é necessário seguir o padrão antigo na declaração do drive no código

Class.forName("com.mysql.jdbc.Driver");