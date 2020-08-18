package thequiz;
import java.util.Scanner;
public class QuizRunner {
// will run the question and get response
    // use quiz to create 4 questions
    //
    public static void main(String[] args) {

        Quiz quiz = new Quiz("quiz");
        // add quiz questions
        quiz.addCheckBox("Which of the following rivers are in America?", "Nile, Colorado, Ganges, Missouri","Colorado, Missouri");
        quiz.addMC("Which river is the longest?","b","a. The Ohio River \n" + "b. The Mississippi River \n"+ "c. The Missouri River \n"+ "d. The Colorado River" );
        quiz.addTF("true", "George Washington was America's first president.");
        // ask the questions and take the input
        Scanner input = new Scanner(System.in);
        String answer;
        // loop through to ensure all questions are asked
        for (int i = 0; i < quiz.getTotalQuestions(); i++) {
            System.out.println(quiz.theQuestions.get(i).ask());
            answer = input.nextLine();
            quiz.theQuestions.get(i).record(answer);
            System.out.println(quiz.gradeQ(quiz.theQuestions.get(i).getIsCorrect()));
            //System.out.println(testQuiz.getGrade());
            //System.out.println(testQuiz.theQuestions.get(0).getIsCorrect());
            //testQuiz.theQuestions.get(0).gradeQ();
        }
        System.out.println(quiz.getGrade());
    }
}
