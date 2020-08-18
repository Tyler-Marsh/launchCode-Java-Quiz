package thequiz;

import java.util.List;
import java.util.Arrays;
public class CheckBox extends Question {
    String question;
    Boolean isCorrect;
    String[] possibleAnswers;
    String[] correctList;
    public CheckBox(String aQuestion, String answers, String aCorrectAnswers) {
        // easier interface for inputting answers
        possibleAnswers = answers.split(",");
        question = aQuestion;
        // easier interface for checkbox options
        // correct answers
       correctList = aCorrectAnswers.split(",");

    }

    public String ask() {
        String askString = question + "\n" + "Please select all of the correct answers separated by a comma like so: \n 1,3,5";

        for (String possibleAnswer : possibleAnswers) {
           askString += "\n" + possibleAnswer;
        }
        return askString;
       // this.record();
    }

    public void record(String userAnswer) {


        /* TURN the answer in list then array list */
        // CONVERT ANSWERS TO LIST
        String[] userAnswers = userAnswer.split(",");
        //
        List<String> iterAnswers;
        iterAnswers = Arrays.asList(userAnswers);
        List<String> iterCorrect = Arrays.asList(this.correctList);
        // iterCorrect = Arrays.asList(this.correctList);
        if (userAnswers.length != possibleAnswers.length ) {
            this.setIsCorrect(false);
        }
        if (iterCorrect.containsAll(iterAnswers)) {
            this.setIsCorrect(true);
        }

    }

    private void setIsCorrect(boolean cor) { isCorrect = cor;}

    public Boolean getIsCorrect() {
        return this.isCorrect;
    }



}
