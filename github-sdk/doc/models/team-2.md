
# Team 2

## Structure

`Team2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Deleted` | `Boolean` | Optional | - | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Description` | `String` | Optional | Description of the team | String getDescription() | setDescription(String description) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | Unique identifier of the team | int getId() | setId(int id) |
| `MembersUrl` | `String` | Optional | - | String getMembersUrl() | setMembersUrl(String membersUrl) |
| `Name` | `String` | Required | Name of the team | String getName() | setName(String name) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Parent` | `Object` | Optional | - | Object getParent() | setParent(Object parent) |
| `Permission` | `String` | Optional | Permission that the team will have for its repositories | String getPermission() | setPermission(String permission) |
| `Privacy` | [`Privacy1Enum`](../../doc/models/privacy-1-enum.md) | Optional | - | Privacy1Enum getPrivacy() | setPrivacy(Privacy1Enum privacy) |
| `RepositoriesUrl` | `String` | Optional | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `Slug` | `String` | Optional | - | String getSlug() | setSlug(String slug) |
| `Url` | `String` | Optional | URL for the team | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "deleted": null,
  "description": null,
  "html_url": null,
  "id": 112,
  "members_url": null,
  "name": "name0",
  "node_id": null,
  "parent": null,
  "permission": null,
  "privacy": null,
  "repositories_url": null,
  "slug": null,
  "url": null
}
```

