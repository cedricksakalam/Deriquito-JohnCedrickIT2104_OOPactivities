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

---

## III. Sustainable Development Goal (SDG) Integration

This project supports **Sustainable Development Goal 4: Quality Education** by creating an inclusive and equitable platform for science education through gamification. **Elemental Explorer** transforms the study of the periodic table into an interactive and enjoyable experience, making it more engaging and effective.

The game fosters active learning by encouraging players to recall and apply their knowledge of chemical elements, with immediate feedback to enhance understanding and retention. Additionally, the study area provides users with the opportunity to learn at their own pace, offering unrestricted access to explore and master the periodic table.

By blending education and entertainment, **Elemental Explorer** promotes critical thinking and scientific literacy. It empowers students and enthusiasts to deepen their chemistry knowledge in a way that is not only meaningful but also fun and memorable.

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
2. **Run the Application**
  Execute the Main class to start the game:
   ```bash
   java Main

---
## Acknowledgement

