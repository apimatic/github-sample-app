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
import com.github.api.models.SimpleUser;
import com.github.api.models.Team;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = ReviewerReviewer.ReviewerReviewerDeserializer.class)
public abstract class ReviewerReviewer {
    
    /**
     * Any-of type initialization method.
     * @param simpleUser SimpleUser value for simpleUser.
     * @return The SimpleUserCase object.
     */
    public static ReviewerReviewer fromSimpleUser(SimpleUser simpleUser) {
        return simpleUser == null ? null : new SimpleUserCase(simpleUser);
    }

    /**
     * Any-of type initialization method.
     * @param team Team value for team.
     * @return The TeamCase object.
     */
    public static ReviewerReviewer fromTeam(Team team) {
        return team == null ? null : new TeamCase(team);
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
        R simpleUser(SimpleUser simpleUser);

        R team(Team team);
    }

    /**
     * This is a implementation class for SimpleUserCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class SimpleUserCase extends ReviewerReviewer {

        @JsonValue
        private SimpleUser simpleUser;

        SimpleUserCase(SimpleUser simpleUser) {
            this.simpleUser = simpleUser;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.simpleUser(this.simpleUser);
        }

        @JsonCreator
        private SimpleUserCase(JsonNode jsonNode) throws IOException {
            this.simpleUser = ApiHelper.deserialize(jsonNode,
                SimpleUser.class);
        }

        @Override
        public String toString() {
            return simpleUser.toString();
        }
    }

    /**
     * This is a implementation class for TeamCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class TeamCase extends ReviewerReviewer {

        @JsonValue
        private Team team;

        TeamCase(Team team) {
            this.team = team;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.team(this.team);
        }

        @JsonCreator
        private TeamCase(JsonNode jsonNode) throws IOException {
            this.team = ApiHelper.deserialize(jsonNode,
                Team.class);
        }

        @Override
        public String toString() {
            return team.toString();
        }
    }

    /**
     * This is a custom deserializer class for ReviewerReviewer.
     */
    protected static class ReviewerReviewerDeserializer
            extends JsonDeserializer<ReviewerReviewer> {

        @Override
        public ReviewerReviewer deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(SimpleUserCase.class,
                    TeamCase.class), false);
        }
    }

}
