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
public class Gabinete {

  private String modelo;
  private String tipo;
  private int baias;
  protected PlacaMae placaMae;

  public Gabinete() {
    // TODO Auto-generated constructor stub
    placaMae = new PlacaMae();
  }


  public Gabinete(String modelo, String tipo, int baias, PlacaMae placaMae) {
    // TODO Auto-generated constructor stub
    setModelo(modelo);
    setTipo(tipo);
    setBaias(baias);
    setPlacaMae(placaMae);
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
   * @return the baias
   */
  public int getBaias() {
    return baias;
  }

  /**
   * @param baias the baias to set
   */
  public void setBaias(int baias) {
    if (baias > 0)
      this.baias = baias;
  }

  /**
   * @return the placaMae
   */
  public PlacaMae getPlacaMae() {
    return placaMae;
  }

  /**
   * @param placaMae the placaMae to set
   */
  public void setPlacaMae(PlacaMae placaMae) {
    this.placaMae = placaMae;
  }

  private PlacaMae createPlacaMae(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
    PlacaMae p = new PlacaMae();
    //
    p.setHd(hd);
    p.setMarca(marca);
    p.setMemoria(memoria);
    p.setModelo(modelo);
    p.setProcessador(processador);
    return p;
  }

  public void setPlacaMaeAtribuitos(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
    setPlacaMae(createPlacaMae(marca, modelo, processador, hd, memoria));
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Gabinete [modelo=");
    builder.append(modelo);
    builder.append(", tipo=");
    builder.append(tipo);
    builder.append(", baias=");
    builder.append(baias);
    builder.append(placaMae);
    builder.append("]");
    return builder.toString();
  }
}
