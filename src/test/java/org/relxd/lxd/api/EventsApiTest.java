/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.api;

import org.relxd.lxd.ApiException;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * 
     *
     * Websocket upgrade
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        String type = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getEvents(type, recursion, filter);

        // TODO: test validations
    }
    
}
