public class AtomicNumberQuestion extends Question {
    private Element element;

    // Constructor to initialize the Element
    public AtomicNumberQuestion(Element element) {
        this.element = element;
    }

    // Generate a question asking for the atomic number of the element
    @Override
    public void generate() {
        questionText = "What is the atomic number of " + element.getSymbol() + "?";
        correctAnswer = String.valueOf(element.getAtomicNumber());
    }
}
