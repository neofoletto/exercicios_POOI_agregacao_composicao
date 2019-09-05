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

package conta_bancaria;

/**
 * @author foletto.home
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ContaSimples cs = new ContaSimples();
    ContaEspecial ce = new ContaEspecial();
    //
    cs.setBancoAtribuitos(99112, "oasihiosahdoi", 1122);
    cs.setPessoaAtribuitos("OILindo", "Rua da beleza");
    cs.setAgencia(11111);
    cs.setNumeroDaConta(11222333);
    cs.setSaldo(8000);
    cs.setSaldoPoupanca(1200123); //conta simples
    //
    cs.setBancoAtribuitos(99112, "oasihiosahdoi", 1122);
    cs.setPessoaAtribuitos("OILindo", "Rua da beleza");
    ce.setAgencia(2222222);
    ce.setNumeroDaConta(66666666);
    ce.setSaldo(3000);
    ce.setDiasDeJuros(10); //conta especial
    ce.setLimite(1400); //conta especial
    ce.setCartaoDeCredito(191, "Blazikosvitche", 1400, "Alimentacao"); //cartao de credito
    //
    System.out.println(cs);
    System.out.println(ce);
  }

}
