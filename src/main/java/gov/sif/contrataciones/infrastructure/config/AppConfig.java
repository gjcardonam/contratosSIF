package gov.sif.contrataciones.infrastructure.config;

import gov.sif.contrataciones.application.services.ContractService;
import gov.sif.contrataciones.infrastructure.repository.ContractRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ContractRepository contractRepository() {
        return new ContractRepository();
    }
    @Bean
    public ContractService contractService() {
        return new ContractService(contractRepository());
    }
}
