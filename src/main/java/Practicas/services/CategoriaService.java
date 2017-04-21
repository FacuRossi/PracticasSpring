package Practicas.services;

import Practicas.models.Categoria;
import Practicas.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getCategorias() {
        List<Categoria> categorias = new ArrayList<Categoria>();
        categoriaRepository.findAll().forEach(categorias :: add);
        return categorias;
    }

    public void addCategoria(Categoria c){
        categoriaRepository.save(c);
    }

    public void deleteCategoria(int idCategoria){
        categoriaRepository.delete(idCategoria);
    }

    public Categoria getCategoria(int id){
        return categoriaRepository.findOne(id);
    }

}
