package app.cybrid.cybrid_api_organization.client.apis

import app.cybrid.cybrid_api_organization.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_organization.client.models.ErrorResponseOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.SubscriptionEventListOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.SubscriptionEventOrganizationModel

interface SubscriptionEventsApi {
    /**
     * Get Subscription Event 
     * Retrieves a Subscription Event.  Required scope: **subscription_events:read**
     * Responses:
     *  - 200: Subscription Event found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: Subscription Event not found
     *
     * @param subscriptionEventGuid Identifier for the Subscription Event.
     * @return [SubscriptionEventOrganizationModel]
     */
    @GET("api/subscription_events/{subscription_event_guid}")
    suspend fun getSubscriptionEvent(@Path("subscription_event_guid") subscriptionEventGuid: kotlin.String): Response<SubscriptionEventOrganizationModel>

    /**
     * Get subscription events list
     * Retrieves a listing of subscription events s.  Required scope: **subscription_events:read**
     * Responses:
     *  - 200: Get list of subscription events
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated subscription_event_guids to list subscription events for. (optional)
     * @return [SubscriptionEventListOrganizationModel]
     */
    @GET("api/subscription_events")
    suspend fun listSubscriptionEvents(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null): Response<SubscriptionEventListOrganizationModel>

}
