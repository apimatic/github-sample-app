
# Event

Event

## Structure

`Event`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Actor` | [`Actor1`](../../doc/models/actor-1.md) | Required | - | Actor1 getActor() | setActor(Actor1 actor) |
| `Repo` | [`Repo`](../../doc/models/repo.md) | Required | - | Repo getRepo() | setRepo(Repo repo) |
| `Org` | [`Org`](../../doc/models/org.md) | Optional | - | Org getOrg() | setOrg(Org org) |
| `Payload` | [`Payload`](../../doc/models/payload.md) | Required | - | Payload getPayload() | setPayload(Payload payload) |
| `Public` | `boolean` | Required | - | boolean getPublic() | setPublic(boolean mPublic) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |

## Example (as JSON)

```json
{
  "id": "id0",
  "type": "type0",
  "actor": {
    "id": 140,
    "login": "login0",
    "display_login": null,
    "gravatar_id": "gravatar_id8",
    "url": "url4",
    "avatar_url": "avatar_url6"
  },
  "repo": {
    "id": 94,
    "name": "name4",
    "url": "url8"
  },
  "org": null,
  "payload": {
    "action": null,
    "issue": null,
    "comment": null,
    "pages": null
  },
  "public": false,
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

