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

package automovel;

/**
 * @author neo
 */
public class Motor {

  private String marca;
  private float potencia;
  private int cilindros;
  private String combustivel;

  public Motor() {
    // TODO Auto-generated constructor stub
  }

  public Motor(String marca, float potencia, int cilindros, String combustivel) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setPotencia(potencia);
    setCilindros(cilindros);
    setCombustivel(combustivel);
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
    if (marca.length() > 3)
      this.marca = marca;
  }

  /**
   * @return the potencia
   */
  public float getPotencia() {
    return potencia;
  }

  /**
   * @param potencia the potencia to set
   */
  public void setPotencia(float potencia) {
    if (potencia > 0)
      this.potencia = potencia;
  }

  /**
   * @return the cilindros
   */
  public int getCilindros() {
    return cilindros;
  }

  /**
   * @param cilindros the cilindros to set
   */
  public void setCilindros(int cilindros) {
    if (cilindros > 0)
      this.cilindros = cilindros;
  }

  /**
   * @return the combustivel
   */
  public String getCombustivel() {
    return combustivel;
  }

  /**
   * @param combustivel the combustivel to set
   */
  public void setCombustivel(String combustivel) {
    if (combustivel.length() > 3)
      this.combustivel = combustivel;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Motor [marca=");
    builder.append(marca);
    builder.append(", potencia=");
    builder.append(potencia);
    builder.append(", cilindros=");
    builder.append(cilindros);
    builder.append(", combustivel=");
    builder.append(combustivel);
    builder.append("]");
    return builder.toString();
  }
}
