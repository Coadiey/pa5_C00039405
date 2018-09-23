// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 260
// Programming Assignment : #5
// Due Date : 3/21/18 
// Program Description: main Pa5_C00039405 class creates new object variables of each class in the package and 
//takes in user input, first the client setting the questions is able to set all questions and answers, then the client 
//user who is answering the questions then is shown the questions, we take the input feed it to the question's class, and 
//then we check it against what the answer should be and tell the user if he/she is correct or not and if wrong they get
//a chance to try again.
// Certificate of Authenticity:
// I certify that the code in the method function main of this project is entirely my own
// work.
package pa5;

public class Pa5_C00039405 {

    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion();
        String questionText = null;
        boolean answer = false;
        String stringAnswer = null;
        int answerChoices = 1;
        String[] possibleChoices = null;
        SimpleQuestion simpleQuestion = new SimpleQuestion(questionText, answer, stringAnswer);
        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion(questionText, answer, stringAnswer, answerChoices, possibleChoices);

        System.out.println("Enter true/false question: ");
        trueFalseQuestion.setQuestionText(keyboard.nextLine());
        System.out.println("Enter answer to true/false question (true or false): ");
        trueFalseQuestion.setAnswer(keyboard.nextBoolean());
        keyboard.nextLine(); //clear out buffer 
        System.out.println();

        System.out.println("Enter a simple question: ");
        simpleQuestion.setQuestionText(keyboard.nextLine());
        System.out.println("Enter the answer to the question: ");
        simpleQuestion.setAnswer(keyboard.nextLine().toLowerCase());
        System.out.println();

        System.out.println("Enter a multiple choice question:");
        multipleChoiceQuestion.setQuestionText(keyboard.nextLine());
        System.out.println("Enter the number of Choices (# greater than 1): ");
        int number = keyboard.nextInt();
        keyboard.nextLine(); // to clear the stupid buffer(because java is too stupid to take a simple \n out of the buffer)
        multipleChoiceQuestion.setAnswerChoicesNumber(number);
        int i;
        for (i = 0; i < number; i++) {
            System.out.printf("Enter choice %d: ", i + 1);
            multipleChoiceQuestion.setChoices(i, keyboard.nextLine());
            System.out.println();
        }
        System.out.println("Enter the correct answer to the question: ");
        multipleChoiceQuestion.setAnswer(keyboard.nextLine().toLowerCase());

        System.out.println();
        System.out.println(trueFalseQuestion.getQuestion() + ": ");
        while (trueFalseQuestion.checkAnswer(keyboard.nextBoolean()) == false) {
            System.out.println("Sorry try again.");
            System.out.println(trueFalseQuestion.getQuestion());
        }
        System.out.println("Correct. Good Job");
        System.out.println();
        keyboard.nextLine();

        System.out.println(simpleQuestion.getQuestion());
        while (simpleQuestion.checkAnswer(keyboard.nextLine().toLowerCase()) == false) {
            System.out.println("Sorry try again.");
            System.out.println(simpleQuestion.getQuestion());
        }
        System.out.println("Correct. Good Job!");
        System.out.println();

        System.out.println(multipleChoiceQuestion.getQuestion());
        for (i = 0; i < number; i++) {
            System.out.println(multipleChoiceQuestion.getChoices(i));
        }
        while (multipleChoiceQuestion.checkAnswer(keyboard.nextLine().toLowerCase()) == false) {
            System.out.println("Sorry try again.");
            System.out.println(multipleChoiceQuestion.getQuestion());
            for (i = 0; i < number; i++) {
                System.out.println(multipleChoiceQuestion.getChoices(i));
            }
        }
        System.out.println("Correct. Good Job!");

    }

}
