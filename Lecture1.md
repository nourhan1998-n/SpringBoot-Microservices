## Lecture 1 

### 1. **Microservices concepts**:
   - Microservices architecture is a design pattern that structures an application as a collection of small, independent services. These services are typically deployed and managed separately but work together to provide the full functionality of the application.

### 2. **Modeling microservices**:
   - This involves breaking down an application into separate services, each focused on a specific business domain. Proper modeling ensures that each microservice has a clear purpose and minimal dependencies on other services.

### 3. **Splitting the monolith**:
   - When transitioning from a monolithic application (where all components are tightly coupled), splitting the monolith refers to the process of decoupling the application into independent services. The challenge lies in deciding how to break it apart while maintaining functionality.

### 4. **Communication styles**:
   - Microservices typically communicate using network protocols like HTTP/REST, gRPC, or messaging queues. Asynchronous and synchronous communication models can be used depending on the service interaction requirements.

### 5. **Distributed transactions**:
   - Handling transactions across multiple microservices requires strategies like the Saga pattern or two-phase commit. These approaches help maintain data consistency without relying on traditional database transactions.

### 6. **Building and deployment**:
   - Continuous integration and continuous deployment (CI/CD) pipelines are often used to automate the building, testing, and deployment of microservices. Each microservice can be deployed independently, which allows for faster releases and updates.

### 7. **Testing microservices**:
   - Microservices introduce complexity in testing, as services need to be tested both in isolation (unit tests) and together (integration and contract tests). Tools for API testing and mocking service dependencies are crucial.

### 8. **Monitoring & observability**:
   - Monitoring microservices is essential for maintaining the health of the application. Observability involves tracking metrics, logging, and tracing to diagnose performance issues or failures.

### 9. **Security**:
   - Each microservice must handle authentication, authorization, and data protection independently. Security best practices include using API gateways, securing inter-service communication, and applying encryption where necessary.

### 10. **Resiliency**:
    - Microservices should be resilient to failures, meaning if one service fails, the entire system should not crash. Techniques like retries, circuit breakers, and failover mechanisms are used to ensure high availability.

### 11. **Scalability**:
    - One of the main advantages of microservices is the ability to scale individual services as needed. Horizontal scaling (adding more instances of a service) is commonly used to handle increased load efficiently.

***

