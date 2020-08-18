package thequiz;

public abstract class  Question {

    public abstract String ask();

    public abstract void record(String userAnswer);

  // public abstract Boolean returnResult();
    public abstract Boolean getIsCorrect();

}
