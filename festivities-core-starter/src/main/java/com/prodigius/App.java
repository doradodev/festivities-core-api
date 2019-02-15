/**
 * 
 */
package com.prodigius;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodigius.core.commons.util.AppConfigurator;

/**
 * @author cristiandorado
 *
 */

@SpringBootApplication
public class App implements CommandLineRunner{
	
	
	@Override
	public void run(String... args) throws Exception {	
		System.out.println("festivities - CORE - RESTful API is running...");
	}
	
	public static void main(String[] args) {
        AppConfigurator.configure(args);
        SpringApplication.run(App.class, args);
        
    }

}
