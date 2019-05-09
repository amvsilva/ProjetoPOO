package negocios;

import java.util.ArrayList;

public interface IFachadaProfessor {
  public Professor logarProfessor(String login, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException;
  public boolean cadastrarProfessor(Professor professor) throws UsuarioJaCadastradoException;
  public ArrayList<String> exibirTurmasProfessor(int professorId) throws SemTurmaCadastradaException;
  public Turma exibirTurmaProfessor(String login);
  public void atualizarNota(String loginProfessor, String loginAluno); 
  // Continuar ...
}
