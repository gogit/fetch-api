package com.fetch.persist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Purchase extends ModelId{

    @OneToMany
    private List<PurchaseItem> items = new ArrayList<PurchaseItem>();

    @JsonIgnore
    @CreationTimestamp
    private Timestamp createdOn;

    public List<PurchaseItem> getItems() {
        return items;
    }

    public void setItems(final List<PurchaseItem> items) {
        this.items = items;
    }

    public Timestamp getCreatedOn() {
        return new Timestamp(createdOn.getTime());
    }

    public void setCreatedOn(final Timestamp createdOn) {
        this.createdOn = new Timestamp(createdOn.getTime());
    }

}
