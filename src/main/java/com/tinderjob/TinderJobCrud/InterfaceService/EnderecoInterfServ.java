package com.tinderjob.TinderJobCrud.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.tinderjob.TinderJobCrud.Model.Endereco;

public interface EnderecoInterfServ {
    public List<Endereco> listar();
    public Optional<Endereco> listarPeloId(int id);
    public int Salvar(Endereco e);
    public void Apagar(int id);
    
}
