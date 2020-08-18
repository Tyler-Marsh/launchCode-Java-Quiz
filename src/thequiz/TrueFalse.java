package thequiz;

public class TrueFalse extends Question {
    String question;
    String answer;
    Boolean isCorrect;
    public String ask() {
        String ask = "True or False \n" + this.question;
        return ask;

    }

    public void record(String userAnswer) {

        if (userAnswer.equals(answer)) {
            this.setIsCorrect(true);
        } else {
            this.setIsCorrect(false);
        }


    }

    private void setIsCorrect(Boolean possibleCorrect) {
        isCorrect = possibleCorrect;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public TrueFalse(String anAnswer, String aQuestion) {
        answer = anAnswer;
        question = aQuestion;

    }
}
