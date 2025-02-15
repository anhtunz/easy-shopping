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
@Table(name = "role_permissions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolePermissions extends BaseEntity {
    
    @OneToMany(mappedBy = "rolePermissions")
    private Set<Role> roles;

    @OneToMany(mappedBy = "rolePermissions")
    private Set<Permission> permissions;
}
