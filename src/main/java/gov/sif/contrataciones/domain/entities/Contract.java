package gov.sif.contrataciones.domain.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Contract {
    private Long id;
    private String code;
    private String object;
    private Date subscriptionDate;
}
