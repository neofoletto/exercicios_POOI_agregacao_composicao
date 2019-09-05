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
public class SistemaDeVideo extends EquipamentoEletronico {

  private String marca;
  private String modelo;
  private String tipo;
  private String resolucao;

  public SistemaDeVideo() {
    // TODO Auto-generated constructor stub
  }

  public SistemaDeVideo(String marca, String modelo, String tipo, String resolucao, float tensao, float consumo) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setModelo(modelo);
    setTipo(tipo);
    setResolucao(resolucao);
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
   * @return the tipo
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * @param tipo the tipo to set
   */
  public void setTipo(String tipo) {
    if (tipo.length() > 2)
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
    if (resolucao.length() > 2)
      this.resolucao = resolucao;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("SistemaDeVideo [marca=");
    builder.append(marca);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(", tipo=");
    builder.append(tipo);
    builder.append(", resolucao=");
    builder.append(resolucao);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
