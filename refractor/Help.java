import javax.swing.*;

public class Help {

    public static void showHelp() {
        String instructionsText = "Instructions for Playing 'Elemental Guesser' Game\n\n"
            + "Objective:\n"
            + "   The goal of the game is to answer questions about the elements of the periodic table. You will either be asked to:\n"
            + "   - Identify the symbol of a given element.\n"
            + "   - Provide the atomic number of a given element.\n"
            + "   - Answer as many questions correctly as you can to score points!\n"
            + "2. How to Play:\n"
            + "   - Start the Game:\n"
            + "     - When you launch the game, the window will appear with a title and a 'Start' button (or it will automatically begin if the game is running).\n"
            + "     - The game will begin with the first question.\n"
            + "   - Answering the Questions:\n"
            + "     - The game will randomly pick an element and ask you one of two questions:\n"
            + "       - What is the symbol for [Element]?\n"
            + "       - What is the atomic number of [Element]?\n"
            + "     - Type your answer in the text box provided.\n"
            + "   - Submit Your Answer:\n"
            + "     - After typing your answer, click the 'Submit' button to check if your answer is correct.\n"
            + "     - If your answer is correct, you’ll get a 'Correct!' message, and you will earn 1 point.\n"
            + "     - If your answer is wrong, the game will show the correct answer.\n"
            + "   - Moving to the Next Question:\n"
            + "     - After answering a question (correct or incorrect), you can click the 'Next Question' button to proceed.\n"
            + "3. Final Score:\n"
            + "   - Once all 25 questions are completed, the game will display your final score out of 25.\n"
            + "   - If you would like to try again, click the 'Retry' button to reset the game and start over with fresh questions.\n"
            + "4. Other Features:\n"
            + "   - Study Area Button:\n"
            + "     - This button is available after the game is complete. Clicking it will take you to a reference view of the periodic table. Use this feature to study and improve your knowledge.\n"
            + "   - Help Button:\n"
            + "     - Click the 'Help' button for additional assistance and instructions on how to play.\n"
            + "5. Winning Tips:\n"
            + "   - Learn the Periodic Table: The more familiar you are with the periodic table, the easier it will be to answer the questions.\n"
            + "   - Use the Study Area: After playing the game, use the study area to brush up on any elements you may have had trouble with.\n"
            + "   - Stay Calm: If you get a question wrong, don't worry! Simply move on to the next one and keep trying.\n"
            + "Good luck and enjoy your journey through the periodic table!";
        
        JOptionPane.showMessageDialog(null, instructionsText, "Help - Elemental Guesser", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        showHelp();
    }
}