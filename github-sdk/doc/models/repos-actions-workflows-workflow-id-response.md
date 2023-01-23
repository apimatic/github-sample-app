
# Repos Actions Workflows Workflow Id Response

## Structure

`ReposActionsWorkflowsWorkflowIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `State` | [`State8Enum`](../../doc/models/state-8-enum.md) | Required | - | State8Enum getState() | setState(State8Enum state) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `BadgeUrl` | `String` | Required | - | String getBadgeUrl() | setBadgeUrl(String badgeUrl) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |

## Example (as JSON)

```json
{
  "id": 5,
  "node_id": "MDg6V29ya2Zsb3cxMg==",
  "name": "CI",
  "path": "ruby.yaml",
  "state": null,
  "created_at": "12/06/2019 14:20:20",
  "updated_at": "12/06/2019 14:20:20",
  "url": "https://api.github.com/repos/actions/setup-ruby/workflows/5",
  "html_url": "https://github.com/actions/setup-ruby/blob/master/.github/workflows/ruby.yaml",
  "badge_url": "https://github.com/actions/setup-ruby/workflows/CI/badge.svg"
}
```

