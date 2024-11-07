package com.gestionbanque;

import com.google.gson.Gson;

public class ClientConverter {
    private static final Gson gson = new Gson();

    public static String toJson(Client client) {
        return gson.toJson(client);
    }

    public static Client fromJson(String json) {
        return gson.fromJson(json, Client.class);
    }
}
