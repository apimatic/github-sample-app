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
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.api.ApiHelper;
import com.github.api.models.User65;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PullRequest31Assignees.PullRequest31AssigneesDeserializer.class)
public abstract class PullRequest31Assignees {
    
    /**
     * One-of type initialization method.
     * @param object Map of String, value for object.
     * @return The ObjectCase object.
     */
    public static PullRequest31Assignees fromObject(Map<String, Object> object) {
        return object == null ? null : new ObjectCase(object);
    }

    /**
     * One-of type initialization method.
     * @param user65 User65 value for user65.
     * @return The User65Case object.
     */
    public static PullRequest31Assignees fromUser65(User65 user65) {
        return user65 == null ? null : new User65Case(user65);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R object(Map<String, Object> object);

        R user65(User65 user65);
    }

    /**
     * This is a implementation class for ObjectCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ObjectCase extends PullRequest31Assignees {

        @JsonValue
        private Map<String, Object> object;

        ObjectCase(Map<String, Object> object) {
            this.object = object;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.object(this.object);
        }

        @JsonCreator
        private ObjectCase(JsonNode jsonNode) throws IOException {
            this.object = ApiHelper.deserialize(jsonNode,
                new TypeReference<Map<String, Object>>(){});
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }

    /**
     * This is a implementation class for User65Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class User65Case extends PullRequest31Assignees {

        @JsonValue
        private User65 user65;

        User65Case(User65 user65) {
            this.user65 = user65;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.user65(this.user65);
        }

        @JsonCreator
        private User65Case(JsonNode jsonNode) throws IOException {
            this.user65 = ApiHelper.deserialize(jsonNode,
                User65.class);
        }

        @Override
        public String toString() {
            return user65.toString();
        }
    }

    /**
     * This is a custom deserializer class for PullRequest31Assignees.
     */
    protected static class PullRequest31AssigneesDeserializer
            extends JsonDeserializer<PullRequest31Assignees> {

        @Override
        public PullRequest31Assignees deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(ObjectCase.class,
                    User65Case.class), true);
        }
    }

}
