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
		Country spain = new Country();
		spain.setName("lunes");
		spain.setCapital("monday");
		

		countries.put(spain.getName(), spain);

		Country pe = new Country();
	    pe.setName("martes");
		pe.setCapital("monday");
		

		countries.put(pe.getName(), pe);

		Country poland = new Country();
		poland.setName("miercoles");
		poland.setCapital("monday");
		
		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("jueves");
		uk.setCapital("monday");
		

		countries.put(uk.getName(), uk);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
