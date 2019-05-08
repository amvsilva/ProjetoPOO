package negocios;

import java.util.Date;

public class Aluno {
  private int id;
  private String nome;
  private Date dataNascimento;
  private int periodo;
  private String nomeUsuario;
  private String senha;
  
  public Aluno(int id, String nome, int dia, int mes, int ano, int periodo, String nomeUsuario, String senha) {
    this.id = id;
    this.nome = nome;
    this.dataNascimento = new Date(ano, mes, dia);
    this.periodo = periodo;
    this.nomeUsuario = nomeUsuario;
    this.senha = senha;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getNome() {
    return this.nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public Date getDataNascimento() {
    return this.dataNascimento;
  }
  
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  
  public int getPeriodo() {
    return this.periodo;
  }
  
  public void setPeriodo(int periodo) {
    this.periodo = periodo;
  }
  
  public String getNomeUsuario() {
    return this.nomeUsuario;
  }
  
  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }
  
  public String getSenha() {
    return this.senha;
  }
  
  public void setSenha(String senha) {
    this.senha = senha;
  }
}
