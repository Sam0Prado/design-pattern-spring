package com.projeto.spring.designpattern.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Endere├žoRepository extends CrudRepository<Endereco, String> {
}
