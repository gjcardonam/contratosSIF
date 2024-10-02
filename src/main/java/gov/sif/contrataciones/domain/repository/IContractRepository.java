package gov.sif.contrataciones.domain.repository;

import gov.sif.contrataciones.domain.entities.Contract;

public interface IContractRepository {
    Contract[] getAll();
    Contract create(Contract contract);
    Contract searchById(Long id);
    Contract update(Contract contract);
    void delete(Long id);
}
