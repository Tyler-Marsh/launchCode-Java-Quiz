package thequiz;
import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
    /**
     * Add questions
     * Run or carry out the quiz
     * Grade the quiz
     */
    // most important field
    ArrayList<Question> theQuestions = new ArrayList<>();
    String name;
    // Constructor
    Integer totalCorrect = 0;
    Quiz(String aName) {
        name = aName;
    }

    public Integer getTotalQuestions() {
        // Array List needs size
        return this.theQuestions.size();
    }

    public String getGrade() {
        return this.totalCorrect + "/" + this.getTotalQuestions();
    }

    private void incrementTotalCorrect() {
        this.totalCorrect++;
    }

    public void addMC(String aQuestion, String anAnswer, String aPossibleAnswers) {
        Question q = new MultipleChoice(aQuestion,anAnswer, aPossibleAnswers);
        this.theQuestions.add(q);

    }

    public void addCheckBox(String aQuestion, String answers, String aCorrectAnswers) {
        Question q = new CheckBox( aQuestion, answers, aCorrectAnswers);
        this.theQuestions.add(q);
    }

    public void addTF(String anAnswer, String aQuestion) {
        Question q = new TrueFalse(anAnswer, aQuestion);
        this.theQuestions.add(q);
    }

    public String gradeQ(Boolean isCorrect) {

        if (isCorrect) {
            this.incrementTotalCorrect();
            return "You are correct!";
        }
        return "Sorry! That's incorrect!";
    }

    // MultipleChoice
    // CheckBox
    // TrueFalse are the Question objects to make
/*
    public static void main(String[] args) {

        Quiz testQuiz = new Quiz("test");

        testQuiz.addCheckBox("Which of the following rivers are in America?", "Nile, Colorado, Ganges, Missouri","Colorado, Missouri");
        Scanner input = new Scanner(System.in);
        System.out.println(testQuiz.theQuestions.get(0).ask());
        String answer = input.nextLine();
        testQuiz.theQuestions.get(0).record(answer);
        testQuiz.gradeQ(testQuiz.theQuestions.get(0).getIsCorrect());
        System.out.println(testQuiz.getGrade());
        //System.out.println(testQuiz.theQuestions.get(0).getIsCorrect());
        //testQuiz.theQuestions.get(0).gradeQ();

        /*
        testQuiz.addMC("Which river is the longest?","b","a. The Ohio River \n" +
                "b. The Mississippi River \n"+ "c. The Missouri River \n"+ "d. The Colorado River" );
        testQuiz.addTF("true", "George Washington was America's first president.");

        // ASKING

        System.out.println(testQuiz.theQuestions.get(1).ask());
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        //input.close();
        testQuiz.theQuestions.get(1).record(answer1);
        System.out.println(testQuiz.theQuestions.get(1).getIsCorrect());
        System.out.println(testQuiz.theQuestions.get(0).ask());
        String answer2 = input.nextLine();
        testQuiz.theQuestions.get(0).record(answer2);
        System.out.println(testQuiz.theQuestions.get(0).getIsCorrect());

*/

    /*
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        System.out.println(first);
        String second = scan.nextLine();
        System.out.println(second);
*/
  //  }

}
