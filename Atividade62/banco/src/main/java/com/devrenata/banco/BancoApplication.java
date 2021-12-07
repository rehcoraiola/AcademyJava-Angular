package com.devrenata.banco;

import java.util.List;

import com.devrenata.banco.model.Filme;
import com.devrenata.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private FilmeRepository repository;

	public BancoApplication(FilmeRepository repository) {
		this.repository=repository;
	}
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filme model=new Filme();
		model.setNome("Lagoa Azul");
		model.setNomeDiretor("Renata");
		model.setGenero("Romance");
		
		repository.save(model); //insert

		// List<Filme> lista=(List<Filme>)repository.findAll(); 

		// for (Filme f : lista) {
		// 	System.out.printf("%d %s \n",f.getId(),f.getNome());
		// }

		//lambda
		repository.findAll().forEach((f)->System.out.printf("%d %s \n",f.getId(),f.getNome()));

		// repository.findAll().forEach((f)->{
		// 	//....
		// }
		// repository.findAll().forEach((f)->{
		// 	if(f<0){}
		// }

		

	}

}
