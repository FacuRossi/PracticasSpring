package Practicas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;

//      OneToMany:Como su nombre indica le dice a Hibernate que esta propiedad contendrá la lista de hijos.
//      mappedBy: Este atributo contendrá el nombre de la propiedad Java de la clase hija que enlaza
//      con la clase padre. En nuestro ejemplo es el nombre de la propiedad usuario que se encuentra en la
//      clase item.
    @OneToMany(mappedBy = "usuario")
    private List<Item> items;

    protected Usuario() {
    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.items = new ArrayList<Item>();
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

//    @JsonIgnore
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
