package com.discovering.carrito_de_compras;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Gastos implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Description("Gastos de envio de la compra si retira por correo.")
	@org.kie.api.definition.type.Label("Envio Correo")
	private double retiraCorreo;
	@org.kie.api.definition.type.Description("Gastos de envio de la compra a domicilio")
	@org.kie.api.definition.type.Label("Envio Domicilio")
	private double envioDomicilio;

	public Gastos() {
	}

	public double getRetiraCorreo() {
		return this.retiraCorreo;
	}

	public void setRetiraCorreo(double retiraCorreo) {
		this.retiraCorreo = retiraCorreo;
	}

	public double getEnvioDomicilio() {
		return this.envioDomicilio;
	}

	public void setEnvioDomicilio(double envioDomicilio) {
		this.envioDomicilio = envioDomicilio;
	}

	public Gastos(double retiraCorreo, double envioDomicilio) {
		this.retiraCorreo = retiraCorreo;
		this.envioDomicilio = envioDomicilio;
	}

}