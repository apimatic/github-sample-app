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
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ReposIssuesIssueNumberRequestMilestone.ReposIssuesIssueNumberRequestMilestoneDeserializer.class)
public abstract class ReposIssuesIssueNumberRequestMilestone {
    
    /**
     * One-of type initialization method.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static ReposIssuesIssueNumberRequestMilestone fromMString(String mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * One-of type initialization method.
     * @param number int value for number.
     * @return The NumberCase object.
     */
    public static ReposIssuesIssueNumberRequestMilestone fromNumber(int number) {
        return new NumberCase(number);
    }

    /**
     * One-of type initialization method.
     * @param object Map of String, value for object.
     * @return The ObjectCase object.
     */
    public static ReposIssuesIssueNumberRequestMilestone fromObject(Map<String, Object> object) {
        return object == null ? null : new ObjectCase(object);
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

        R number(int number);

        R object(Map<String, Object> object);
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase
    private static class MStringCase extends ReposIssuesIssueNumberRequestMilestone {

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
     * This is a implementation class for NumberCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class NumberCase extends ReposIssuesIssueNumberRequestMilestone {

        @JsonValue
        private int number;

        NumberCase(int number) {
            this.number = number;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.number(this.number);
        }

        @JsonCreator
        private NumberCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isInt()) {
                this.number = ApiHelper.deserialize(jsonNode, Integer.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }

    /**
     * This is a implementation class for ObjectCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ObjectCase extends ReposIssuesIssueNumberRequestMilestone {

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
     * This is a custom deserializer class for ReposIssuesIssueNumberRequestMilestone.
     */
    protected static class ReposIssuesIssueNumberRequestMilestoneDeserializer
            extends JsonDeserializer<ReposIssuesIssueNumberRequestMilestone> {

        @Override
        public ReposIssuesIssueNumberRequestMilestone deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MStringCase.class, NumberCase.class,
                    ObjectCase.class), true);
        }
    }

}
