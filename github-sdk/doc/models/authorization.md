
# Authorization

The authorization for an OAuth app, GitHub App, or a Personal Access Token.

## Structure

`Authorization`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Scopes` | `List<String>` | Required | A list of scopes that this authorization is in. | List<String> getScopes() | setScopes(List<String> scopes) |
| `Token` | `String` | Required | - | String getToken() | setToken(String token) |
| `TokenLastEight` | `String` | Required | - | String getTokenLastEight() | setTokenLastEight(String tokenLastEight) |
| `HashedToken` | `String` | Required | - | String getHashedToken() | setHashedToken(String hashedToken) |
| `App` | [`App`](../../doc/models/app.md) | Required | - | App getApp() | setApp(App app) |
| `Note` | `String` | Required | - | String getNote() | setNote(String note) |
| `NoteUrl` | `String` | Required | - | String getNoteUrl() | setNoteUrl(String noteUrl) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Fingerprint` | `String` | Required | - | String getFingerprint() | setFingerprint(String fingerprint) |
| `User` | `Object` | Optional | - | Object getUser() | setUser(Object user) |
| `Installation` | `Object` | Optional | - | Object getInstallation() | setInstallation(Object installation) |
| `ExpiresAt` | `LocalDateTime` | Required | - | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |

## Example (as JSON)

```json
{
  "id": 112,
  "url": "url4",
  "scopes": [
    "scopes2"
  ],
  "token": "token6",
  "token_last_eight": "token_last_eight4",
  "hashed_token": "hashed_token8",
  "app": {
    "client_id": "client_id4",
    "name": "name2",
    "url": "url6"
  },
  "note": "note4",
  "note_url": "note_url6",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "created_at": "2016-03-13T12:52:32.123Z",
  "fingerprint": "fingerprint6",
  "user": null,
  "installation": null,
  "expires_at": "2016-03-13T12:52:32.123Z"
}
```

