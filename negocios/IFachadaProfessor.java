package negocios;

public interface IFachadaProfessor {
  public void logarProfessor(String nomeUsuario, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException;
  public void cadastrarProfessor(Professor professor) throws UsuarioJaCadastradoException;
  public String[] exibirTurmasProfessor(String nomeUsuario) throws SemTurmaCadastradaException;
  public String exibirTurmaProfessor(String nomeUsuario);
  // Continuar ...
}
