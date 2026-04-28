package com.example.zbd.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
public class WishItem {
    @EmbeddedId
    WishItemKey key;
}
