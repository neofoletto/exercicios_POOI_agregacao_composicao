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
public class HomeTheater {

  protected SistemaDeSom sistemaDeSom;
  protected SistemaDeVideo sistemaDeVideo;

  public HomeTheater() {
    // TODO Auto-generated constructor stub
  }

  public HomeTheater(SistemaDeVideo sistemaDeVideo, SistemaDeSom sistemaDeSom) {
    // TODO Auto-generated constructor stub
    setSistemaDeSom(sistemaDeSom);
    setSistemaDeVideo(sistemaDeVideo);
  }

  /**
   * @return the sistemaDeSom
   */
  public SistemaDeSom getSistemaDeSom() {
    return sistemaDeSom;
  }

  /**
   * @param sistemaDeSom the sistemaDeSom to set
   */
  public void setSistemaDeSom(SistemaDeSom sistemaDeSom) {
    this.sistemaDeSom = sistemaDeSom;
  }

  /**
   * @return the sistemaDeVideo
   */
  public SistemaDeVideo getSistemaDeVideo() {
    return sistemaDeVideo;
  }

  /**
   * @param sistemaDeVideo the sistemaDeVideo to set
   */
  public void setSistemaDeVideo(SistemaDeVideo sistemaDeVideo) {
    this.sistemaDeVideo = sistemaDeVideo;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("HomeTheater \nSistema De Som =");
    builder.append(sistemaDeSom);
    builder.append("\nSistema De Video = ");
    builder.append(sistemaDeVideo);
    builder.append("]");
    return builder.toString();
  }

}
