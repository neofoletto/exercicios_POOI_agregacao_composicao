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
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    HomeTheater ht = new HomeTheater();
    SistemaDeVideo sv = new SistemaDeVideo();
    SistemaDeSom ss = new SistemaDeSom();
    //
    sv.setTensao(110);
    sv.setConsumo(2000);
    sv.setMarca("AWD");
    sv.setModelo("Pancadao");
    sv.setResolucao("1920x1080");
    sv.setTipo("parede");
    ht.setSistemaDeVideo(sv);
    //
    ss.setTensao(220);
    ss.setConsumo(12221);
    ss.setMarca("Capirot");
    ss.setModelo("Bermeio");
    ss.setPotencia("222222222");
    ht.setSistemaDeSom(ss);
    //
    System.out.println(ht);
  }

}
