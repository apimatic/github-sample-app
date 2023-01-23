
# Gist History

Gist History

## Structure

`GistHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `User` | `Object` | Optional | - | Object getUser() | setUser(Object user) |
| `Version` | `String` | Optional | - | String getVersion() | setVersion(String version) |
| `CommittedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCommittedAt() | setCommittedAt(LocalDateTime committedAt) |
| `ChangeStatus` | [`ChangeStatus`](../../doc/models/change-status.md) | Optional | - | ChangeStatus getChangeStatus() | setChangeStatus(ChangeStatus changeStatus) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "user": null,
  "version": null,
  "committed_at": null,
  "change_status": null,
  "url": null
}
```

