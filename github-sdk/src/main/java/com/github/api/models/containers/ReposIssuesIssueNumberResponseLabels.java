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
import com.github.api.models.Label2;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ReposIssuesIssueNumberResponseLabels.ReposIssuesIssueNumberResponseLabelsDeserializer.class)
public abstract class ReposIssuesIssueNumberResponseLabels {
    
    /**
     * One-of type initialization method.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static ReposIssuesIssueNumberResponseLabels fromMString(String mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * One-of type initialization method.
     * @param label2 Label2 value for label2.
     * @return The Label2Case object.
     */
    public static ReposIssuesIssueNumberResponseLabels fromLabel2(Label2 label2) {
        return label2 == null ? null : new Label2Case(label2);
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
        R mString(String mString);

        R label2(Label2 label2);
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase
    private static class MStringCase extends ReposIssuesIssueNumberResponseLabels {

        @JsonValue
        private String mString;

        MStringCase(String mString) {
            this.mString = mString;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mString(this.mString);
        }

        @JsonCreator
        private MStringCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isTextual()) {
                this.mString = ApiHelper.deserialize(jsonNode, String.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return mString.toString();
        }
    }

    /**
     * This is a implementation class for Label2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class Label2Case extends ReposIssuesIssueNumberResponseLabels {

        @JsonValue
        private Label2 label2;

        Label2Case(Label2 label2) {
            this.label2 = label2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.label2(this.label2);
        }

        @JsonCreator
        private Label2Case(JsonNode jsonNode) throws IOException {
            this.label2 = ApiHelper.deserialize(jsonNode,
                Label2.class);
        }

        @Override
        public String toString() {
            return label2.toString();
        }
    }

    /**
     * This is a custom deserializer class for ReposIssuesIssueNumberResponseLabels.
     */
    protected static class ReposIssuesIssueNumberResponseLabelsDeserializer
            extends JsonDeserializer<ReposIssuesIssueNumberResponseLabels> {

        @Override
        public ReposIssuesIssueNumberResponseLabels deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MStringCase.class,
                    Label2Case.class), true);
        }
    }

}
