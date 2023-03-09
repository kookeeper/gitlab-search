
package br.com.kookeeper.gitlab.search.json;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "issues",
    "merge_requests",
    "repo_branches",
    "labels",
    "events",
    "members"
})
@Generated("jsonschema2pojo")
public class Links implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("issues")
    private String issues;
    @JsonProperty("merge_requests")
    private String mergeRequests;
    @JsonProperty("repo_branches")
    private String repoBranches;
    @JsonProperty("labels")
    private String labels;
    @JsonProperty("events")
    private String events;
    @JsonProperty("members")
    private String members;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 8679715581797424869L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("issues")
    public String getIssues() {
        return issues;
    }

    @JsonProperty("issues")
    public void setIssues(String issues) {
        this.issues = issues;
    }

    @JsonProperty("merge_requests")
    public String getMergeRequests() {
        return mergeRequests;
    }

    @JsonProperty("merge_requests")
    public void setMergeRequests(String mergeRequests) {
        this.mergeRequests = mergeRequests;
    }

    @JsonProperty("repo_branches")
    public String getRepoBranches() {
        return repoBranches;
    }

    @JsonProperty("repo_branches")
    public void setRepoBranches(String repoBranches) {
        this.repoBranches = repoBranches;
    }

    @JsonProperty("labels")
    public String getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(String labels) {
        this.labels = labels;
    }

    @JsonProperty("events")
    public String getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(String events) {
        this.events = events;
    }

    @JsonProperty("members")
    public String getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(String members) {
        this.members = members;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Links.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("issues");
        sb.append('=');
        sb.append(((this.issues == null)?"<null>":this.issues));
        sb.append(',');
        sb.append("mergeRequests");
        sb.append('=');
        sb.append(((this.mergeRequests == null)?"<null>":this.mergeRequests));
        sb.append(',');
        sb.append("repoBranches");
        sb.append('=');
        sb.append(((this.repoBranches == null)?"<null>":this.repoBranches));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.mergeRequests == null)? 0 :this.mergeRequests.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        result = ((result* 31)+((this.repoBranches == null)? 0 :this.repoBranches.hashCode()));
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.issues == null)? 0 :this.issues.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return (((((((((this.mergeRequests == rhs.mergeRequests)||((this.mergeRequests!= null)&&this.mergeRequests.equals(rhs.mergeRequests)))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))))&&((this.repoBranches == rhs.repoBranches)||((this.repoBranches!= null)&&this.repoBranches.equals(rhs.repoBranches))))&&((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.issues == rhs.issues)||((this.issues!= null)&&this.issues.equals(rhs.issues))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))));
    }

}
