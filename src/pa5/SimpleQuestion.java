package pa5;

public class SimpleQuestion extends TrueFalseQuestion {

    private String stringAnswer = "";

    public SimpleQuestion(String questionText, boolean answer, String stringAnswer) {
        super();
        this.stringAnswer = stringAnswer;
    }

    @Override
    public String getQuestion() {
        return super.questionText;
    }

    public final void setAnswer(String answer) {
        this.stringAnswer = answer;
    }

    public final boolean checkAnswer(String attempt) {
        return attempt.compareTo(this.stringAnswer) == 0;
    }
}
