package com.adria.contratapp.web;

import com.adria.contratapp.entities.Contrat;
import com.adria.contratapp.repositories.ContratRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ContratController {
    private ContratRepository contratRepository;

    public ContratController(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @GetMapping(path="/index")
    public String index(){
        return "index";
    }

    @GetMapping(path="/contrat")
    public String contrat(Model model){
        List<Contrat> contratList=contratRepository.findAll();
        model.addAttribute("listContrats",contratList);
        return "contrat";
    }


}

