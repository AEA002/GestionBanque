package com.gestionbanque;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private int numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String phone;
    private String email;
}
