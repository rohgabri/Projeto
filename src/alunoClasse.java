public class alunoClasse {
    private String nome;
    private int matricula;
    private String sexo;
    private String nascimento;
    private String curso;
    private double inicio;
    private double nota1;
    private double nota2;
    private double media;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getInicio() {
        return inicio;
    }
    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    public boolean estaAprovado() {
        double somaNotas = nota1 + nota2 + media;
        double mediaFinal = somaNotas / 3;
        return mediaFinal >= 6;
    }

    public double calcularMedia() {
        double somaNotas = nota1 + nota2 + media;
        return somaNotas / 3;
    }
}
