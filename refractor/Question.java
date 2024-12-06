// File: Question.java

public abstract class Question {
    protected String questionText;
    protected String correctAnswer;

    // Abstract method to be implemented by subclasses to generate specific questions
    public abstract void generate();

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
