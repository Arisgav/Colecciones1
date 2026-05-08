package ni.edu.uam.controlador;

import ni.edu.uam.modelos.Producto;
import ni.edu.uam.servicios.CRUDinterface;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductoController implements CRUDinterface {

    private List<Producto> productos = new ArrayList<>();

    @Override
    public void guardar(Producto objeto) {
        productos.add( objeto);

    }

    @Override
    public List ObtenerTodos() {
        return productos;
    }

    @Override
    public void actualizar(long id, Producto objeto) {
        Producto producto = BuscarId(id);
        if (producto!=null){
            producto.setNombre(producto.getNombre());
        }


    }

    @Override
    public void eliminar(long id) {

    }

    @Override
    public Producto BuscarId(long id) {
        return null;
    }
}
