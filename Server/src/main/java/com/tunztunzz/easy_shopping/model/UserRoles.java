package com.tunztunzz.easy_shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "user_roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoles extends BaseEntity {
    @OneToMany(mappedBy = "userRoles")
    private Set<User> users;

    @OneToMany(mappedBy = "userRoles")
    private Set<Role> roles;
}
