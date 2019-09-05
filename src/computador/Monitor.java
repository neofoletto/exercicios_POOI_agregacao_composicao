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

package computador;

/**
 * @author neo
 *
 */
public class Monitor {

  private String marca;
  private String tipo;
  private String resolucao;

  public Monitor() {
    // TODO Auto-generated constructor stub
  }

  public Monitor(String marca, String tipo, String resolucao) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setTipo(tipo);
    setResolucao(resolucao);
  }

  /**
   * @return the marca
   */
  public String getMarca() {
    return marca;
  }

  /**
   * @param marca the marca to set
   */
  public void setMarca(String marca) {
    if (marca.length() > 0)
      this.marca = marca;
  }

  /**
   * @return the tipo
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * @param tipo the tipo to set
   */
  public void setTipo(String tipo) {
    if (tipo.length() > 0)
      this.tipo = tipo;
  }

  /**
   * @return the resolucao
   */
  public String getResolucao() {
    return resolucao;
  }

  /**
   * @param resolucao the resolucao to set
   */
  public void setResolucao(String resolucao) {
    if (resolucao.length() > 0)
      this.resolucao = resolucao;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nMonitor [marca=");
    builder.append(marca);
    builder.append(", tipo=");
    builder.append(tipo);
    builder.append(", resolucao=");
    builder.append(resolucao);
    builder.append("]");
    return builder.toString();
  }
}
