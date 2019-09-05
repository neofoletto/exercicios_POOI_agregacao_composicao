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
public class Pessoa {

  private String nome;
  private String endereco;

  public Pessoa() {
    // TODO Auto-generated constructor stub
  }

  public Pessoa(String nome, String endereco) {
    // TODO Auto-generated constructor stub
    setNome(nome);
    setEndereco(endereco);
  }

  protected void setAtribuitos(String nome, String endereco) {
    setNome(nome);
    setEndereco(endereco);
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
   * @return the endereco
   */
  public String getEndereco() {
    return endereco;
  }

  /**
   * @param endereco the endereco to set
   */
  public void setEndereco(String endereco) {
    if (endereco.length() > 3)
      this.endereco = endereco;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Pessoa [nome=");
    builder.append(nome);
    builder.append(", endereco=");
    builder.append(endereco);
    builder.append("]");
    return builder.toString();
  }
}
