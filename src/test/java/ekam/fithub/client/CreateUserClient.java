package ekam.fithub.client;

import Utils.TestData;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import ekam.fithub.models.request.CreateUser.CreateUserRequest;
import ekam.fithub.models.response.CreateUser.CreateUserResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public class CreateUserClient extends RetrofitBaseClient {

    private interface CreateUserService {
                @POST("/api/users")
        Call<CreateUserResponse> createUser(@Header("Authorization") String authToken,
                                            @Header("Content-Type") String contentType,
                                            @Body CreateUserRequest request);
    }

    private final CreateUserService service;

    @Inject
    public CreateUserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(CreateUserService.class);
    }

    @APIStep(keyword = "When", description = "verify create user")
    public Response<CreateUserResponse> validateCreateUser(CreateUserRequest request){
        Call<CreateUserResponse> createUserResponseCall = service
                .createUser(TestData.USER_TOKEN, "application/json", request);
        return httpClient.executeAsResponse(createUserResponseCall);
    }
}