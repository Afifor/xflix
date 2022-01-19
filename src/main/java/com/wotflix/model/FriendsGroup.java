package com.wotflix.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class FriendsGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(targetEntity = User.class, mappedBy = "friendsGroup")
    private List<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
