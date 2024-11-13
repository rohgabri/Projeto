import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(">>>INÍCIO SOFTWARE ALUNO<<<\n");

        alunoClasse aluno = new alunoClasse();
        System.out.print("Informe o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Informe a matrícula: ");
        aluno.setMatricula(sc.nextInt());
        sc.nextLine();

        System.out.print("Informeyhjuikolçp o sexo: ");
        aluno.setSexo(sc.nextLine());

        System.out.print("Informe a data de nascimento: ");
        aluno.setNascimento(sc.nextLine());

        System.out.print("Informe o Curso: ");
        aluno.setCurso(sc.nextLine());

        System.out.print("Informe o ano de início: ");
        aluno.setInicio(sc.nextInt());

        System.out.print("Informe a Nota da Prova 1: ");
        aluno.setNota1(sc.nextDouble());

        System.out.print("Informe a Nota da Prova 2: ");
        aluno.setNota2(sc.nextDouble());

        System.out.print("Informe a média dos Trabalhos: ");
        aluno.setMedia(sc.nextDouble());
        sc.close();

        boolean aprovado = aluno.estaAprovado();
        double mediaFinal = aluno.calcularMedia();

        System.out.println("\n###INFORMAÇÕES###");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome do Curso: " + aluno.getCurso());

        if (aprovado){
            System.out.println("Situação: Aprovado com média: " + mediaFinal);
        }
        else{
            System.out.println("Situação: Reprovado com média: " + mediaFinal);
        }

        System.out.println("\n>>>Fim da execução do software<<<");

    }
}