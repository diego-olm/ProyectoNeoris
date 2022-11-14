package neoris.app.domain;

import java.util.Objects;

public class Categoria
{
	private int idCategoria;
	private String descripcion;
	
	
	public Categoria()
	{
		super();
	}

	public Categoria(int idCategoria,String descripcion)
	{
		super();
		this.idCategoria=idCategoria;
		this.descripcion=descripcion;
	}
	
	public int getIdCategoria()
	{
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria)
	{
		this.idCategoria=idCategoria;
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
		return Objects.hash(descripcion,idCategoria);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass()) return false;
		Categoria other=(Categoria)obj;
		return Objects.equals(descripcion,other.descripcion)&&idCategoria==other.idCategoria;
	}
	@Override
	public String toString()
	{
		return "idCategoria="+idCategoria+", descripcion="+descripcion+" ";
	}
	

}
