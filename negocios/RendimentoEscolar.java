// Ver com o professor se as notas vão ser int mesmo

package negocios;

public class RendimentoEscolar {
  private Turma turma;
  private Aluno aluno;
  private int nota1;
  private int nota2;
  private String[] trabalhos;
  private int[] notaTrabalhos;
  
  public RendimentoEscolar(Turma turma, Aluno aluno, int nota1, int nota2, String[] trabalhos, int[] notaTrabalhos) {
    this.turma = turma;
    this.aluno = aluno;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.trabalhos = trabalhos;
    this.notaTrabalhos = notaTrabalhos;
  }
  
  public Turma getTurma() {
    return this.turma;
  }
  
  public void setTurma(Turma turma) {
    this.turma = turma;
  }
  
  public Aluno getAluno() {
    return this.aluno;
  }
  
  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }
  
  public int getNota1() {
    return this.nota1;
  }
  
  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }
  
  public int getNota2() {
    return this.nota2;
  }
  
  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }
  
  public String[] getTrabalhos() {
    return this.trabalhos;
  }
  
  public void setTrabalhos(String[] trabalhos) {
    this.trabalhos = trabalhos;
  }
  
  public int[] getNotaTrabalhos() {
    return this.notaTrabalhos;
  }
  
  public void setNotaTrabalhos(int[] notaTrabalhos) {
    this.notaTrabalhos = notaTrabalhos;
  }
}
