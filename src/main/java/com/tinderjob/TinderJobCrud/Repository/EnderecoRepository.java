package com.tinderjob.TinderJobCrud.Repository;

import com.tinderjob.TinderJobCrud.Model.Endereco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository <Endereco, Integer> {
    
}
