
# Team 6

Groups of organization members that gives permissions on specified repositories.

## Structure

`Team6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Deleted` | `Boolean` | Optional | - | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Description` | `String` | Required | Description of the team | String getDescription() | setDescription(String description) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | Unique identifier of the team | int getId() | setId(int id) |
| `MembersUrl` | `String` | Required | - | String getMembersUrl() | setMembersUrl(String membersUrl) |
| `Name` | `String` | Required | Name of the team | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Parent` | `Object` | Optional | - | Object getParent() | setParent(Object parent) |
| `Permission` | `String` | Required | Permission that the team will have for its repositories | String getPermission() | setPermission(String permission) |
| `Privacy` | [`Privacy1Enum`](../../doc/models/privacy-1-enum.md) | Required | - | Privacy1Enum getPrivacy() | setPrivacy(Privacy1Enum privacy) |
| `RepositoriesUrl` | `String` | Required | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `Slug` | `String` | Required | - | String getSlug() | setSlug(String slug) |
| `Url` | `String` | Required | URL for the team | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "deleted": null,
  "description": "description0",
  "html_url": "html_url0",
  "id": 112,
  "members_url": "members_url6",
  "name": "name0",
  "node_id": "node_id2",
  "parent": null,
  "permission": "permission2",
  "privacy": "closed",
  "repositories_url": "repositories_url2",
  "slug": "slug6",
  "url": "url4"
}
```

