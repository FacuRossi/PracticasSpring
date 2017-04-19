package Practicas.models;

import javax.persistence.*;

/**
 * Created by Facundo on 11/04/2017.
 */
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String descripcion;
    @OneToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

//      ManyToOne:Al ser el otro lado de la relación indicamos que desde este lado es una relación muchos a uno.
//      JoinColumn: Indicaremos el nombre de la columna que en la tabla hija contiene la clave ajena a la tabla padre.
//      En nuestro ejemplo es la columna de la base de datos id_usuario que se encuentra en la tabla Item
//      la cual enlaza con la tabla Usuario
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    public Item(String nombre, String descripcion,  Categoria categoria ,Usuario usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.usuario = usuario;
    }

    protected Item() {
    }

    public Item(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
