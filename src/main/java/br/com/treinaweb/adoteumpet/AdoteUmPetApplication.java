package br.com.treinaweb.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treinaweb.adoteumpet.core.models.Pet;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Joãozinho");
		pet.setHistoria("Historia JAVA");
		pet.setFoto("https://img.freepik.com/fotos-gratis/tigre-que-olha-para-a-frente_1286-73.jpg?1?w=360");
		petRepository.save(pet);
		
		var pet2 = new Pet();
		pet2.setNome("Joãozinho2");
		pet2.setHistoria("Historia2 JAVA");
		pet2.setFoto("https://img.r7.com/images/cachorro-que-parece-pompom-13012022171412951?dimensions=771x420");
		petRepository.save(pet2);
	}

}
