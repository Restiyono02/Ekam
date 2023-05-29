package ekam.fithub.flows;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.LayoutInitiator;
import ekam.fithub.client.CreateUserClient;
import ekam.fithub.models.request.CreateUser.CreateUserRequest;
import ekam.fithub.models.response.CreateUser.CreateUserResponse;
import retrofit2.Response;

public class CreateUserFlows {

    @Inject
    CreateUserRequest createUserRequest;

    public Response<CreateUserResponse> getCreate(String name, String job){
        CreateUserClient createUserClient = LayoutInitiator.Client(CreateUserClient.class);
        CreateUserRequest createUserRequest = this.createUserRequest.setCreateUser(name, job);
        Response<CreateUserResponse> createUser = createUserClient.validateCreateUser(createUserRequest);
        return createUser;
    }
}
