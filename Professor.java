package negocios;

import java.util.Date;

public class Professor {
  private int id;
  private String nome;
  private String cargo;
  private Date dataNascimento;
  private String nomeUsuario;
  private String senha;
  
  public Professor(int id, String nome, String cargo, int dia, int mes, int ano, String nomeUsuario, String senha) {
    this.id = id;
    this.nome = nome;
    this.cargo = cargo;
    this.dataNascimento = new Date(ano, mes, dia);
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
  
  public String getCargo() {
    return this.cargo;
  }
  
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
  
  public Date getDataNascimento() {
    return this.dataNascimento;
  }
  
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
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
