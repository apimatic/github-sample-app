/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for SearchCommitsResponse type.
 */
public class SearchCommitsResponse {
    private int totalCount;
    private boolean incompleteResults;
    private List<CommitSearchResultItem> items;

    /**
     * Default constructor.
     */
    public SearchCommitsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  incompleteResults  boolean value for incompleteResults.
     * @param  items  List of CommitSearchResultItem value for items.
     */
    public SearchCommitsResponse(
            int totalCount,
            boolean incompleteResults,
            List<CommitSearchResultItem> items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    /**
     * Getter for TotalCount.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for IncompleteResults.
     * @return Returns the boolean
     */
    @JsonGetter("incomplete_results")
    public boolean getIncompleteResults() {
        return incompleteResults;
    }

    /**
     * Setter for IncompleteResults.
     * @param incompleteResults Value for boolean
     */
    @JsonSetter("incomplete_results")
    public void setIncompleteResults(boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    /**
     * Getter for Items.
     * @return Returns the List of CommitSearchResultItem
     */
    @JsonGetter("items")
    public List<CommitSearchResultItem> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of CommitSearchResultItem
     */
    @JsonSetter("items")
    public void setItems(List<CommitSearchResultItem> items) {
        this.items = items;
    }

    /**
     * Converts this SearchCommitsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchCommitsResponse [" + "totalCount=" + totalCount + ", incompleteResults="
                + incompleteResults + ", items=" + items + "]";
    }

    /**
     * Builds a new {@link SearchCommitsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchCommitsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, incompleteResults, items);
        return builder;
    }

    /**
     * Class to build instances of {@link SearchCommitsResponse}.
     */
    public static class Builder {
        private int totalCount;
        private boolean incompleteResults;
        private List<CommitSearchResultItem> items;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  incompleteResults  boolean value for incompleteResults.
         * @param  items  List of CommitSearchResultItem value for items.
         */
        public Builder(int totalCount, boolean incompleteResults,
                List<CommitSearchResultItem> items) {
            this.totalCount = totalCount;
            this.incompleteResults = incompleteResults;
            this.items = items;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  int value for totalCount.
         * @return Builder
         */
        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for incompleteResults.
         * @param  incompleteResults  boolean value for incompleteResults.
         * @return Builder
         */
        public Builder incompleteResults(boolean incompleteResults) {
            this.incompleteResults = incompleteResults;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of CommitSearchResultItem value for items.
         * @return Builder
         */
        public Builder items(List<CommitSearchResultItem> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds a new {@link SearchCommitsResponse} object using the set fields.
         * @return {@link SearchCommitsResponse}
         */
        public SearchCommitsResponse build() {
            return new SearchCommitsResponse(totalCount, incompleteResults, items);
        }
    }
}
