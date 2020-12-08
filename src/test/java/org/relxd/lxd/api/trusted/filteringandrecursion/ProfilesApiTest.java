
package org.relxd.lxd.api.trusted.filteringandrecursion;

import com.google.gson.JsonSyntaxException;
import org.junit.After;
import org.junit.jupiter.api.*;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.ProfilesApi;
import org.relxd.lxd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for ProfilesApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProfilesApiTest {

    private ProfilesApi api;
    private Logger logger;

    @BeforeAll
    public void setup() {
        new RelxdApiClient();
        api  = new ProfilesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }
    
    /**
     * 
     *
     * List of configuration profiles
     *
     */
    @Test
    @Order(2)
    public void getProfilesTest(){

        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getProfiles(recursion, filter);
            logger.info("Get Profiles Response >>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }


    }
    
    /**
     * 
     *
     * Profile configuration
     *
     */
    @Test
    @Order(4)
    public void getProfilesByNameTest() {
        String name = "profile1rename";
        Integer recursion = 1;
        String filter = null;

        try {
            BackgroundOperationResponse response = api.getProfilesByName(name, recursion, filter);
            logger.info("Get Profiles By Name Response >>>>>>> {}", response);
            assertEquals(response.getStatusCode(), Integer.valueOf(200));
        }catch (ApiException ex){
            catchApiException(ex);
        }


    }
    
    /**
     * 
     *
     * Define a new profile
     *
     */
    @Test
    @Order(1)
    public void postProfilesTest() {

        MemoryLimitsConfig memoryLimitsConfig = new MemoryLimitsConfig();
        memoryLimitsConfig.setLimitsMemory("2GB");

        Kvm kvm = new Kvm();
        kvm.setType("unix-char");
        kvm.setPath("/dev/kvm");

        DevicesKvm devicesKvm = new DevicesKvm();
        devicesKvm.setKvm(kvm);

        CreateProfilesRequest request = new CreateProfilesRequest();
        request.setName("profile1");
        request.setDescription("This is another profile");
        request.setConfig(memoryLimitsConfig);
        request.setDevices(devicesKvm);

        try {
            BackgroundOperationResponse response = api.postProfiles(request);
            logger.info("Post Profiles Response >>>>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }

    }
    
    /**
     * 
     *
     * Rename a profile
     *
     */
    @Test
    @Order(3)
    public void postProfilesByNameTest() {
        String name = "profile1";
        CreateProfilesByNameRequest request = new CreateProfilesByNameRequest();
        request.setName("profile1rename");

        try {
            BackgroundOperationResponse response = api.postProfilesByName(name, request);
            logger.info("Post Profiles By Name Response >>>>> {}", response);
            assertEquals(Integer.valueOf(200), response.getStatusCode());
        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){

        }
        return errorResponse;
    }
    
}