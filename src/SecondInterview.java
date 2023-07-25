public class SecondInterview implements IQuizPlusJobState{
    QuizPlusJobContext context;

    public SecondInterview(QuizPlusJobContext quizPlusJobContext) {
        this.context = quizPlusJobContext;
    }

    @Override
    public void Apply() {
        System.out.println("You have already applied for this job.");
    }

    @Override
    public void CV_Approved() {
        System.out.println("You have already applied for this job.");
    }

    @Override
    public void CV_Rejected() {
        System.out.println("Your cv has already been approved for this job.");

    }

    @Override
    public void FirstInterviewPassed() {
        System.out.println("You have already passed first interview this job.");
    }

    @Override
    public void SecondInterviewPassed() {
        System.out.println("Congrats You passed second interview this job , Offer has been sent.");
        context.setCurrentState(context.Hired);
    }

    @Override
    public void FirstInterviewFailed() {
        System.out.println("You have already passed your first interview this job.");
    }

    @Override
    public void SecondInterviewFailed() {
        System.out.println("Sadly You didn't pass your second interview this job , you can re-apply.");
        context.currentState = context.Rejected;
    }

    @Override
    public void ReApply() {
        System.out.println("You have already applied for this job.");
    }
}
