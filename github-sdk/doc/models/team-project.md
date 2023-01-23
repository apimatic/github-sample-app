
# Team Project

A team's access to a project.

## Structure

`TeamProject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OwnerUrl` | `String` | Required | - | String getOwnerUrl() | setOwnerUrl(String ownerUrl) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `ColumnsUrl` | `String` | Required | - | String getColumnsUrl() | setColumnsUrl(String columnsUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Creator` | [`Creator`](../../doc/models/creator.md) | Required | - | Creator getCreator() | setCreator(Creator creator) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `OrganizationPermission` | `String` | Optional | The organization permission for this project. Only present when owner is an organization. | String getOrganizationPermission() | setOrganizationPermission(String organizationPermission) |
| `Private` | `Boolean` | Optional | Whether the project is private or not. Only present when owner is an organization. | Boolean getPrivate() | setPrivate(Boolean mPrivate) |
| `Permissions` | [`Permissions8`](../../doc/models/permissions-8.md) | Required | - | Permissions8 getPermissions() | setPermissions(Permissions8 permissions) |

## Example (as JSON)

```json
{
  "owner_url": null,
  "url": null,
  "html_url": null,
  "columns_url": null,
  "id": null,
  "node_id": null,
  "name": null,
  "body": null,
  "number": null,
  "state": null,
  "creator": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "created_at": null,
  "updated_at": null,
  "permissions": null
}
```

