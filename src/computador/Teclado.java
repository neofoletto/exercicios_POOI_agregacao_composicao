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
public class
Teclado {

  private String marca;
  private String tipo;

  public Teclado() {
    // TODO Auto-generated constructor stub
  }

  public Teclado(String marca, String tipo) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setTipo(tipo);
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

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nTeclado [marca=");
    builder.append(marca);
    builder.append(", tipo=");
    builder.append(tipo);
    builder.append("]");
    return builder.toString();
  }
}
