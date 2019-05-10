package negocios;

public interface IFachadaAluno {
	
	public Aluno logarAluno(String login, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException;
  	public boolean cadastrarAluno(Aluno aluno) throws UsuarioJaCadastradoException;
  	public ArrayList<Turma> exibirTurmasAluno(int alunoId) throws SemTurmaCadastradaException;
  	public ArrayList<RendimentoEscolar> exibirNotasAluno(int turmaId) throws SemAlunoMatriculadoException;
	public boolean adicionarTrabalho(RendimentoEscolar trabalhoNovo) throws SemEspacoParaNovoTrabalhoException;
		//todo procurar saber se põe (RendimentoEscolar trabalhoNovo) ou (string[] trabalhoNovo)
  	public ArrayList<Turma> exibirListagemTurmasDisponiveisAluno(int AlunoId) throws SemTurmaCadastradaException;
  	public boolean associarTurmaAluno(Aluno aluno);
  
}
