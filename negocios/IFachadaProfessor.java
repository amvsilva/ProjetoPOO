package negocios;

import java.util.ArrayList;

public interface IFachadaProfessor {
  public Professor logarProfessor(String login, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException;
  public boolean cadastrarProfessor(Professor professor) throws UsuarioJaCadastradoException;
  public ArrayList<Turma> exibirTurmasProfessor(int professorId) throws SemTurmaCadastradaException;
  public ArrayList<RendimentoEscolar> exibirNotasProfessor(int turmaId) throws SemAlunoMatriculadoException;
  public boolean atualizarNotasProfessor(int alunoId, float nota1, float 2) throws NotaInvalidaException;
  public boolean atualizarNotasTrabalhosProfessor(float[] notaTrabalhos) throws NotaInvalidaException;
  public ArrayList<RendimentoEscolar> exibirListagemProfessor(int turmaId) throws SemAlunoMatriculadoException;
  public ArrayList<Turma> exibirListagemTurmasDisponiveisProfessor(int professorId) throws SemTurmaCadastradaException;
  public boolean associarTurmaProfessor(Professor professor);
}
