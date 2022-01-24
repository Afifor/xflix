package com.wotflix.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name = "friends_group_id")
    private FriendsGroup friendsGroup;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private Boolean locked;
    private Boolean enabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public FriendsGroup getFriendsGroup() {
        return friendsGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(String username,
                String password,
                FriendsGroup friendsGroup,
                UserRole userRole,
                Boolean locked,
                Boolean enabled) {
        this.username = username;
        this.password = password;
        this.friendsGroup = friendsGroup;
        this.userRole = userRole;
        this.locked = locked;
        this.enabled = enabled;
    }
}
