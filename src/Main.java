import ProgramBehaviour.IProgram;
import ProgramBehaviour.ProgramBackEnd;
import Programmers.BackendProgrammer;
import Programmers.FrontEndProgrammer;
import Programmers.Programmer;
import Programmers.QualityAssuranceProgrammer;
import ResponsibleBehaviour.BackEndResponseible;
import ResponsibleBehaviour.IResponsible;

public class Main {
    public static void main(String[] args) {
        System.out.println("BackEnd : ");
        Programmer backend = new BackendProgrammer( );
        backend.performProgramming();
        backend.perfromResponsibility();
        backend.Introduce();


        System.out.println("------------------------------------");
        System.out.println("FrontEnd : ");


        Programmer QA = new QualityAssuranceProgrammer();
        QA.performProgramming();
        QA.perfromResponsibility();
        QA.Introduce();


        System.out.println("------------------------------------");
        System.out.println("QA : ");

        Programmer frontend = new FrontEndProgrammer();
        frontend.performProgramming();
        frontend.perfromResponsibility();
        frontend.Introduce();


    }
}