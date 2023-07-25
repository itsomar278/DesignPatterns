public class Applied implements IQuizPlusJobState{
    QuizPlusJobContext context;

    public Applied(QuizPlusJobContext quizPlusJobContext) {
        this.context = quizPlusJobContext;
    }

    @Override
    public void Apply() {
        System.out.println("You have applied for the job at QuizPlus");
    }

    @Override
    public void CV_Approved() {
       System.out.println("Your CV has been approved");
         context.currentState = context.FirstInterview;
    }

    @Override
    public void CV_Rejected() {
        System.out.println("Your CV has been Rejected");
        context.currentState = context.Rejected;
    }

    @Override
    public void FirstInterviewPassed() {
        System.out.println("you should attend the interview first");
    }

    @Override
    public void SecondInterviewPassed() {
        System.out.println("you should pass the first interview first");

    }

    @Override
    public void FirstInterviewFailed() {
        System.out.println("you should attend the interview first");
    }

    @Override
    public void SecondInterviewFailed() {
        System.out.println("you should pass the first interview first");
    }

    @Override
    public void ReApply() {
        System.out.println("you should go through the proccess befor re-applying");
    }
}
