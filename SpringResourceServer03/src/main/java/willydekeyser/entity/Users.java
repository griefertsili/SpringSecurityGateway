package willydekeyser.entity;

import java.util.List;

public record Users(String username, String password, Boolean enabled, List<String> authorities) {
	
	public void addAuthority(String authority) {
		this.authorities.add(authority);
	}	
}
