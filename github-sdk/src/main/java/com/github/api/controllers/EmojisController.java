/*
 * GitHubAPILib This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.api.ApiHelper;
import com.github.api.Server;
import com.github.api.exceptions.ApiException;
import com.github.api.http.request.HttpMethod;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class EmojisController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig Configurations added in client.
     */
    public EmojisController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Lists all the emojis available to use on GitHub.
     * @return Returns the Map of String, String response from the API call
     * @throws ApiException Represents error response from the server.
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    public Map<String, String> emojisGet() throws ApiException, IOException {
        return prepareEmojisGetRequest().execute();
    }

    /**
     * Lists all the emojis available to use on GitHub.
     * @return Returns the Map of String, String response from the API call
     */
    public CompletableFuture<Map<String, String>> emojisGetAsync() {
        try {
            return prepareEmojisGetRequest().executeAsync();
        } catch (Exception e) {
            throw new CompletionException(e);
        }
    }

    /**
     * Builds the ApiCall object for emojisGet.
     */
    private ApiCall<Map<String, String>, ApiException> prepareEmojisGetRequest()
            throws IOException {
        return new ApiCall.Builder<Map<String, String>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder.server(Server.ENUM_DEFAULT.value())
                        .path("/emojis").authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(response -> ApiHelper.deserialize(response,
                                new TypeReference<Map<String, String>>() {}))
                        .nullify404(false).globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}
