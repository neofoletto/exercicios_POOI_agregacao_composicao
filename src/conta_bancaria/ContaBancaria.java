/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

package conta_bancaria;

/**
 * @author neo
 *
 */
public class ContaBancaria {

  protected Banco banco;
  private int agencia;
  private int numeroDaConta;
  private double saldo = 0;
  protected Pessoa correntista;

  public ContaBancaria() {
    // TODO Auto-generated constructor stub
  }

  public ContaBancaria(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista) {
    // TODO Auto-generated constructor stub
    setBanco(banco);
    setAgencia(agencia);
    setNumeroDaConta(numeroDaConta);
    setSaldo(saldo);
    setCorrentista(correntista);
  }

  /**
   * @return the banco
   */
  public Banco getBanco() {
    return banco;
  }

  /**
   * @param banco the banco to set
   */
  public void setBanco(Banco banco) {
    this.banco = banco;
  }

  /**
   * @return the agencia
   */
  public int getAgencia() {
    return agencia;
  }

  /**
   * @param agencia the agencia to set
   */
  public void setAgencia(int agencia) {
    if (agencia >= 0)
      this.agencia = agencia;
  }

  /**
   * @return the numeroDaConta
   */
  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  /**
   * @param numeroDaConta the numeroDaConta to set
   */
  public void setNumeroDaConta(int numeroDaConta) {
    if (numeroDaConta >= 0)
      this.numeroDaConta = numeroDaConta;
  }

  /**
   * @return the saldo
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * @param saldo the saldo to set
   */
  public void setSaldo(double saldo) {
    if (saldo >= 0)
      this.saldo = saldo;
  }

  /**
   * @return the correntista
   */
  public Pessoa getCorrentista() {
    return correntista;
  }

  /**
   * @param correntista the correntista to set
   */
  public void setCorrentista(Pessoa correntista) {
    this.correntista = correntista;
  }

  public boolean deposito(double valor) {
    if (valor > 0) {
      this.saldo += valor;
      return true;
    } else
      return false;
  }

  public boolean saque(double valor) {
    if (valor > 0 && valor <= this.saldo) {
      this.saldo -= valor;
      return true;
    } else
      return false;
  }

  private Pessoa createPessoa(String nome, String endereco) {
    Pessoa p = new Pessoa();
    //
    p.setEndereco(endereco);
    p.setNome(nome);
    return p;
  }

  private Banco createBanco(int codigo, String nome, int numeroAgencia) {
    Banco b = new Banco();
    //
    b.setCodigo(codigo);
    b.setNome(nome);
    b.setNumeroAgencia(numeroAgencia);
    return b;
  }

  protected void setPessoaAtribuitos(String nome, String endereco) {
    setCorrentista(createPessoa(nome, endereco));
  }

  protected void setBancoAtribuitos(int codigo, String nome, int numeroAgencia) {
    setBanco(createBanco(codigo, nome, numeroAgencia));
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nContaBancaria [banco=");
    builder.append(banco);
    builder.append(", agencia=");
    builder.append(agencia);
    builder.append(", numeroDaConta=");
    builder.append(numeroDaConta);
    builder.append(", saldo=");
    builder.append(saldo);
    builder.append(", correntista=");
    builder.append(correntista);
    builder.append("]");
    return builder.toString();
  }
}
