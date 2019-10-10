package com.ryszardp.repository.jdbc;

import com.ryszardp.domain.vo.Role;

import java.util.List;

public interface RoleDao extends GenericDao<Role,Long> {
    List<Role> getRolesByUserId(Long userId);
}
