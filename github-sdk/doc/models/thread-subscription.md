
# Thread Subscription

Thread Subscription

## Structure

`ThreadSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscribed` | `boolean` | Required | - | boolean getSubscribed() | setSubscribed(boolean subscribed) |
| `Ignored` | `boolean` | Required | - | boolean getIgnored() | setIgnored(boolean ignored) |
| `Reason` | `String` | Required | - | String getReason() | setReason(String reason) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ThreadUrl` | `String` | Optional | - | String getThreadUrl() | setThreadUrl(String threadUrl) |
| `RepositoryUrl` | `String` | Optional | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |

## Example (as JSON)

```json
{
  "subscribed": true,
  "ignored": null,
  "reason": null,
  "created_at": "10/06/2012 21:34:12",
  "url": "https://api.github.com/notifications/threads/1/subscription"
}
```

