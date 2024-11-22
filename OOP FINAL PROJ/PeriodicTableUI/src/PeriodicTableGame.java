import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PeriodicTableGame extends JFrame {
    private final Map<String, Element> ELEMENTS = new HashMap<>();
    private int questionCount = 1;
    private int score = 0;
    private String correctAnswer;
    private String currentElement;

    private JLabel titleLabel, questionLabel, questionCountLabel, feedbackLabel, finalScoreLabel;
    private JTextField answerField;
    private JButton submitButton, nextQuestionButton, retakeButton, viewTableButton;

    public PeriodicTableGame() {
        // Initialize Elements
        initializeElements();

        // Set up the frame
        setTitle("Elemental Explorer");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(12, 100, 120));

        // Add components
        setupComponents();

        // Start the game
        askQuestion();
    }

    private void initializeElements() {
        ELEMENTS.put("Hydrogen", new Element("H", 1));
        ELEMENTS.put("Helium", new Element("He", 2));
        ELEMENTS.put("Lithium", new Element("Li", 3));
        ELEMENTS.put("Beryllium", new Element("Be", 4));
        ELEMENTS.put("Boron", new Element("B", 5));
        ELEMENTS.put("Carbon", new Element("C", 6));
        ELEMENTS.put("Nitrogen", new Element("N", 7));
        ELEMENTS.put("Oxygen", new Element("O", 8));
        ELEMENTS.put("Fluorine", new Element("F", 9));
        ELEMENTS.put("Neon", new Element("Ne", 10));
        ELEMENTS.put("Sodium", new Element("Na", 11));
        ELEMENTS.put("Magnesium", new Element("Mg", 12));
        ELEMENTS.put("Aluminum", new Element("Al", 13));
        ELEMENTS.put("Silicon", new Element("Si", 14));
        ELEMENTS.put("Phosphorus", new Element("P", 15));
        ELEMENTS.put("Sulfur", new Element("S", 16));
        ELEMENTS.put("Chlorine", new Element("Cl", 17));
        ELEMENTS.put("Argon", new Element("Ar", 18));
        ELEMENTS.put("Potassium", new Element("K", 19));
        ELEMENTS.put("Calcium", new Element("Ca", 20));
        ELEMENTS.put("Scandium", new Element("Sc", 21));
        ELEMENTS.put("Titanium", new Element("Ti", 22));
        ELEMENTS.put("Vanadium", new Element("V", 23));
        ELEMENTS.put("Chromium", new Element("Cr", 24));
        ELEMENTS.put("Manganese", new Element("Mn", 25));
        ELEMENTS.put("Iron", new Element("Fe", 26));
        ELEMENTS.put("Cobalt", new Element("Co", 27));
        ELEMENTS.put("Nickel", new Element("Ni", 28));
        ELEMENTS.put("Copper", new Element("Cu", 29));
        ELEMENTS.put("Zinc", new Element("Zn", 30));
        ELEMENTS.put("Gallium", new Element("Ga", 31));
        ELEMENTS.put("Germanium", new Element("Ge", 32));
        ELEMENTS.put("Arsenic", new Element("As", 33));
        ELEMENTS.put("Selenium", new Element("Se", 34));
        ELEMENTS.put("Bromine", new Element("Br", 35));
        ELEMENTS.put("Krypton", new Element("Kr", 36));
        ELEMENTS.put("Rubidium", new Element("Rb", 37));
        ELEMENTS.put("Strontium", new Element("Sr", 38));
        ELEMENTS.put("Yttrium", new Element("Y", 39));
        ELEMENTS.put("Zirconium", new Element("Zr", 40));
        ELEMENTS.put("Niobium", new Element("Nb", 41));
        ELEMENTS.put("Molybdenum", new Element("Mo", 42));
        ELEMENTS.put("Technetium", new Element("Tc", 43));
        ELEMENTS.put("Ruthenium", new Element("Ru", 44));
        ELEMENTS.put("Rhodium", new Element("Rh", 45));
        ELEMENTS.put("Palladium", new Element("Pd", 46));
        ELEMENTS.put("Silver", new Element("Ag", 47));
        ELEMENTS.put("Cadmium", new Element("Cd", 48));
        ELEMENTS.put("Indium", new Element("In", 49));
        ELEMENTS.put("Tin", new Element("Sn", 50));
        ELEMENTS.put("Antimony", new Element("Sb", 51));
        ELEMENTS.put("Tellurium", new Element("Te", 52));
        ELEMENTS.put("Iodine", new Element("I", 53));
        ELEMENTS.put("Xenon", new Element("Xe", 54));
        ELEMENTS.put("Cesium", new Element("Cs", 55));
        ELEMENTS.put("Barium", new Element("Ba", 56));
        ELEMENTS.put("Lanthanum", new Element("La", 57));
        ELEMENTS.put("Cerium", new Element("Ce", 58));
        ELEMENTS.put("Praseodymium", new Element("Pr", 59));
        ELEMENTS.put("Neodymium", new Element("Nd", 60));
        ELEMENTS.put("Promethium", new Element("Pm", 61));
        ELEMENTS.put("Samarium", new Element("Sm", 62));
        ELEMENTS.put("Europium", new Element("Eu", 63));
        ELEMENTS.put("Gadolinium", new Element("Gd", 64));
        ELEMENTS.put("Terbium", new Element("Tb", 65));
        ELEMENTS.put("Dysprosium", new Element("Dy", 66));
        ELEMENTS.put("Holmium", new Element("Ho", 67));
        ELEMENTS.put("Erbium", new Element("Er", 68));
        ELEMENTS.put("Thulium", new Element("Tm", 69));
        ELEMENTS.put("Ytterbium", new Element("Yb", 70));
        ELEMENTS.put("Lutetium", new Element("Lu", 71));
        ELEMENTS.put("Hafnium", new Element("Hf", 72));
        ELEMENTS.put("Tantalum", new Element("Ta", 73));
        ELEMENTS.put("Tungsten", new Element("W", 74));
        ELEMENTS.put("Rhenium", new Element("Re", 75));
        ELEMENTS.put("Osmium", new Element("Os", 76));
        ELEMENTS.put("Iridium", new Element("Ir", 77));
        ELEMENTS.put("Platinum", new Element("Pt", 78));
        ELEMENTS.put("Gold", new Element("Au", 79));
        ELEMENTS.put("Mercury", new Element("Hg", 80));
        ELEMENTS.put("Thallium", new Element("Tl", 81));
        ELEMENTS.put("Lead", new Element("Pb", 82));
        ELEMENTS.put("Bismuth", new Element("Bi", 83));
        ELEMENTS.put("Polonium", new Element("Po", 84));
        ELEMENTS.put("Astatine", new Element("At", 85));
        ELEMENTS.put("Radon", new Element("Rn", 86));
        ELEMENTS.put("Francium", new Element("Fr", 87));
        ELEMENTS.put("Radium", new Element("Ra", 88));
        ELEMENTS.put("Actinium", new Element("Ac", 89));
        ELEMENTS.put("Thorium", new Element("Th", 90));
        ELEMENTS.put("Protactinium", new Element("Pa", 91));
        ELEMENTS.put("Uranium", new Element("U", 92));
        ELEMENTS.put("Neptunium", new Element("Np", 93));
        ELEMENTS.put("Plutonium", new Element("Pu", 94));
        ELEMENTS.put("Americium", new Element("Am", 95));
        ELEMENTS.put("Curium", new Element("Cm", 96));
        ELEMENTS.put("Berkelium", new Element("Bk", 97));
        ELEMENTS.put("Californium", new Element("Cf", 98));
        ELEMENTS.put("Einsteinium", new Element("Es", 99));
        ELEMENTS.put("Fermium", new Element("Fm", 100));
        ELEMENTS.put("Mendelevium", new Element("Md", 101));
        ELEMENTS.put("Nobelium", new Element("No", 102));
        ELEMENTS.put("Lawrencium", new Element("Lr", 103));
        ELEMENTS.put("Rutherfordium", new Element("Rf", 104));
        ELEMENTS.put("Dubnium", new Element("Db", 105));
        ELEMENTS.put("Seaborgium", new Element("Sg", 106));
        ELEMENTS.put("Bohrium", new Element("Bh", 107));
        ELEMENTS.put("Hassium", new Element("Hs", 108));
        ELEMENTS.put("Meitnerium", new Element("Mt", 109));
        ELEMENTS.put("Darmstadtium", new Element("Ds", 110));
        ELEMENTS.put("Roentgenium", new Element("Rg", 111));
        ELEMENTS.put("Copernicium", new Element("Cn", 112));
        ELEMENTS.put("Nihonium", new Element("Nh", 113));
        ELEMENTS.put("Flerovium", new Element("Fl", 114));
        ELEMENTS.put("Moscovium", new Element("Mc", 115));
        ELEMENTS.put("Livermorium", new Element("Lv", 116));
        ELEMENTS.put("Tennessine", new Element("Ts", 117));
        ELEMENTS.put("Oganesson", new Element("Og", 118));
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
        submitButton.addActionListener(new SubmitButtonListener());
        add(submitButton);

        nextQuestionButton = new JButton("Next Question");
        nextQuestionButton.setBounds(100, 220, 200, 30);
        nextQuestionButton.addActionListener(new NextQuestionButtonListener());
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
    }

    private void askQuestion() {
        if (questionCount > 25) {
            displayFinalScore();
            return;
        }

        // Pick a random element and question type
        Random random = new Random();
        Object[] elementKeys = ELEMENTS.keySet().toArray();
        currentElement = (String) elementKeys[random.nextInt(elementKeys.length)];
        Element element = ELEMENTS.get(currentElement);

        boolean askForSymbol = random.nextBoolean();
        if (askForSymbol) {
            questionLabel.setText("What is the symbol for " + currentElement + "?");
            correctAnswer = element.symbol;
        } else {
            questionLabel.setText("What is the atomic number of " + currentElement + "?");
            correctAnswer = String.valueOf(element.atomicNumber);
        }

        questionCountLabel.setText("Question: " + questionCount);
        feedbackLabel.setText("");
        answerField.setText("");
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
            feedbackLabel.setForeground(Color.RED);
        }
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

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkAnswer();
        }
    }

    private class NextQuestionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (questionCount < 25) {
                questionCount++;
                askQuestion();
            } else {
                displayFinalScore();
            }
        }
    }

    private static class Element {
        String symbol;
        int atomicNumber;

        public Element(String symbol, int atomicNumber) {
            this.symbol = symbol;
            this.atomicNumber = atomicNumber;
        }
    }

    private void showPeriodicTable() {
        dispose();
        viewTableButton.setEnabled(false);
        Ptable.main(new String[]{});
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PeriodicTableGame game = new PeriodicTableGame();
            game.setVisible(true);
        });
    }
}
