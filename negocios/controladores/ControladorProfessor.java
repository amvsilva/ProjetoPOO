package negocios.controladores;

public class ControladorProfessor {
  private IRepositorioProfessor rep;
  
  public ControladorProfessor() {
    // TODO - ver se vai ter algum parâmetro pro construtor
    rep = new RepositorioProfessor();
  }
  
  public Professor logarProfessor(String login, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException {
    return this.rep.logarProfessor(login, senha);
  }
  
  public boolean cadastrarProfessor(Professor professor) throws UsuarioJaCadastradoException {
    return this.rep.cadastrarProfessor(professor);
  }
  
  public ArrayList<Turma> exibirTurmasProfessor(int professorId) throws SemTurmaCadastradaException {
    return this.rep.exibirTurmasProfessor(professorId);
  }
  
  public ArrayList<RendimentoEscolar> exibirNotasProfessor(int turmaId) throws SemAlunoMatriculadoException {
    return this.rep.exibirNotasProfessor(turmaId);
  }
  
  public boolean atualizarNotasProfessor(int alunoId, float nota1, float nota2) throws NotaInvalidaException {
    return this.rep.atualizarNotasProfessor(alunoId, nota1, nota2);
  }
  
  public boolean atualizarNotasTrabalhosProfessor(float[] notaTrabalhos) throws NotaInvalidaException {
    return this.rep.atualizarNotasTrabalhosProfessor(notaTrabalhos);
  }
  
  public ArrayList<RendimentoEscolar> exibirListagemProfessor(int turmaId) throws SemAlunoMatriculadoException {
    return this.rep.exibirListagemProfessor(turmaId);
  }
  
  public ArrayList<Turma> exibirListagemTurmasDisponiveisProfessor(int professorId) throws SemTurmaCadastradaException {
    return this.rep.exibirListagemTurmasDisponiveisProfessor(professorId);
  }
  
  public boolean associarTurmaProfessor(Professor professor) {
    return this.rep.associarTurmaProfessor(professor);
  }
  
}
