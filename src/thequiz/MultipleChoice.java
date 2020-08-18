package thequiz;
import java.util.Scanner;
public class MultipleChoice extends Question {
    String question;
    String answer;
    Boolean isCorrect;
    String possibleAnswers;
    public String ask() {
        return this.question + "\n" + this.possibleAnswers;
        // System.out.println(possibleAnswers + "\n");
       // this.record();
    }

    public void record(String userAnswer) {
        if (userAnswer.equals(this.getAnswer())) {
            this.setIsCorrect(true);
        } else {
            this.setIsCorrect(false);
        }
    }

    private void setIsCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    private String getAnswer() {
        return this.answer;
    }

    /* CONSTRUCTOR */
    public MultipleChoice(String aQuestion, String anAnswer, String aPossibleAnswers) {
        question = aQuestion;
        answer = anAnswer;
        possibleAnswers = aPossibleAnswers;
    }

}
