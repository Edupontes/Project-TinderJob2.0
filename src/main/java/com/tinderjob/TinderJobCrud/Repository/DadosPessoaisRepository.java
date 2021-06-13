package com.tinderjob.TinderJobCrud.Repository;

import com.tinderjob.TinderJobCrud.Model.DadosPessoais;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosPessoaisRepository extends CrudRepository<DadosPessoais, Long> {

}
