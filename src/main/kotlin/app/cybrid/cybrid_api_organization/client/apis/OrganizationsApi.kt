package app.cybrid.cybrid_api_organization.client.apis

import app.cybrid.cybrid_api_organization.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_organization.client.models.ErrorResponseOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.OrganizationOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.PatchOrganizationOrganizationModel

interface OrganizationsApi {
    /**
     * Get organization
     * Retrieve an organization.  Required scope: **organizations:read**
     * Responses:
     *  - 200: organization found
     *  - 404: organization not found
     *  - 401: Invalid responses - invalid subject, Authentication failed
     *  - 403: Invalid scope
     *  - 400: Malformed Authentication Header
     *
     * @param organizationGuid Identifier for the organization. 
     * @return [OrganizationOrganizationModel]
     */
    @GET("api/organizations/{organization_guid}")
    suspend fun getOrganization(@Path("organization_guid") organizationGuid: kotlin.String): Response<OrganizationOrganizationModel>

    /**
     * Patch organization
     * Update an organization.  Required scope: **organizations:write**
     * Responses:
     *  - 200: organization found
     *  - 404: organization not found
     *  - 400: Invalid responses - malformed authentication header, invalid organization name length
     *  - 401: Invalid responses - invalid subject, authentication failed
     *  - 403: Invalid scope
     *
     * @param organizationGuid Identifier for the organization. 
     * @param patchOrganizationOrganizationModel  
     * @return [OrganizationOrganizationModel]
     */
    @PATCH("api/organizations/{organization_guid}")
    suspend fun updateOrganization(@Path("organization_guid") organizationGuid: kotlin.String, @Body patchOrganizationOrganizationModel: PatchOrganizationOrganizationModel): Response<OrganizationOrganizationModel>

}
