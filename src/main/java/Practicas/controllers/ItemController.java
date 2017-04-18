package Practicas.controllers;

import Practicas.models.Item;
import Practicas.models.Usuario;
import Practicas.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    public List<Item> getItems(){
        return itemService.getItems();
    }

    @RequestMapping(method= RequestMethod.POST , value="/items")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.GET, value="/items", params = "id_categoria")
    public List<Item> findByCategoria(int id_categoria){
        return itemService.findByCategoria(id_categoria);
    }

    @RequestMapping(method =RequestMethod.GET , value = "/items", params = "nombre_usuario")
    public List<Item> findByUsuario(String nombre_usuario){
        return itemService.findByUsuario(nombre_usuario);
    }
}
