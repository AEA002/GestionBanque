package com.gestionbanque;

import com.google.gson.Gson;

public class BanqueConverter {
    private static final Gson gson = new Gson();

    public static String toJson(Banque banque) {
        return gson.toJson(banque);
    }

    public static Banque fromJson(String json) {
        return gson.fromJson(json, Banque.class);
    }
}

