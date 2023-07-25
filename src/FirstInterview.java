public class FirstInterview implements IQuizPlusJobState{
    QuizPlusJobContext context;

    public FirstInterview(QuizPlusJobContext quizPlusJobContext) {
        this.context = quizPlusJobContext;
    }

    @Override
    public void Apply() {
        System.out.println("You have already applied for this job.");
    }

    @Override
    public void CV_Approved() {
        System.out.println("Your cv has already been approved for this job.");
    }

    @Override
    public void CV_Rejected() {
        System.out.println("Your cv has already been approved for this job.");
    }

    @Override
    public void FirstInterviewPassed() {
        System.out.println("congrats , you passed you first interview , second interview is assigned");
        context.currentState = context.SecondInterview;
    }

    @Override
    public void SecondInterviewPassed() {
        System.out.println("you should attend your interview first");
    }

    @Override
    public void FirstInterviewFailed() {
        System.out.println("Sadly , you didn't pass you first interview , you can reapply for this job");
        context.currentState = context.Rejected;
    }

    @Override
    public void SecondInterviewFailed() {
        System.out.println("you should attend your interview first");
    }

    @Override
    public void ReApply() {
        System.out.println("you should attend your interview first");
    }
}
