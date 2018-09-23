package pa5;

public class MultipleChoiceQuestion extends TrueFalseQuestion {

    private int answerChoicesNumber = 0;
    private String stringAnswer = null;
    private String[] possibleChoices = null;

    public MultipleChoiceQuestion(String questionText, boolean answer, String stringAnswer, int answerChoicesNumber, String[] possibleChoices) {
        super();
        this.possibleChoices = possibleChoices;
        this.stringAnswer = stringAnswer;
        if (answerChoicesNumber > 1) {
            this.answerChoicesNumber = answerChoicesNumber;
        }
    }

    public String getChoices(int number) {
        return this.possibleChoices[number];
    }

    public void setAnswerChoicesNumber(int number) {
        this.answerChoicesNumber = number;
        this.possibleChoices = new String[number];
    }

    public void setChoices(int number, String choice) {
        this.possibleChoices[number] = choice;
    }

    @Override
    public String getQuestion() {
        return super.questionText;
    }

    public void setAnswer(String answer) {
        this.stringAnswer = answer;
    }

    public boolean checkAnswer(String attempt) {
        return attempt.compareTo(this.stringAnswer) == 0;
    }

}
