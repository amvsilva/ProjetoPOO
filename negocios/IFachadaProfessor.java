package negocios;

public interface IFachadaProfessor {
  public void logar(String nomeUsuario, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException;
  public void cadastrar(Professor professor) throws UsuarioJaCadastradoException;
  // Continuar ...
}
