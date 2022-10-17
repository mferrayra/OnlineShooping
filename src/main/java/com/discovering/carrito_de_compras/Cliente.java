package com.discovering.carrito_de_compras;

import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cliente implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Documento")
	@org.kie.api.definition.type.Description("Documento del cliente")
	private int documento;
	@org.kie.api.definition.type.Label("Nombres")
	@org.kie.api.definition.type.Description("Nombre completo del cliente")
	private java.lang.String nombres;
	@org.kie.api.definition.type.Label("Fecha Nacimiento")
	@org.kie.api.definition.type.Description("Fecha de nacimiento del cliente")
	private Date fechaNacimiento;
	@org.kie.api.definition.type.Label("Nro. Compra")
	@org.kie.api.definition.type.Description("Nro. de compras al momento")
	private int nroCompra;
	@org.kie.api.definition.type.Label("Cupon Descuento")
	@org.kie.api.definition.type.Description("Porcentaje de descuento sobre el total de la compra")
	private double descuentoCupon;
	@org.kie.api.definition.type.Label("Cupon Descuento Proxima Compra")
	@org.kie.api.definition.type.Description("Gano un cupon de descuento para la próxima compra")
	private double cuponDescuentoProximaCompra;
	@org.kie.api.definition.type.Label("Gastos Envio")
	@org.kie.api.definition.type.Description("Gastos de envío, puede ser 0.")
	private double gastoEnvio;
	@org.kie.api.definition.type.Label("Productos")
	@org.kie.api.definition.type.Description("Productos de la compra")
	private java.util.List<com.discovering.carrito_de_compras.Producto> productos;

	@org.kie.api.definition.type.Label("Total")
	@org.kie.api.definition.type.Description("Importe total de la compra")
	private double importeTotal;

	@org.kie.api.definition.type.Description("Indica la forma en que el cliente recibe la compra.")
	@org.kie.api.definition.type.Label("Envio")
	private java.lang.String formaEnvio;

	@org.kie.api.definition.type.Description("Indica si se le debe enviar una encuesta de satisfaccion")
	@org.kie.api.definition.type.Label("Encuesta Satisfaccion")
	private Boolean enviarEncuestaSatisfaccion;

	@org.kie.api.definition.type.Description("Observaciones descuentos")
	@org.kie.api.definition.type.Label("Observaciones")
	private java.util.List<java.lang.String> obsDescuentos;

	@org.kie.api.definition.type.Description("Indica que los todos los descuentos de la compra fueron procesaron.")
	@org.kie.api.definition.type.Label("Descuentos Procesados")
	private java.lang.Boolean descuentosProcesados;

	public Cliente() {
	}

	public java.lang.String getNombres() {
		return this.nombres;
	}

	public void setNombres(java.lang.String nombres) {
		this.nombres = nombres;
	}

	public java.util.List<com.discovering.carrito_de_compras.Producto> getProductos() {
		if (this.productos == null) {
		    this.productos = new java.util.ArrayList();
		}
			
		return this.productos;
	}

	public void setProductos(
			java.util.List<com.discovering.carrito_de_compras.Producto> productos) {
		this.productos = productos;
	}

	public java.lang.String getFormaEnvio() {
		return this.formaEnvio;
	}

	public void setFormaEnvio(java.lang.String formaEnvio) {
		this.formaEnvio = formaEnvio;
	}

	public java.util.List<java.lang.String> getObsDescuentos() {
		if (this.obsDescuentos == null) {
			this.obsDescuentos = new java.util.ArrayList();
		}
		return this.obsDescuentos;
	}

	public void setObsDescuentos(java.util.List<java.lang.String> obsDescuentos) {
		this.obsDescuentos = obsDescuentos;
	}

	public void addObservacionDescuento(String obs) {
		this.getObsDescuentos().add(obs);
	}

	public java.lang.Boolean indicaPrimeraCompra() {
		Producto productoDescuentoPrimeraCompra = this.getProductos().stream()
				.findFirst().orElse(null);
		if (productoDescuentoPrimeraCompra != null) {
			return productoDescuentoPrimeraCompra
					.getAplicaDescuentoPrimeraCompra();
		}
		return false;
	}

	public void aplicarDescuentoPrimeraCompra() {
		Producto productoDescuentoPrimeraCompra = this.getProductos().stream()
				.findFirst().orElse(null);
		if (productoDescuentoPrimeraCompra != null) {
			productoDescuentoPrimeraCompra
					.setAplicaDescuentoPrimeraCompra(true);
		}
	}

	public java.lang.Boolean cumpleCliente() {
		java.util.Date now = new java.util.Date();

		return this.fechaNacimiento.getDate() == now.getDate()
				&& this.fechaNacimiento.getMonth() == now.getMonth();
	}

	public java.util.Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(java.util.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getDocumento() {
		return this.documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public int getNroCompra() {
		return this.nroCompra;
	}

	public void setNroCompra(int nroCompra) {
		this.nroCompra = nroCompra;
	}

	public double getDescuentoCupon() {
		return this.descuentoCupon;
	}

	public void setDescuentoCupon(double descuentoCupon) {
		this.descuentoCupon = descuentoCupon;
	}

	public double getCuponDescuentoProximaCompra() {
		return this.cuponDescuentoProximaCompra;
	}

	public void setCuponDescuentoProximaCompra(
			double cuponDescuentoProximaCompra) {
		this.cuponDescuentoProximaCompra = cuponDescuentoProximaCompra;
	}

	public double getGastoEnvio() {
		return this.gastoEnvio;
	}

	public void setGastoEnvio(double gastoEnvio) {
		this.gastoEnvio = gastoEnvio;
	}

	public double getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public java.lang.Boolean getEnviarEncuestaSatisfaccion() {
		return this.enviarEncuestaSatisfaccion;
	}

	public void setEnviarEncuestaSatisfaccion(
			java.lang.Boolean enviarEncuestaSatisfaccion) {
		this.enviarEncuestaSatisfaccion = enviarEncuestaSatisfaccion;
	}

	public void aplicarDescuentoPorCumple() {
		Producto productosIguales = this.getProductos().stream()
				.filter(p -> p.getCantidad() > 1).findFirst().orElse(null);
		if (productosIguales != null) {
			productosIguales.setAplicaDescuentoCumple(true);
		} else {
			for (Producto producto : this.getProductos()) {
				producto.setAplicaDescuentoCumple(true);
			}
		}
	}

	public java.lang.Boolean getDescuentosProcesados() {
		return this.descuentosProcesados;
	}

	public void setDescuentosProcesados(java.lang.Boolean descuentosProcesados) {
		this.descuentosProcesados = descuentosProcesados;
	}

	public Cliente(
			int documento,
			java.lang.String nombres,
			java.util.Date fechaNacimiento,
			int nroCompra,
			double descuentoCupon,
			double cuponDescuentoProximaCompra,
			double gastoEnvio,
			java.util.List<com.discovering.carrito_de_compras.Producto> productos,
			double importeTotal, java.lang.String formaEnvio,
			java.lang.Boolean enviarEncuestaSatisfaccion,
			java.util.List<java.lang.String> obsDescuentos,
			java.lang.Boolean descuentosProcesados) {
		this.documento = documento;
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.nroCompra = nroCompra;
		this.descuentoCupon = descuentoCupon;
		this.cuponDescuentoProximaCompra = cuponDescuentoProximaCompra;
		this.gastoEnvio = gastoEnvio;
		this.productos = productos;
		this.importeTotal = importeTotal;
		this.formaEnvio = formaEnvio;
		this.enviarEncuestaSatisfaccion = enviarEncuestaSatisfaccion;
		this.obsDescuentos = obsDescuentos;
		this.descuentosProcesados = descuentosProcesados;
	}
}