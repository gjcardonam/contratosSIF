package gov.sif.contrataciones.application.services;

import gov.sif.contrataciones.domain.entities.Contract;
import gov.sif.contrataciones.domain.repository.IContractRepository;
import gov.sif.contrataciones.domain.services.IContractService;

public class ContractService implements IContractService {

    private final IContractRepository contractRepository;

    public ContractService(IContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract[] getAll() {
        return contractRepository.getAll();
    }

    @Override
    public Contract create(Contract contract) {
        return contractRepository.create(contract);
    }

    @Override
    public Contract searchById(Long id) {
        return contractRepository.searchById(id);
    }

    @Override
    public Contract update(Contract contract) {
        Contract contractToUpdate = contractRepository.searchById(contract.getId());
        if (contractToUpdate == null) {
            Throwable e = new Throwable("Contract not found");
            throw new RuntimeException("Contract not found", e);
        }
        return contractRepository.update(contract);
    }

    @Override
    public void delete(Long id) {
        Contract contractToDelete = contractRepository.searchById(id);
        if (contractToDelete == null) {
            Throwable e = new Throwable("Contract not found");
            throw new RuntimeException("Contract not found", e);
        }
        contractRepository.delete(id);
    }
}
