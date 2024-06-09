Ferramentas e Tecnologias Utilizadas

Spring Tool Suite
O projeto foi inicialmente criado utilizando o Spring Tool Suite, uma IDE baseada no Eclipse, otimizada para o desenvolvimento de aplicações Spring.

Java
O código do projeto foi escrito em Java. Foram criadas as classes Marca e Modelo, que foram relacionadas entre si.

Docker
Para o banco de dados, optamos por utilizar o Docker. O Docker nos permite contêinerizar o banco de dados, o que facilita a portabilidade e a configuração do ambiente de desenvolvimento.

DBeaver
Para interagir com o banco de dados, utilizamos o DBeaver, uma ferramenta de banco de dados universal que nos permite visualizar, editar e gerenciar nossos bancos de dados.

Postman
Para testar a API, utilizamos o Postman. Com o Postman, fomos capazes de enviar solicitações GET, POST, PUT e DELETE para a nossa API e verificar as respostas.



PASSO A PASSO:

Clone o Repositório: Primeiro, clone o repositório do GitHub para sua máquina local usando o comando git clone.

Instale as Dependências: Navegue até a pasta do projeto e instale o Maven, pode usar o comando mvn install.

Inicie o Banco de Dados:O projeto usa um banco de dados Docker, inicie o contêiner do Docker com o comando apropriado. Certifique-se de que o banco de dados esteja configurado corretamente e funcionando antes de iniciar o aplicativo.

Inicie o Aplicativo: Inicie o aplicativo Spring Boot. Se você estiver usando o Spring Tool Suite, pode fazer isso diretamente da IDE. Caso contrário, pode usar o comando mvn spring-boot:run.

Teste a API: Agora que o aplicativo está em execução, você pode testar a API usando o Postman. Importe a coleção Postman fornecida com o projeto e execute as solicitações. Certifique-se de que todas as solicitações GET, POST, PUT e DELETE estejam retornando as respostas esperadas.
