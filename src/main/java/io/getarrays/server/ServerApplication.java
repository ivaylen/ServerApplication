package io.getarrays.server;

import io.getarrays.server.enumeration.Status;
import io.getarrays.server.model.Server;
import io.getarrays.server.repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args ->{
			serverRepo.save(new Server(null, "192.168.1.160", "Ubunto Linux", "16 GB", "Personal PC", null, Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.103", "MAC OS", "32 GB", "Mac PC", null, Status.SERVER_UP));
		};
	}

}
