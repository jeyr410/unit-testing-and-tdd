package com.acme.banking.dbo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private Collection<Account> accounts = new ArrayList<>();

    public Client(UUID id, String name, Collection<Account> accounts ) {
        if (id == null) throw new IllegalArgumentException("id must be not null");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name must be not null or empty");
        if (accounts==null) throw new IllegalArgumentException("accounts must be not null");
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Account> getAccounts() {
        return accounts;
    }
}
