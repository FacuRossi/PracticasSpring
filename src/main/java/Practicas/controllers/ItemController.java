package Practicas.controllers;

import Practicas.models.Item;
import Practicas.models.Usuario;
import Practicas.services.ItemService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET, value="/usuarios/{id}/items")
    public List<Item> getAllItemsTheUser(@PathVariable int id){
        return itemService.getAllItemsTheUser(id);
    }

    @RequestMapping(method= RequestMethod.POST , value="/usuarios/{id}/items")
    public void addItem(@RequestBody Item item, @PathVariable int id)
    {
        item.setUsuario(new Usuario(id, "", "" ));
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.GET, value="/usuarios/{idUsuario}/items/{id}")
    public Item getItem(@PathVariable int id){
        return itemService.getItem(id);
    }

    @RequestMapping(method = RequestMethod.PUT , value ="/usuarios/{idUsuario}/items/{id}" )
    public void updateItem(@RequestBody Item item, @PathVariable int idUsuario, @PathVariable int id){
        item.setUsuario(new Usuario(id, "", "" ));
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.DELETE , value ="/usuarios/{idUsuario}/items/{id}" )
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }


    @RequestMapping(method = RequestMethod.GET, value="/items", params = "id_categoria")
    public List<Item> findByCategoria(int id_categoria){
        return itemService.findByCategoria(id_categoria);
    }

    @RequestMapping(method =RequestMethod.GET , value = "/items", params = "id_usuario")
    public List<Item> findByUsuario(int id_usuario){
        return itemService.findByUsuario(id_usuario);
    }
}
