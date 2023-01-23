/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.controllers;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.api.ApiHelper;
import com.github.api.Server;
import com.github.api.exceptions.ApiException;
import com.github.api.exceptions.OrgsInteractionLimits422ErrorException;
import com.github.api.exceptions.UserInteractionLimits422ErrorException;
import com.github.api.http.request.HttpMethod;
import com.github.api.models.OrgsInteractionLimitsRequest;
import com.github.api.models.OrgsInteractionLimitsResponse;
import com.github.api.models.OrgsInteractionLimitsResponse2;
import com.github.api.models.ReposInteractionLimitsRequest;
import com.github.api.models.ReposInteractionLimitsResponse2;
import com.github.api.models.UserInteractionLimitsRequest;
import com.github.api.models.UserInteractionLimitsResponse2;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;

/**
 * This class lists all the endpoints of the groups.
 */
public final class InteractionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public InteractionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Shows which type of GitHub user can interact with this organization and when the restriction
     * expires. If there is no restrictions, you will see an empty response.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the OrgsInteractionLimitsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrgsInteractionLimitsResponse interactionsGetRestrictionsForOrg(
            final String org) throws ApiException, IOException {
        return prepareInteractionsGetRestrictionsForOrgRequest(org).execute();
    }

    /**
     * Shows which type of GitHub user can interact with this organization and when the restriction
     * expires. If there is no restrictions, you will see an empty response.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the OrgsInteractionLimitsResponse response from the API call
     */
    public CompletableFuture<OrgsInteractionLimitsResponse> interactionsGetRestrictionsForOrgAsync(
            final String org) {
        try { 
            return prepareInteractionsGetRestrictionsForOrgRequest(org).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsGetRestrictionsForOrg.
     */
    private ApiCall<OrgsInteractionLimitsResponse, ApiException> prepareInteractionsGetRestrictionsForOrgRequest(
            final String org) throws IOException {
        return new ApiCall.Builder<OrgsInteractionLimitsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orgs/{org}/interaction-limits")
                        .templateParam(param -> param.key("org").value(org)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OrgsInteractionLimitsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Temporarily restricts interactions to a certain type of GitHub user in any public repository
     * in the given organization. You must be an organization owner to set these restrictions.
     * Setting the interaction limit at the organization level will overwrite any interaction limits
     * that are set for individual repositories owned by the organization.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @param  body  Required parameter: Example:
     * @return    Returns the OrgsInteractionLimitsResponse2 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrgsInteractionLimitsResponse2 interactionsSetRestrictionsForOrg(
            final String org,
            final OrgsInteractionLimitsRequest body) throws ApiException, IOException {
        return prepareInteractionsSetRestrictionsForOrgRequest(org, body).execute();
    }

    /**
     * Temporarily restricts interactions to a certain type of GitHub user in any public repository
     * in the given organization. You must be an organization owner to set these restrictions.
     * Setting the interaction limit at the organization level will overwrite any interaction limits
     * that are set for individual repositories owned by the organization.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @param  body  Required parameter: Example:
     * @return    Returns the OrgsInteractionLimitsResponse2 response from the API call
     */
    public CompletableFuture<OrgsInteractionLimitsResponse2> interactionsSetRestrictionsForOrgAsync(
            final String org,
            final OrgsInteractionLimitsRequest body) {
        try { 
            return prepareInteractionsSetRestrictionsForOrgRequest(org, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsSetRestrictionsForOrg.
     */
    private ApiCall<OrgsInteractionLimitsResponse2, ApiException> prepareInteractionsSetRestrictionsForOrgRequest(
            final String org,
            final OrgsInteractionLimitsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<OrgsInteractionLimitsResponse2, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orgs/{org}/interaction-limits")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("org").value(org)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OrgsInteractionLimitsResponse2.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.create("Validation failed, or the endpoint has been spammed.",
                                (reason, context) -> new OrgsInteractionLimits422ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Removes all interaction restrictions from public repositories in the given organization. You
     * must be an organization owner to remove restrictions.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void interactionsRemoveRestrictionsForOrg(
            final String org) throws ApiException, IOException {
        prepareInteractionsRemoveRestrictionsForOrgRequest(org).execute();
    }

    /**
     * Removes all interaction restrictions from public repositories in the given organization. You
     * must be an organization owner to remove restrictions.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> interactionsRemoveRestrictionsForOrgAsync(
            final String org) {
        try { 
            return prepareInteractionsRemoveRestrictionsForOrgRequest(org).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsRemoveRestrictionsForOrg.
     */
    private ApiCall<Void, ApiException> prepareInteractionsRemoveRestrictionsForOrgRequest(
            final String org) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orgs/{org}/interaction-limits")
                        .templateParam(param -> param.key("org").value(org)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Shows which type of GitHub user can interact with this repository and when the restriction
     * expires. If there are no restrictions, you will see an empty response.
     * @param  owner  Required parameter: The account owner of the repository. The name is not case
     *         sensitive.
     * @param  repo  Required parameter: The name of the repository. The name is not case sensitive.
     * @return    Returns the OrgsInteractionLimitsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrgsInteractionLimitsResponse interactionsGetRestrictionsForRepo(
            final String owner,
            final String repo) throws ApiException, IOException {
        return prepareInteractionsGetRestrictionsForRepoRequest(owner, repo).execute();
    }

    /**
     * Shows which type of GitHub user can interact with this repository and when the restriction
     * expires. If there are no restrictions, you will see an empty response.
     * @param  owner  Required parameter: The account owner of the repository. The name is not case
     *         sensitive.
     * @param  repo  Required parameter: The name of the repository. The name is not case sensitive.
     * @return    Returns the OrgsInteractionLimitsResponse response from the API call
     */
    public CompletableFuture<OrgsInteractionLimitsResponse> interactionsGetRestrictionsForRepoAsync(
            final String owner,
            final String repo) {
        try { 
            return prepareInteractionsGetRestrictionsForRepoRequest(owner, repo).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsGetRestrictionsForRepo.
     */
    private ApiCall<OrgsInteractionLimitsResponse, ApiException> prepareInteractionsGetRestrictionsForRepoRequest(
            final String owner,
            final String repo) throws IOException {
        return new ApiCall.Builder<OrgsInteractionLimitsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/repos/{owner}/{repo}/interaction-limits")
                        .templateParam(param -> param.key("owner").value(owner)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("repo").value(repo)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OrgsInteractionLimitsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Temporarily restricts interactions to a certain type of GitHub user within the given
     * repository. You must have owner or admin access to set these restrictions. If an interaction
     * limit is set for the user or organization that owns this repository, you will receive a `409
     * Conflict` response and will not be able to use this endpoint to change the interaction limit
     * for a single repository.
     * @param  owner  Required parameter: The account owner of the repository. The name is not case
     *         sensitive.
     * @param  repo  Required parameter: The name of the repository. The name is not case sensitive.
     * @param  body  Required parameter: Example:
     * @return    Returns the ReposInteractionLimitsResponse2 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReposInteractionLimitsResponse2 interactionsSetRestrictionsForRepo(
            final String owner,
            final String repo,
            final ReposInteractionLimitsRequest body) throws ApiException, IOException {
        return prepareInteractionsSetRestrictionsForRepoRequest(owner, repo, body).execute();
    }

    /**
     * Temporarily restricts interactions to a certain type of GitHub user within the given
     * repository. You must have owner or admin access to set these restrictions. If an interaction
     * limit is set for the user or organization that owns this repository, you will receive a `409
     * Conflict` response and will not be able to use this endpoint to change the interaction limit
     * for a single repository.
     * @param  owner  Required parameter: The account owner of the repository. The name is not case
     *         sensitive.
     * @param  repo  Required parameter: The name of the repository. The name is not case sensitive.
     * @param  body  Required parameter: Example:
     * @return    Returns the ReposInteractionLimitsResponse2 response from the API call
     */
    public CompletableFuture<ReposInteractionLimitsResponse2> interactionsSetRestrictionsForRepoAsync(
            final String owner,
            final String repo,
            final ReposInteractionLimitsRequest body) {
        try { 
            return prepareInteractionsSetRestrictionsForRepoRequest(owner, repo, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsSetRestrictionsForRepo.
     */
    private ApiCall<ReposInteractionLimitsResponse2, ApiException> prepareInteractionsSetRestrictionsForRepoRequest(
            final String owner,
            final String repo,
            final ReposInteractionLimitsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ReposInteractionLimitsResponse2, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/repos/{owner}/{repo}/interaction-limits")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("owner").value(owner)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("repo").value(repo)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReposInteractionLimitsResponse2.class))
                        .nullify404(false)
                        .localErrorCase("409",
                                 ErrorCase.create("Response",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Removes all interaction restrictions from the given repository. You must have owner or admin
     * access to remove restrictions. If the interaction limit is set for the user or organization
     * that owns this repository, you will receive a `409 Conflict` response and will not be able to
     * use this endpoint to change the interaction limit for a single repository.
     * @param  owner  Required parameter: The account owner of the repository. The name is not case
     *         sensitive.
     * @param  repo  Required parameter: The name of the repository. The name is not case sensitive.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void interactionsRemoveRestrictionsForRepo(
            final String owner,
            final String repo) throws ApiException, IOException {
        prepareInteractionsRemoveRestrictionsForRepoRequest(owner, repo).execute();
    }

    /**
     * Removes all interaction restrictions from the given repository. You must have owner or admin
     * access to remove restrictions. If the interaction limit is set for the user or organization
     * that owns this repository, you will receive a `409 Conflict` response and will not be able to
     * use this endpoint to change the interaction limit for a single repository.
     * @param  owner  Required parameter: The account owner of the repository. The name is not case
     *         sensitive.
     * @param  repo  Required parameter: The name of the repository. The name is not case sensitive.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> interactionsRemoveRestrictionsForRepoAsync(
            final String owner,
            final String repo) {
        try { 
            return prepareInteractionsRemoveRestrictionsForRepoRequest(owner, repo).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsRemoveRestrictionsForRepo.
     */
    private ApiCall<Void, ApiException> prepareInteractionsRemoveRestrictionsForRepoRequest(
            final String owner,
            final String repo) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/repos/{owner}/{repo}/interaction-limits")
                        .templateParam(param -> param.key("owner").value(owner)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("repo").value(repo)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("409",
                                 ErrorCase.create("Response",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Shows which type of GitHub user can interact with your public repositories and when the
     * restriction expires.
     * @return    Returns the OrgsInteractionLimitsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrgsInteractionLimitsResponse interactionsGetRestrictionsForAuthenticatedUser() throws ApiException, IOException {
        return prepareInteractionsGetRestrictionsForAuthenticatedUserRequest().execute();
    }

    /**
     * Shows which type of GitHub user can interact with your public repositories and when the
     * restriction expires.
     * @return    Returns the OrgsInteractionLimitsResponse response from the API call
     */
    public CompletableFuture<OrgsInteractionLimitsResponse> interactionsGetRestrictionsForAuthenticatedUserAsync() {
        try { 
            return prepareInteractionsGetRestrictionsForAuthenticatedUserRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsGetRestrictionsForAuthenticatedUser.
     */
    private ApiCall<OrgsInteractionLimitsResponse, ApiException> prepareInteractionsGetRestrictionsForAuthenticatedUserRequest() throws IOException {
        return new ApiCall.Builder<OrgsInteractionLimitsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/user/interaction-limits")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OrgsInteractionLimitsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Temporarily restricts which type of GitHub user can interact with your public repositories.
     * Setting the interaction limit at the user level will overwrite any interaction limits that
     * are set for individual repositories owned by the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the UserInteractionLimitsResponse2 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UserInteractionLimitsResponse2 interactionsSetRestrictionsForAuthenticatedUser(
            final UserInteractionLimitsRequest body) throws ApiException, IOException {
        return prepareInteractionsSetRestrictionsForAuthenticatedUserRequest(body).execute();
    }

    /**
     * Temporarily restricts which type of GitHub user can interact with your public repositories.
     * Setting the interaction limit at the user level will overwrite any interaction limits that
     * are set for individual repositories owned by the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the UserInteractionLimitsResponse2 response from the API call
     */
    public CompletableFuture<UserInteractionLimitsResponse2> interactionsSetRestrictionsForAuthenticatedUserAsync(
            final UserInteractionLimitsRequest body) {
        try { 
            return prepareInteractionsSetRestrictionsForAuthenticatedUserRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsSetRestrictionsForAuthenticatedUser.
     */
    private ApiCall<UserInteractionLimitsResponse2, ApiException> prepareInteractionsSetRestrictionsForAuthenticatedUserRequest(
            final UserInteractionLimitsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<UserInteractionLimitsResponse2, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/user/interaction-limits")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UserInteractionLimitsResponse2.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.create("Validation failed, or the endpoint has been spammed.",
                                (reason, context) -> new UserInteractionLimits422ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Removes any interaction restrictions from your public repositories.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void interactionsRemoveRestrictionsForAuthenticatedUser() throws ApiException, IOException {
        prepareInteractionsRemoveRestrictionsForAuthenticatedUserRequest().execute();
    }

    /**
     * Removes any interaction restrictions from your public repositories.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> interactionsRemoveRestrictionsForAuthenticatedUserAsync() {
        try { 
            return prepareInteractionsRemoveRestrictionsForAuthenticatedUserRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for interactionsRemoveRestrictionsForAuthenticatedUser.
     */
    private ApiCall<Void, ApiException> prepareInteractionsRemoveRestrictionsForAuthenticatedUserRequest() throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/user/interaction-limits")
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}