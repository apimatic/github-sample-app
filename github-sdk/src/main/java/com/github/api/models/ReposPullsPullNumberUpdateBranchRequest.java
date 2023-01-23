/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ReposPullsPullNumberUpdateBranchRequest type.
 */
public class ReposPullsPullNumberUpdateBranchRequest {
    private String expectedHeadSha;

    /**
     * Default constructor.
     */
    public ReposPullsPullNumberUpdateBranchRequest() {
    }

    /**
     * Initialization constructor.
     * @param  expectedHeadSha  String value for expectedHeadSha.
     */
    public ReposPullsPullNumberUpdateBranchRequest(
            String expectedHeadSha) {
        this.expectedHeadSha = expectedHeadSha;
    }

    /**
     * Getter for ExpectedHeadSha.
     * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull
     * request's branch. If the expected SHA does not match the pull request's HEAD, you will
     * receive a `422 Unprocessable Entity` status. You can use the "[List
     * commits](https://docs.github.com/rest/reference/repos#list-commits)" endpoint to find the
     * most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
     * @return Returns the String
     */
    @JsonGetter("expected_head_sha")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpectedHeadSha() {
        return expectedHeadSha;
    }

    /**
     * Setter for ExpectedHeadSha.
     * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull
     * request's branch. If the expected SHA does not match the pull request's HEAD, you will
     * receive a `422 Unprocessable Entity` status. You can use the "[List
     * commits](https://docs.github.com/rest/reference/repos#list-commits)" endpoint to find the
     * most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
     * @param expectedHeadSha Value for String
     */
    @JsonSetter("expected_head_sha")
    public void setExpectedHeadSha(String expectedHeadSha) {
        this.expectedHeadSha = expectedHeadSha;
    }

    /**
     * Converts this ReposPullsPullNumberUpdateBranchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPullsPullNumberUpdateBranchRequest [" + "expectedHeadSha=" + expectedHeadSha
                + "]";
    }

    /**
     * Builds a new {@link ReposPullsPullNumberUpdateBranchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPullsPullNumberUpdateBranchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .expectedHeadSha(getExpectedHeadSha());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPullsPullNumberUpdateBranchRequest}.
     */
    public static class Builder {
        private String expectedHeadSha;



        /**
         * Setter for expectedHeadSha.
         * @param  expectedHeadSha  String value for expectedHeadSha.
         * @return Builder
         */
        public Builder expectedHeadSha(String expectedHeadSha) {
            this.expectedHeadSha = expectedHeadSha;
            return this;
        }

        /**
         * Builds a new {@link ReposPullsPullNumberUpdateBranchRequest} object using the set fields.
         * @return {@link ReposPullsPullNumberUpdateBranchRequest}
         */
        public ReposPullsPullNumberUpdateBranchRequest build() {
            return new ReposPullsPullNumberUpdateBranchRequest(expectedHeadSha);
        }
    }
}