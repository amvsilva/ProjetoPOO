package negocios;

public interface IFachadaAluno {
	
	public void logarAluno(String nomeUsuario,String senha)throws UsuarioNaoCadastradoException, SenhaInvalidaException;
	
	public void cadastrarAluno(Aluno aluno)throws UsuarioJaCadastradoException;
	public void[] exibirTurmasAluno(string nomeUsuario)throws SemTurmaCadastradaException;
  
}