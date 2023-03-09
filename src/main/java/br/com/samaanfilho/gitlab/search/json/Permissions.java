
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
    "project_access",
    "group_access"
})
@Generated("jsonschema2pojo")
public class Permissions implements Serializable
{

    @JsonProperty("project_access")
    private Object projectAccess;
    @JsonProperty("group_access")
    private GroupAccess groupAccess;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 7135157992195232181L;

    @JsonProperty("project_access")
    public Object getProjectAccess() {
        return projectAccess;
    }

    @JsonProperty("project_access")
    public void setProjectAccess(Object projectAccess) {
        this.projectAccess = projectAccess;
    }

    @JsonProperty("group_access")
    public GroupAccess getGroupAccess() {
        return groupAccess;
    }

    @JsonProperty("group_access")
    public void setGroupAccess(GroupAccess groupAccess) {
        this.groupAccess = groupAccess;
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
        sb.append(Permissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projectAccess");
        sb.append('=');
        sb.append(((this.projectAccess == null)?"<null>":this.projectAccess));
        sb.append(',');
        sb.append("groupAccess");
        sb.append('=');
        sb.append(((this.groupAccess == null)?"<null>":this.groupAccess));
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
        result = ((result* 31)+((this.projectAccess == null)? 0 :this.projectAccess.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.groupAccess == null)? 0 :this.groupAccess.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permissions) == false) {
            return false;
        }
        Permissions rhs = ((Permissions) other);
        return ((((this.projectAccess == rhs.projectAccess)||((this.projectAccess!= null)&&this.projectAccess.equals(rhs.projectAccess)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.groupAccess == rhs.groupAccess)||((this.groupAccess!= null)&&this.groupAccess.equals(rhs.groupAccess))));
    }

}
