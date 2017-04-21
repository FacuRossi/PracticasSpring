package Practicas.services;

import Practicas.models.Item;
import Practicas.models.Usuario;
import Practicas.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        itemRepository.findAll().forEach(items :: add);
        return items;
    }

    public List<Item> getAllItemsTheUser(int id){
        List<Item> items = new ArrayList<Item>();
        itemRepository.findItemsByUsuarioId(id).forEach(items :: add);
        return items;
    }
    public Item getItem(int id){
        return itemRepository.findOne(id);
    }
    public void addItem(Item i){
        itemRepository.save(i);
    }

    public void deleteItem(int id){
        itemRepository.delete(id);
    }

    public List<Item> findByCategoria(int idCategoria){
        return itemRepository.findItemsByCategoria_Id(idCategoria);
    }

    public List<Item> findByUsuario(int idUsuario){
        return itemRepository.findItemsByUsuario_Id(idUsuario);
    }

}
