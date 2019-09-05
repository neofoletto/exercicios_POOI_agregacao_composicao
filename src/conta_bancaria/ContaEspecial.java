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
public class ContaEspecial extends ContaBancaria {

  private int diasDeJuros;
  private double limite = 0;
  protected CartaoDeCredito credito;

  public ContaEspecial() {
    // TODO Auto-generated constructor stub
  }

  public ContaEspecial(int diasDeJuros, double limiteEspecial, int numero, String operadora, double limiteCredito, String tipoDeCartao) {
    // TODO Auto-generated constructor stub
    setDiasDeJuros(diasDeJuros);
    setLimite(limiteEspecial);
    setCredito(createCartaoCredito(numero, operadora, limiteCredito, tipoDeCartao));
  }

  private CartaoDeCredito createCartaoCredito(int numero, String operadora, double limiteCredito, String tipoDeCartao) {
    CartaoDeCredito cc = new CartaoDeCredito();
    //
    cc.setLimite(limiteCredito);
    cc.setNumero(numero);
    cc.setOperadora(operadora);
    cc.setTipoDeCartao(tipoDeCartao);
    return cc;
  }

  /**
   * @return the diasDeJuros
   */
  public int getDiasDeJuros() {
    return diasDeJuros;
  }

  /**
   * @param diasDeJuros the diasDeJuros to set
   */
  public void setDiasDeJuros(int diasDeJuros) {
    if (diasDeJuros >= 0)
      this.diasDeJuros = diasDeJuros;
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
   * @return the credito
   */
  public CartaoDeCredito getCredito() {
    return credito;
  }

  /**
   * @param credito the credito to set
   */
  public void setCredito(CartaoDeCredito credito) {
    this.credito = credito;
  }

  public void setCartaoDeCredito(int numero, String operadora, double limiteCredito, String tipoDeCartao) {
    setCredito(createCartaoCredito(numero, operadora, limiteCredito, tipoDeCartao));
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ContaEspecial [diasDeJuros=");
    builder.append(diasDeJuros);
    builder.append(", limite=");
    builder.append(limite);
    builder.append(", credito=");
    builder.append(credito);
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
