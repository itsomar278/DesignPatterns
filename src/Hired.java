public class Hired implements IQuizPlusJobState {
    QuizPlusJobContext context;

    public Hired(QuizPlusJobContext quizPlusJobContext) {
        context = quizPlusJobContext;
    }

    @Override
    public void Apply() {
        System.out.println("You are already hired");
    }

    @Override
    public void CV_Approved() {
        System.out.println("You are already hired");
    }

    @Override
    public void CV_Rejected() {
        System.out.println("You are already hired");

    }

    @Override
    public void FirstInterviewPassed() {
        System.out.println("You are already hired");

    }

    @Override
    public void SecondInterviewPassed() {
        System.out.println("You are already hired");

    }

    @Override
    public void FirstInterviewFailed() {
        System.out.println("You are already hired");

    }

    @Override
    public void SecondInterviewFailed() {
        System.out.println("You are already hired");

    }

    @Override
    public void ReApply() {
        System.out.println("You are already hired");

    }
}
