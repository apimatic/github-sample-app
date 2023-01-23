
# Team Simple

Groups of organization members that gives permissions on specified repositories.

## Structure

`TeamSimple`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the team | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | URL for the team | String getUrl() | setUrl(String url) |
| `MembersUrl` | `String` | Required | - | String getMembersUrl() | setMembersUrl(String membersUrl) |
| `Name` | `String` | Required | Name of the team | String getName() | setName(String name) |
| `Description` | `String` | Required | Description of the team | String getDescription() | setDescription(String description) |
| `Permission` | `String` | Required | Permission that the team will have for its repositories | String getPermission() | setPermission(String permission) |
| `Privacy` | `String` | Optional | The level of privacy this team should have | String getPrivacy() | setPrivacy(String privacy) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `RepositoriesUrl` | `String` | Required | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `Slug` | `String` | Required | - | String getSlug() | setSlug(String slug) |
| `LdapDn` | `String` | Optional | Distinguished Name (DN) that team maps to within LDAP environment | String getLdapDn() | setLdapDn(String ldapDn) |

## Example (as JSON)

```json
{
  "id": 1,
  "node_id": "MDQ6VGVhbTE=",
  "url": "https://api.github.com/organizations/1/team/1",
  "members_url": "https://api.github.com/organizations/1/team/1/members{/member}",
  "name": "Justice League",
  "description": "A great team.",
  "permission": "admin",
  "html_url": "https://github.com/orgs/rails/teams/core",
  "repositories_url": "https://api.github.com/organizations/1/team/1/repos",
  "slug": "justice-league"
}
```

