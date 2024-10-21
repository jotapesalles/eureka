# Projeto de Tarefas com Eureka Server

## Introdução

Este projeto demonstra a utilização do **Eureka Server** como serviço de registro em uma arquitetura de microserviços. Ele contém os seguintes serviços:

- **Eureka Server**: O coração da aplicação, responsável por registrar e descobrir outros serviços.
- **Notification Service**: Serviço responsável por enviar notificações.
- **Task Service**: Serviço responsável por gerenciar tarefas.
- **User Service**: Serviço responsável por gerenciar usuários.

## Pré-requisitos

- **Java Development Kit (JDK)**: Versão 21 ou superior.
- **Maven**: Ferramenta de gerenciamento de dependências.
- **Docker** e **Docker Compose**: Para executar os serviços em contêineres.

## Instalação e Execução

### Clone o repositório:

```bash
git clone git@github.com:jotapesalles/eureka.git
```

### Navegue para o diretório do projeto:

```bash
cd eureka
```

### Executar com Docker Compose

Todos os serviços estão configurados para serem executados como contêineres Docker. Utilize o comando abaixo para subir o ambiente completo:

1. Verifique se o Docker está instalado e em execução.
2. No diretório raiz do projeto, execute o seguinte comando:

```bash
docker compose up --build
```

### Serviços

- **Eureka Server** será iniciado na porta `8761`.
- **User Service** será iniciado na porta `8081`.
- **Task Service** será iniciado na porta `8082`.
- **Notification Service** será iniciado na porta `8083`.

### Acesse o Eureka Server:

Abra um navegador e acesse [http://localhost:8761](http://localhost:8761). Você verá uma lista dos serviços registrados.

### Parar os contêineres:

Para parar e remover os contêineres criados pelo Docker Compose, execute:

```bash
docker compose down
```

### Observações:

- **Porta**: Por padrão, o Eureka Server utiliza a porta `8761`. Você pode alterar essa porta no arquivo `application.yaml` do serviço Eureka.
- **Configuração**: Verifique os arquivos `application.yaml` de cada serviço para garantir que a URL do Eureka Server esteja configurada corretamente.
- **Discovery Client**: Os serviços clientes utilizam o Eureka Discovery Client para se registrar no servidor e descobrir outros serviços.

### Como Observar as Instâncias

Acesse o **Eureka Dashboard**: Ao acessar [http://localhost:8761](http://localhost:8761), você verá um painel com a lista de instâncias registradas, incluindo o nome do serviço, a instância ID, o status e outras informações relevantes.
```

Basta copiar o conteúdo acima para um arquivo chamado `README.md` no seu projeto.