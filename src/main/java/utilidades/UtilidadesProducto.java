package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.List;

public class UtilidadesProducto {

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo) {
        for (Producto producto : productos) {
            if (producto.getTproductos().equals(tipo)) {
                productos.add(producto);
            }
        }

        return productos;
    }

    public List<Producto> getPorAlmacen(List<Producto> productos,Almacen almacen){
        for (Producto producto : productos) {
            if (producto.getAlmacen().equals(almacen)) {
                productos.add(producto);
            }
        }
        return productos;
    }
}
