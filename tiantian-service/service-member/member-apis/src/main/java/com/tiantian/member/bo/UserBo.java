package com.tiantian.member.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserBo extends BaseBo {
   
	private static final long serialVersionUID = 8317938773876733565L;
	private Integer id;
    //message: 错误提示
    private String username;
    @JsonIgnore
    private String password;
    private String phone;
    private String email;
    private Date created;
    private Date updated;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
	@Override
	public String toString() {
		return "UserBo [id=" + id + ", username=" + username + ", password="
				+ password + ", phone=" + phone + ", email=" + email
				+ ", created=" + created + ", updated=" + updated + "]";
	}
    

}
