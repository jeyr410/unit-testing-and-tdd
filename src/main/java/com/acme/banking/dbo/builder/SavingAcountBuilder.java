package com.acme.banking.dbo.builder;

import com.acme.banking.dbo.domain.Client;
import com.acme.banking.dbo.domain.SavingAccount;

import java.util.UUID;

public class SavingAcountBuilder {
    private UUID id;
    private Client client;
    private double amount;

    public SavingAcountBuilder SetUUID(UUID id){
        this.id=id;
        return this;
    }

    public SavingAcountBuilder SetClient(Client client){
        this.client=client;
        return this;
    }

    public SavingAcountBuilder SetAmount(double amount){
        this.amount=amount;
        return this;
    }

    public SavingAccount build(){
        return new SavingAccount(id,client,amount);
    }


}
