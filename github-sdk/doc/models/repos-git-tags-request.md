
# Repos Git Tags Request

## Structure

`ReposGitTagsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Tag` | `String` | Required | The tag's name. This is typically a version (e.g., "v0.0.1"). | String getTag() | setTag(String tag) |
| `Message` | `String` | Required | The tag message. | String getMessage() | setMessage(String message) |
| `Object` | `String` | Required | The SHA of the git object this is tagging. | String getObject() | setObject(String object) |
| `Type` | [`Type613Enum`](../../doc/models/type-613-enum.md) | Required | - | Type613Enum getType() | setType(Type613Enum type) |
| `Tagger` | [`Tagger12`](../../doc/models/tagger-12.md) | Optional | - | Tagger12 getTagger() | setTagger(Tagger12 tagger) |

## Example (as JSON)

```json
{
  "tag": "tag6",
  "message": "message0",
  "object": "object2",
  "type": "blob",
  "tagger": null
}
```

