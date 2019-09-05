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
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Computador c = new Computador();
    //
    c.setMarca("aaaa");
    c.setModelo("aaaa");
    c.setConsumo(1222123);
    c.setTensao(220);
    //
    c.monitor.setMarca("mmm");
    c.monitor.setResolucao("123123x1");
    c.monitor.setTipo("mmm");
    //
    c.mouse.setMarca("mou");
    c.mouse.setTipo("miu");
    //
    c.teclado.setMarca("mou");
    c.teclado.setTipo("miu");
    //
    c.gabinete.setBaias(1);
    c.gabinete.setModelo("gggg");
    c.gabinete.setTipo("gggg");
    //
    c.gabinete.placaMae.setMarca("aaa");
    c.gabinete.placaMae.setModelo("aaaa");
    //
    c.gabinete.placaMae.hd.setCapacidade(11111);
    c.gabinete.placaMae.hd.setMarca("hf");
    c.gabinete.placaMae.hd.setModelo("hd");
    c.gabinete.placaMae.hd.setRmp(10000);
    //
    c.gabinete.placaMae.memoria.setCapacidade(12312313);
    c.gabinete.placaMae.memoria.setMarca("memo");
    c.gabinete.placaMae.memoria.setModelo("mode");
    c.gabinete.placaMae.memoria.setVelocidade(123123213);
    //
    c.gabinete.placaMae.processador.setCache(123123);
    c.gabinete.placaMae.processador.setClock(123123);
    c.gabinete.placaMae.processador.setMarca("proc");
    c.gabinete.placaMae.processador.setModelo("prov");

    System.out.println(c);
  }

}
