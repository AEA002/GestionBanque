package com.gestionbanque;

import com.google.gson.Gson;

public class TransactionConverter {
    private static final Gson gson = new Gson();

    public static String toJson(Transaction transaction) {
        return gson.toJson(transaction);
    }

    public static Transaction fromJson(String json) {
        return gson.fromJson(json, Transaction.class);
    }
}
