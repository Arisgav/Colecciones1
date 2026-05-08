package ni.edu.uam.servicios;

import ni.edu.uam.modelos.Producto;

import java.util.List;

public interface CRUDinterface<T> {

        public void guardar(T objeto);

        void guardar(Producto objeto);

        public List<T> ObtenerTodos();

        public void actualizar(long id,T objeto);

        void actualizar(long id, Producto objeto);

        public void eliminar(long id);
        public T BuscarId(long id);


}
