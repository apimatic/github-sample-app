/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.api.ApiHelper;
import com.github.api.models.UserEmailsRequest;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = UsersAddEmailForAuthenticatedUserBody.UsersAddEmailForAuthenticatedUserBodyDeserializer.class)
public abstract class UsersAddEmailForAuthenticatedUserBody {
    
    /**
     * One-of type initialization method.
     * @param userEmailsRequest UserEmailsRequest value for userEmailsRequest.
     * @return The UserEmailsRequestCase object.
     */
    public static UsersAddEmailForAuthenticatedUserBody fromUserEmailsRequest(
            UserEmailsRequest userEmailsRequest) {
        return userEmailsRequest == null ? null : new UserEmailsRequestCase(userEmailsRequest);
    }

    /**
     * One-of type initialization method.
     * @param mString List of String value for mString.
     * @return The MStringCase object.
     */
    public static UsersAddEmailForAuthenticatedUserBody fromMString(List<String> mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * One-of type initialization method.
     * @param string2 String value for string2.
     * @return The String2Case object.
     */
    public static UsersAddEmailForAuthenticatedUserBody fromString2(String string2) {
        return string2 == null ? null : new String2Case(string2);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * Method to get serialized content type of set one-of type.
     * @return The String value of content type.
     */
    public abstract String getContentType();

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R userEmailsRequest(UserEmailsRequest userEmailsRequest);

        R mString(List<String> mString);

        R string2(String string2);
    }

    /**
     * This is a implementation class for UserEmailsRequestCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class UserEmailsRequestCase extends UsersAddEmailForAuthenticatedUserBody {

        @JsonValue
        private UserEmailsRequest userEmailsRequest;

        UserEmailsRequestCase(UserEmailsRequest userEmailsRequest) {
            this.userEmailsRequest = userEmailsRequest;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.userEmailsRequest(this.userEmailsRequest);
        }

        @Override
        public String getContentType() {
            return "application/json";
        }

        @JsonCreator
        private UserEmailsRequestCase(JsonNode jsonNode) throws IOException {
            this.userEmailsRequest = ApiHelper.deserialize(jsonNode,
                UserEmailsRequest.class);
        }

        @Override
        public String toString() {
            return userEmailsRequest.toString();
        }
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class MStringCase extends UsersAddEmailForAuthenticatedUserBody {

        @JsonValue
        private List<String> mString;

        MStringCase(List<String> mString) {
            this.mString = mString;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mString(this.mString);
        }

        @Override
        public String getContentType() {
            return "application/json";
        }

        @JsonCreator
        private MStringCase(JsonNode jsonNode) throws IOException {
            this.mString = ApiHelper.deserializeArray(jsonNode,
                String[].class);
        }

        @Override
        public String toString() {
            return mString.toString();
        }
    }

    /**
     * This is a implementation class for String2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase
    private static class String2Case extends UsersAddEmailForAuthenticatedUserBody {

        @JsonValue
        private String string2;

        String2Case(String string2) {
            this.string2 = string2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.string2(this.string2);
        }

        @Override
        public String getContentType() {
            return "text/plain; charset=utf-8";
        }

        @JsonCreator
        private String2Case(JsonNode jsonNode) throws IOException {
            if (jsonNode.isTextual()) {
                this.string2 = ApiHelper.deserialize(jsonNode, String.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return string2.toString();
        }
    }

    /**
     * This is a custom deserializer class for UsersAddEmailForAuthenticatedUserBody.
     */
    protected static class UsersAddEmailForAuthenticatedUserBodyDeserializer
            extends JsonDeserializer<UsersAddEmailForAuthenticatedUserBody> {

        @Override
        public UsersAddEmailForAuthenticatedUserBody deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(UserEmailsRequestCase.class,
                    MStringCase.class, String2Case.class), true);
        }
    }

}
