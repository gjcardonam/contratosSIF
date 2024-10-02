package gov.sif.contrataciones.infrastructure.repository;

import gov.sif.contrataciones.domain.entities.Contract;
import gov.sif.contrataciones.domain.repository.IContractRepository;

import java.util.Date;

public class ContractRepository implements IContractRepository {

    @Override
    public Contract[] getAll() {
        // List of contracts
        Contract contract1 = new Contract();

        contract1.setId(1L);
        contract1.setCode("123456");
        contract1.setObject("Object 1");
        contract1.setSubscriptionDate(new Date());

        Contract contract2 = new Contract();

        contract2.setId(2L);
        contract2.setCode("654321");
        contract2.setObject("Object 2");
        contract2.setSubscriptionDate(new Date());

        return new Contract[]{contract1, contract2};
    }

    @Override
    public Contract create(Contract contract) {
        Contract newContract = new Contract();
        newContract.setObject("Created contract");
        return newContract;
    }

    @Override
    public Contract searchById(Long id) {
        Contract newContract = new Contract();
        newContract.setObject("Contract found");
        return newContract;
    }

    @Override
    public Contract update(Contract contract) {
        Contract newContract = new Contract();
        newContract.setObject("Contract updated");
        return newContract;
    }

    @Override
    public void delete(Long id) {
    }
}
