package com.villarraga.gil.programacion.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.villarraga.gil.programacion.entities.Inventary;

@Repository
public interface IInventaryRepository extends CrudRepository<Inventary, Long>{
    List<Inventary> findAll();
}
