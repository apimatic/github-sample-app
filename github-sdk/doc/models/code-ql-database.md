
# Code QL Database

A CodeQL database.

## Structure

`CodeQLDatabase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The ID of the CodeQL database. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the CodeQL database. | String getName() | setName(String name) |
| `Language` | `String` | Required | The language of the CodeQL database. | String getLanguage() | setLanguage(String language) |
| `Uploader` | [`Uploader`](../../doc/models/uploader.md) | Required | - | Uploader getUploader() | setUploader(Uploader uploader) |
| `ContentType` | `String` | Required | The MIME type of the CodeQL database file. | String getContentType() | setContentType(String contentType) |
| `Size` | `int` | Required | The size of the CodeQL database file in bytes. | int getSize() | setSize(int size) |
| `CreatedAt` | `LocalDateTime` | Required | The date and time at which the CodeQL database was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The date and time at which the CodeQL database was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | The URL at which to download the CodeQL database. The `Accept` header must be set to the value of the `content_type` property. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "language": null,
  "uploader": {
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
  "content_type": null,
  "size": null,
  "created_at": null,
  "updated_at": null,
  "url": null
}
```

