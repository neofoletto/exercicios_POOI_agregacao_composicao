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
public class CartaoDeCredito {

  private int numero;
  private String operadora;
  private double limite = 0;
  private String tipoDeCartao;

  public CartaoDeCredito() {
    // TODO Auto-generated constructor stub
  }

  public CartaoDeCredito(int numero, String operadora, double limite, String tipoDeCartao) {
    // TODO Auto-generated constructor stub
    setNumero(numero);
    setOperadora(operadora);
    setLimite(limite);
    setTipoDeCartao(tipoDeCartao);
  }

  /**
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }

  /**
   * @param numero the numero to set
   */
  public void setNumero(int numero) {
    if (numero > 0)
      this.numero = numero;
  }

  /**
   * @return the operadora
   */
  public String getOperadora() {
    return operadora;
  }

  /**
   * @param operadora the operadora to set
   */
  public void setOperadora(String operadora) {
    if (operadora.length() > 0)
      this.operadora = operadora;
  }

  /**
   * @return the limite
   */
  public double getLimite() {
    return limite;
  }

  /**
   * @param limite the limite to set
   */
  public void setLimite(double limite) {
    if (limite >= 0)
      this.limite = limite;
  }

  /**
   * @return the tipoDeCartao
   */
  public String getTipoDeCartao() {
    return tipoDeCartao;
  }

  /**
   * @param tipoDeCartao the tipoDeCartao to set
   */
  public void setTipoDeCartao(String tipoDeCartao) {
    if (tipoDeCartao.length() > 0)
      this.tipoDeCartao = tipoDeCartao;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("CartaoDeCredito [numero=");
    builder.append(numero);
    builder.append(", operadora=");
    builder.append(operadora);
    builder.append(", limite=");
    builder.append(limite);
    builder.append(", tipoDeCartao=");
    builder.append(tipoDeCartao);
    builder.append("]");
    return builder.toString();
  }
}
