import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PeriodicTableGame extends JFrame {
    private JLabel titleLabel, questionLabel, questionCountLabel, feedbackLabel, finalScoreLabel;
    private JTextField answerField;
    private JButton submitButton, nextQuestionButton, retakeButton, viewTableButton, helpButton;
    private int questionCount = 1;
    private int score = 0;
    private String correctAnswer;

    public PeriodicTableGame() {
        setTitle("Elemental Explorer");
        setSize(400, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(new Color(12, 100, 120));

        setupComponents();
        askQuestion();
    }

    private void setupComponents() {
        titleLabel = new JLabel("Elemental Guesser");
        titleLabel.setBounds(110, 20, 200, 30);
        titleLabel.setFont(new Font("Papyrus", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel);

        questionCountLabel = new JLabel("Question: " + questionCount);
        questionCountLabel.setBounds(160, 60, 200, 30);
        questionCountLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        questionCountLabel.setForeground(Color.WHITE);
        add(questionCountLabel);

        questionLabel = new JLabel("");
        questionLabel.setBounds(50, 100, 300, 30);
        questionLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        questionLabel.setForeground(Color.WHITE);
        add(questionLabel);

        answerField = new JTextField();
        answerField.setBounds(100, 140, 200, 30);
        add(answerField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 180, 200, 30);
        submitButton.addActionListener(e -> checkAnswer());
        add(submitButton);

        nextQuestionButton = new JButton("Next Question");
        nextQuestionButton.setBounds(100, 220, 200, 30);
        nextQuestionButton.addActionListener(e -> nextQuestion());
        add(nextQuestionButton);

        feedbackLabel = new JLabel("");
        feedbackLabel.setBounds(100, 260, 300, 30);
        feedbackLabel.setForeground(Color.GREEN);
        add(feedbackLabel);

        finalScoreLabel = new JLabel("");
        finalScoreLabel.setBounds(100, 300, 300, 30);
        finalScoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        finalScoreLabel.setForeground(Color.BLUE);
        add(finalScoreLabel);

        retakeButton = new JButton("Retry");
        retakeButton.setBounds(100, 340, 200, 30);
        retakeButton.setEnabled(false);
        retakeButton.addActionListener(e -> resetGame());
        add(retakeButton);

        viewTableButton = new JButton("Study Area");
        viewTableButton.setBounds(100, 380, 200, 30);
        viewTableButton.setEnabled(false);
        viewTableButton.addActionListener(e -> showPeriodicTable());
        add(viewTableButton);

        helpButton = new JButton("Help");
        helpButton.setBounds(100, 420, 200, 30);
        helpButton.addActionListener(e -> showHelp());
        add(helpButton);
    }

    private void askQuestion() {
        Random random = new Random();
        Object[] elementKeys = ElementRepository.getElements().keySet().toArray();
        String elementName = (String) elementKeys[random.nextInt(elementKeys.length)];
        Element element = ElementRepository.getElements().get(elementName);

        // Create a SymbolQuestion with the element
        SymbolQuestion question = new SymbolQuestion(element);

        // Generate the question and retrieve the correct answer
        question.generate();
        questionLabel.setText(question.getQuestionText());
        correctAnswer = question.getCorrectAnswer();  // Store the correct answer for later checking
    }


    private void checkAnswer() {
        String userAnswer = answerField.getText().trim();
        if (userAnswer.isEmpty()) {
            feedbackLabel.setText("Please enter an answer.");
            feedbackLabel.setForeground(Color.BLACK);
            return;
        }
    
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            feedbackLabel.setText("Correct!");
            feedbackLabel.setForeground(Color.GREEN);
            score++;
        } else {
            feedbackLabel.setText("Wrong! The correct answer was " + correctAnswer + ".");
            feedbackLabel.setForeground(Color.ORANGE);
        }
    }
    
    private void nextQuestion() {
        if (questionCount < 25) {
            questionCount++;
            askQuestion();
        } else {
            displayFinalScore();
        }
    
        // Clear the answer field for the next question
        answerField.setText("");
    }
    

    private void displayFinalScore() {
        questionLabel.setText("Test Complete!");
        submitButton.setEnabled(false);
        nextQuestionButton.setEnabled(false);
        answerField.setEnabled(false);
        finalScoreLabel.setText("Your final score is: " + score + " / 25");
        retakeButton.setEnabled(true);
        viewTableButton.setEnabled(true);
    }

    private void resetGame() {
        questionCount = 1;
        score = 0;
        submitButton.setEnabled(true);
        nextQuestionButton.setEnabled(true);
        answerField.setEnabled(true);
        finalScoreLabel.setText("");
        retakeButton.setEnabled(false);
        viewTableButton.setEnabled(false);
        askQuestion();
    }

    private void showHelp() {
        Help.showHelp();
    }

    private void showPeriodicTable() {
        Ptable.main(new String[]{});
    }

}