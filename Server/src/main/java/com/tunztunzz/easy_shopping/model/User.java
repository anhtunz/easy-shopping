package com.tunztunzz.easy_shopping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 50)
    private String fullName;

    @Column
    private String description;

    @Column(nullable = false)
    private UserState state;

    @ManyToOne
    @JoinColumn(name = "user_roles_id")
    private UserRoles userRoles;
}

enum UserState{
    ACTIVE,
    INACTIVE,
    BANNED,
}
