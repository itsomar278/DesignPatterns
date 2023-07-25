package Programmers;

import ProgramBehaviour.IProgram;
import ResponsibleBehaviour.IResponsible;

public abstract class Programmer
{
    IProgram programBehaviour;
    IResponsible responsibleBehaviour;

    public Programmer()
    {

    }
    public abstract void Introduce();

   public void performProgramming() {
    programBehaviour.program();
    }

    public void perfromResponsibility() {
        responsibleBehaviour.responsible();
    }

    // setters and getters
    public IProgram getProgramBehaviour() {
        return programBehaviour;
    }

    public void setProgramBehaviour(IProgram programBehaviour) {
        this.programBehaviour = programBehaviour;
    }

    public IResponsible getResponsibleBehaviour() {
        return responsibleBehaviour;
    }

    public void setResponsibleBehaviour(IResponsible responsibleBehaviour) {
        this.responsibleBehaviour = responsibleBehaviour;
    }
}
