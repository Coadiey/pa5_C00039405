package pa5;

public class TrueFalseQuestion {

    protected String questionText = null;
    private boolean answer = false;

    public TrueFalseQuestion() {
        this.questionText = "No Question";
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestion() {
        return questionText + " (true/false)";
    }

    public final void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public final boolean checkAnswer(boolean attempt) {
        return answer == attempt;
    }

}
