package ekam.fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import ekam.fithub.client.GetListUsersClient;
import ekam.fithub.models.response.GetListUsers.GetListUsersResponse;
import retrofit2.Response;

public class GetListUsersFlows {
    public Response<GetListUsersResponse> validateListUsers() {
        GetListUsersClient getListUsersClient = LayoutInitiator.Client(GetListUsersClient.class);
        Response<GetListUsersResponse> getListUsersResponse = getListUsersClient.validatListUsers();
        return getListUsersResponse;
    }
}
