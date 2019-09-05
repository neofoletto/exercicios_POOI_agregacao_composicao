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
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Carro c = new Carro();
    Pessoa p = new Pessoa();
    Motor m = new Motor();
    //
    p.setEndereco("aaaadddaadadadadadaad");
    p.setNome("Obsvaldo");
    //
    m.setCilindros(4);
    m.setCombustivel("Gasosa");
    m.setMarca("Chinoca");
    m.setPotencia(1111111);
    //
    c.setFabricante("adsasd");
    c.setModelo("swd");
    c.setAno(1999);
    c.setDono(p);
    c.setMotor(m);
    //
    System.out.println(c);
  }

}
