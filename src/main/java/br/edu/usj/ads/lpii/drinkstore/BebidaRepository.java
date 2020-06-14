package br.edu.usj.ads.lpii.drinkstore;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BebidaRepository extends CrudRepository <Bebida, Long>{
    List<Bebida> findAll();
}