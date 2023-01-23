
# Git Reference

Git references within a repository

## Structure

`GitReference`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Object` | [`ObjectType`](../../doc/models/object-type.md) | Required | - | ObjectType getObject() | setObject(ObjectType object) |

## Example (as JSON)

```json
{
  "ref": null,
  "node_id": null,
  "url": null,
  "object": {
    "type": null,
    "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
    "url": null
  }
}
```

