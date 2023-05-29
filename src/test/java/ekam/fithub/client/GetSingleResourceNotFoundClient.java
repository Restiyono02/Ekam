package ekam.fithub.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import ekam.fithub.models.response.GetSingleResourceNotFound.GetSingleResourceNotFoundResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GetSingleResourceNotFoundClient extends RetrofitBaseClient {

    private interface GetSingleResourceNotFoundService {
                @GET("/api/unknown/23")
        Call<GetSingleResourceNotFoundResponse> getsingleResourceNotFound();
    }

    private final GetSingleResourceNotFoundService service;

    @Inject
    public GetSingleResourceNotFoundClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GetSingleResourceNotFoundService.class);
    }

    @APIStep(keyword = "When", description = "verify get single resource not found")
    public Response<GetSingleResourceNotFoundResponse> validateSingleResourceNotFound(){
        Call<GetSingleResourceNotFoundResponse> getSingleResourceNotFoundResponseCall = service
                .getsingleResourceNotFound();
        return httpClient.executeAsResponse(getSingleResourceNotFoundResponseCall);
    }
}