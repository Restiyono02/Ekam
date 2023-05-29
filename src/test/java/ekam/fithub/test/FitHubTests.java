package ekam.fithub.test;

import Utils.TestData;
import com.google.inject.Inject;
import com.testvagrant.ekam.testBases.testng.APITest;
import ekam.fithub.flows.*;
import ekam.fithub.models.response.CreateUser.CreateUserResponse;
import ekam.fithub.models.response.GetListResource.GetListResourceResponse;
import ekam.fithub.models.response.GetListUsers.GetListUsersResponse;
import ekam.fithub.models.response.GetSingleResource.GetSingleResourceResponse;
import ekam.fithub.models.response.GetSingleResourceNotFound.GetSingleResourceNotFoundResponse;
import ekam.fithub.models.response.GetSingleUser.GetSingleUserResponse;
import ekam.fithub.models.response.GetSingleUserNotFound.GetSingleUserNotFoundResponse;
import org.testng.annotations.Test;
import retrofit2.Response;

public class FitHubTests extends APITest {

    @Inject
    GetListUsersFlows getListUsersFlows;

    @Inject
    GetSingleUserFlows getSingleUserFlows;

    @Inject
    GetSingleUserNotFoundFlows getSingleUserNotFoundFlows;

    @Inject
    GetListResourceFlows getListResourceFlows;

    @Inject
    GetSingleResourceFlows getSingleResourceFlows;

    @Inject
    GetSingleResourceNotFoundFlows getSingleResourceNotFoundFlows;

    @Inject
    CreateUserFlows createUserFlows;


    @Test
    public void validateGetListUsers(){
        Response<GetListUsersResponse> getListUsersResponse = getListUsersFlows.validateListUsers();

        System.out.println(getListUsersResponse);
    }

    @Test
    public void validateGetSingleUser(){
        Response<GetSingleUserResponse> getSingleUserResponse = getSingleUserFlows.validateSingleUser();

        System.out.println(getSingleUserResponse);
    }

    @Test
    public void validateGetSingleUserNotFound(){
        Response<GetSingleUserNotFoundResponse> getSingleUserNotFoundResponse = getSingleUserNotFoundFlows
                .validateSingleUserNotFound();

        System.out.println(getSingleUserNotFoundResponse);
    }

    @Test
    public void validateGetListResource(){
        Response<GetListResourceResponse> getListResourceResponse = getListResourceFlows
                .validateListResource();

        System.out.println(getListResourceResponse);
    }

    @Test
    public void validateGetSingleResource(){
        Response<GetSingleResourceResponse> getSingleResourceResponse = getSingleResourceFlows
                .validateSingleResource();

        System.out.println(getSingleResourceResponse);
    }

    @Test
    public void validateGetSingleResourceNotFound(){
        Response<GetSingleResourceNotFoundResponse> getSingleResourceNotFoundResponse = getSingleResourceNotFoundFlows
                .validateSingleResourceNotFound();

        System.out.println(getSingleResourceNotFoundResponse);
    }

    @Test
    public void validateCreateUser(){
        Response<CreateUserResponse> createUserResponse = createUserFlows.getCreate(TestData.NAME, TestData.JOB);

        System.out.println(createUserResponse);
    }

}
