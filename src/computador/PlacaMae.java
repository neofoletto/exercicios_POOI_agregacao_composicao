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
public class PlacaMae {

  private String marca;
  private String modelo;
  protected Processador processador;
  protected HD hd;
  protected Memoria memoria;

  public PlacaMae() {
    // TODO Auto-generated constructor stub
    hd = new HD();
    memoria = new Memoria();
    processador = new Processador();
  }

  public PlacaMae(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
    // TODO Auto-generated constructor stub
    setMarca(marca);
    setModelo(modelo);
    setProcessador(processador);
    setHd(hd);
    setMemoria(memoria);
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
   * @return the processador
   */
  public Processador getProcessador() {
    return processador;
  }

  /**
   * @param processador the processador to set
   */
  public void setProcessador(Processador processador) {
    this.processador = processador;
  }

  /**
   * @return the hd
   */
  public HD getHd() {
    return hd;
  }

  /**
   * @param hd the hd to set
   */
  public void setHd(HD hd) {
    this.hd = hd;
  }

  /**
   * @return the memoria
   */
  public Memoria getMemoria() {
    return memoria;
  }

  /**
   * @param memoria the memoria to set
   */
  public void setMemoria(Memoria memoria) {
    this.memoria = memoria;
  }

  private Processador createProcessador(String marca, String modelo, float clock, float cache) {
    Processador p = new Processador();
    //
    p.setCache(cache);
    p.setClock(clock);
    p.setMarca(marca);
    p.setModelo(modelo);
    return p;
  }

  private Memoria createMemoria(String marca, String modelo, float capacidade, float velocidade) {
    Memoria m = new Memoria();
    //
    m.setCapacidade(capacidade);
    m.setVelocidade(velocidade);
    m.setMarca(marca);
    m.setModelo(modelo);
    return m;
  }

  private HD createHd(String marca, String modelo, float capacidade, int rpm) {
    HD h = new HD();
    //
    h.setRmp(rpm);
    h.setCapacidade(capacidade);
    h.setMarca(marca);
    h.setModelo(modelo);
    return h;
  }

  protected void setHDAtribuitos(String marca, String modelo, float capacidade, int rpm) {
    setHd(createHd(marca, modelo, capacidade, rpm));
  }

  protected void setMemoriaAtribuitos(String marca, String modelo, float capacidade, float velocidade) {
    setMemoria(createMemoria(marca, modelo, capacidade, velocidade));
  }

  protected void setProcessadorAtribuitos(String marca, String modelo, float clock, float cache) {
    setProcessador(createProcessador(marca, modelo, clock, cache));
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nPlacaMae [marca=");
    builder.append(marca);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(processador);
    builder.append(hd);
    builder.append(memoria);
    builder.append("]");
    return builder.toString();
  }
}
