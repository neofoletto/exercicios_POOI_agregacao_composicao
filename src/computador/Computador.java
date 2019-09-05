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

/**
 *
 */
package computador;

/**
 * @author foletto.home
 *
 */
public class Computador extends EquipamentoEletronico{

	private String marca;
	private String modelo;
	protected Gabinete gabinete;
	protected Teclado teclado;
	protected Mouse mouse;
	protected Monitor monitor;

	public Computador() {
		// TODO Auto-generated constructor stub
	 	gabinete = new Gabinete();
		monitor = new Monitor();
		mouse = new Mouse();
		teclado = new Teclado();
	}

	public Computador(String marca, String modelo, Gabinete gabinete, Teclado teclado, Mouse mouse, Monitor monitor) {
		// TODO Auto-generated constructor stub
		setMarca(marca);
		setModelo(modelo);
		setGabinete(gabinete);
		setTeclado(teclado);
		setMouse(mouse);
		setMonitor(monitor);
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
		if(marca.length() > 0)
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
		if(modelo.length() > 0)
			this.modelo = modelo;
	}
	/**
	 * @return the gabinete
	 */
	public Gabinete getGabinete() {
		return gabinete;
	}
	/**
	 * @param gabinete the gabinete to set
	 */
	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	/**
	 * @return the teclado
	 */
	public Teclado getTeclado() {
		return teclado;
	}
	/**
	 * @param teclado the teclado to set
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	/**
	 * @return the mouse
	 */
	public Mouse getMouse() {
		return mouse;
	}
	/**
	 * @param mouse the mouse to set
	 */
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	/**
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}
	/**
	 * @param monitor the monitor to set
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	private Monitor createMonitor(String marca, String tipo, String resolucao) {
		Monitor m = new Monitor();
		m.setMarca(marca);
		m.setResolucao(resolucao);
		m.setTipo(tipo);
		return m;
	}

	private Mouse createMouse(String marca, String tipo) {
		Mouse m = new Mouse();
		m.setMarca(marca);
		m.setTipo(tipo);
		return m;
	}

	private Teclado createTeclado(String marca, String tipo) {
		Teclado t = new Teclado();
		t.setMarca(marca);
		t.setTipo(tipo);
		return t;
	}

	protected void setTecladoAtribuito(String marca, String tipo) {
		setTeclado(createTeclado(marca, tipo));
	}

	protected void setMouseAtribuito(String marca, String tipo) {
		setMouse(createMouse(marca, tipo));
	}

	protected void setMonitorAtribuito(String marca, String tipo, String resolucao) {
		setMonitor(createMonitor(marca, tipo, resolucao));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(gabinete);
		builder.append(teclado);
		builder.append(mouse);
		builder.append(monitor);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
