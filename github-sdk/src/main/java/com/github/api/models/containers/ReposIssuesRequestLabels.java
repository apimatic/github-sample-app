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
import com.github.api.models.Label6;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ReposIssuesRequestLabels.ReposIssuesRequestLabelsDeserializer.class)
public abstract class ReposIssuesRequestLabels {
    
    /**
     * One-of type initialization method.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static ReposIssuesRequestLabels fromMString(String mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * One-of type initialization method.
     * @param label6 Label6 value for label6.
     * @return The Label6Case object.
     */
    public static ReposIssuesRequestLabels fromLabel6(Label6 label6) {
        return label6 == null ? null : new Label6Case(label6);
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

        R label6(Label6 label6);
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase
    private static class MStringCase extends ReposIssuesRequestLabels {

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
     * This is a implementation class for Label6Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class Label6Case extends ReposIssuesRequestLabels {

        @JsonValue
        private Label6 label6;

        Label6Case(Label6 label6) {
            this.label6 = label6;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.label6(this.label6);
        }

        @JsonCreator
        private Label6Case(JsonNode jsonNode) throws IOException {
            this.label6 = ApiHelper.deserialize(jsonNode,
                Label6.class);
        }

        @Override
        public String toString() {
            return label6.toString();
        }
    }

    /**
     * This is a custom deserializer class for ReposIssuesRequestLabels.
     */
    protected static class ReposIssuesRequestLabelsDeserializer
            extends JsonDeserializer<ReposIssuesRequestLabels> {

        @Override
        public ReposIssuesRequestLabels deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MStringCase.class,
                    Label6Case.class), true);
        }
    }

}
