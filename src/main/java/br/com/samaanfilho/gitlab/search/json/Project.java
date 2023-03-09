
package br.com.samaanfilho.gitlab.search.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "id",
    "description",
    "name",
    "name_with_namespace",
    "path",
    "path_with_namespace",
    "created_at",
    "default_branch",
    "tag_list",
    "ssh_url_to_repo",
    "http_url_to_repo",
    "web_url",
    "readme_url",
    "avatar_url",
    "forks_count",
    "star_count",
    "last_activity_at",
    "namespace",
    "_links",
    "packages_enabled",
    "empty_repo",
    "archived",
    "visibility",
    "resolve_outdated_diff_discussions",
    "container_registry_enabled",
    "container_expiration_policy",
    "issues_enabled",
    "merge_requests_enabled",
    "wiki_enabled",
    "jobs_enabled",
    "snippets_enabled",
    "service_desk_enabled",
    "service_desk_address",
    "can_create_merge_request_in",
    "issues_access_level",
    "repository_access_level",
    "merge_requests_access_level",
    "forking_access_level",
    "wiki_access_level",
    "builds_access_level",
    "snippets_access_level",
    "pages_access_level",
    "operations_access_level",
    "analytics_access_level",
    "emails_disabled",
    "shared_runners_enabled",
    "lfs_enabled",
    "creator_id",
    "import_status",
    "open_issues_count",
    "ci_default_git_depth",
    "ci_forward_deployment_enabled",
    "public_jobs",
    "build_timeout",
    "auto_cancel_pending_pipelines",
    "build_coverage_regex",
    "ci_config_path",
    "shared_with_groups",
    "only_allow_merge_if_pipeline_succeeds",
    "allow_merge_on_skipped_pipeline",
    "restrict_user_defined_variables",
    "request_access_enabled",
    "only_allow_merge_if_all_discussions_are_resolved",
    "remove_source_branch_after_merge",
    "printing_merge_request_link_enabled",
    "merge_method",
    "suggestion_commit_message",
    "auto_devops_enabled",
    "auto_devops_deploy_strategy",
    "autoclose_referenced_issues",
    "permissions"
})
@Generated("jsonschema2pojo")
public class Project implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_with_namespace")
    private String nameWithNamespace;
    @JsonProperty("path")
    private String path;
    @JsonProperty("path_with_namespace")
    private String pathWithNamespace;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonProperty("tag_list")
    private List<Object> tagList = new ArrayList<Object>();
    @JsonProperty("ssh_url_to_repo")
    private String sshUrlToRepo;
    @JsonProperty("http_url_to_repo")
    private String httpUrlToRepo;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("readme_url")
    private String readmeUrl;
    @JsonProperty("avatar_url")
    private Object avatarUrl;
    @JsonProperty("forks_count")
    private Integer forksCount;
    @JsonProperty("star_count")
    private Integer starCount;
    @JsonProperty("last_activity_at")
    private String lastActivityAt;
    @JsonProperty("namespace")
    private Namespace namespace;
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("packages_enabled")
    private Object packagesEnabled;
    @JsonProperty("empty_repo")
    private Boolean emptyRepo;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("resolve_outdated_diff_discussions")
    private Boolean resolveOutdatedDiffDiscussions;
    @JsonProperty("container_registry_enabled")
    private Boolean containerRegistryEnabled;
    @JsonProperty("container_expiration_policy")
    private ContainerExpirationPolicy containerExpirationPolicy;
    @JsonProperty("issues_enabled")
    private Boolean issuesEnabled;
    @JsonProperty("merge_requests_enabled")
    private Boolean mergeRequestsEnabled;
    @JsonProperty("wiki_enabled")
    private Boolean wikiEnabled;
    @JsonProperty("jobs_enabled")
    private Boolean jobsEnabled;
    @JsonProperty("snippets_enabled")
    private Boolean snippetsEnabled;
    @JsonProperty("service_desk_enabled")
    private Boolean serviceDeskEnabled;
    @JsonProperty("service_desk_address")
    private Object serviceDeskAddress;
    @JsonProperty("can_create_merge_request_in")
    private Boolean canCreateMergeRequestIn;
    @JsonProperty("issues_access_level")
    private String issuesAccessLevel;
    @JsonProperty("repository_access_level")
    private String repositoryAccessLevel;
    @JsonProperty("merge_requests_access_level")
    private String mergeRequestsAccessLevel;
    @JsonProperty("forking_access_level")
    private String forkingAccessLevel;
    @JsonProperty("wiki_access_level")
    private String wikiAccessLevel;
    @JsonProperty("builds_access_level")
    private String buildsAccessLevel;
    @JsonProperty("snippets_access_level")
    private String snippetsAccessLevel;
    @JsonProperty("pages_access_level")
    private String pagesAccessLevel;
    @JsonProperty("operations_access_level")
    private String operationsAccessLevel;
    @JsonProperty("analytics_access_level")
    private String analyticsAccessLevel;
    @JsonProperty("emails_disabled")
    private Object emailsDisabled;
    @JsonProperty("shared_runners_enabled")
    private Boolean sharedRunnersEnabled;
    @JsonProperty("lfs_enabled")
    private Boolean lfsEnabled;
    @JsonProperty("creator_id")
    private Integer creatorId;
    @JsonProperty("import_status")
    private String importStatus;
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    @JsonProperty("ci_default_git_depth")
    private Integer ciDefaultGitDepth;
    @JsonProperty("ci_forward_deployment_enabled")
    private Object ciForwardDeploymentEnabled;
    @JsonProperty("public_jobs")
    private Boolean publicJobs;
    @JsonProperty("build_timeout")
    private Integer buildTimeout;
    @JsonProperty("auto_cancel_pending_pipelines")
    private String autoCancelPendingPipelines;
    @JsonProperty("build_coverage_regex")
    private Object buildCoverageRegex;
    @JsonProperty("ci_config_path")
    private Object ciConfigPath;
    @JsonProperty("shared_with_groups")
    private List<Object> sharedWithGroups = new ArrayList<Object>();
    @JsonProperty("only_allow_merge_if_pipeline_succeeds")
    private Boolean onlyAllowMergeIfPipelineSucceeds;
    @JsonProperty("allow_merge_on_skipped_pipeline")
    private Object allowMergeOnSkippedPipeline;
    @JsonProperty("restrict_user_defined_variables")
    private Boolean restrictUserDefinedVariables;
    @JsonProperty("request_access_enabled")
    private Boolean requestAccessEnabled;
    @JsonProperty("only_allow_merge_if_all_discussions_are_resolved")
    private Boolean onlyAllowMergeIfAllDiscussionsAreResolved;
    @JsonProperty("remove_source_branch_after_merge")
    private Object removeSourceBranchAfterMerge;
    @JsonProperty("printing_merge_request_link_enabled")
    private Boolean printingMergeRequestLinkEnabled;
    @JsonProperty("merge_method")
    private String mergeMethod;
    @JsonProperty("suggestion_commit_message")
    private Object suggestionCommitMessage;
    @JsonProperty("auto_devops_enabled")
    private Boolean autoDevopsEnabled;
    @JsonProperty("auto_devops_deploy_strategy")
    private String autoDevopsDeployStrategy;
    @JsonProperty("autoclose_referenced_issues")
    private Boolean autocloseReferencedIssues;
    @JsonProperty("permissions")
    private Permissions permissions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4026178756483292706L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_with_namespace")
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    @JsonProperty("name_with_namespace")
    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("path_with_namespace")
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    @JsonProperty("path_with_namespace")
    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @JsonProperty("tag_list")
    public List<Object> getTagList() {
        return tagList;
    }

    @JsonProperty("tag_list")
    public void setTagList(List<Object> tagList) {
        this.tagList = tagList;
    }

    @JsonProperty("ssh_url_to_repo")
    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    @JsonProperty("ssh_url_to_repo")
    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    @JsonProperty("http_url_to_repo")
    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    @JsonProperty("http_url_to_repo")
    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @JsonProperty("readme_url")
    public String getReadmeUrl() {
        return readmeUrl;
    }

    @JsonProperty("readme_url")
    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    @JsonProperty("avatar_url")
    public Object getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonProperty("forks_count")
    public Integer getForksCount() {
        return forksCount;
    }

    @JsonProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    @JsonProperty("star_count")
    public Integer getStarCount() {
        return starCount;
    }

    @JsonProperty("star_count")
    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    @JsonProperty("last_activity_at")
    public String getLastActivityAt() {
        return lastActivityAt;
    }

    @JsonProperty("last_activity_at")
    public void setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    @JsonProperty("namespace")
    public Namespace getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("packages_enabled")
    public Object getPackagesEnabled() {
        return packagesEnabled;
    }

    @JsonProperty("packages_enabled")
    public void setPackagesEnabled(Object packagesEnabled) {
        this.packagesEnabled = packagesEnabled;
    }

    @JsonProperty("empty_repo")
    public Boolean getEmptyRepo() {
        return emptyRepo;
    }

    @JsonProperty("empty_repo")
    public void setEmptyRepo(Boolean emptyRepo) {
        this.emptyRepo = emptyRepo;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("resolve_outdated_diff_discussions")
    public Boolean getResolveOutdatedDiffDiscussions() {
        return resolveOutdatedDiffDiscussions;
    }

    @JsonProperty("resolve_outdated_diff_discussions")
    public void setResolveOutdatedDiffDiscussions(Boolean resolveOutdatedDiffDiscussions) {
        this.resolveOutdatedDiffDiscussions = resolveOutdatedDiffDiscussions;
    }

    @JsonProperty("container_registry_enabled")
    public Boolean getContainerRegistryEnabled() {
        return containerRegistryEnabled;
    }

    @JsonProperty("container_registry_enabled")
    public void setContainerRegistryEnabled(Boolean containerRegistryEnabled) {
        this.containerRegistryEnabled = containerRegistryEnabled;
    }

    @JsonProperty("container_expiration_policy")
    public ContainerExpirationPolicy getContainerExpirationPolicy() {
        return containerExpirationPolicy;
    }

    @JsonProperty("container_expiration_policy")
    public void setContainerExpirationPolicy(ContainerExpirationPolicy containerExpirationPolicy) {
        this.containerExpirationPolicy = containerExpirationPolicy;
    }

    @JsonProperty("issues_enabled")
    public Boolean getIssuesEnabled() {
        return issuesEnabled;
    }

    @JsonProperty("issues_enabled")
    public void setIssuesEnabled(Boolean issuesEnabled) {
        this.issuesEnabled = issuesEnabled;
    }

    @JsonProperty("merge_requests_enabled")
    public Boolean getMergeRequestsEnabled() {
        return mergeRequestsEnabled;
    }

    @JsonProperty("merge_requests_enabled")
    public void setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
        this.mergeRequestsEnabled = mergeRequestsEnabled;
    }

    @JsonProperty("wiki_enabled")
    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    @JsonProperty("wiki_enabled")
    public void setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    @JsonProperty("jobs_enabled")
    public Boolean getJobsEnabled() {
        return jobsEnabled;
    }

    @JsonProperty("jobs_enabled")
    public void setJobsEnabled(Boolean jobsEnabled) {
        this.jobsEnabled = jobsEnabled;
    }

    @JsonProperty("snippets_enabled")
    public Boolean getSnippetsEnabled() {
        return snippetsEnabled;
    }

    @JsonProperty("snippets_enabled")
    public void setSnippetsEnabled(Boolean snippetsEnabled) {
        this.snippetsEnabled = snippetsEnabled;
    }

    @JsonProperty("service_desk_enabled")
    public Boolean getServiceDeskEnabled() {
        return serviceDeskEnabled;
    }

    @JsonProperty("service_desk_enabled")
    public void setServiceDeskEnabled(Boolean serviceDeskEnabled) {
        this.serviceDeskEnabled = serviceDeskEnabled;
    }

    @JsonProperty("service_desk_address")
    public Object getServiceDeskAddress() {
        return serviceDeskAddress;
    }

    @JsonProperty("service_desk_address")
    public void setServiceDeskAddress(Object serviceDeskAddress) {
        this.serviceDeskAddress = serviceDeskAddress;
    }

    @JsonProperty("can_create_merge_request_in")
    public Boolean getCanCreateMergeRequestIn() {
        return canCreateMergeRequestIn;
    }

    @JsonProperty("can_create_merge_request_in")
    public void setCanCreateMergeRequestIn(Boolean canCreateMergeRequestIn) {
        this.canCreateMergeRequestIn = canCreateMergeRequestIn;
    }

    @JsonProperty("issues_access_level")
    public String getIssuesAccessLevel() {
        return issuesAccessLevel;
    }

    @JsonProperty("issues_access_level")
    public void setIssuesAccessLevel(String issuesAccessLevel) {
        this.issuesAccessLevel = issuesAccessLevel;
    }

    @JsonProperty("repository_access_level")
    public String getRepositoryAccessLevel() {
        return repositoryAccessLevel;
    }

    @JsonProperty("repository_access_level")
    public void setRepositoryAccessLevel(String repositoryAccessLevel) {
        this.repositoryAccessLevel = repositoryAccessLevel;
    }

    @JsonProperty("merge_requests_access_level")
    public String getMergeRequestsAccessLevel() {
        return mergeRequestsAccessLevel;
    }

    @JsonProperty("merge_requests_access_level")
    public void setMergeRequestsAccessLevel(String mergeRequestsAccessLevel) {
        this.mergeRequestsAccessLevel = mergeRequestsAccessLevel;
    }

    @JsonProperty("forking_access_level")
    public String getForkingAccessLevel() {
        return forkingAccessLevel;
    }

    @JsonProperty("forking_access_level")
    public void setForkingAccessLevel(String forkingAccessLevel) {
        this.forkingAccessLevel = forkingAccessLevel;
    }

    @JsonProperty("wiki_access_level")
    public String getWikiAccessLevel() {
        return wikiAccessLevel;
    }

    @JsonProperty("wiki_access_level")
    public void setWikiAccessLevel(String wikiAccessLevel) {
        this.wikiAccessLevel = wikiAccessLevel;
    }

    @JsonProperty("builds_access_level")
    public String getBuildsAccessLevel() {
        return buildsAccessLevel;
    }

    @JsonProperty("builds_access_level")
    public void setBuildsAccessLevel(String buildsAccessLevel) {
        this.buildsAccessLevel = buildsAccessLevel;
    }

    @JsonProperty("snippets_access_level")
    public String getSnippetsAccessLevel() {
        return snippetsAccessLevel;
    }

    @JsonProperty("snippets_access_level")
    public void setSnippetsAccessLevel(String snippetsAccessLevel) {
        this.snippetsAccessLevel = snippetsAccessLevel;
    }

    @JsonProperty("pages_access_level")
    public String getPagesAccessLevel() {
        return pagesAccessLevel;
    }

    @JsonProperty("pages_access_level")
    public void setPagesAccessLevel(String pagesAccessLevel) {
        this.pagesAccessLevel = pagesAccessLevel;
    }

    @JsonProperty("operations_access_level")
    public String getOperationsAccessLevel() {
        return operationsAccessLevel;
    }

    @JsonProperty("operations_access_level")
    public void setOperationsAccessLevel(String operationsAccessLevel) {
        this.operationsAccessLevel = operationsAccessLevel;
    }

    @JsonProperty("analytics_access_level")
    public String getAnalyticsAccessLevel() {
        return analyticsAccessLevel;
    }

    @JsonProperty("analytics_access_level")
    public void setAnalyticsAccessLevel(String analyticsAccessLevel) {
        this.analyticsAccessLevel = analyticsAccessLevel;
    }

    @JsonProperty("emails_disabled")
    public Object getEmailsDisabled() {
        return emailsDisabled;
    }

    @JsonProperty("emails_disabled")
    public void setEmailsDisabled(Object emailsDisabled) {
        this.emailsDisabled = emailsDisabled;
    }

    @JsonProperty("shared_runners_enabled")
    public Boolean getSharedRunnersEnabled() {
        return sharedRunnersEnabled;
    }

    @JsonProperty("shared_runners_enabled")
    public void setSharedRunnersEnabled(Boolean sharedRunnersEnabled) {
        this.sharedRunnersEnabled = sharedRunnersEnabled;
    }

    @JsonProperty("lfs_enabled")
    public Boolean getLfsEnabled() {
        return lfsEnabled;
    }

    @JsonProperty("lfs_enabled")
    public void setLfsEnabled(Boolean lfsEnabled) {
        this.lfsEnabled = lfsEnabled;
    }

    @JsonProperty("creator_id")
    public Integer getCreatorId() {
        return creatorId;
    }

    @JsonProperty("creator_id")
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    @JsonProperty("import_status")
    public String getImportStatus() {
        return importStatus;
    }

    @JsonProperty("import_status")
    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    @JsonProperty("open_issues_count")
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    @JsonProperty("ci_default_git_depth")
    public Integer getCiDefaultGitDepth() {
        return ciDefaultGitDepth;
    }

    @JsonProperty("ci_default_git_depth")
    public void setCiDefaultGitDepth(Integer ciDefaultGitDepth) {
        this.ciDefaultGitDepth = ciDefaultGitDepth;
    }

    @JsonProperty("ci_forward_deployment_enabled")
    public Object getCiForwardDeploymentEnabled() {
        return ciForwardDeploymentEnabled;
    }

    @JsonProperty("ci_forward_deployment_enabled")
    public void setCiForwardDeploymentEnabled(Object ciForwardDeploymentEnabled) {
        this.ciForwardDeploymentEnabled = ciForwardDeploymentEnabled;
    }

    @JsonProperty("public_jobs")
    public Boolean getPublicJobs() {
        return publicJobs;
    }

    @JsonProperty("public_jobs")
    public void setPublicJobs(Boolean publicJobs) {
        this.publicJobs = publicJobs;
    }

    @JsonProperty("build_timeout")
    public Integer getBuildTimeout() {
        return buildTimeout;
    }

    @JsonProperty("build_timeout")
    public void setBuildTimeout(Integer buildTimeout) {
        this.buildTimeout = buildTimeout;
    }

    @JsonProperty("auto_cancel_pending_pipelines")
    public String getAutoCancelPendingPipelines() {
        return autoCancelPendingPipelines;
    }

    @JsonProperty("auto_cancel_pending_pipelines")
    public void setAutoCancelPendingPipelines(String autoCancelPendingPipelines) {
        this.autoCancelPendingPipelines = autoCancelPendingPipelines;
    }

    @JsonProperty("build_coverage_regex")
    public Object getBuildCoverageRegex() {
        return buildCoverageRegex;
    }

    @JsonProperty("build_coverage_regex")
    public void setBuildCoverageRegex(Object buildCoverageRegex) {
        this.buildCoverageRegex = buildCoverageRegex;
    }

    @JsonProperty("ci_config_path")
    public Object getCiConfigPath() {
        return ciConfigPath;
    }

    @JsonProperty("ci_config_path")
    public void setCiConfigPath(Object ciConfigPath) {
        this.ciConfigPath = ciConfigPath;
    }

    @JsonProperty("shared_with_groups")
    public List<Object> getSharedWithGroups() {
        return sharedWithGroups;
    }

    @JsonProperty("shared_with_groups")
    public void setSharedWithGroups(List<Object> sharedWithGroups) {
        this.sharedWithGroups = sharedWithGroups;
    }

    @JsonProperty("only_allow_merge_if_pipeline_succeeds")
    public Boolean getOnlyAllowMergeIfPipelineSucceeds() {
        return onlyAllowMergeIfPipelineSucceeds;
    }

    @JsonProperty("only_allow_merge_if_pipeline_succeeds")
    public void setOnlyAllowMergeIfPipelineSucceeds(Boolean onlyAllowMergeIfPipelineSucceeds) {
        this.onlyAllowMergeIfPipelineSucceeds = onlyAllowMergeIfPipelineSucceeds;
    }

    @JsonProperty("allow_merge_on_skipped_pipeline")
    public Object getAllowMergeOnSkippedPipeline() {
        return allowMergeOnSkippedPipeline;
    }

    @JsonProperty("allow_merge_on_skipped_pipeline")
    public void setAllowMergeOnSkippedPipeline(Object allowMergeOnSkippedPipeline) {
        this.allowMergeOnSkippedPipeline = allowMergeOnSkippedPipeline;
    }

    @JsonProperty("restrict_user_defined_variables")
    public Boolean getRestrictUserDefinedVariables() {
        return restrictUserDefinedVariables;
    }

    @JsonProperty("restrict_user_defined_variables")
    public void setRestrictUserDefinedVariables(Boolean restrictUserDefinedVariables) {
        this.restrictUserDefinedVariables = restrictUserDefinedVariables;
    }

    @JsonProperty("request_access_enabled")
    public Boolean getRequestAccessEnabled() {
        return requestAccessEnabled;
    }

    @JsonProperty("request_access_enabled")
    public void setRequestAccessEnabled(Boolean requestAccessEnabled) {
        this.requestAccessEnabled = requestAccessEnabled;
    }

    @JsonProperty("only_allow_merge_if_all_discussions_are_resolved")
    public Boolean getOnlyAllowMergeIfAllDiscussionsAreResolved() {
        return onlyAllowMergeIfAllDiscussionsAreResolved;
    }

    @JsonProperty("only_allow_merge_if_all_discussions_are_resolved")
    public void setOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean onlyAllowMergeIfAllDiscussionsAreResolved) {
        this.onlyAllowMergeIfAllDiscussionsAreResolved = onlyAllowMergeIfAllDiscussionsAreResolved;
    }

    @JsonProperty("remove_source_branch_after_merge")
    public Object getRemoveSourceBranchAfterMerge() {
        return removeSourceBranchAfterMerge;
    }

    @JsonProperty("remove_source_branch_after_merge")
    public void setRemoveSourceBranchAfterMerge(Object removeSourceBranchAfterMerge) {
        this.removeSourceBranchAfterMerge = removeSourceBranchAfterMerge;
    }

    @JsonProperty("printing_merge_request_link_enabled")
    public Boolean getPrintingMergeRequestLinkEnabled() {
        return printingMergeRequestLinkEnabled;
    }

    @JsonProperty("printing_merge_request_link_enabled")
    public void setPrintingMergeRequestLinkEnabled(Boolean printingMergeRequestLinkEnabled) {
        this.printingMergeRequestLinkEnabled = printingMergeRequestLinkEnabled;
    }

    @JsonProperty("merge_method")
    public String getMergeMethod() {
        return mergeMethod;
    }

    @JsonProperty("merge_method")
    public void setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    @JsonProperty("suggestion_commit_message")
    public Object getSuggestionCommitMessage() {
        return suggestionCommitMessage;
    }

    @JsonProperty("suggestion_commit_message")
    public void setSuggestionCommitMessage(Object suggestionCommitMessage) {
        this.suggestionCommitMessage = suggestionCommitMessage;
    }

    @JsonProperty("auto_devops_enabled")
    public Boolean getAutoDevopsEnabled() {
        return autoDevopsEnabled;
    }

    @JsonProperty("auto_devops_enabled")
    public void setAutoDevopsEnabled(Boolean autoDevopsEnabled) {
        this.autoDevopsEnabled = autoDevopsEnabled;
    }

    @JsonProperty("auto_devops_deploy_strategy")
    public String getAutoDevopsDeployStrategy() {
        return autoDevopsDeployStrategy;
    }

    @JsonProperty("auto_devops_deploy_strategy")
    public void setAutoDevopsDeployStrategy(String autoDevopsDeployStrategy) {
        this.autoDevopsDeployStrategy = autoDevopsDeployStrategy;
    }

    @JsonProperty("autoclose_referenced_issues")
    public Boolean getAutocloseReferencedIssues() {
        return autocloseReferencedIssues;
    }

    @JsonProperty("autoclose_referenced_issues")
    public void setAutocloseReferencedIssues(Boolean autocloseReferencedIssues) {
        this.autocloseReferencedIssues = autocloseReferencedIssues;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
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
        sb.append(Project.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameWithNamespace");
        sb.append('=');
        sb.append(((this.nameWithNamespace == null)?"<null>":this.nameWithNamespace));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("pathWithNamespace");
        sb.append('=');
        sb.append(((this.pathWithNamespace == null)?"<null>":this.pathWithNamespace));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("defaultBranch");
        sb.append('=');
        sb.append(((this.defaultBranch == null)?"<null>":this.defaultBranch));
        sb.append(',');
        sb.append("tagList");
        sb.append('=');
        sb.append(((this.tagList == null)?"<null>":this.tagList));
        sb.append(',');
        sb.append("sshUrlToRepo");
        sb.append('=');
        sb.append(((this.sshUrlToRepo == null)?"<null>":this.sshUrlToRepo));
        sb.append(',');
        sb.append("httpUrlToRepo");
        sb.append('=');
        sb.append(((this.httpUrlToRepo == null)?"<null>":this.httpUrlToRepo));
        sb.append(',');
        sb.append("webUrl");
        sb.append('=');
        sb.append(((this.webUrl == null)?"<null>":this.webUrl));
        sb.append(',');
        sb.append("readmeUrl");
        sb.append('=');
        sb.append(((this.readmeUrl == null)?"<null>":this.readmeUrl));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("forksCount");
        sb.append('=');
        sb.append(((this.forksCount == null)?"<null>":this.forksCount));
        sb.append(',');
        sb.append("starCount");
        sb.append('=');
        sb.append(((this.starCount == null)?"<null>":this.starCount));
        sb.append(',');
        sb.append("lastActivityAt");
        sb.append('=');
        sb.append(((this.lastActivityAt == null)?"<null>":this.lastActivityAt));
        sb.append(',');
        sb.append("namespace");
        sb.append('=');
        sb.append(((this.namespace == null)?"<null>":this.namespace));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("packagesEnabled");
        sb.append('=');
        sb.append(((this.packagesEnabled == null)?"<null>":this.packagesEnabled));
        sb.append(',');
        sb.append("emptyRepo");
        sb.append('=');
        sb.append(((this.emptyRepo == null)?"<null>":this.emptyRepo));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(((this.archived == null)?"<null>":this.archived));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("resolveOutdatedDiffDiscussions");
        sb.append('=');
        sb.append(((this.resolveOutdatedDiffDiscussions == null)?"<null>":this.resolveOutdatedDiffDiscussions));
        sb.append(',');
        sb.append("containerRegistryEnabled");
        sb.append('=');
        sb.append(((this.containerRegistryEnabled == null)?"<null>":this.containerRegistryEnabled));
        sb.append(',');
        sb.append("containerExpirationPolicy");
        sb.append('=');
        sb.append(((this.containerExpirationPolicy == null)?"<null>":this.containerExpirationPolicy));
        sb.append(',');
        sb.append("issuesEnabled");
        sb.append('=');
        sb.append(((this.issuesEnabled == null)?"<null>":this.issuesEnabled));
        sb.append(',');
        sb.append("mergeRequestsEnabled");
        sb.append('=');
        sb.append(((this.mergeRequestsEnabled == null)?"<null>":this.mergeRequestsEnabled));
        sb.append(',');
        sb.append("wikiEnabled");
        sb.append('=');
        sb.append(((this.wikiEnabled == null)?"<null>":this.wikiEnabled));
        sb.append(',');
        sb.append("jobsEnabled");
        sb.append('=');
        sb.append(((this.jobsEnabled == null)?"<null>":this.jobsEnabled));
        sb.append(',');
        sb.append("snippetsEnabled");
        sb.append('=');
        sb.append(((this.snippetsEnabled == null)?"<null>":this.snippetsEnabled));
        sb.append(',');
        sb.append("serviceDeskEnabled");
        sb.append('=');
        sb.append(((this.serviceDeskEnabled == null)?"<null>":this.serviceDeskEnabled));
        sb.append(',');
        sb.append("serviceDeskAddress");
        sb.append('=');
        sb.append(((this.serviceDeskAddress == null)?"<null>":this.serviceDeskAddress));
        sb.append(',');
        sb.append("canCreateMergeRequestIn");
        sb.append('=');
        sb.append(((this.canCreateMergeRequestIn == null)?"<null>":this.canCreateMergeRequestIn));
        sb.append(',');
        sb.append("issuesAccessLevel");
        sb.append('=');
        sb.append(((this.issuesAccessLevel == null)?"<null>":this.issuesAccessLevel));
        sb.append(',');
        sb.append("repositoryAccessLevel");
        sb.append('=');
        sb.append(((this.repositoryAccessLevel == null)?"<null>":this.repositoryAccessLevel));
        sb.append(',');
        sb.append("mergeRequestsAccessLevel");
        sb.append('=');
        sb.append(((this.mergeRequestsAccessLevel == null)?"<null>":this.mergeRequestsAccessLevel));
        sb.append(',');
        sb.append("forkingAccessLevel");
        sb.append('=');
        sb.append(((this.forkingAccessLevel == null)?"<null>":this.forkingAccessLevel));
        sb.append(',');
        sb.append("wikiAccessLevel");
        sb.append('=');
        sb.append(((this.wikiAccessLevel == null)?"<null>":this.wikiAccessLevel));
        sb.append(',');
        sb.append("buildsAccessLevel");
        sb.append('=');
        sb.append(((this.buildsAccessLevel == null)?"<null>":this.buildsAccessLevel));
        sb.append(',');
        sb.append("snippetsAccessLevel");
        sb.append('=');
        sb.append(((this.snippetsAccessLevel == null)?"<null>":this.snippetsAccessLevel));
        sb.append(',');
        sb.append("pagesAccessLevel");
        sb.append('=');
        sb.append(((this.pagesAccessLevel == null)?"<null>":this.pagesAccessLevel));
        sb.append(',');
        sb.append("operationsAccessLevel");
        sb.append('=');
        sb.append(((this.operationsAccessLevel == null)?"<null>":this.operationsAccessLevel));
        sb.append(',');
        sb.append("analyticsAccessLevel");
        sb.append('=');
        sb.append(((this.analyticsAccessLevel == null)?"<null>":this.analyticsAccessLevel));
        sb.append(',');
        sb.append("emailsDisabled");
        sb.append('=');
        sb.append(((this.emailsDisabled == null)?"<null>":this.emailsDisabled));
        sb.append(',');
        sb.append("sharedRunnersEnabled");
        sb.append('=');
        sb.append(((this.sharedRunnersEnabled == null)?"<null>":this.sharedRunnersEnabled));
        sb.append(',');
        sb.append("lfsEnabled");
        sb.append('=');
        sb.append(((this.lfsEnabled == null)?"<null>":this.lfsEnabled));
        sb.append(',');
        sb.append("creatorId");
        sb.append('=');
        sb.append(((this.creatorId == null)?"<null>":this.creatorId));
        sb.append(',');
        sb.append("importStatus");
        sb.append('=');
        sb.append(((this.importStatus == null)?"<null>":this.importStatus));
        sb.append(',');
        sb.append("openIssuesCount");
        sb.append('=');
        sb.append(((this.openIssuesCount == null)?"<null>":this.openIssuesCount));
        sb.append(',');
        sb.append("ciDefaultGitDepth");
        sb.append('=');
        sb.append(((this.ciDefaultGitDepth == null)?"<null>":this.ciDefaultGitDepth));
        sb.append(',');
        sb.append("ciForwardDeploymentEnabled");
        sb.append('=');
        sb.append(((this.ciForwardDeploymentEnabled == null)?"<null>":this.ciForwardDeploymentEnabled));
        sb.append(',');
        sb.append("publicJobs");
        sb.append('=');
        sb.append(((this.publicJobs == null)?"<null>":this.publicJobs));
        sb.append(',');
        sb.append("buildTimeout");
        sb.append('=');
        sb.append(((this.buildTimeout == null)?"<null>":this.buildTimeout));
        sb.append(',');
        sb.append("autoCancelPendingPipelines");
        sb.append('=');
        sb.append(((this.autoCancelPendingPipelines == null)?"<null>":this.autoCancelPendingPipelines));
        sb.append(',');
        sb.append("buildCoverageRegex");
        sb.append('=');
        sb.append(((this.buildCoverageRegex == null)?"<null>":this.buildCoverageRegex));
        sb.append(',');
        sb.append("ciConfigPath");
        sb.append('=');
        sb.append(((this.ciConfigPath == null)?"<null>":this.ciConfigPath));
        sb.append(',');
        sb.append("sharedWithGroups");
        sb.append('=');
        sb.append(((this.sharedWithGroups == null)?"<null>":this.sharedWithGroups));
        sb.append(',');
        sb.append("onlyAllowMergeIfPipelineSucceeds");
        sb.append('=');
        sb.append(((this.onlyAllowMergeIfPipelineSucceeds == null)?"<null>":this.onlyAllowMergeIfPipelineSucceeds));
        sb.append(',');
        sb.append("allowMergeOnSkippedPipeline");
        sb.append('=');
        sb.append(((this.allowMergeOnSkippedPipeline == null)?"<null>":this.allowMergeOnSkippedPipeline));
        sb.append(',');
        sb.append("restrictUserDefinedVariables");
        sb.append('=');
        sb.append(((this.restrictUserDefinedVariables == null)?"<null>":this.restrictUserDefinedVariables));
        sb.append(',');
        sb.append("requestAccessEnabled");
        sb.append('=');
        sb.append(((this.requestAccessEnabled == null)?"<null>":this.requestAccessEnabled));
        sb.append(',');
        sb.append("onlyAllowMergeIfAllDiscussionsAreResolved");
        sb.append('=');
        sb.append(((this.onlyAllowMergeIfAllDiscussionsAreResolved == null)?"<null>":this.onlyAllowMergeIfAllDiscussionsAreResolved));
        sb.append(',');
        sb.append("removeSourceBranchAfterMerge");
        sb.append('=');
        sb.append(((this.removeSourceBranchAfterMerge == null)?"<null>":this.removeSourceBranchAfterMerge));
        sb.append(',');
        sb.append("printingMergeRequestLinkEnabled");
        sb.append('=');
        sb.append(((this.printingMergeRequestLinkEnabled == null)?"<null>":this.printingMergeRequestLinkEnabled));
        sb.append(',');
        sb.append("mergeMethod");
        sb.append('=');
        sb.append(((this.mergeMethod == null)?"<null>":this.mergeMethod));
        sb.append(',');
        sb.append("suggestionCommitMessage");
        sb.append('=');
        sb.append(((this.suggestionCommitMessage == null)?"<null>":this.suggestionCommitMessage));
        sb.append(',');
        sb.append("autoDevopsEnabled");
        sb.append('=');
        sb.append(((this.autoDevopsEnabled == null)?"<null>":this.autoDevopsEnabled));
        sb.append(',');
        sb.append("autoDevopsDeployStrategy");
        sb.append('=');
        sb.append(((this.autoDevopsDeployStrategy == null)?"<null>":this.autoDevopsDeployStrategy));
        sb.append(',');
        sb.append("autocloseReferencedIssues");
        sb.append('=');
        sb.append(((this.autocloseReferencedIssues == null)?"<null>":this.autocloseReferencedIssues));
        sb.append(',');
        sb.append("permissions");
        sb.append('=');
        sb.append(((this.permissions == null)?"<null>":this.permissions));
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
        result = ((result* 31)+((this.httpUrlToRepo == null)? 0 :this.httpUrlToRepo.hashCode()));
        result = ((result* 31)+((this.readmeUrl == null)? 0 :this.readmeUrl.hashCode()));
        result = ((result* 31)+((this.packagesEnabled == null)? 0 :this.packagesEnabled.hashCode()));
        result = ((result* 31)+((this.emptyRepo == null)? 0 :this.emptyRepo.hashCode()));
        result = ((result* 31)+((this.snippetsAccessLevel == null)? 0 :this.snippetsAccessLevel.hashCode()));
        result = ((result* 31)+((this.issuesAccessLevel == null)? 0 :this.issuesAccessLevel.hashCode()));
        result = ((result* 31)+((this.forksCount == null)? 0 :this.forksCount.hashCode()));
        result = ((result* 31)+((this.analyticsAccessLevel == null)? 0 :this.analyticsAccessLevel.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.onlyAllowMergeIfAllDiscussionsAreResolved == null)? 0 :this.onlyAllowMergeIfAllDiscussionsAreResolved.hashCode()));
        result = ((result* 31)+((this.printingMergeRequestLinkEnabled == null)? 0 :this.printingMergeRequestLinkEnabled.hashCode()));
        result = ((result* 31)+((this.containerExpirationPolicy == null)? 0 :this.containerExpirationPolicy.hashCode()));
        result = ((result* 31)+((this.requestAccessEnabled == null)? 0 :this.requestAccessEnabled.hashCode()));
        result = ((result* 31)+((this.suggestionCommitMessage == null)? 0 :this.suggestionCommitMessage.hashCode()));
        result = ((result* 31)+((this.permissions == null)? 0 :this.permissions.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.removeSourceBranchAfterMerge == null)? 0 :this.removeSourceBranchAfterMerge.hashCode()));
        result = ((result* 31)+((this.pathWithNamespace == null)? 0 :this.pathWithNamespace.hashCode()));
        result = ((result* 31)+((this.jobsEnabled == null)? 0 :this.jobsEnabled.hashCode()));
        result = ((result* 31)+((this.publicJobs == null)? 0 :this.publicJobs.hashCode()));
        result = ((result* 31)+((this.importStatus == null)? 0 :this.importStatus.hashCode()));
        result = ((result* 31)+((this.operationsAccessLevel == null)? 0 :this.operationsAccessLevel.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.defaultBranch == null)? 0 :this.defaultBranch.hashCode()));
        result = ((result* 31)+((this.snippetsEnabled == null)? 0 :this.snippetsEnabled.hashCode()));
        result = ((result* 31)+((this.sshUrlToRepo == null)? 0 :this.sshUrlToRepo.hashCode()));
        result = ((result* 31)+((this.autoDevopsEnabled == null)? 0 :this.autoDevopsEnabled.hashCode()));
        result = ((result* 31)+((this.starCount == null)? 0 :this.starCount.hashCode()));
        result = ((result* 31)+((this.autoDevopsDeployStrategy == null)? 0 :this.autoDevopsDeployStrategy.hashCode()));
        result = ((result* 31)+((this.webUrl == null)? 0 :this.webUrl.hashCode()));
        result = ((result* 31)+((this.autocloseReferencedIssues == null)? 0 :this.autocloseReferencedIssues.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.ciDefaultGitDepth == null)? 0 :this.ciDefaultGitDepth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.buildCoverageRegex == null)? 0 :this.buildCoverageRegex.hashCode()));
        result = ((result* 31)+((this.sharedRunnersEnabled == null)? 0 :this.sharedRunnersEnabled.hashCode()));
        result = ((result* 31)+((this.serviceDeskEnabled == null)? 0 :this.serviceDeskEnabled.hashCode()));
        result = ((result* 31)+((this.creatorId == null)? 0 :this.creatorId.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.lastActivityAt == null)? 0 :this.lastActivityAt.hashCode()));
        result = ((result* 31)+((this.repositoryAccessLevel == null)? 0 :this.repositoryAccessLevel.hashCode()));
        result = ((result* 31)+((this.containerRegistryEnabled == null)? 0 :this.containerRegistryEnabled.hashCode()));
        result = ((result* 31)+((this.sharedWithGroups == null)? 0 :this.sharedWithGroups.hashCode()));
        result = ((result* 31)+((this.openIssuesCount == null)? 0 :this.openIssuesCount.hashCode()));
        result = ((result* 31)+((this.ciForwardDeploymentEnabled == null)? 0 :this.ciForwardDeploymentEnabled.hashCode()));
        result = ((result* 31)+((this.archived == null)? 0 :this.archived.hashCode()));
        result = ((result* 31)+((this.emailsDisabled == null)? 0 :this.emailsDisabled.hashCode()));
        result = ((result* 31)+((this.wikiAccessLevel == null)? 0 :this.wikiAccessLevel.hashCode()));
        result = ((result* 31)+((this.mergeMethod == null)? 0 :this.mergeMethod.hashCode()));
        result = ((result* 31)+((this.wikiEnabled == null)? 0 :this.wikiEnabled.hashCode()));
        result = ((result* 31)+((this.issuesEnabled == null)? 0 :this.issuesEnabled.hashCode()));
        result = ((result* 31)+((this.pagesAccessLevel == null)? 0 :this.pagesAccessLevel.hashCode()));
        result = ((result* 31)+((this.autoCancelPendingPipelines == null)? 0 :this.autoCancelPendingPipelines.hashCode()));
        result = ((result* 31)+((this.mergeRequestsAccessLevel == null)? 0 :this.mergeRequestsAccessLevel.hashCode()));
        result = ((result* 31)+((this.serviceDeskAddress == null)? 0 :this.serviceDeskAddress.hashCode()));
        result = ((result* 31)+((this.restrictUserDefinedVariables == null)? 0 :this.restrictUserDefinedVariables.hashCode()));
        result = ((result* 31)+((this.lfsEnabled == null)? 0 :this.lfsEnabled.hashCode()));
        result = ((result* 31)+((this.ciConfigPath == null)? 0 :this.ciConfigPath.hashCode()));
        result = ((result* 31)+((this.tagList == null)? 0 :this.tagList.hashCode()));
        result = ((result* 31)+((this.mergeRequestsEnabled == null)? 0 :this.mergeRequestsEnabled.hashCode()));
        result = ((result* 31)+((this.buildsAccessLevel == null)? 0 :this.buildsAccessLevel.hashCode()));
        result = ((result* 31)+((this.buildTimeout == null)? 0 :this.buildTimeout.hashCode()));
        result = ((result* 31)+((this.allowMergeOnSkippedPipeline == null)? 0 :this.allowMergeOnSkippedPipeline.hashCode()));
        result = ((result* 31)+((this.nameWithNamespace == null)? 0 :this.nameWithNamespace.hashCode()));
        result = ((result* 31)+((this.onlyAllowMergeIfPipelineSucceeds == null)? 0 :this.onlyAllowMergeIfPipelineSucceeds.hashCode()));
        result = ((result* 31)+((this.namespace == null)? 0 :this.namespace.hashCode()));
        result = ((result* 31)+((this.canCreateMergeRequestIn == null)? 0 :this.canCreateMergeRequestIn.hashCode()));
        result = ((result* 31)+((this.forkingAccessLevel == null)? 0 :this.forkingAccessLevel.hashCode()));
        result = ((result* 31)+((this.resolveOutdatedDiffDiscussions == null)? 0 :this.resolveOutdatedDiffDiscussions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Project) == false) {
            return false;
        }
        Project rhs = ((Project) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.httpUrlToRepo == rhs.httpUrlToRepo)||((this.httpUrlToRepo!= null)&&this.httpUrlToRepo.equals(rhs.httpUrlToRepo)))&&((this.readmeUrl == rhs.readmeUrl)||((this.readmeUrl!= null)&&this.readmeUrl.equals(rhs.readmeUrl))))&&((this.packagesEnabled == rhs.packagesEnabled)||((this.packagesEnabled!= null)&&this.packagesEnabled.equals(rhs.packagesEnabled))))&&((this.emptyRepo == rhs.emptyRepo)||((this.emptyRepo!= null)&&this.emptyRepo.equals(rhs.emptyRepo))))&&((this.snippetsAccessLevel == rhs.snippetsAccessLevel)||((this.snippetsAccessLevel!= null)&&this.snippetsAccessLevel.equals(rhs.snippetsAccessLevel))))&&((this.issuesAccessLevel == rhs.issuesAccessLevel)||((this.issuesAccessLevel!= null)&&this.issuesAccessLevel.equals(rhs.issuesAccessLevel))))&&((this.forksCount == rhs.forksCount)||((this.forksCount!= null)&&this.forksCount.equals(rhs.forksCount))))&&((this.analyticsAccessLevel == rhs.analyticsAccessLevel)||((this.analyticsAccessLevel!= null)&&this.analyticsAccessLevel.equals(rhs.analyticsAccessLevel))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.onlyAllowMergeIfAllDiscussionsAreResolved == rhs.onlyAllowMergeIfAllDiscussionsAreResolved)||((this.onlyAllowMergeIfAllDiscussionsAreResolved!= null)&&this.onlyAllowMergeIfAllDiscussionsAreResolved.equals(rhs.onlyAllowMergeIfAllDiscussionsAreResolved))))&&((this.printingMergeRequestLinkEnabled == rhs.printingMergeRequestLinkEnabled)||((this.printingMergeRequestLinkEnabled!= null)&&this.printingMergeRequestLinkEnabled.equals(rhs.printingMergeRequestLinkEnabled))))&&((this.containerExpirationPolicy == rhs.containerExpirationPolicy)||((this.containerExpirationPolicy!= null)&&this.containerExpirationPolicy.equals(rhs.containerExpirationPolicy))))&&((this.requestAccessEnabled == rhs.requestAccessEnabled)||((this.requestAccessEnabled!= null)&&this.requestAccessEnabled.equals(rhs.requestAccessEnabled))))&&((this.suggestionCommitMessage == rhs.suggestionCommitMessage)||((this.suggestionCommitMessage!= null)&&this.suggestionCommitMessage.equals(rhs.suggestionCommitMessage))))&&((this.permissions == rhs.permissions)||((this.permissions!= null)&&this.permissions.equals(rhs.permissions))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.removeSourceBranchAfterMerge == rhs.removeSourceBranchAfterMerge)||((this.removeSourceBranchAfterMerge!= null)&&this.removeSourceBranchAfterMerge.equals(rhs.removeSourceBranchAfterMerge))))&&((this.pathWithNamespace == rhs.pathWithNamespace)||((this.pathWithNamespace!= null)&&this.pathWithNamespace.equals(rhs.pathWithNamespace))))&&((this.jobsEnabled == rhs.jobsEnabled)||((this.jobsEnabled!= null)&&this.jobsEnabled.equals(rhs.jobsEnabled))))&&((this.publicJobs == rhs.publicJobs)||((this.publicJobs!= null)&&this.publicJobs.equals(rhs.publicJobs))))&&((this.importStatus == rhs.importStatus)||((this.importStatus!= null)&&this.importStatus.equals(rhs.importStatus))))&&((this.operationsAccessLevel == rhs.operationsAccessLevel)||((this.operationsAccessLevel!= null)&&this.operationsAccessLevel.equals(rhs.operationsAccessLevel))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.defaultBranch == rhs.defaultBranch)||((this.defaultBranch!= null)&&this.defaultBranch.equals(rhs.defaultBranch))))&&((this.snippetsEnabled == rhs.snippetsEnabled)||((this.snippetsEnabled!= null)&&this.snippetsEnabled.equals(rhs.snippetsEnabled))))&&((this.sshUrlToRepo == rhs.sshUrlToRepo)||((this.sshUrlToRepo!= null)&&this.sshUrlToRepo.equals(rhs.sshUrlToRepo))))&&((this.autoDevopsEnabled == rhs.autoDevopsEnabled)||((this.autoDevopsEnabled!= null)&&this.autoDevopsEnabled.equals(rhs.autoDevopsEnabled))))&&((this.starCount == rhs.starCount)||((this.starCount!= null)&&this.starCount.equals(rhs.starCount))))&&((this.autoDevopsDeployStrategy == rhs.autoDevopsDeployStrategy)||((this.autoDevopsDeployStrategy!= null)&&this.autoDevopsDeployStrategy.equals(rhs.autoDevopsDeployStrategy))))&&((this.webUrl == rhs.webUrl)||((this.webUrl!= null)&&this.webUrl.equals(rhs.webUrl))))&&((this.autocloseReferencedIssues == rhs.autocloseReferencedIssues)||((this.autocloseReferencedIssues!= null)&&this.autocloseReferencedIssues.equals(rhs.autocloseReferencedIssues))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.ciDefaultGitDepth == rhs.ciDefaultGitDepth)||((this.ciDefaultGitDepth!= null)&&this.ciDefaultGitDepth.equals(rhs.ciDefaultGitDepth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.buildCoverageRegex == rhs.buildCoverageRegex)||((this.buildCoverageRegex!= null)&&this.buildCoverageRegex.equals(rhs.buildCoverageRegex))))&&((this.sharedRunnersEnabled == rhs.sharedRunnersEnabled)||((this.sharedRunnersEnabled!= null)&&this.sharedRunnersEnabled.equals(rhs.sharedRunnersEnabled))))&&((this.serviceDeskEnabled == rhs.serviceDeskEnabled)||((this.serviceDeskEnabled!= null)&&this.serviceDeskEnabled.equals(rhs.serviceDeskEnabled))))&&((this.creatorId == rhs.creatorId)||((this.creatorId!= null)&&this.creatorId.equals(rhs.creatorId))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.lastActivityAt == rhs.lastActivityAt)||((this.lastActivityAt!= null)&&this.lastActivityAt.equals(rhs.lastActivityAt))))&&((this.repositoryAccessLevel == rhs.repositoryAccessLevel)||((this.repositoryAccessLevel!= null)&&this.repositoryAccessLevel.equals(rhs.repositoryAccessLevel))))&&((this.containerRegistryEnabled == rhs.containerRegistryEnabled)||((this.containerRegistryEnabled!= null)&&this.containerRegistryEnabled.equals(rhs.containerRegistryEnabled))))&&((this.sharedWithGroups == rhs.sharedWithGroups)||((this.sharedWithGroups!= null)&&this.sharedWithGroups.equals(rhs.sharedWithGroups))))&&((this.openIssuesCount == rhs.openIssuesCount)||((this.openIssuesCount!= null)&&this.openIssuesCount.equals(rhs.openIssuesCount))))&&((this.ciForwardDeploymentEnabled == rhs.ciForwardDeploymentEnabled)||((this.ciForwardDeploymentEnabled!= null)&&this.ciForwardDeploymentEnabled.equals(rhs.ciForwardDeploymentEnabled))))&&((this.archived == rhs.archived)||((this.archived!= null)&&this.archived.equals(rhs.archived))))&&((this.emailsDisabled == rhs.emailsDisabled)||((this.emailsDisabled!= null)&&this.emailsDisabled.equals(rhs.emailsDisabled))))&&((this.wikiAccessLevel == rhs.wikiAccessLevel)||((this.wikiAccessLevel!= null)&&this.wikiAccessLevel.equals(rhs.wikiAccessLevel))))&&((this.mergeMethod == rhs.mergeMethod)||((this.mergeMethod!= null)&&this.mergeMethod.equals(rhs.mergeMethod))))&&((this.wikiEnabled == rhs.wikiEnabled)||((this.wikiEnabled!= null)&&this.wikiEnabled.equals(rhs.wikiEnabled))))&&((this.issuesEnabled == rhs.issuesEnabled)||((this.issuesEnabled!= null)&&this.issuesEnabled.equals(rhs.issuesEnabled))))&&((this.pagesAccessLevel == rhs.pagesAccessLevel)||((this.pagesAccessLevel!= null)&&this.pagesAccessLevel.equals(rhs.pagesAccessLevel))))&&((this.autoCancelPendingPipelines == rhs.autoCancelPendingPipelines)||((this.autoCancelPendingPipelines!= null)&&this.autoCancelPendingPipelines.equals(rhs.autoCancelPendingPipelines))))&&((this.mergeRequestsAccessLevel == rhs.mergeRequestsAccessLevel)||((this.mergeRequestsAccessLevel!= null)&&this.mergeRequestsAccessLevel.equals(rhs.mergeRequestsAccessLevel))))&&((this.serviceDeskAddress == rhs.serviceDeskAddress)||((this.serviceDeskAddress!= null)&&this.serviceDeskAddress.equals(rhs.serviceDeskAddress))))&&((this.restrictUserDefinedVariables == rhs.restrictUserDefinedVariables)||((this.restrictUserDefinedVariables!= null)&&this.restrictUserDefinedVariables.equals(rhs.restrictUserDefinedVariables))))&&((this.lfsEnabled == rhs.lfsEnabled)||((this.lfsEnabled!= null)&&this.lfsEnabled.equals(rhs.lfsEnabled))))&&((this.ciConfigPath == rhs.ciConfigPath)||((this.ciConfigPath!= null)&&this.ciConfigPath.equals(rhs.ciConfigPath))))&&((this.tagList == rhs.tagList)||((this.tagList!= null)&&this.tagList.equals(rhs.tagList))))&&((this.mergeRequestsEnabled == rhs.mergeRequestsEnabled)||((this.mergeRequestsEnabled!= null)&&this.mergeRequestsEnabled.equals(rhs.mergeRequestsEnabled))))&&((this.buildsAccessLevel == rhs.buildsAccessLevel)||((this.buildsAccessLevel!= null)&&this.buildsAccessLevel.equals(rhs.buildsAccessLevel))))&&((this.buildTimeout == rhs.buildTimeout)||((this.buildTimeout!= null)&&this.buildTimeout.equals(rhs.buildTimeout))))&&((this.allowMergeOnSkippedPipeline == rhs.allowMergeOnSkippedPipeline)||((this.allowMergeOnSkippedPipeline!= null)&&this.allowMergeOnSkippedPipeline.equals(rhs.allowMergeOnSkippedPipeline))))&&((this.nameWithNamespace == rhs.nameWithNamespace)||((this.nameWithNamespace!= null)&&this.nameWithNamespace.equals(rhs.nameWithNamespace))))&&((this.onlyAllowMergeIfPipelineSucceeds == rhs.onlyAllowMergeIfPipelineSucceeds)||((this.onlyAllowMergeIfPipelineSucceeds!= null)&&this.onlyAllowMergeIfPipelineSucceeds.equals(rhs.onlyAllowMergeIfPipelineSucceeds))))&&((this.namespace == rhs.namespace)||((this.namespace!= null)&&this.namespace.equals(rhs.namespace))))&&((this.canCreateMergeRequestIn == rhs.canCreateMergeRequestIn)||((this.canCreateMergeRequestIn!= null)&&this.canCreateMergeRequestIn.equals(rhs.canCreateMergeRequestIn))))&&((this.forkingAccessLevel == rhs.forkingAccessLevel)||((this.forkingAccessLevel!= null)&&this.forkingAccessLevel.equals(rhs.forkingAccessLevel))))&&((this.resolveOutdatedDiffDiscussions == rhs.resolveOutdatedDiffDiscussions)||((this.resolveOutdatedDiffDiscussions!= null)&&this.resolveOutdatedDiffDiscussions.equals(rhs.resolveOutdatedDiffDiscussions))));
    }

}
