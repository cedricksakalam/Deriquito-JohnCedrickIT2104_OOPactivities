// File: SymbolQuestion.java

public class SymbolQuestion extends Question {
    private Element element;

    // Constructor to initialize the Element
    public SymbolQuestion(Element element) {
        this.element = element;
    }

    // Generate a question asking for the symbol of the element
    @Override
    public void generate() {
        questionText = "What is the symbol for " + element.getName() + "?"; // Use the element's name
        correctAnswer = element.getSymbol();  // The correct answer is the symbol of the element
    }
}
