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
import com.github.api.models.DynamicResponse;
import com.github.api.models.Team6;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PullRequest42RequestedReviewers.PullRequest42RequestedReviewersDeserializer.class)
public abstract class PullRequest42RequestedReviewers {
    
    /**
     * One-of type initialization method.
     * @param dynamic DynamicResponse value for dynamic.
     * @return The DynamicCase object.
     */
    public static PullRequest42RequestedReviewers fromDynamic(DynamicResponse dynamic) {
        return dynamic == null ? null : new DynamicCase(dynamic);
    }

    /**
     * One-of type initialization method.
     * @param team6 Team6 value for team6.
     * @return The Team6Case object.
     */
    public static PullRequest42RequestedReviewers fromTeam6(Team6 team6) {
        return team6 == null ? null : new Team6Case(team6);
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
        R dynamic(DynamicResponse dynamic);

        R team6(Team6 team6);
    }

    /**
     * This is a implementation class for DynamicCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class DynamicCase extends PullRequest42RequestedReviewers {

        @JsonValue
        private DynamicResponse dynamic;

        DynamicCase(DynamicResponse dynamic) {
            this.dynamic = dynamic;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.dynamic(this.dynamic);
        }

        @JsonCreator
        private DynamicCase(JsonNode jsonNode) throws IOException {
            this.dynamic = ApiHelper.deserialize(jsonNode, DynamicResponse.class);
        }

        @Override
        public String toString() {
            return dynamic.toString();
        }
    }

    /**
     * This is a implementation class for Team6Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class Team6Case extends PullRequest42RequestedReviewers {

        @JsonValue
        private Team6 team6;

        Team6Case(Team6 team6) {
            this.team6 = team6;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.team6(this.team6);
        }

        @JsonCreator
        private Team6Case(JsonNode jsonNode) throws IOException {
            this.team6 = ApiHelper.deserialize(jsonNode,
                Team6.class);
        }

        @Override
        public String toString() {
            return team6.toString();
        }
    }

    /**
     * This is a custom deserializer class for PullRequest42RequestedReviewers.
     */
    protected static class PullRequest42RequestedReviewersDeserializer
            extends JsonDeserializer<PullRequest42RequestedReviewers> {

        @Override
        public PullRequest42RequestedReviewers deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(DynamicCase.class,
                    Team6Case.class), true);
        }
    }

}
