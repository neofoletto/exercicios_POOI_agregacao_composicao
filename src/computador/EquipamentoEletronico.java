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
public class EquipamentoEletronico {

  private float tensao;
  private float consumo;

  public EquipamentoEletronico() {
    // TODO Auto-generated constructor stub
  }

  public EquipamentoEletronico(float tensa, float consumo) {
    // TODO Auto-generated constructor stub
    setTensao(tensa);
    setConsumo(consumo);
  }

  /**
   * @return the tensao
   */
  public float getTensao() {
    return tensao;
  }

  /**
   * @param tensao the tensao to set
   */
  public void setTensao(float tensao) {
    if (tensao > 0)
      this.tensao = tensao;
  }

  /**
   * @return the consumo
   */
  public float getConsumo() {
    return consumo;
  }

  /**
   * @param consumo the consumo to set
   */
  public void setConsumo(float consumo) {
    if (consumo > 0)
      this.consumo = consumo;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nEquipamentoEletronico [tensao=");
    builder.append(tensao);
    builder.append(", consumo=");
    builder.append(consumo);
    builder.append("]");
    return builder.toString();
  }
}
