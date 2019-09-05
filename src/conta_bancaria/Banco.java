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
public class Banco {

  private int codigo;
  private String nome;
  private int numeroAgencia;

  public Banco() {
    // TODO Auto-generated constructor stub
  }

  public Banco(int codigo, String nome, int numeroAgencia) {
    // TODO Auto-generated constructor stub
    setCodigo(codigo);
    setNome(nome);
    setNumeroAgencia(numeroAgencia);
  }

  protected void setAtribitos(int codigo, String nome, int numeroAgencia) {
    setCodigo(codigo);
    setNome(nome);
    setNumeroAgencia(numeroAgencia);
  }

  /**
   * @return the codigo
   */
  public int getCodigo() {
    return codigo;
  }

  /**
   * @param codigo the codigo to set
   */
  public void setCodigo(int codigo) {
    if (codigo > 0)
      this.codigo = codigo;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    if (nome.length() > 3)
      this.nome = nome;
  }

  /**
   * @return the numeroAgencia
   */
  public int getNumeroAgencia() {
    return numeroAgencia;
  }

  /**
   * @param numeroAgencia the numeroAgencia to set
   */
  public void setNumeroAgencia(int numeroAgencia) {
    if (numeroAgencia > 0)
      this.numeroAgencia = numeroAgencia;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Banco [codigo=");
    builder.append(codigo);
    builder.append(", nome=");
    builder.append(nome);
    builder.append(", numeroAgencia=");
    builder.append(numeroAgencia);
    builder.append("]");
    return builder.toString();
  }
}
