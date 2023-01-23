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
import com.github.api.models.ReposBranchesBranchProtectionRestrictionsTeamsRequest;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ReposAddTeamAccessRestrictionsBody.ReposAddTeamAccessRestrictionsBodyDeserializer.class)
public abstract class ReposAddTeamAccessRestrictionsBody {
    
    /**
     * One-of type initialization method.
     * @param reposBranchesBranchProtectionRestrictionsTeamsRequest ReposBranchesBranchProtectionRestrictionsTeamsRequest value for reposBranchesBranchProtectionRestrictionsTeamsRequest.
     * @return The ReposBranchesBranchProtectionRestrictionsTeamsRequestCase object.
     */
    public static ReposAddTeamAccessRestrictionsBody fromReposBranchesBranchProtectionRestrictionsTeamsRequest(
            ReposBranchesBranchProtectionRestrictionsTeamsRequest reposBranchesBranchProtectionRestrictionsTeamsRequest) {
        return reposBranchesBranchProtectionRestrictionsTeamsRequest == null ? null : new ReposBranchesBranchProtectionRestrictionsTeamsRequestCase(reposBranchesBranchProtectionRestrictionsTeamsRequest);
    }

    /**
     * One-of type initialization method.
     * @param mString List of String value for mString.
     * @return The MStringCase object.
     */
    public static ReposAddTeamAccessRestrictionsBody fromMString(List<String> mString) {
        return mString == null ? null : new MStringCase(mString);
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
        R reposBranchesBranchProtectionRestrictionsTeamsRequest(ReposBranchesBranchProtectionRestrictionsTeamsRequest reposBranchesBranchProtectionRestrictionsTeamsRequest);

        R mString(List<String> mString);
    }

    /**
     * This is a implementation class for ReposBranchesBranchProtectionRestrictionsTeamsRequestCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ReposBranchesBranchProtectionRestrictionsTeamsRequestCase extends ReposAddTeamAccessRestrictionsBody {

        @JsonValue
        private ReposBranchesBranchProtectionRestrictionsTeamsRequest reposBranchesBranchProtectionRestrictionsTeamsRequest;

        ReposBranchesBranchProtectionRestrictionsTeamsRequestCase(ReposBranchesBranchProtectionRestrictionsTeamsRequest reposBranchesBranchProtectionRestrictionsTeamsRequest) {
            this.reposBranchesBranchProtectionRestrictionsTeamsRequest = reposBranchesBranchProtectionRestrictionsTeamsRequest;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.reposBranchesBranchProtectionRestrictionsTeamsRequest(this.reposBranchesBranchProtectionRestrictionsTeamsRequest);
        }

        @JsonCreator
        private ReposBranchesBranchProtectionRestrictionsTeamsRequestCase(JsonNode jsonNode) throws IOException {
            this.reposBranchesBranchProtectionRestrictionsTeamsRequest = ApiHelper.deserialize(jsonNode,
                ReposBranchesBranchProtectionRestrictionsTeamsRequest.class);
        }

        @Override
        public String toString() {
            return reposBranchesBranchProtectionRestrictionsTeamsRequest.toString();
        }
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class MStringCase extends ReposAddTeamAccessRestrictionsBody {

        @JsonValue
        private List<String> mString;

        MStringCase(List<String> mString) {
            this.mString = mString;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mString(this.mString);
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
     * This is a custom deserializer class for ReposAddTeamAccessRestrictionsBody.
     */
    protected static class ReposAddTeamAccessRestrictionsBodyDeserializer
            extends JsonDeserializer<ReposAddTeamAccessRestrictionsBody> {

        @Override
        public ReposAddTeamAccessRestrictionsBody deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    ReposBranchesBranchProtectionRestrictionsTeamsRequestCase.class,
                    MStringCase.class), true);
        }
    }

}
