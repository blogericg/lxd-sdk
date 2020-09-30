/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@competitionlabs.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.api;

import org.relxd.lxd.ApiException;
import org.relxd.lxd.model.BasicStandardReturnValueResponse;
import org.relxd.lxd.model.Config1;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.GetServerStateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LxdApi
 */
@Ignore
public class LxdApiTest {

    private final LxdApi api = new LxdApi();

    
    /**
     * 
     *
     * List of supported APIs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiListTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        List<String> response = api.getApiList(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Server configuration and environment information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServerStateTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        GetServerStateResponse response = api.getServerState(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates the server configuration or other properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchServerStateTest() throws ApiException {
        Config1 body = null;
        BasicStandardReturnValueResponse response = api.patchServerState(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replaces the server configuration or other properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putServerStateTest() throws ApiException {
        Config1 body = null;
        BasicStandardReturnValueResponse response = api.putServerState(body);

        // TODO: test validations
    }
    
}
