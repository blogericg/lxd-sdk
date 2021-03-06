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
import org.relxd.lxd.model.CreateCertificatesRequest;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.UpdateFingerprintRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertificatesApi
 */
@Ignore
public class CertificatesApiTest {

    private final CertificatesApi api = new CertificatesApi();

    
    /**
     * 
     *
     * Remove a trusted certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFingerprintTest() throws ApiException {
        String fingerprint = null;
        BackgroundOperationResponse response = api.deleteFingerprint(fingerprint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return a list of trusted certificates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCertificatesTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getCertificates(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return a trusted certificate information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCertificatesByFingerPrintTest() throws ApiException {
        String fingerprint = null;
        BackgroundOperationResponse response = api.getCertificatesByFingerPrint(fingerprint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates the certificate properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchFingerprintTest() throws ApiException {
        String fingerprint = null;
        UpdateFingerprintRequest body = null;
        BackgroundOperationResponse response = api.patchFingerprint(fingerprint, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a new trusted certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCertificatesTest() throws ApiException {
        CreateCertificatesRequest body = null;
        BackgroundOperationResponse response = api.postCertificates(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replaces the certificate properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFingerprintTest() throws ApiException {
        String fingerprint = null;
        UpdateFingerprintRequest body = null;
        BackgroundOperationResponse response = api.putFingerprint(fingerprint, body);

        // TODO: test validations
    }
    
}
