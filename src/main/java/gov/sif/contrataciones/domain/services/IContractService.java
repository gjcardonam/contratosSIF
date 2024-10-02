package gov.sif.contrataciones.domain.services;

import gov.sif.contrataciones.domain.entities.Contract;

public interface IContractService {
    Contract[] getAll();
    Contract create(Contract contract);
    Contract searchById(Long id);
    Contract update(Contract contract);
    void delete(Long id);
}
