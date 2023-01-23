
# Git Tag

Metadata for a Git tag

## Structure

`GitTag`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Tag` | `String` | Required | Name of the tag | String getTag() | setTag(String tag) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Url` | `String` | Required | URL for the tag | String getUrl() | setUrl(String url) |
| `Message` | `String` | Required | Message describing the purpose of the tag | String getMessage() | setMessage(String message) |
| `Tagger` | [`Tagger`](../../doc/models/tagger.md) | Required | - | Tagger getTagger() | setTagger(Tagger tagger) |
| `Object` | [`Object1`](../../doc/models/object-1.md) | Required | - | Object1 getObject() | setObject(Object1 object) |
| `Verification` | [`Verification`](../../doc/models/verification.md) | Optional | - | Verification getVerification() | setVerification(Verification verification) |

## Example (as JSON)

```json
{
  "node_id": "MDM6VGFnOTQwYmQzMzYyNDhlZmFlMGY5ZWU1YmM3YjJkNWM5ODU4ODdiMTZhYw==",
  "tag": "v0.0.1",
  "sha": "940bd336248efae0f9ee5bc7b2d5c985887b16ac",
  "url": "https://api.github.com/repositories/42/git/tags/940bd336248efae0f9ee5bc7b2d5c985887b16ac",
  "message": "Initial public release",
  "tagger": null,
  "object": null
}
```

