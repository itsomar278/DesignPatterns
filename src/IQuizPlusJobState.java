public interface IQuizPlusJobState {
    public void Apply();
    public void CV_Approved();
    public void CV_Rejected();
    public void FirstInterviewPassed();
    public void SecondInterviewPassed();
    public void FirstInterviewFailed();
    public void SecondInterviewFailed();
    public void ReApply();

}
