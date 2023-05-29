package ekam.fithub.flows;

import com.testvagrant.ekam.commons.LayoutInitiator;
import ekam.fithub.client.GetSingleResourceNotFoundClient;
import ekam.fithub.models.response.GetSingleResourceNotFound.GetSingleResourceNotFoundResponse;
import retrofit2.Response;

public class GetSingleResourceNotFoundFlows {
    public Response<GetSingleResourceNotFoundResponse> validateSingleResourceNotFound() {
        GetSingleResourceNotFoundClient getSingleResourceNotFoundClient = LayoutInitiator
                .Client(GetSingleResourceNotFoundClient.class);
        Response<GetSingleResourceNotFoundResponse> getSingleResourceNotFoundResponse = getSingleResourceNotFoundClient
                .validateSingleResourceNotFound();
        return getSingleResourceNotFoundResponse;
    }
}
