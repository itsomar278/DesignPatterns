import java.util.Currency;

public class QuizPlusJobContext {
    IQuizPlusJobState Applied ;
    IQuizPlusJobState Rejected ;
    IQuizPlusJobState FirstInterview ;
    IQuizPlusJobState SecondInterview ;
    IQuizPlusJobState Hired;
    IQuizPlusJobState currentState ;
    public QuizPlusJobContext () {
        Applied = new Applied(this);
        Rejected = new Rejected(this);
        FirstInterview = new FirstInterview(this);
        SecondInterview = new SecondInterview(this);
        Hired = new Hired(this);
        currentState = Applied;
        Applied.Apply();
    }

    public void CV_Approved() {
        currentState.CV_Approved();
    }

    public void CV_Rejected() {
        currentState.CV_Rejected();
    }

    public void FirstInterviewPassed() {
        currentState.FirstInterviewPassed();
    }

    public void SecondInterviewPassed() {
        currentState.SecondInterviewPassed();
    }

    public void FirstInterviewFailed() {
        currentState.FirstInterviewFailed();
    }


    public void SecondInterviewFailed() {
        currentState.SecondInterviewFailed();
    }

    public void ReApply() {
        currentState.ReApply();
    }

    public IQuizPlusJobState getApplied() {
        return Applied;
    }
    public IQuizPlusJobState getRejected() {
        return Rejected;
    }

    public IQuizPlusJobState getFirstInterview() {
        return FirstInterview;
    }

    public IQuizPlusJobState getSecondInterview() {
        return SecondInterview;
    }

    public IQuizPlusJobState getHired() {
        return Hired;
    }

    public IQuizPlusJobState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IQuizPlusJobState currentState) {
        this.currentState = currentState;
        if(currentState == Hired)
        {
            System.out.println("Congrats You are hired");
        }
    }
}
