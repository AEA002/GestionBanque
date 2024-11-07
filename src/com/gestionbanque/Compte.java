package com.gestionbanque;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    private String nomCompte;
    private Date dateCrea;
    private Date dateUpdate;
    private String devise;
}
