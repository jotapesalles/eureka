## **Projeto de Tarefas com Eureka Server e gerenciamento de API Gateway**

### **Introdução**

Este projeto demonstra a utilização do Eureka Server como serviço de registro em uma arquitetura de microserviços. Ele contém os seguintes serviços:

  * **Eureka Server:** O coração da aplicação, responsável por registrar e descobrir outros serviços.
  * **User Service:** Serviço responsável por gerenciar usuários.
  * **Task Service:** Serviço responsável por gerenciar tarefas.
  * **Notification Service:** Serviço responsável por enviar notificações.
  * **API Gateway:** Serviço responsável por gerenciar as requisições.

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
    A partir do repositório raiz:
    
    ```bash
    cd user-service
    ./mvnw spring-boot:run
    ```
    ```bash
    cd task-service
    ./mvnw spring-boot:run
    ```
    ```bash
    cd notification-service
    ./mvnw spring-boot:run
    ```
    ```bash
    cd api-gateway
    ./mvnw spring-boot:run
    ```

6.  **Acesse o Eureka Server:**

    Abra um navegador e acesse `http://localhost:8761`. Você verá uma lista dos serviços registrados.

7  **Acesse o API Gateway:**

   Abra um navegador e acesse `http://localhost:8084`. Você terá acesso as chamadas a partir da URI cadastradas:
   * **http://localhost:8084/users:** API responsável por gerenciar usuários.
   * **http://localhost:8084/tasks:** API responsável por gerenciar tarefas.
   * **http://localhost:8084/notifications:** API responsável por enviar notificações.
     
### **Observações:**

  * **Porta:** Por padrão, o Eureka Server utiliza a porta 8761. Você pode alterar essa porta no arquivo `application.yml` do serviço Eureka.
  * **Configuração:** Verifique os arquivos `application.properties` de cada serviço para garantir que a URL do Eureka Server esteja configurada corretamente.
  * **Discovery Client:** Os serviços clientes utilizam o Eureka Discovery Client para se registrar no servidor e descobrir outros serviços.

### **Como Observar as Instâncias**

  * **Acesso ao Eureka Dashboard:** Ao acessar `http://localhost:8761`, você verá um painel com a lista de instâncias registradas, incluindo o nome do serviço, a instância ID, o status e outras informações relevantes.
