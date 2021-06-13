package com.tinderjob.TinderJobCrud.InterfaceService;

import java.util.List;

import com.tinderjob.TinderJobCrud.Model.DadosPessoais;

public interface DadosPessoaisInterfServ {

    public List<DadosPessoais> listar();

    public DadosPessoais listarPeloId(long id);

    public int Salvar(DadosPessoais dp);

    public void DeletarPorId(Long id);

}
