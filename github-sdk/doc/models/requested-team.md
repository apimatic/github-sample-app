
# Requested Team

## Structure

`RequestedTeam`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Slug` | `String` | Required | - | String getSlug() | setSlug(String slug) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Privacy` | `String` | Optional | - | String getPrivacy() | setPrivacy(String privacy) |
| `Permission` | `String` | Required | - | String getPermission() | setPermission(String permission) |
| `Permissions` | [`Permissions5`](../../doc/models/permissions-5.md) | Optional | - | Permissions5 getPermissions() | setPermissions(Permissions5 permissions) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `MembersUrl` | `String` | Required | - | String getMembersUrl() | setMembersUrl(String membersUrl) |
| `RepositoriesUrl` | `String` | Required | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `Parent` | `Object` | Required | - | Object getParent() | setParent(Object parent) |

## Example (as JSON)

```json
{
  "id": null,
  "node_id": null,
  "name": null,
  "slug": null,
  "description": null,
  "permission": null,
  "url": null,
  "html_url": "https://github.com/orgs/rails/teams/core",
  "members_url": null,
  "repositories_url": null,
  "parent": null
}
```

