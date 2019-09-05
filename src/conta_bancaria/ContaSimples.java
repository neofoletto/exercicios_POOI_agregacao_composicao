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
public class ContaSimples extends ContaBancaria {

  private double saldoPoupanca = 0;

  public ContaSimples() {
    // TODO Auto-generated constructor stub
  }

  public ContaSimples(double saldoPoupanca) {
    // TODO Auto-generated constructor stub
    setSaldoPoupanca(saldoPoupanca);
  }

  /**
   * @return the saldoPoupanca
   */
  public double getSaldoPoupanca() {
    return saldoPoupanca;
  }

  /**
   * @param saldoPoupanca the saldoPoupanca to set
   */
  public void setSaldoPoupanca(double saldoPoupanca) {
    if (saldoPoupanca >= 0)
      this.saldoPoupanca = saldoPoupanca;
  }

  public boolean depositoPoupanca(double valor) {
    if (valor > 0) {
      this.saldoPoupanca += valor;
      return true;
    } else
      return false;
  }

  public boolean saquePoupanca(double valor) {
    if (valor > 0 && valor >= this.saldoPoupanca) {
      this.saldoPoupanca -= valor;
      return true;
    } else
      return false;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ContaSimples [saldoPoupanca=");
    builder.append(saldoPoupanca);
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
