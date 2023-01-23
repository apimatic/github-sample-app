
# Timeline Cross Referenced Event

Timeline Cross Referenced Event

## Structure

`TimelineCrossReferencedEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | `String` | Required | - | String getEvent() | setEvent(String event) |
| `Actor` | [`Actor2`](../../doc/models/actor-2.md) | Optional | - | Actor2 getActor() | setActor(Actor2 actor) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Source` | [`Source`](../../doc/models/source.md) | Required | - | Source getSource() | setSource(Source source) |

## Example (as JSON)

```json
{
  "event": "event0",
  "actor": null,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "source": {
    "type": null,
    "issue": null
  }
}
```

