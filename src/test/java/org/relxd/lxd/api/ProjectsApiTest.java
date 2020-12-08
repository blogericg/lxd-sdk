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
import org.relxd.lxd.model.CreateProjectsByNameRequest;
import org.relxd.lxd.model.CreateProjectsRequest;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.UpdateProjectsByNameRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * 
     *
     * Remove a project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectsByNameTest() throws ApiException {
        String name = null;
        BackgroundOperationResponse response = api.deleteProjectsByName(name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of projects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getProjects(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Project configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsByNameTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getProjectsByName(name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the project information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchProjectsByNameTest() throws ApiException {
        String name = null;
        UpdateProjectsByNameRequest body = null;
        BackgroundOperationResponse response = api.patchProjectsByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Define a new project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postProjectsTest() throws ApiException {
        CreateProjectsRequest body = null;
        BackgroundOperationResponse response = api.postProjects(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rename a project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postProjectsByNameTest() throws ApiException {
        String name = null;
        CreateProjectsByNameRequest body = null;
        BackgroundOperationResponse response = api.postProjectsByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replace the project information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putProjectsByNameTest() throws ApiException {
        String name = null;
        UpdateProjectsByNameRequest body = null;
        BackgroundOperationResponse response = api.putProjectsByName(name, body);

        // TODO: test validations
    }
    
}
