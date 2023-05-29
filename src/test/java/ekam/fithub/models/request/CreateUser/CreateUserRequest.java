package ekam.fithub.models.request.CreateUser;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import lombok.Data;

@Data
public class CreateUserRequest{

	@Inject
	DataSetsClient dataSetsClient;

	private String name;
	private String job;

	public CreateUserRequest setCreateUser(String name, String job){
		CreateUserRequest createUserRequest = dataSetsClient.getValue("create_user", CreateUserRequest.class);
		createUserRequest.setName(name);
		createUserRequest.setJob(job);
		return createUserRequest;
	}


}