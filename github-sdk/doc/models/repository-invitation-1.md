
# Repository Invitation 1

Repository invitations let you manage who you collaborate with.

## Structure

`RepositoryInvitation1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscribed` | `boolean` | Required | Determines if notifications should be received from this repository. | boolean getSubscribed() | setSubscribed(boolean subscribed) |
| `Ignored` | `boolean` | Required | Determines if all notifications should be blocked from this repository. | boolean getIgnored() | setIgnored(boolean ignored) |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |

## Example (as JSON)

```json
{
  "subscribed": true,
  "ignored": null,
  "reason": null,
  "created_at": "10/06/2012 21:34:12",
  "url": "https://api.github.com/repos/octocat/example/subscription",
  "repository_url": "https://api.github.com/repos/octocat/example"
}
```

