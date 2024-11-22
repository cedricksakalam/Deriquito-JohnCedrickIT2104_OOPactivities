Elemental Explorer - Periodic Table Game
 I. Project Overview
  Elemental Explorer is an interactive quiz game designed to test and enhance your knowledge of the periodic table. The game challenges players with up to 25 questions about chemical elements, including their symbols and atomic numbers. Players can review their final score and access a study mode to improve their periodic table expertise.

 II. Object-Oriented Programming (OOP) Principles
 This project employs fundamental OOP principles to ensure clean, maintainable, and modular code:

 Encapsulation:
  - The Element class encapsulates the properties of a chemical element (symbol and atomicNumber), ensuring clear separation of data and behavior.
  - Private fields and methods are used where appropriate to prevent unauthorized access.

 Abstraction:
  - The main game logic is abstracted into methods like askQuestion(), checkAnswer(), and resetGame(), providing a clear interface for game mechanics.

 Inheritance:
  - The game extends JFrame to inherit its GUI capabilities and overrides its functionalities to customize the user interface.

 Polymorphism:
  - Action listeners (SubmitButtonListener and NextQuestionButtonListener) utilize polymorphism by implementing the ActionListener interface, enabling dynamic behavior for different button actions.

 Modularity:
  - The game is divided into distinct methods and components (e.g., element initialization, GUI setup), promoting code reuse and easier debugging.
 III. Sustainable Development Goal (SDG) Integration
  - This project aligns with SDG 4: Quality Education by offering an engaging, gamified learning experience. The Periodic Table Game aims to:
  - Make science education accessible and interactive.
  - Foster curiosity and understanding of chemistry among learners.
  - Provide a self-paced platform for students to improve their knowledge.
 By gamifying the periodic table, this project encourages learning through play, addressing the need for innovative educational tools.

 IV. Instructions for Running the Program
  Follow these steps to run the game:

  Prerequisites:
  - Ensure you have Java Development Kit (JDK) 8 or higher installed.
  - A Java IDE like IntelliJ IDEA, Eclipse, or NetBeans is recommended for easier execution and debugging.
  
  Gameplay:
  - On launch, the game presents a question about a chemical element.
  - Enter your answer in the provided text field and click Submit to check your response.
  - Click Next Question to proceed to the next question.
  - Once all questions are answered, view your final score and choose to retry or enter the study mode.

  Study Mode:
  - After completing the game, access the "Study Area" to review a detailed periodic table.
Enjoy learning with Elemental Explorer and make chemistry fun! 🎉
