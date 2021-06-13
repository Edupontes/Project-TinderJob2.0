package com.tinderjob.TinderJobCrud.Service;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.InterfaceService.EnderecoInterfServ;
import com.tinderjob.TinderJobCrud.Model.Endereco;
import com.tinderjob.TinderJobCrud.Repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService implements EnderecoInterfServ {

    @Autowired
    private EnderecoRepository registros;

    @Override
    public void Apagar(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int Salvar(Endereco e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Endereco> listar() {
        return (List<Endereco>)registros.findAll();
    }

    @Override
    public Optional<Endereco> listarPeloId(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
