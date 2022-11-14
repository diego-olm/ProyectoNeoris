package neoris.app.domain;

public class Proveedor
{
	private int idProveedor;
	private String empresa;
	private String contacto;
	private String direccion;
	
	
	
	public Proveedor()
	{
		super();
	}
	public Proveedor(int idProveedor,String empresa,String contacto,String direccion)
	{
		super();
		this.idProveedor=idProveedor;
		this.empresa=empresa;
		this.contacto=contacto;
		this.direccion=direccion;
	}
	public int getIdProveedor()
	{
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor)
	{
		this.idProveedor=idProveedor;
	}
	public String getEmpresa()
	{
		return empresa;
	}
	public void setEmpresa(String empresa)
	{
		this.empresa=empresa;
	}
	public String getContacto()
	{
		return contacto;
	}
	public void setContacto(String contacto)
	{
		this.contacto=contacto;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion=direccion;
	}
	@Override
	public String toString()
	{
		return "idProveedor="+idProveedor+", empresa="+empresa+", contacto="+contacto+", direccion="+direccion+" ";
	}
	
	
}
