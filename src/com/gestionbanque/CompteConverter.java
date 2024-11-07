package com.gestionbanque;

import com.google.gson.Gson;

public class CompteConverter {
    private static final Gson gson = new Gson();

    public static String toJson(Compte compte) {
        return gson.toJson(compte);
    }

    public static Compte fromJson(String json) {
        return gson.fromJson(json, Compte.class);
    }
}
