package pe.edu.idat.DSW1EC1L11_1;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lunes = new Country();
		lunes.setName("lunes");
		lunes.setCapital("monday");
		

		countries.put(lunes.getName(), lunes);

		Country martes = new Country();
	    martes.setName("martes");
		martes.setCapital("monday");
		

		countries.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("miercoles");
		miercoles.setCapital("monday");
		
		countries.put(miercoles.getName(), miercoles);

		Country jueves = new Country();
		jueves.setName("jueves");
		jueves.setCapital("monday");
		

		countries.put(jueves.getName(), jueves);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
