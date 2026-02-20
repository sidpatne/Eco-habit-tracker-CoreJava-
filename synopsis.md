EcoHabit
Enterprise-Style MVC Console Application (Core Java)
1. Executive Summary

EcoHabit is a layered, modular Core Java console application that demonstrates a clean separation of concerns using an MVC-inspired architecture and a Repository pattern implementation.

The application enables full CRUD lifecycle management of eco-friendly habits through a console-based interface while maintaining architectural discipline typically found in enterprise-grade systems.

Although lightweight and in-memory, the structure mirrors scalable production systems and can be easily extended to support persistent storage or RESTful APIs.

2. Architectural Overview

The system follows a simplified Layered Architecture aligned with enterprise best practices:

Presentation Layer (Console View)
        ↓
Application Layer (Controller)
        ↓
Domain Layer (Model)
        ↓
Data Access Layer (Repository)
Architectural Principles Applied

Separation of Concerns (SoC)

Single Responsibility Principle (SRP)

Repository Pattern

Layered Architecture

Dependency Direction (UI → Controller → Repository → Model)

The application avoids tight coupling between layers, ensuring maintainability and testability.

3. Package Structure
com.ecohabit.model

Purpose: Domain layer (business entity representation)

EcoHabit

Encapsulates the core domain state

Maintains data integrity via controlled access (getters/setters)

Overrides toString() for formatted output

Serves as the central business object

Responsibilities:

Represent eco habit attributes (e.g., id, name, description, frequency, status)

Remain persistence-agnostic

Contain no UI or repository logic

com.ecohabit.repository

Purpose: Data Access Layer abstraction (in-memory implementation)

EcoHabitRepository

Provides full CRUD operations:

create(EcoHabit habit)

findById(int id)

findAll()

update(EcoHabit habit)

delete(int id)

Uses an in-memory data structure (e.g., List<EcoHabit> or Map<Integer, EcoHabit>)

Simulates persistence behavior

Design Considerations:

Centralized data management

Replaceable with JDBC / JPA without affecting upper layers

Encapsulates storage logic

This structure makes migration to a relational database or NoSQL system straightforward.

com.ecohabit.app

Purpose: Presentation and Application orchestration

Controller

Acts as the application service layer

Coordinates between repository and view

Validates input before delegating to repository

Manages business flow logic

Console View

Handles user interaction

Displays menu-driven options

Collects and sanitizes input

Formats output for readability

App (Main Entry Point)

Bootstraps application components

Initializes repository and controller

Starts the execution loop

4. Data Flow

Example: Create Habit

User selects "Create Habit"

Console View collects input

Controller validates input

Repository stores entity in memory

View confirms successful operation

All operations follow this same structured flow, ensuring clean interaction boundaries.

5. Design Patterns Implemented
1. MVC (Adapted for Console Environment)

Model → EcoHabit

View → Console interface

Controller → Application coordinator

2. Repository Pattern

Encapsulates data access logic to:

Decouple business logic from storage

Enable easy transition to persistent storage

3. Layered Architecture

Ensures:

Scalability

Maintainability

Replaceable infrastructure components

6. Non-Functional Considerations
Concern	Implementation Approach
Maintainability	Clear package boundaries
Extensibility	Replaceable repository layer
Testability	Decoupled layers
Simplicity	No external dependencies
Performance	O(1) or O(n) in-memory operations
7. Scalability Roadmap

This architecture supports enterprise-level evolution:

Phase 1 – Persistence

Introduce DAO interface

Implement JDBC repository

Add connection pooling

Phase 2 – REST API Layer

Convert controller into service layer

Introduce Spring Boot

Expose REST endpoints

Phase 3 – Production Hardening

Logging framework (SLF4J + Logback)

Validation layer

Exception hierarchy

Unit & integration tests (JUnit + Mockito)

CI/CD integration

8. Example Execution Flow
=== EcoHabit Tracker ===
1. Add Habit
2. View All Habits
3. View Habit by ID
4. Update Habit
5. Delete Habit
6. Exit

The application runs in a continuous loop until the user exits.

9. Technology Stack

Java (Core / Standard Edition)

No external frameworks

In-memory data storage

Console-based UI

10. Target Audience

This project is particularly suited for:

Junior Java developers

Students learning layered architecture

Developers preparing for technical interviews

Engineers demonstrating architectural discipline without frameworks

11. Key Takeaways

EcoHabit demonstrates that even a small console application can:

Follow enterprise architectural principles

Maintain strict separation of concerns

Be designed for scalability

Remain clean, readable, and extensible

It is intentionally minimal in infrastructure but structurally aligned with production-grade application design.
