/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.controllers;

import com.github.api.ApiHelper;
import com.github.api.Server;
import com.github.api.exceptions.ApiException;
import com.github.api.http.request.HttpMethod;
import com.github.api.models.ActionsBillingUsage;
import com.github.api.models.CombinedBillingUsage;
import com.github.api.models.PackagesBillingUsage;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class BillingController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public BillingController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Gets the summary of the free and paid GitHub Actions minutes used. Paid minutes only apply to
     * workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for
     * each GitHub-hosted runner operating system. Any job re-runs are also included in the usage.
     * The usage returned includes any minute multipliers for macOS and Windows runners, and is
     * rounded up to the nearest whole minute. For more information, see "[Managing billing for
     * GitHub
     * Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
     * Access tokens must have the `repo` or `admin:org` scope.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the ActionsBillingUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ActionsBillingUsage billingGetGithubActionsBillingOrg(
            final String org) throws ApiException, IOException {
        return prepareBillingGetGithubActionsBillingOrgRequest(org).execute();
    }

    /**
     * Gets the summary of the free and paid GitHub Actions minutes used. Paid minutes only apply to
     * workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for
     * each GitHub-hosted runner operating system. Any job re-runs are also included in the usage.
     * The usage returned includes any minute multipliers for macOS and Windows runners, and is
     * rounded up to the nearest whole minute. For more information, see "[Managing billing for
     * GitHub
     * Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
     * Access tokens must have the `repo` or `admin:org` scope.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the ActionsBillingUsage response from the API call
     */
    public CompletableFuture<ActionsBillingUsage> billingGetGithubActionsBillingOrgAsync(
            final String org) {
        try { 
            return prepareBillingGetGithubActionsBillingOrgRequest(org).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for billingGetGithubActionsBillingOrg.
     */
    private ApiCall<ActionsBillingUsage, ApiException> prepareBillingGetGithubActionsBillingOrgRequest(
            final String org) throws IOException {
        return new ApiCall.Builder<ActionsBillingUsage, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orgs/{org}/settings/billing/actions")
                        .templateParam(param -> param.key("org").value(org)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ActionsBillingUsage.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets the free and paid storage used for GitHub Packages in gigabytes. Paid minutes only apply
     * to packages stored for private repositories. For more information, see "[Managing billing for
     * GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `repo` or `admin:org` scope.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the PackagesBillingUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PackagesBillingUsage billingGetGithubPackagesBillingOrg(
            final String org) throws ApiException, IOException {
        return prepareBillingGetGithubPackagesBillingOrgRequest(org).execute();
    }

    /**
     * Gets the free and paid storage used for GitHub Packages in gigabytes. Paid minutes only apply
     * to packages stored for private repositories. For more information, see "[Managing billing for
     * GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `repo` or `admin:org` scope.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the PackagesBillingUsage response from the API call
     */
    public CompletableFuture<PackagesBillingUsage> billingGetGithubPackagesBillingOrgAsync(
            final String org) {
        try { 
            return prepareBillingGetGithubPackagesBillingOrgRequest(org).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for billingGetGithubPackagesBillingOrg.
     */
    private ApiCall<PackagesBillingUsage, ApiException> prepareBillingGetGithubPackagesBillingOrgRequest(
            final String org) throws IOException {
        return new ApiCall.Builder<PackagesBillingUsage, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orgs/{org}/settings/billing/packages")
                        .templateParam(param -> param.key("org").value(org)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PackagesBillingUsage.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub
     * Packages. Paid minutes only apply to packages stored for private repositories. For more
     * information, see "[Managing billing for GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `repo` or `admin:org` scope.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the CombinedBillingUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CombinedBillingUsage billingGetSharedStorageBillingOrg(
            final String org) throws ApiException, IOException {
        return prepareBillingGetSharedStorageBillingOrgRequest(org).execute();
    }

    /**
     * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub
     * Packages. Paid minutes only apply to packages stored for private repositories. For more
     * information, see "[Managing billing for GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `repo` or `admin:org` scope.
     * @param  org  Required parameter: The organization name. The name is not case sensitive.
     * @return    Returns the CombinedBillingUsage response from the API call
     */
    public CompletableFuture<CombinedBillingUsage> billingGetSharedStorageBillingOrgAsync(
            final String org) {
        try { 
            return prepareBillingGetSharedStorageBillingOrgRequest(org).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for billingGetSharedStorageBillingOrg.
     */
    private ApiCall<CombinedBillingUsage, ApiException> prepareBillingGetSharedStorageBillingOrgRequest(
            final String org) throws IOException {
        return new ApiCall.Builder<CombinedBillingUsage, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orgs/{org}/settings/billing/shared-storage")
                        .templateParam(param -> param.key("org").value(org)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CombinedBillingUsage.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets the summary of the free and paid GitHub Actions minutes used. Paid minutes only apply to
     * workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for
     * each GitHub-hosted runner operating system. Any job re-runs are also included in the usage.
     * The usage returned includes any minute multipliers for macOS and Windows runners, and is
     * rounded up to the nearest whole minute. For more information, see "[Managing billing for
     * GitHub
     * Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
     * Access tokens must have the `user` scope.
     * @param  username  Required parameter: The handle for the GitHub user account.
     * @return    Returns the ActionsBillingUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ActionsBillingUsage billingGetGithubActionsBillingUser(
            final String username) throws ApiException, IOException {
        return prepareBillingGetGithubActionsBillingUserRequest(username).execute();
    }

    /**
     * Gets the summary of the free and paid GitHub Actions minutes used. Paid minutes only apply to
     * workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for
     * each GitHub-hosted runner operating system. Any job re-runs are also included in the usage.
     * The usage returned includes any minute multipliers for macOS and Windows runners, and is
     * rounded up to the nearest whole minute. For more information, see "[Managing billing for
     * GitHub
     * Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
     * Access tokens must have the `user` scope.
     * @param  username  Required parameter: The handle for the GitHub user account.
     * @return    Returns the ActionsBillingUsage response from the API call
     */
    public CompletableFuture<ActionsBillingUsage> billingGetGithubActionsBillingUserAsync(
            final String username) {
        try { 
            return prepareBillingGetGithubActionsBillingUserRequest(username).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for billingGetGithubActionsBillingUser.
     */
    private ApiCall<ActionsBillingUsage, ApiException> prepareBillingGetGithubActionsBillingUserRequest(
            final String username) throws IOException {
        return new ApiCall.Builder<ActionsBillingUsage, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/users/{username}/settings/billing/actions")
                        .templateParam(param -> param.key("username").value(username)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ActionsBillingUsage.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets the free and paid storage used for GitHub Packages in gigabytes. Paid minutes only apply
     * to packages stored for private repositories. For more information, see "[Managing billing for
     * GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `user` scope.
     * @param  username  Required parameter: The handle for the GitHub user account.
     * @return    Returns the PackagesBillingUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PackagesBillingUsage billingGetGithubPackagesBillingUser(
            final String username) throws ApiException, IOException {
        return prepareBillingGetGithubPackagesBillingUserRequest(username).execute();
    }

    /**
     * Gets the free and paid storage used for GitHub Packages in gigabytes. Paid minutes only apply
     * to packages stored for private repositories. For more information, see "[Managing billing for
     * GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `user` scope.
     * @param  username  Required parameter: The handle for the GitHub user account.
     * @return    Returns the PackagesBillingUsage response from the API call
     */
    public CompletableFuture<PackagesBillingUsage> billingGetGithubPackagesBillingUserAsync(
            final String username) {
        try { 
            return prepareBillingGetGithubPackagesBillingUserRequest(username).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for billingGetGithubPackagesBillingUser.
     */
    private ApiCall<PackagesBillingUsage, ApiException> prepareBillingGetGithubPackagesBillingUserRequest(
            final String username) throws IOException {
        return new ApiCall.Builder<PackagesBillingUsage, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/users/{username}/settings/billing/packages")
                        .templateParam(param -> param.key("username").value(username)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PackagesBillingUsage.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub
     * Packages. Paid minutes only apply to packages stored for private repositories. For more
     * information, see "[Managing billing for GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `user` scope.
     * @param  username  Required parameter: The handle for the GitHub user account.
     * @return    Returns the CombinedBillingUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CombinedBillingUsage billingGetSharedStorageBillingUser(
            final String username) throws ApiException, IOException {
        return prepareBillingGetSharedStorageBillingUserRequest(username).execute();
    }

    /**
     * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub
     * Packages. Paid minutes only apply to packages stored for private repositories. For more
     * information, see "[Managing billing for GitHub
     * Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
     * Access tokens must have the `user` scope.
     * @param  username  Required parameter: The handle for the GitHub user account.
     * @return    Returns the CombinedBillingUsage response from the API call
     */
    public CompletableFuture<CombinedBillingUsage> billingGetSharedStorageBillingUserAsync(
            final String username) {
        try { 
            return prepareBillingGetSharedStorageBillingUserRequest(username).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for billingGetSharedStorageBillingUser.
     */
    private ApiCall<CombinedBillingUsage, ApiException> prepareBillingGetSharedStorageBillingUserRequest(
            final String username) throws IOException {
        return new ApiCall.Builder<CombinedBillingUsage, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/users/{username}/settings/billing/shared-storage")
                        .templateParam(param -> param.key("username").value(username)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CombinedBillingUsage.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}