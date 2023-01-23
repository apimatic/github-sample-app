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
import com.github.api.models.InteractionLimits;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = InteractionsGetRestrictionsForOrgResponse.InteractionsGetRestrictionsForOrgResponseDeserializer.class)
public abstract class InteractionsGetRestrictionsForOrgResponse {
    
    /**
     * Any-of type initialization method.
     * @param interactionLimits InteractionLimits value for interactionLimits.
     * @return The InteractionLimitsCase object.
     */
    public static InteractionsGetRestrictionsForOrgResponse fromInteractionLimits(
            InteractionLimits interactionLimits) {
        return interactionLimits == null ? null : new InteractionLimitsCase(interactionLimits);
    }

    /**
     * Any-of type initialization method.
     * @param object Map of String, value for object.
     * @return The ObjectCase object.
     */
    public static InteractionsGetRestrictionsForOrgResponse fromObject(Map<String, Object> object) {
        return object == null ? null : new ObjectCase(object);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R interactionLimits(InteractionLimits interactionLimits);

        R object(Map<String, Object> object);
    }

    /**
     * This is a implementation class for InteractionLimitsCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class InteractionLimitsCase extends InteractionsGetRestrictionsForOrgResponse {

        @JsonValue
        private InteractionLimits interactionLimits;

        InteractionLimitsCase(InteractionLimits interactionLimits) {
            this.interactionLimits = interactionLimits;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.interactionLimits(this.interactionLimits);
        }

        @JsonCreator
        private InteractionLimitsCase(JsonNode jsonNode) throws IOException {
            this.interactionLimits = ApiHelper.deserialize(jsonNode,
                InteractionLimits.class);
        }

        @Override
        public String toString() {
            return interactionLimits.toString();
        }
    }

    /**
     * This is a implementation class for ObjectCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ObjectCase extends InteractionsGetRestrictionsForOrgResponse {

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
     * This is a custom deserializer class for InteractionsGetRestrictionsForOrgResponse.
     */
    protected static class InteractionsGetRestrictionsForOrgResponseDeserializer
            extends JsonDeserializer<InteractionsGetRestrictionsForOrgResponse> {

        @Override
        public InteractionsGetRestrictionsForOrgResponse deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(InteractionLimitsCase.class,
                    ObjectCase.class), false);
        }
    }

}
