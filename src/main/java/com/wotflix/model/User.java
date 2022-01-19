package com.wotflix.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;

    private String password;

    @ManyToOne
    @JoinColumn(name = "friends_group_id")
    private FriendsGroup friendsGroup;

    public FriendsGroup getFriendsGroup() {
        return friendsGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
