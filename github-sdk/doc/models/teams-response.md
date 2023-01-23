
# Teams Response

## Structure

`TeamsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the team | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | URL for the team | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Name` | `String` | Required | Name of the team | String getName() | setName(String name) |
| `Slug` | `String` | Required | - | String getSlug() | setSlug(String slug) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Privacy` | [`PrivacyEnum`](../../doc/models/privacy-enum.md) | Optional | - | PrivacyEnum getPrivacy() | setPrivacy(PrivacyEnum privacy) |
| `Permission` | `String` | Required | Permission that the team will have for its repositories | String getPermission() | setPermission(String permission) |
| `MembersUrl` | `String` | Required | - | String getMembersUrl() | setMembersUrl(String membersUrl) |
| `RepositoriesUrl` | `String` | Required | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `Parent` | `Object` | Optional | - | Object getParent() | setParent(Object parent) |
| `MembersCount` | `int` | Required | - | int getMembersCount() | setMembersCount(int membersCount) |
| `ReposCount` | `int` | Required | - | int getReposCount() | setReposCount(int reposCount) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Organization` | [`Organization1`](../../doc/models/organization-1.md) | Required | - | Organization1 getOrganization() | setOrganization(Organization1 organization) |
| `LdapDn` | `String` | Optional | Distinguished Name (DN) that team maps to within LDAP environment | String getLdapDn() | setLdapDn(String ldapDn) |

## Example (as JSON)

```json
{
  "id": 42,
  "node_id": "MDQ6VGVhbTE=",
  "url": "https://api.github.com/organizations/1/team/1",
  "html_url": "https://github.com/orgs/rails/teams/core",
  "name": "Developers",
  "slug": "justice-league",
  "description": "A great team.",
  "permission": "push",
  "members_url": "https://api.github.com/organizations/1/team/1/members{/member}",
  "repositories_url": "https://api.github.com/organizations/1/team/1/repos",
  "members_count": 3,
  "repos_count": 10,
  "created_at": "07/14/2017 16:53:42",
  "updated_at": "08/17/2017 12:37:15",
  "organization": {
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
}
```

