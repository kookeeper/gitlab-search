
package br.com.samaanfilho.gitlab.search.json;

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
    "cadence",
    "enabled",
    "keep_n",
    "older_than",
    "name_regex",
    "name_regex_keep",
    "next_run_at"
})
@Generated("jsonschema2pojo")
public class ContainerExpirationPolicy implements Serializable
{

    @JsonProperty("cadence")
    private String cadence;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("keep_n")
    private Integer keepN;
    @JsonProperty("older_than")
    private String olderThan;
    @JsonProperty("name_regex")
    private String nameRegex;
    @JsonProperty("name_regex_keep")
    private Object nameRegexKeep;
    @JsonProperty("next_run_at")
    private String nextRunAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4775790818156853942L;

    @JsonProperty("cadence")
    public String getCadence() {
        return cadence;
    }

    @JsonProperty("cadence")
    public void setCadence(String cadence) {
        this.cadence = cadence;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("keep_n")
    public Integer getKeepN() {
        return keepN;
    }

    @JsonProperty("keep_n")
    public void setKeepN(Integer keepN) {
        this.keepN = keepN;
    }

    @JsonProperty("older_than")
    public String getOlderThan() {
        return olderThan;
    }

    @JsonProperty("older_than")
    public void setOlderThan(String olderThan) {
        this.olderThan = olderThan;
    }

    @JsonProperty("name_regex")
    public String getNameRegex() {
        return nameRegex;
    }

    @JsonProperty("name_regex")
    public void setNameRegex(String nameRegex) {
        this.nameRegex = nameRegex;
    }

    @JsonProperty("name_regex_keep")
    public Object getNameRegexKeep() {
        return nameRegexKeep;
    }

    @JsonProperty("name_regex_keep")
    public void setNameRegexKeep(Object nameRegexKeep) {
        this.nameRegexKeep = nameRegexKeep;
    }

    @JsonProperty("next_run_at")
    public String getNextRunAt() {
        return nextRunAt;
    }

    @JsonProperty("next_run_at")
    public void setNextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
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
        sb.append(ContainerExpirationPolicy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cadence");
        sb.append('=');
        sb.append(((this.cadence == null)?"<null>":this.cadence));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("keepN");
        sb.append('=');
        sb.append(((this.keepN == null)?"<null>":this.keepN));
        sb.append(',');
        sb.append("olderThan");
        sb.append('=');
        sb.append(((this.olderThan == null)?"<null>":this.olderThan));
        sb.append(',');
        sb.append("nameRegex");
        sb.append('=');
        sb.append(((this.nameRegex == null)?"<null>":this.nameRegex));
        sb.append(',');
        sb.append("nameRegexKeep");
        sb.append('=');
        sb.append(((this.nameRegexKeep == null)?"<null>":this.nameRegexKeep));
        sb.append(',');
        sb.append("nextRunAt");
        sb.append('=');
        sb.append(((this.nextRunAt == null)?"<null>":this.nextRunAt));
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
        result = ((result* 31)+((this.nameRegex == null)? 0 :this.nameRegex.hashCode()));
        result = ((result* 31)+((this.nameRegexKeep == null)? 0 :this.nameRegexKeep.hashCode()));
        result = ((result* 31)+((this.olderThan == null)? 0 :this.olderThan.hashCode()));
        result = ((result* 31)+((this.keepN == null)? 0 :this.keepN.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nextRunAt == null)? 0 :this.nextRunAt.hashCode()));
        result = ((result* 31)+((this.cadence == null)? 0 :this.cadence.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerExpirationPolicy) == false) {
            return false;
        }
        ContainerExpirationPolicy rhs = ((ContainerExpirationPolicy) other);
        return (((((((((this.nameRegex == rhs.nameRegex)||((this.nameRegex!= null)&&this.nameRegex.equals(rhs.nameRegex)))&&((this.nameRegexKeep == rhs.nameRegexKeep)||((this.nameRegexKeep!= null)&&this.nameRegexKeep.equals(rhs.nameRegexKeep))))&&((this.olderThan == rhs.olderThan)||((this.olderThan!= null)&&this.olderThan.equals(rhs.olderThan))))&&((this.keepN == rhs.keepN)||((this.keepN!= null)&&this.keepN.equals(rhs.keepN))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nextRunAt == rhs.nextRunAt)||((this.nextRunAt!= null)&&this.nextRunAt.equals(rhs.nextRunAt))))&&((this.cadence == rhs.cadence)||((this.cadence!= null)&&this.cadence.equals(rhs.cadence))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))));
    }

}
