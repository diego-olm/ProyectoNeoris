package neoris.app.domain;

import java.util.Objects;

public class Promocion
{
	private int idPromocion;
	private String descripcion;
	
	
	public Promocion()
	{
		super();
	}
	public Promocion(int idPromocion,String descripcion)
	{
		super();
		this.idPromocion=idPromocion;
		this.descripcion=descripcion;
	}
	public int getIdPromocion()
	{
		return idPromocion;
	}
	public void setIdPromocion(int idPromocion)
	{
		this.idPromocion=idPromocion;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion=descripcion;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(descripcion,idPromocion);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass()) return false;
		Promocion other=(Promocion)obj;
		return Objects.equals(descripcion,other.descripcion)&&idPromocion==other.idPromocion;
	}
	@Override
	public String toString()
	{
		return "Promocion [idPromocion="+idPromocion+", descripcion="+descripcion+"]";
	}
	
	
}
