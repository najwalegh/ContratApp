package com.adria.contratapp;

import com.adria.contratapp.entities.Contrat;
import com.adria.contratapp.repositories.ContratRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ContratAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContratAppApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ContratRepository contratRepository){
        return args->{
          contratRepository.save(new Contrat(null,"creation de compte",new Date(),67999,"najwa",false)) ;
          contratRepository.save(new Contrat(null,"vente",new Date(),1000,"taha",false)) ;
          contratRepository.save(new Contrat(null,"assurance",new Date(),667,"reda",false)) ;
          contratRepository.findAll().forEach(c->{
              System.out.println(c.toString());
            });
        };
    }

}
