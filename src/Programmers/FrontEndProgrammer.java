package Programmers;

import ProgramBehaviour.FrontEndProgram;
import ProgramBehaviour.IProgram;
import ProgramBehaviour.QualityAssuranceProgram;
import ResponsibleBehaviour.FrontEndResponsible;
import ResponsibleBehaviour.IResponsible;
import ResponsibleBehaviour.QualityAssuranceResponsible;

public class FrontEndProgrammer extends Programmer{

    public FrontEndProgrammer() {
        programBehaviour = new FrontEndProgram();
        responsibleBehaviour = new FrontEndResponsible();
    }

    @Override
    public void Introduce() {
        System.out.println("I am a frontend programmer");
    }
}
