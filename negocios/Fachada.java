// TODO - colocar os métodos da interface IFachadaAdministrador e IFachadaAluno
package negocios;

public class Fachada implements IFachadaAdministrador, IFachadaAluno, IFachadaProfessor {
  private ControladorAluno controladorAluno;
  private ControladorAdministrador controladorAdministrador;
  private ControladorProfessor controladorProfessor;
  private static Fachada instancia;
  
  /*
   *  Singleton
   */
  private Fachada(String instancia) {
    if(instancia.equals("Aluno") {
      controladorAluno = new ControladorAluno();
    } else if(instancia.equals("Administrador") {
      controladorAdministrador = new ControladorAdministrador();
    } else {
      controladorProfessor = new ControladorProfessor();
    }    
  }
  
  public static Fachada getInstancia(String instancia) {
    if(instancia == null)
      instancia = new Fachada(instancia);
    return instancia;
  }
  /*
   * Fim Singleton
   */
  
  /*
   * Gets e Sets
   */
  public ControladorAluno getControladorAluno() {
    return this.controladorAluno;
  }
  
  public void setControladorAluno(ControladorAluno controladorAluno) {
    this.controladorAluno = controladorAluno;
  }
  
  public ControladorAdministrador getControladorAdministrador() {
    return this.controladorAdministrador;
  }
  
  public void setControladorAdministrador(ControladorAdministrador controladorAdministrador) {
    this.controladorAdministrador = controladorAdministrador;
  }
  
  public ControladorProfessor getControladorProfessor() {
    return this.controladorProfessor;
  }
  
  public void setControladorProfessor(ControladorProfessor controladorProfessor) {
    this.controladorProfessor = controladorProfessor;
  }
  /*
   * Fim Gets e Sets
   */
  
  /*
   *  Interface IFachadaProfessor
   */
  public Professor logarProfessor(String login, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException {
    return this.controladorProfessor.logarProfessor(login, senha).
  }
  
  public boolean cadastrarProfessor(Professor professor) throws UsuarioJaCadastradoException {
    return this.controladorProfessor.cadastrarProfessor(professor);
  }
  
  public ArrayList<Turma> exibirTurmasProfessor(int professorId) throws SemTurmaCadastradaException {
    return this.controladorProfessor.exibirTurmasProfessor(professorId);
  }
  
  public ArrayList<RendimentoEscolar> exibirNotasProfessor(int turmaId) throws SemAlunoMatriculadoException {
    return this.controladorProfessor.exibirNotasProfessor(turmaId);
  }
  
  public boolean atualizarNotasProfessor(int alunoId, float nota1, float nota2) throws NotaInvalidaException {
    return this.controladorProfessor.atualizarNotasProfessor(alunoId, nota1, nota2);
  }
  
  public boolean atualizarNotasTrabalhosProfessor(float[] notaTrabalhos) throws NotaInvalidaException {
    return this.controladorProfessor.atualizarNotasTrabalhosProfessor(notaTrabalhos);
  }
  
  public ArrayList<RendimentoEscolar> exibirListagemProfessor(int turmaId) throws SemAlunoMatriculadoException {
    return this.controladorProfessor.exibirListagemProfessor(turmaId);
  }
  
  public ArrayList<Turma> exibirListagemTurmasDisponiveisProfessor(int professorId) throws SemTurmaCadastradaException {
    return this.controladorProfessor.exibirListagemTurmasDisponiveisProfessor(professorId);
  }
  
  public boolean associarTurmaProfessor(Professor professor) {
    return this.controladorProfessor(professor);
  }
  /*
   * Fim Interface IFachadaProfessor
   */
  
}
