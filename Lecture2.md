## Lecture 2
### 1. **Good Microservices Boundaries**:
   - Defining proper boundaries between microservices is critical. Good boundaries ensure that each microservice focuses on a single responsibility and minimizes dependencies with other services. A clear boundary allows independent development, deployment, and scalability.

### 2. **Information Hiding**:
   - This principle involves encapsulating the internal details of a microservice and exposing only what’s necessary through well-defined interfaces (APIs). Information hiding reduces the risk of unintentional coupling between services and provides flexibility to modify internal implementations without affecting others.

### 3. **Cohesion**:
   - Cohesion refers to how closely related and focused the responsibilities of a microservice are. High cohesion ensures that each service has a single, well-defined purpose and that all its functions are directly related to that purpose. This leads to better maintainability and clarity in the system.

### 4. **Coupling**:
   - Coupling measures how much one microservice depends on another. Low coupling is desired in microservices because it enables individual services to evolve and change independently without impacting other services. Loose coupling allows for better flexibility, scalability, and fault tolerance.

### 5. **Domain-Driven Design (DDD)**:
   - DDD is an approach to software design where the structure and language of the code align closely with business domains. In the context of microservices, DDD helps to design services around business capabilities, ensuring that each service has a clear boundary and reflects a specific domain.

### 6. **Alternatives to Business Domain Boundaries**:
   - While business domain boundaries (as in DDD) are common for defining microservices, alternatives such as technical boundaries (e.g., front-end, database, etc.) or functional boundaries (e.g., user management, payment processing) can also be used depending on the use case and system requirements.

***
