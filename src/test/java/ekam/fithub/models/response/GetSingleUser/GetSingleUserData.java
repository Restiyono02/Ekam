package ekam.fithub.models.response.GetSingleUser;

import lombok.Data;

@Data
public class GetSingleUserData {
	private String lastName;
	private int id;
	private String avatar;
	private String firstName;
	private String email;
}