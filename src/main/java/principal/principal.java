package principal;

import classes.Aluno;
import classes.Professor;


//Envie o projeto para um repositorio publico do github
//Cole o link do repositorio como resposta dessa atividade

public class principal {
    
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Joao");
        a.setMatricula("1010");
        double total = a.tirarCopia(10);
        System.out.println("O nome do Aluno é: "+a.getNome());
        System.out.println("O valor total das cópias ficou: R$"+total);
        
        Professor p = new Professor();
        p.setNome("Pedro");
        p.setDisciplina("POO");
        total = p.tirarCopia(75);        
        System.out.println("O nome do Professor é: "+p.getNome());
        System.out.println("O valor total das cópias ficou: R$"+total);
        
        
        
        
        
        
    }
    
}
