# Elemental Explorer: Periodic Table Game

## I. Project Overview
**Elemental Explorer** is an interactive educational game designed to test and enhance the player's knowledge of the periodic table. Through engaging gameplay, users can answer questions about chemical elements, including their symbols and atomic numbers. The game also features a study area for self-paced learning, score tracking, and a retry option for improving performance.

---

## II. Application of OOP Principles
### 1. Abstraction
- **Simplified Interfaces**: The program abstracts complex details of element management and question generation.
- **Abstract Class**: The `Question` class serves as a blueprint for creating specific question types (e.g., `AtomicNumberQuestion`, `SymbolQuestion`).

### 2. Encapsulation
- **Data and Behavior Encapsulation**:
  - **`Element` Class**: Encapsulates properties like `name`, `symbol`, and `atomicNumber` with private access and public getter methods.
  - **`PeriodicTableGame` Class**: Encapsulates game state (`score`, `questionCount`) and manages game flow through public methods.

### 3. Inheritance
- **Extending Functionality**:
  - The `Question` class is extended by `AtomicNumberQuestion` and `SymbolQuestion` to implement specialized question logic.
  - The `PeriodicTableGame` class extends `JFrame` to inherit graphical user interface (GUI) capabilities.

### 4. Polymorphism
- **Dynamic Behavior**:
  - The abstract `generate()` method in `Question` is overridden by subclasses for specific question logic.
  - The `askQuestion()` method interacts generically with any `Question` type, ensuring extensibility.

### 5. Composition
- **Modular Design**:
  - Each question type (e.g., `AtomicNumberQuestion`, `SymbolQuestion`) holds a reference to an `Element` object.
  - The `ElementRepository` serves as a centralized source of periodic table data, promoting modular and reusable logic.

---

## III. Sustainable Development Goal (SDG) Integration
### **SDG Goal 4: Quality Education**
This project supports **SDG 4** by promoting science education through interactive learning.  
- **Educational Value**: Engages users in learning chemical elements in a fun and memorable way.  
- **Accessibility**: The study area enables users to explore the periodic table independently.  
- **Retention**: Testing with immediate feedback enhances knowledge retention of periodic table facts.  

---

## IV. Instructions for Running the Program

### **Requirements**
- **Java Development Kit (JDK)**: Version 8 or later.
- A **Java IDE** (e.g., IntelliJ IDEA, Eclipse) or command-line tools for running Java programs.

### **Steps to Run**
1. **Clone or Download the Repository**  
   Download the project files or clone the repository using the command:
   ```bash
   git clone https://github.com/your-repo/PeriodicTableGame.git
