package com.market.ApiRest.persistence.crud;

import com.market.ApiRest.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

        List<Producto> findByIdCategoriaOrderByNombreAsc(int IdCategoria);

        Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
