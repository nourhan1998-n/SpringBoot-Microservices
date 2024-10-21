 
### 1. **Database Transactions:**
   - A database transaction is a **unit of work** performed within a database management system. It is often composed of multiple operations (like inserts, updates, or deletes) that need to be executed together as a whole.
   - A transaction typically ends with a **commit** (save changes) or a **rollback** (revert to the previous state).

### 2. **ACID Transactions:**
   - ACID properties ensure that database transactions are processed reliably:
     - **Atomicity**: Ensures that all operations within a transaction are completed; if one operation fails, the entire transaction fails.
     - **Consistency**: Ensures that a transaction brings the database from one valid state to another.
     - **Isolation**: Ensures that transactions are executed in isolation from one another, preventing them from affecting each other's outcome.
     - **Durability**: Once a transaction is committed, the changes are permanent, even in the event of a system failure.

### 3. **Two-Phase Commit (2PC):**
   - A protocol used to ensure **atomicity** in distributed systems where multiple nodes or services are involved in a transaction.
   - **Phase 1 (Prepare phase)**: The coordinator sends a request to all participants to prepare the transaction and report if they are ready to commit.
   - **Phase 2 (Commit phase)**: If all participants are ready, the coordinator sends a commit message. If any participant is not ready, a rollback is initiated to maintain consistency.

### 4. **Saga:**
   - A **Saga** is a pattern used to manage **distributed transactions** in a microservices architecture. Instead of using a two-phase commit, the saga pattern breaks the transaction into smaller, independent transactions.
   - Each step of the saga has a corresponding **compensation** step to undo the work in case of failure.
   - This pattern is useful in systems where 2PC would be too complex or slow.

