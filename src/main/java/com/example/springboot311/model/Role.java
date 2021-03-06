package com.example.springboot311.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role implements GrantedAuthority {
    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    public Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role")
    private String role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    @Override
    public String toString() {
        return role;
    }

    @Override
    public String getAuthority() {
        return getRole();
    }
}

