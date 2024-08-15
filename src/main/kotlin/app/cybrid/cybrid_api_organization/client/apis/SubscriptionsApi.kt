package app.cybrid.cybrid_api_organization.client.apis

import app.cybrid.cybrid_api_organization.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import app.cybrid.cybrid_api_organization.client.models.ErrorResponseOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.PostSubscriptionOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.SubscriptionListOrganizationModel
import app.cybrid.cybrid_api_organization.client.models.SubscriptionOrganizationModel

interface SubscriptionsApi {
    /**
     * Create Subscription
     * Creates a Subscription.  ## Subscription creation  Subscriptions can be created for webhook endpoints.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the subscription details in our private store | | completed | The Platform has created the subscription | | failed | The Platform was not able to successfully create the subscription |    Required scope: **subscriptions:execute
     * Responses:
     *  - 201: Subscription created
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param postSubscriptionOrganizationModel 
     * @return [SubscriptionOrganizationModel]
     */
    @POST("api/subscriptions/")
    suspend fun createSubscription(@Body postSubscriptionOrganizationModel: PostSubscriptionOrganizationModel): Response<SubscriptionOrganizationModel>

    /**
     * Delete Subscription
     * Deletes a subscription.  Required scope: **subscriptions:execute**
     * Responses:
     *  - 204: Subscription deleted
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: Subscription not found
     *
     * @param subscriptionGuid Identifier for the subscription.
     * @return [Unit]
     */
    @DELETE("api/subscriptions/{subscription_guid}")
    suspend fun deleteSubscription(@Path("subscription_guid") subscriptionGuid: kotlin.String): Response<Unit>

    /**
     * Get Subscription 
     * Retrieves a subscription.  Required scope: **subscriptions:read**
     * Responses:
     *  - 200: Subscription found
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *  - 404: Subscription not found
     *
     * @param subscriptionGuid Identifier for the subscription.
     * @param includeSigningKey Flag to include signing key in the response. (optional)
     * @return [SubscriptionOrganizationModel]
     */
    @GET("api/subscriptions/{subscription_guid}")
    suspend fun getSubscription(@Path("subscription_guid") subscriptionGuid: kotlin.String, @Query("include_signing_key") includeSigningKey: kotlin.Boolean? = null): Response<SubscriptionOrganizationModel>

    /**
     * Get subscriptions list
     * Retrieves a listing of subscriptions.  Required scope: **subscriptions:read**
     * Responses:
     *  - 200: Get list of subscriptions
     *  - 400: Invalid requests
     *  - 401: Unauthorized - Authentication failed, 
     *  - 403: Invalid scope
     *
     * @param page The page index to retrieve. (optional)
     * @param perPage The number of entities per page to return. (optional)
     * @param guid Comma separated subscription_guids to list subscriptions for. (optional)
     * @param includeSigningKey Flag to include signing key in the response. (optional)
     * @return [SubscriptionListOrganizationModel]
     */
    @GET("api/subscriptions")
    suspend fun listSubscriptions(@Query("page") page: java.math.BigDecimal? = null, @Query("per_page") perPage: java.math.BigDecimal? = null, @Query("guid") guid: kotlin.String? = null, @Query("include_signing_key") includeSigningKey: kotlin.Boolean? = null): Response<SubscriptionListOrganizationModel>

}
