## Lecture 3
### Monolith vs Microservices

- **Monolith**:
  - A monolithic application is built as a single, unified unit. It contains all the modules (e.g., user interface, business logic, and data access layers) tightly coupled together and runs as one executable.
  - **Example**: A typical web application where the UI, data handling, and backend logic are part of the same project and deployed together.
  - **Advantages**:
    - Simple to develop for smaller teams and projects.
    - Easier to test and deploy since everything is contained in one unit.
    - Lower initial infrastructure cost.
  - **Disadvantages**:
    - Hard to maintain as the application grows—small changes can have unintended side effects.
    - Scaling requires the whole application to scale together, even if only one part (like a specific module) needs it.
    - Long development and deployment cycles, since updating a single feature involves redeploying the entire application.

- **Microservices**:
  - Microservices architecture breaks down the monolithic application into smaller, independent services, each handling a specific piece of functionality (e.g., user management, product catalog, payment service).
  - **Example**: An e-commerce platform where different services handle the shopping cart, product details, payment, and order history separately.
  - **Advantages**:
    - Services can be developed, deployed, and scaled independently.
    - Improves fault isolation—if one service fails, others can still function.
    - Teams can work on different services simultaneously, increasing development speed.
    - Technology diversity: each service can be built using different programming languages or frameworks, depending on what fits the use case best.
  - **Disadvantages**:
    - Increased complexity in managing and deploying services, requiring better DevOps practices and tooling (e.g., containers, orchestration tools like Kubernetes).
    - Distributed system issues such as network latency, debugging challenges, and inter-service communication failures.
    - Requires robust monitoring, security, and service orchestration.

---

### Microservices Characteristics

1. **Independently Deployable**:
   - Each microservice can be deployed without affecting others, allowing faster and more flexible updates.
   
2. **Focused on a Single Responsibility**:
   - Microservices are designed around specific business capabilities. This single responsibility principle makes the service easier to maintain and test.

3. **Decentralized Data Management**:
   - Each service typically manages its own data, avoiding a single shared database. This aligns services closely with the business domain but can complicate data consistency across the system.

4. **Communication via APIs**:
   - Services interact with each other over well-defined APIs, often using REST or messaging systems (e.g., RabbitMQ, Kafka). They maintain independence by communicating asynchronously or synchronously.

5. **Scalability**:
   - Individual services can be scaled independently. For instance, if the "payment service" experiences high load, it can be scaled without scaling the entire application.

6. **Polyglot Programming**:
   - Each service can be developed using the programming language or framework that best suits its requirements. This allows teams to choose the best tools for each specific problem.

7. **Resilience**:
   - Built with fault tolerance in mind. Techniques like circuit breakers, retries, and fallbacks ensure that the system continues to operate even if one microservice fails.

---

### Microservices Advantages & Disadvantages

**Advantages**:

- **Faster Time to Market**:
  - Since microservices allow independent development, teams can release features or updates more quickly.

- **Improved Fault Isolation**:
  - Failure in one service (e.g., payment) doesn't necessarily crash the entire system (e.g., product catalog remains accessible).

- **Scalability**:
  - Only the services that need to scale (due to traffic) can be scaled without increasing the system’s overall footprint, making scaling more efficient and cost-effective.

- **Technology Flexibility**:
  - Teams can choose the best-suited technology stack per service, which allows the adoption of modern, more efficient solutions as needed.

- **Autonomous Teams**:
  - Teams can work independently on different services, improving productivity and reducing dependencies among teams.

**Disadvantages**:

- **Operational Complexity**:
  - Requires advanced infrastructure management. Each service needs to be monitored, managed, and scaled separately, which increases complexity.

- **Data Consistency Challenges**:
  - Since microservices manage their own databases, maintaining data consistency across services (especially during transactions) is more difficult. Techniques like event sourcing or eventual consistency need to be employed.

- **Increased Communication Overhead**:
  - Services need to communicate over the network, which introduces latency and the risk of communication failures, especially in large-scale distributed systems.

- **Debugging and Testing**:
  - It's more challenging to trace issues across multiple services. Distributed tracing tools (e.g., Zipkin) are essential to understand service interactions.

- **Security Concerns**:
  - Every microservice must be secured individually, requiring robust authentication and authorization across services.

---

### Modelling Microservices

1. **Domain-Driven Design (DDD)**:
   - Start by understanding the business domains and defining services around them. Each microservice should represent a specific bounded context (a clearly defined domain or business capability).
   - **Example**: For an e-commerce site, separate services for "user management," "inventory management," "order processing," and "payment processing."

2. **Decompose the Monolith**:
   - Identify the modules within a monolithic system that can be split out into microservices. This often starts by breaking off less critical or simpler functionality.
   - **Example**: Instead of one massive application, break out user authentication into a separate service, followed by order management, etc.

3. **Decouple by Business Capability**:
   - Services should be designed to focus on specific business functionality rather than technical concerns. Each service should represent an independent part of the business.
   - **Example**: An insurance application might have separate services for "claims processing," "policy management," and "customer support."

4. **Single Responsibility Principle**:
   - Each microservice should do one thing well. Ensure that it handles only one part of the application’s functionality.

5. **Event-Driven Design**:
   - Model microservices to react to events. When one service changes state, it emits an event that other services can respond to. This decouples services and supports eventual consistency across the system.
   - **Example**: In an online store, when an order is placed, the "Order Service" emits an event that triggers the "Payment Service" and "Inventory Service" to act.

6. **Versioning**:
   - Ensure API versioning so that different versions of the same service can coexist, allowing gradual updates and changes without disrupting other services.

7. **Scalability Considerations**:
   - Some services will require more frequent scaling (e.g., those handling requests from customers). Separate services by their scaling needs to allow efficient resource allocation.

 ***
