package app.cybrid.cybrid_api_organization.client.apis

import app.cybrid.cybrid_api_organization.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_organization.client.models.ErrorResponseOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.PostSubscriptionDeliveryOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.SubscriptionDeliveryListOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.SubscriptionDeliveryOrganizationModel

interface SubscriptionDeliveriesApi {
    /**
     * Create SubscriptionDelivery
     * Creates a SubscriptionDelivery.  post  Required scope: **subscription_events:execute
     * Responses:
     *  - 201: SubscriptionDelivery created
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postSubscriptionDeliveryOrganizationModel 
     * @return [SubscriptionDeliveryOrganizationModel]
     */
    @POST("api/subscription_deliveries/")
    suspend fun createSubscriptionDelivery(@Body postSubscriptionDeliveryOrganizationModel: PostSubscriptionDeliveryOrganizationModel): Response<SubscriptionDeliveryOrganizationModel>

    /**
     * Get Subscription Delivery 
     * Retrieves a subscription delivery.  Required scope: **subscription_events:read**
     * Responses:
     *  - 200: Subscription delivery found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: Subscription delivery not found
     *
     * @param subscriptionDeliveryGuid Identifier for the subscription delivery.
     * @return [SubscriptionDeliveryOrganizationModel]
     */
    @GET("api/subscription_deliveries/{subscription_delivery_guid}")
    suspend fun getSubscriptionDelivery(@Path("subscription_delivery_guid") subscriptionDeliveryGuid: kotlin.String): Response<SubscriptionDeliveryOrganizationModel>

    /**
     * Get subscription deliveries list
     * Retrieves a listing of subscription deliveries s.  Required scope: **subscription_events:read**
     * Responses:
     *  - 200: Get list of subscription deliveries
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated subscription_delivery_guids to list subscription deliveries for. (optional)
     * @param subscriptionEventGuid Comma separated subscription_event_guids to list subscription deliveries for. (optional)
     * @param subscriptionGuid Comma separated subscription_guids to list subscription deliveries for. (optional)
     * @return [SubscriptionDeliveryListOrganizationModel]
     */
    @GET("api/subscription_deliveries")
    suspend fun listSubscriptionDeliveries(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("subscription_event_guid") subscriptionEventGuid: kotlin.String? = null, @Query("subscription_guid") subscriptionGuid: kotlin.String? = null): Response<SubscriptionDeliveryListOrganizationModel>

}
