package Programmers;
import ProgramBehaviour.QualityAssuranceProgram;
import ResponsibleBehaviour.QualityAssuranceResponsible;

public class QualityAssuranceProgrammer extends Programmer{
    public QualityAssuranceProgrammer() {
        programBehaviour = new QualityAssuranceProgram();
        responsibleBehaviour = new QualityAssuranceResponsible();
    }

    @Override
    public void Introduce() {
        System.out.println("I am a quality assurance programmer");
    }
}
