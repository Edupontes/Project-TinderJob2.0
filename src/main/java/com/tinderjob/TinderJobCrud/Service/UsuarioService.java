package com.tinderjob.TinderJobCrud.Service;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.InterfaceService.UsuarioInterfServ;
import com.tinderjob.TinderJobCrud.Model.Usuario;
import com.tinderjob.TinderJobCrud.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UsuarioInterfServ {
    @Autowired
    private UsuarioRepository registros;

    @Override
    public void Apagar(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int Salvar(Usuario u) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Usuario> listar() {
        return (List<Usuario>)registros.findAll();
    }

    @Override
    public Optional<Usuario> listarPeloId() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
