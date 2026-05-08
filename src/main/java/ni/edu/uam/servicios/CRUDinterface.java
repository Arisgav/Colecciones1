package ni.edu.uam.servicios;

import java.util.List;

public interface CRUDinterface<T> {

        public void guardar(T objeto);
        public List<T> ObtenerTodos();

        public void actualizar(long id,T objeto);
        public void eliminar(long id);
        public T BuscarId(long id);


}
