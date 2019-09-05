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
public class HD {

  private String marca;
  private String modelo;
  private float capacidade;
  private int rpm;

  public HD() {
    // TODO Auto-generated constructor stub
  }

  public HD(String marca, String modelo, float capacidade, int rpm) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setModelo(modelo);
    setCapacidade(capacidade);
    setRmp(rpm);
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
   * @return the modelo
   */
  public String getModelo() {
    return modelo;
  }

  /**
   * @param modelo the modelo to set
   */
  public void setModelo(String modelo) {
    if (modelo.length() > 0)
      this.modelo = modelo;
  }

  /**
   * @return the capacidade
   */
  public float getCapacidade() {
    return capacidade;
  }

  /**
   * @param capacidade the capacidade to set
   */
  public void setCapacidade(float capacidade) {
    if (capacidade > 0)
      this.capacidade = capacidade;
  }

  /**
   * @return the rmp
   */
  public int getRmp() {
    return rpm;
  }

  /**
   * @param rmp the rmp to set
   */
  public void setRmp(int rpm) {
    if (rpm > 600)
      this.rpm = rpm;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nHD [marca=");
    builder.append(marca);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(", capacidade=");
    builder.append(capacidade);
    builder.append(", rmp=");
    builder.append(rpm);
    builder.append("]");
    return builder.toString();
  }
}
