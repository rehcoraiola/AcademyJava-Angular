package com.devrenata.banco;

import com.devrenata.banco.model.Agencia;
import com.devrenata.banco.repository.AgenciaRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private AgenciaRepository repository;

	public BancoApplication(AgenciaRepository repository) {
		this.repository=repository;
	}
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Agencia model=new Agencia();
		model.setNumero(1234);
				
		repository.save(model); //insert

		//lambda
		repository.findAll().forEach((a)->System.out.printf("%d %d \n",a.getId(),a.getNumero()));
	}

}
