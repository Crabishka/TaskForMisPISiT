package ru.lukomorebo.lukomorye_site.domain;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
	USER,
	ADMIN,
	LEAD;


	@Override
	public String getAuthority() {
		return name();
	}


}
