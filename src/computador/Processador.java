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
public class Processador {

  private String marca;
  private String modelo;
  private float clock;
  private float cache;

  public Processador() {
    // TODO Auto-generated constructor stub
  }

  private void publi(String marca, String modelo, float clock, float cache) {
    // TODO Auto-generated method stub
    setModelo(modelo);
    setMarca(marca);
    setClock(cache);
    setCache(cache);
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
   * @return the clock
   */
  public float getClock() {
    return clock;
  }

  /**
   * @param clock the clock to set
   */
  public void setClock(float clock) {
    if (clock > 0)
      this.clock = clock;
  }

  /**
   * @return the cache
   */
  public float getCache() {
    return cache;
  }

  /**
   * @param cache the cache to set
   */
  public void setCache(float cache) {
    if (cache > 0)
      this.cache = cache;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\nProcessador [marca=");
    builder.append(marca);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(", clock=");
    builder.append(clock);
    builder.append(", cache=");
    builder.append(cache);
    builder.append("]");
    return builder.toString();
  }
}
