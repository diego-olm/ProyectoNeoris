package neoris.app.domain;

public class Producto
{

	private int idProducto;
	private String Descripcion;
	private int idProveedor;
	private int idCategoria;
	private double precioUnitario;
	private int unidadesStock;
	private int unidadesStockMinimo;
	private int unidadesStockMaximo;
	private int flgDescontinuo;
	
	
	
	
	public Producto()
	{
		super();
	}
	public Producto(int idProducto,String descripcion,int idProveedor,int idCategoria,double precioUnitario,int unidadesStock,int unidadesStockMinimo,int unidadesStockMaximo,int flgDescontinuo)
	{
		super();
		this.idProducto=idProducto;
		Descripcion=descripcion;
		this.idProveedor=idProveedor;
		this.idCategoria=idCategoria;
		this.precioUnitario=precioUnitario;
		this.unidadesStock=unidadesStock;
		this.unidadesStockMinimo=unidadesStockMinimo;
		this.unidadesStockMaximo=unidadesStockMaximo;
		this.flgDescontinuo=flgDescontinuo;
	}
	public int getIdProducto()
	{
		return idProducto;
	}
	public void setIdProducto(int idProducto)
	{
		this.idProducto=idProducto;
	}
	public String getDescripcion()
	{
		return Descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		Descripcion=descripcion;
	}
	public int getIdProveedor()
	{
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor)
	{
		this.idProveedor=idProveedor;
	}
	public int getIdCategoria()
	{
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria=idCategoria;
	}
	public double getPrecioUnitario()
	{
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario)
	{
		this.precioUnitario=precioUnitario;
	}
	public int getUnidadesStock()
	{
		return unidadesStock;
	}
	public void setUnidadesStock(int unidadesStock)
	{
		this.unidadesStock=unidadesStock;
	}
	public int getUnidadesStockMinimo()
	{
		return unidadesStockMinimo;
	}
	public void setUnidadesStockMinimo(int unidadesStockMinimo)
	{
		this.unidadesStockMinimo=unidadesStockMinimo;
	}
	public int getUnidadesStockMaximo()
	{
		return unidadesStockMaximo;
	}
	public void setUnidadesStockMaximo(int unidadesStockMaximo)
	{
		this.unidadesStockMaximo=unidadesStockMaximo;
	}
	public int getFlgDescontinuo()
	{
		return flgDescontinuo;
	}
	public void setFlgDescontinuo(int flgDescontinuo)
	{
		this.flgDescontinuo=flgDescontinuo;
	}
	@Override
	public String toString()
	{
		return "idProducto="+idProducto+", Descripcion="+Descripcion+", idProveedor="+idProveedor+", idCategoria="+idCategoria+", precioUnitario="+precioUnitario+", unidadesStock="
				+unidadesStock+", unidadesStockMinimo="+unidadesStockMinimo+", unidadesStockMaximo="+unidadesStockMaximo+", flgDescontinuo="+flgDescontinuo+" ";
	}
	
	
}
