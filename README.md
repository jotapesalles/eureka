## **Projeto de Tarefas com Eureka Server**

### **Introdução**

Este projeto demonstra a utilização do Eureka Server como serviço de registro em uma arquitetura de microserviços. Ele contém os seguintes serviços:

  * **Eureka Server:** O coração da aplicação, responsável por registrar e descobrir outros serviços.
  * **Notification Service:** Serviço responsável por enviar notificações.
  * **Task Service:** Serviço responsável por gerenciar tarefas.
  * **User Service:** Serviço responsável por gerenciar usuários.

### **Pré-requisitos**

  * **Java Development Kit (JDK):** Versão 21 ou superior.
  * **Maven:** Ferramenta de gerenciamento de dependências.

### **Instalação e Execução**

1.  **Clone o repositório:**

    ```bash
    git clone git@github.com:jotapesalles/eureka.git
    ```

2.  **Navegue para o diretório do projeto:**

    ```bash
    cd eureka
    ```

3.  **Construa e execute o Eureka Server:**

    ```bash
    cd eureka-server
    ./mvnw spring-boot:run
    ```

4.  **Construa e execute os serviços clientes:**

    ```bash
    # Para cada serviço cliente (notification-service, task-service, user-service)
    cd notification-service
    ./mvnw spring-boot:run

    # Repita o processo para os outros serviços
    ```

5.  **Acesse o Eureka Server:**

    Abra um navegador e acesse `http://localhost:8761`. Você verá uma lista dos serviços registrados.

### **Observações:**

  * **Porta:** Por padrão, o Eureka Server utiliza a porta 8761. Você pode alterar essa porta no arquivo `application.properties` do serviço Eureka.
  * **Configuração:** Verifique os arquivos `application.properties` de cada serviço para garantir que a URL do Eureka Server esteja configurada corretamente.
  * **Discovery Client:** Os serviços clientes utilizam o Eureka Discovery Client para se registrar no servidor e descobrir outros serviços.

### **Como Observar as Instâncias**

  * **Acesso ao Eureka Dashboard:** Ao acessar `http://localhost:8761`, você verá um painel com a lista de instâncias registradas, incluindo o nome do serviço, a instância ID, o status e outras informações relevantes.
