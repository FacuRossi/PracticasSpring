package Practicas.repositories;

import Practicas.models.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Facundo on 10/04/2017.
 */
//al extender de PaginAndSortingRepository tenemos dos metodos mas
//    findAll(Pageable pageable) : Page<Categoria>
//    findAll(Sort sort) : Iterable<Categoria>

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
