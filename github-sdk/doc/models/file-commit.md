
# File Commit

File Commit

## Structure

`FileCommit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Content` | `Object` | Required | - | Object getContent() | setContent(Object content) |
| `Commit` | [`Commit4`](../../doc/models/commit-4.md) | Required | - | Commit4 getCommit() | setCommit(Commit4 commit) |

## Example (as JSON)

```json
{
  "content": {
    "key1": "val1",
    "key2": "val2"
  },
  "commit": {
    "sha": null,
    "node_id": null,
    "url": null,
    "html_url": null,
    "author": null,
    "committer": null,
    "message": null,
    "tree": null,
    "parents": null,
    "verification": null
  }
}
```

