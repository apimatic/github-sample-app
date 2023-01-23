
# Organization 1

## Structure

`Organization1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Login` | `String` | Required | - | String getLogin() | setLogin(String login) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ReposUrl` | `String` | Required | - | String getReposUrl() | setReposUrl(String reposUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `HooksUrl` | `String` | Required | - | String getHooksUrl() | setHooksUrl(String hooksUrl) |
| `IssuesUrl` | `String` | Required | - | String getIssuesUrl() | setIssuesUrl(String issuesUrl) |
| `MembersUrl` | `String` | Required | - | String getMembersUrl() | setMembersUrl(String membersUrl) |
| `PublicMembersUrl` | `String` | Required | - | String getPublicMembersUrl() | setPublicMembersUrl(String publicMembersUrl) |
| `AvatarUrl` | `String` | Required | - | String getAvatarUrl() | setAvatarUrl(String avatarUrl) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Company` | `String` | Optional | - | String getCompany() | setCompany(String company) |
| `Blog` | `String` | Optional | - | String getBlog() | setBlog(String blog) |
| `Location` | `String` | Optional | - | String getLocation() | setLocation(String location) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `TwitterUsername` | `String` | Optional | - | String getTwitterUsername() | setTwitterUsername(String twitterUsername) |
| `IsVerified` | `Boolean` | Optional | - | Boolean getIsVerified() | setIsVerified(Boolean isVerified) |
| `HasOrganizationProjects` | `boolean` | Required | - | boolean getHasOrganizationProjects() | setHasOrganizationProjects(boolean hasOrganizationProjects) |
| `HasRepositoryProjects` | `boolean` | Required | - | boolean getHasRepositoryProjects() | setHasRepositoryProjects(boolean hasRepositoryProjects) |
| `PublicRepos` | `int` | Required | - | int getPublicRepos() | setPublicRepos(int publicRepos) |
| `PublicGists` | `int` | Required | - | int getPublicGists() | setPublicGists(int publicGists) |
| `Followers` | `int` | Required | - | int getFollowers() | setFollowers(int followers) |
| `Following` | `int` | Required | - | int getFollowing() | setFollowing(int following) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `TotalPrivateRepos` | `Integer` | Optional | - | Integer getTotalPrivateRepos() | setTotalPrivateRepos(Integer totalPrivateRepos) |
| `OwnedPrivateRepos` | `Integer` | Optional | - | Integer getOwnedPrivateRepos() | setOwnedPrivateRepos(Integer ownedPrivateRepos) |
| `PrivateGists` | `Integer` | Optional | - | Integer getPrivateGists() | setPrivateGists(Integer privateGists) |
| `DiskUsage` | `Integer` | Optional | - | Integer getDiskUsage() | setDiskUsage(Integer diskUsage) |
| `Collaborators` | `Integer` | Optional | - | Integer getCollaborators() | setCollaborators(Integer collaborators) |
| `BillingEmail` | `String` | Optional | - | String getBillingEmail() | setBillingEmail(String billingEmail) |
| `Plan` | [`Plan1`](../../doc/models/plan-1.md) | Optional | - | Plan1 getPlan() | setPlan(Plan1 plan) |
| `DefaultRepositoryPermission` | `String` | Optional | - | String getDefaultRepositoryPermission() | setDefaultRepositoryPermission(String defaultRepositoryPermission) |
| `MembersCanCreateRepositories` | `Boolean` | Optional | - | Boolean getMembersCanCreateRepositories() | setMembersCanCreateRepositories(Boolean membersCanCreateRepositories) |
| `TwoFactorRequirementEnabled` | `Boolean` | Optional | - | Boolean getTwoFactorRequirementEnabled() | setTwoFactorRequirementEnabled(Boolean twoFactorRequirementEnabled) |
| `MembersAllowedRepositoryCreationType` | `String` | Optional | - | String getMembersAllowedRepositoryCreationType() | setMembersAllowedRepositoryCreationType(String membersAllowedRepositoryCreationType) |
| `MembersCanCreatePublicRepositories` | `Boolean` | Optional | - | Boolean getMembersCanCreatePublicRepositories() | setMembersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) |
| `MembersCanCreatePrivateRepositories` | `Boolean` | Optional | - | Boolean getMembersCanCreatePrivateRepositories() | setMembersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) |
| `MembersCanCreateInternalRepositories` | `Boolean` | Optional | - | Boolean getMembersCanCreateInternalRepositories() | setMembersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) |
| `MembersCanCreatePages` | `Boolean` | Optional | - | Boolean getMembersCanCreatePages() | setMembersCanCreatePages(Boolean membersCanCreatePages) |
| `MembersCanCreatePublicPages` | `Boolean` | Optional | - | Boolean getMembersCanCreatePublicPages() | setMembersCanCreatePublicPages(Boolean membersCanCreatePublicPages) |
| `MembersCanCreatePrivatePages` | `Boolean` | Optional | - | Boolean getMembersCanCreatePrivatePages() | setMembersCanCreatePrivatePages(Boolean membersCanCreatePrivatePages) |
| `MembersCanForkPrivateRepositories` | `Boolean` | Optional | - | Boolean getMembersCanForkPrivateRepositories() | setMembersCanForkPrivateRepositories(Boolean membersCanForkPrivateRepositories) |
| `WebCommitSignoffRequired` | `Boolean` | Optional | - | Boolean getWebCommitSignoffRequired() | setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "login": "github",
  "id": 1,
  "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
  "url": "https://api.github.com/orgs/github",
  "repos_url": "https://api.github.com/orgs/github/repos",
  "events_url": "https://api.github.com/orgs/github/events",
  "hooks_url": "https://api.github.com/orgs/github/hooks",
  "issues_url": "https://api.github.com/orgs/github/issues",
  "members_url": "https://api.github.com/orgs/github/members{/member}",
  "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
  "avatar_url": "https://github.com/images/error/octocat_happy.gif",
  "description": "A great organization",
  "has_organization_projects": true,
  "has_repository_projects": true,
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "html_url": "https://github.com/octocat",
  "created_at": "01/14/2008 04:33:35",
  "type": "Organization",
  "updated_at": null
}
```

