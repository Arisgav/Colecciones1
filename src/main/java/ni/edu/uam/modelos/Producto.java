package ni.edu.uam.modelos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {

    private Long id;
    private String nombre;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int cantidad;
    //commit

}
