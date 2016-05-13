package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Role {
    private int idRole, agentId;
    private String roleName;

    public Role(){}

    public Role(int idRole, int agentId, String roleName) {
        this.idRole = idRole;
        this.agentId = agentId;
        this.roleName = roleName;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
