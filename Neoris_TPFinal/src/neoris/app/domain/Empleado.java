package neoris.app.domain;

import java.util.Objects;

public class Empleado
{
	private int idEmpleado;
	private String nombre;
	private int idJefe;
	
	
	public Empleado()
	{
		super();
	}
	public Empleado(int idEmpleado,String nombre,int idJefe)
	{
		super();
		this.idEmpleado=idEmpleado;
		this.nombre=nombre;
		this.idJefe=idJefe;
	}
	public int getIdEmpleado()
	{
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado=idEmpleado;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public int getIdJefe()
	{
		return idJefe;
	}
	public void setIdJefe(int idJefe)
	{
		this.idJefe=idJefe;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(idEmpleado,idJefe,nombre);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass()) return false;
		Empleado other=(Empleado)obj;
		return idEmpleado==other.idEmpleado&&idJefe==other.idJefe&&Objects.equals(nombre,other.nombre);
	}
	@Override
	public String toString()
	{
		return "Empleado [idEmpleado="+idEmpleado+", nombre="+nombre+", idJefe="+idJefe+"]";
	}
	
	
}
