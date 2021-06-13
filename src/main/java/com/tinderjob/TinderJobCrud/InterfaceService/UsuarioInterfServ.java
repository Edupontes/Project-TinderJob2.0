package com.tinderjob.TinderJobCrud.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.Model.Usuario;

public interface UsuarioInterfServ {
    public List<Usuario> listar();
    public Optional<Usuario> listarPeloId();
    public int Salvar(Usuario u);
    public void Apagar(int id);
}
