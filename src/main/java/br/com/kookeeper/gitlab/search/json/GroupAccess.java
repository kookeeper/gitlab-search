
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
    "access_level",
    "notification_level"
})
@Generated("jsonschema2pojo")
public class GroupAccess implements Serializable
{

    @JsonProperty("access_level")
    private Integer accessLevel;
    @JsonProperty("notification_level")
    private Integer notificationLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 6402487045955584993L;

    @JsonProperty("access_level")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    @JsonProperty("access_level")
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @JsonProperty("notification_level")
    public Integer getNotificationLevel() {
        return notificationLevel;
    }

    @JsonProperty("notification_level")
    public void setNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
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
        sb.append(GroupAccess.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessLevel");
        sb.append('=');
        sb.append(((this.accessLevel == null)?"<null>":this.accessLevel));
        sb.append(',');
        sb.append("notificationLevel");
        sb.append('=');
        sb.append(((this.notificationLevel == null)?"<null>":this.notificationLevel));
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
        result = ((result* 31)+((this.notificationLevel == null)? 0 :this.notificationLevel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accessLevel == null)? 0 :this.accessLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupAccess) == false) {
            return false;
        }
        GroupAccess rhs = ((GroupAccess) other);
        return ((((this.notificationLevel == rhs.notificationLevel)||((this.notificationLevel!= null)&&this.notificationLevel.equals(rhs.notificationLevel)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accessLevel == rhs.accessLevel)||((this.accessLevel!= null)&&this.accessLevel.equals(rhs.accessLevel))));
    }

}
