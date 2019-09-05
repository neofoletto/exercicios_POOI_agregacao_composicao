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

package sistema_de_som;

/**
 * @author neo
 *
 */
public class SistemaDeSom extends EquipamentoEletronico {

  private String marca;
  private String modelo;
  private String potencia;

  public SistemaDeSom() {
    // TODO Auto-generated constructor stub
  }

  public SistemaDeSom(String marca, String modelo, String potencia, float tensao, float consumo) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setModelo(modelo);
    setPotencia(potencia);
    EquipamentoEletronico eq = new EquipamentoEletronico(tensao, consumo);
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
    if (marca.length() > 2)
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
    if (modelo.length() > 2)
      this.modelo = modelo;
  }

  /**
   * @return the potencia
   */
  public String getPotencia() {
    return potencia;
  }

  /**
   * @param potencia the potencia to set
   */
  public void setPotencia(String potencia) {
    if (potencia.length() > 2)
      this.potencia = potencia;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("SistemaDeSom [marca=");
    builder.append(marca);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(", potencia=");
    builder.append(potencia);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
