package gov.sif.contrataciones.infrastructure.controller;

import gov.sif.contrataciones.domain.entities.Contract;
import gov.sif.contrataciones.domain.services.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContractController {

    private final IContractService contractService;

    @Autowired
    public ContractController(IContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contracts")
    public Contract[] getAll() {
        return contractService.getAll();
    }

    @GetMapping("/contract/{id}")
    public Contract searchById(@PathVariable Long id) {
        return contractService.searchById(id);
    }

    @PostMapping("/contract")
    public Contract create(@RequestBody Contract contract) {
        return contractService.create(contract);
    }

    @PutMapping("/contract")
    public Contract update(@RequestBody Contract contract) {
        return contractService.update(contract);
    }

    @DeleteMapping("/contract/{id}")
    public void delete(@PathVariable Long id) {
        contractService.delete(id);
    }
}
