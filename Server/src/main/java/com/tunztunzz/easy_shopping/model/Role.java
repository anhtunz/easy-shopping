package com.tunztunzz.easy_shopping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role extends BaseEntity {
    @Column(nullable = false)
    private String roleName;

    @Column
    private String roleDesc;

    @ManyToOne
    @JoinColumn(name = "user_roles_id")
    private UserRoles userRoles;

    @ManyToOne
    @JoinColumn(name = "role_permissions_id")
    private RolePermissions rolePermissions;

}
