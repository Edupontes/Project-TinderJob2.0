package com.tinderjob.TinderJobCrud.Repository;

import com.tinderjob.TinderJobCrud.Model.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Integer> {
    
}
