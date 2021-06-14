package com.tinderjob.TinderJobCrud.Controller;

import java.util.List;

import com.tinderjob.TinderJobCrud.InterfaceService.DadosPessoaisInterfServ;
import com.tinderjob.TinderJobCrud.Model.DadosPessoais;
import com.tinderjob.TinderJobCrud.Model.Endereco;
import com.tinderjob.TinderJobCrud.Repository.DadosPessoaisRepository;
import com.tinderjob.TinderJobCrud.Repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisInterfServ action;

    @Autowired
    private DadosPessoaisRepository repoDp;

    @Autowired
    private EnderecoRepository repoEnd;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "TelaLogin";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<DadosPessoais> dados = action.listar();
        model.addAttribute("dados_pessoais", dados);
        return "TelaListagem";
    }

    @GetMapping("/TelaCadastro")
    public String Cadastrar(Model model) {

        DadosPessoais DadosPessoais = new DadosPessoais();
        model.addAttribute("DadosPessoais", DadosPessoais);

        Endereco endereco = new Endereco();
        model.addAttribute("Endereco", endereco);

        return "TelaCadastro";
    }

    @PostMapping("/SalvarCadastro")
    public String Salvar(@ModelAttribute("DadosPessoais") DadosPessoais dadospessoais, @ModelAttribute("Endereco") Endereco endereco) {
        repoDp.save(dadospessoais);
        repoEnd.save(endereco);

        return "redirect:/listar";
    }
    // @PostMapping("/SalvarEndereco")
    // public String Salvar(@ModelAttribute("Endereco") Endereco endereco) {
    //     repoEnd.save(endereco);

    //     return "redirect:/listar";
    // }

    @GetMapping("/EditarCadastro/{id}")
    public String EditarCadastro(@PathVariable(value = "id") long id, Model model) {

        DadosPessoais DadosPessoais = action.listarPeloId(id);

        model.addAttribute("DadosPessoais", DadosPessoais);

        return "TelaEdicaoDados";
    }

    @GetMapping("/DeletarCadastro/{id}")
    public String DeletarCadastro(@PathVariable(value = "id") long id) {

        this.repoDp.deleteById(id);
        return "redirect:/listar";
    }

}
