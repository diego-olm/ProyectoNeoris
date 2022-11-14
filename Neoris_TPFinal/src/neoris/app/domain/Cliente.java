package neoris.app.domain;

import java.util.Objects;

public class Cliente
{
	private int idCliente;
	private int idUsuario;
	private String nombre;
	private String direccion;
	private int idTipoCliente;
	
	
	
	public Cliente()
	{
		super();
	}
	public Cliente(int idCliente,int idUsuario,String nombre,String direccion,int idTipoCliente)
	{
		super();
		this.idCliente=idCliente;
		this.idUsuario=idUsuario;
		this.nombre=nombre;
		this.direccion=direccion;
		this.idTipoCliente=idTipoCliente;
	}
	public int getIdCliente()
	{
		return idCliente;
	}
	public void setIdCliente(int idCliente)
	{
		this.idCliente=idCliente;
	}
	public int getIdUsuario()
	{
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario)
	{
		this.idUsuario=idUsuario;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion=direccion;
	}
	public int getIdTipoCliente()
	{
		return idTipoCliente;
	}
	public void setIdTipoCliente(int idTipoCliente)
	{
		this.idTipoCliente=idTipoCliente;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(direccion,idCliente,idTipoCliente,idUsuario,nombre);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass()) return false;
		Cliente other=(Cliente)obj;
		return Objects.equals(direccion,other.direccion)&&idCliente==other.idCliente&&idTipoCliente==other.idTipoCliente&&idUsuario==other.idUsuario&&Objects.equals(nombre,other.nombre);
	}
	@Override
	public String toString()
	{
		return "idCliente="+idCliente+", idUsuario="+idUsuario+", nombre="+nombre+", direccion="+direccion+", idTipoCliente="+idTipoCliente+" ";
	}
	
	
}
