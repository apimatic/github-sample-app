
# Gist Commit

Gist Commit

## Structure

`GistCommit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Version` | `String` | Required | - | String getVersion() | setVersion(String version) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `ChangeStatus` | [`ChangeStatus`](../../doc/models/change-status.md) | Required | - | ChangeStatus getChangeStatus() | setChangeStatus(ChangeStatus changeStatus) |
| `CommittedAt` | `LocalDateTime` | Required | - | LocalDateTime getCommittedAt() | setCommittedAt(LocalDateTime committedAt) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/gists/aa5a315d61ae9438b18d/57a7f021a713b1c5a6a199b54cc514735d2d462f",
  "version": "57a7f021a713b1c5a6a199b54cc514735d2d462f",
  "user": null,
  "change_status": null,
  "committed_at": "04/14/2010 02:15:15"
}
```

