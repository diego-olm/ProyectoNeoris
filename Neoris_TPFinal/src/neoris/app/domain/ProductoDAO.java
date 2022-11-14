package neoris.app.domain;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class ProductoDAO
{

	public List<Producto> traerProductos(){
		MiJdbc dao = MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT p.id_producto, p.descripcion, ";
		sql+="p.id_proveedor, p.id_categoria, ";
		sql+="p.precio_unitario, p.unidades_stock, ";
		sql+="p.unidades_stock_minimo, p.unidades_stock_maximo, ";
		sql+="p.flg_discontinuo ";
		sql+="FROM PRODUCTO p ";
		
		List<Object[]> lst= dao.query(sql);
		List<Producto> ret= new ArrayList<>();
		for(Object[] p: lst) {
			Producto agregar= new Producto();
			agregar.setIdProducto((Integer) p[0]);
			agregar.setDescripcion((String) p[1]);
			agregar.setIdProveedor((Integer) p[2]);
			agregar.setIdCategoria((Integer)p[3]);
			agregar.setPrecioUnitario((double) p[4]);
			agregar.setUnidadesStock((Integer)p[5]);
			agregar.setUnidadesStockMinimo((Integer)p[6]);
			agregar.setUnidadesStockMaximo((Integer) p[7]);
			agregar.setFlgDescontinuo((Integer)p[8]);
			ret.add(agregar);
		}
		
		
		return ret;
	}
	public List<Producto> obtenerProductosConPromocionesVigentes(){
		MiJdbc dao= MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT DISTINCT(p.id_producto) , p.descripcion, p.id_proveedor, ";
		sql+="p.id_categoria, p.precio_unitario, p.unidades_stock, ";
		sql+="p.unidades_stock_minimo, p.unidades_stock_maximo, p.flg_discontinuo ";
		sql+="FROM PRODUCTO p INNER JOIN PROMOCION_PRODUCTO pp ON ";
		sql+="p.ID_PRODUCTO=pp.id_producto ";
		sql+="INNER JOIN PROMOCION_VIGENCIA pv ON ";
		sql+="pp.id_promocion_vigencia= pv.id_promocion_vigencia where pv.fecha_inicio <=NOW() ";
		sql+="AND pv.fecha_fin>=NOW() ";
		List<Producto> ret= new ArrayList<>();
		List<Object[]> lista = dao.query(sql);
		for(Object[] p: lista) {
			Producto agregar= new Producto();
			agregar.setIdProducto((Integer) p[0]);
			agregar.setDescripcion((String) p[1]);
			agregar.setIdProveedor((Integer) p[2]);
			agregar.setIdCategoria((Integer)p[3]);
			agregar.setPrecioUnitario((double) p[4]);
			agregar.setUnidadesStock((Integer)p[5]);
			agregar.setUnidadesStockMinimo((Integer)p[6]);
			agregar.setUnidadesStockMaximo((Integer) p[7]);
			agregar.setFlgDescontinuo((Integer)p[8]);
			ret.add(agregar);
		}
		
		return ret;
	}
}
