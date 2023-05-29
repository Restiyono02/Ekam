package ekam.fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import ekam.fithub.models.response.GetListResource.GetListResourceResponse;
import ekam.fithub.models.response.GetListUsers.GetListUsersResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetListResourceClient extends RetrofitBaseClient {

    private interface GetListResourceService {
                @GET("/api/unknown")
        Call<GetListResourceResponse> getlistResource();
    }

    private final GetListResourceService service;

    @Inject
    public GetListResourceClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetListResourceService.class);
    }

    @APIStep(keyword = "When", description = "verify get list resource")
    public Response<GetListResourceResponse> validateListResource(){
        Call<GetListResourceResponse> getListResourceResponseCall = service.getlistResource();
        return httpClient.executeAsResponse(getListResourceResponseCall);
    }
}