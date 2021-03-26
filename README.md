## Vamos Começar

1. Clone o repositório.
2. Entre no repositório clonado.
3. Abra o bash, e digite `mvn clean install` para instalar as dependencias do projeto.
4. Digite `mvn spring-boot:run` para rodar o programa.
5. Irá levantar na porta 8080.
6. Todos os arquivos CSV que você deseja ultilizar devem estar na pasta data.
7. Depois que o processo estiver rodando, o seu endpoint vai ficar diponivel na rota "http://localhost:8080/sincronizacao/" + o nome do arquivo CSV que você deseja sincronizar
Exemplo: "http://localhost:8080/sincronizacao/relatorio".
8. O arquivo processado irá estar dentro da pasta data/out.
9. O nome do arquivo processado é o nome do seu arquivo + a palavra Out
Exemplo: relatorioOut.csv.

## Pre requisitos

- Java 8 ou superior
- Maven
