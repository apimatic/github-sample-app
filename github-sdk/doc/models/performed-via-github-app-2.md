
# Performed Via Github App 2

## Structure

`PerformedViaGithubApp2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the GitHub app | int getId() | setId(int id) |
| `Slug` | `String` | Optional | The slug name of the GitHub app | String getSlug() | setSlug(String slug) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Owner` | [`Owner1`](../../doc/models/owner-1.md) | Required | - | Owner1 getOwner() | setOwner(Owner1 owner) |
| `Name` | `String` | Required | The name of the GitHub app | String getName() | setName(String name) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `ExternalUrl` | `String` | Required | - | String getExternalUrl() | setExternalUrl(String externalUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Permissions` | [`Permissions30`](../../doc/models/permissions-30.md) | Required | - | Permissions30 getPermissions() | setPermissions(Permissions30 permissions) |
| `Events` | `List<String>` | Required | The list of events for the GitHub app | List<String> getEvents() | setEvents(List<String> events) |
| `InstallationsCount` | `Integer` | Optional | The number of installations associated with the GitHub app | Integer getInstallationsCount() | setInstallationsCount(Integer installationsCount) |
| `ClientId` | `String` | Optional | - | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Optional | - | String getClientSecret() | setClientSecret(String clientSecret) |
| `WebhookSecret` | `String` | Optional | - | String getWebhookSecret() | setWebhookSecret(String webhookSecret) |
| `Pem` | `String` | Optional | - | String getPem() | setPem(String pem) |

## Example (as JSON)

```json
{
  "id": 37,
  "node_id": "MDExOkludGVncmF0aW9uMQ==",
  "owner": {
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
  "name": "Probot Owners",
  "description": "The description of the app.",
  "external_url": "https://example.com",
  "html_url": "https://github.com/apps/super-ci",
  "created_at": "07/09/2017 01:18:44",
  "updated_at": "07/09/2017 01:18:44",
  "permissions": null,
  "events": [
    "label",
    "deployment"
  ]
}
```

