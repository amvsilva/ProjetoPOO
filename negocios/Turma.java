// Perguntar ao professor como funcionará pra saber se tem vaga ou não na turma

package negocios;

public class Turma {
  private int id;
  private Disciplina disciplina;
  private Professor professor;
  //private int capacidadeDaTurma;
  
  public Turma(int id, Disciplina disciplina, Professor professor) {
    this.id = id;
    this.disciplina = disciplina;
    this.professor = professor;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getDisciplina() {
    return this.disciplina;
  }
  
  public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }
  
  public String getProfessor() {
    return this.professor;
  }
  
  public void setProfessor(Professor professor) {
    this.professor = professor;
  }
}
