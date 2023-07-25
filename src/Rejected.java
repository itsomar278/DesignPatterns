public class Rejected implements IQuizPlusJobState{
    QuizPlusJobContext context;

    public Rejected(QuizPlusJobContext quizPlusJobContext) {
        this.context = quizPlusJobContext;
    }

    @Override
    public void Apply() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void CV_Approved() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void CV_Rejected() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void FirstInterviewPassed() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void SecondInterviewPassed() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void FirstInterviewFailed() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void SecondInterviewFailed() {
        System.out.println("You've been rejected , wait 6 months to reapply");
    }

    @Override
    public void ReApply() {
        System.out.println("Your application was sent again");
        context.currentState = context.Applied;
    }
}
