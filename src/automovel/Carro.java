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
public class Carro {

  private String fabricante;
  private String modelo;
  private String cor;
  private int ano;
  protected Pessoa dono;
  protected Motor motor;

  public Carro() {
    // TODO Auto-generated constructor stub
  }

  public Carro(String fabricante, String modelo, String cor, int ano, Pessoa dono, Motor motor) {
    // TODO Auto-generated constructor stub
    setFabricante(fabricante);
    setModelo(modelo);
    setCor(cor);
    setAno(ano);
    setDono(dono);
    setModelo(modelo);
  }

  /**
   * @return the fabricante
   */
  public String getFabricante() {
    return fabricante;
  }

  /**
   * @param fabricante the fabricante to set
   */
  public void setFabricante(String fabricante) {
    if (fabricante.length() > 3)
      this.fabricante = fabricante;
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
    if (modelo.length() > 3)
      this.modelo = modelo;
  }

  /**
   * @return the cor
   */
  public String getCor() {
    return cor;
  }

  /**
   * @param cor the cor to set
   */
  public void setCor(String cor) {
    if (cor.length() > 2)
      this.cor = cor;
  }

  /**
   * @return the ano
   */
  public int getAno() {
    return ano;
  }

  /**
   * @param ano the ano to set
   */
  public void setAno(int ano) {
    if (ano > 1910)
      this.ano = ano;
  }

  /**
   * @return the dono
   */
  public Pessoa getDono() {
    return dono;
  }

  /**
   * @param dono the dono to set
   */
  public void setDono(Pessoa dono) {
    this.dono = dono;
  }

  /**
   * @return the motor
   */
  public Motor getMotor() {
    return motor;
  }

  /**
   * @param motor the motor to set
   */
  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Carro [fabricante=");
    builder.append(fabricante);
    builder.append(", modelo=");
    builder.append(modelo);
    builder.append(", cor=");
    builder.append(cor);
    builder.append(", ano=");
    builder.append(ano);
    builder.append("\nDono = ");
    builder.append(dono);
    builder.append("\nMotor = ");
    builder.append(motor);
    return builder.toString();
  }
}
