package com.tunztunzz.easy_shopping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "permission")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Permission extends BaseEntity {

    @Column(nullable = false)
    private String permissionName;

    @Column
    private String permissionDesc;

    @ManyToOne
    @JoinColumn(name = "role_permissions_id")
    private RolePermissions rolePermissions;


}
