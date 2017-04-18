package Practicas.repositories;

import Practicas.models.Item;
import Practicas.models.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */

public interface ItemRepository extends CrudRepository<Item, Integer>{

    public List<Item> findItemsByCategoria_Id(int id_categoria);

    public List<Item>findItemsByUsuario_Nombre(String nombre_usuario);

}
