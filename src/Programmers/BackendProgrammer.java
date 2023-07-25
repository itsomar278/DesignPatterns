package Programmers;

import ProgramBehaviour.IProgram;
import ProgramBehaviour.ProgramBackEnd;
import ResponsibleBehaviour.BackEndResponseible;
import ResponsibleBehaviour.IResponsible;

public class BackendProgrammer extends Programmer{

    public BackendProgrammer() {
        programBehaviour = new ProgramBackEnd();
        responsibleBehaviour = new BackEndResponseible();
    }

    @Override
    public void Introduce() {
        System.out.println("I am a backend programmer");
    }


}
