
# Repos Git Blobs Request

## Structure

`ReposGitBlobsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Content` | `String` | Required | The new blob's content. | String getContent() | setContent(String content) |
| `Encoding` | `String` | Optional | The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.<br>**Default**: `"utf-8"` | String getEncoding() | setEncoding(String encoding) |

## Example (as JSON)

```json
{
  "content": "content4",
  "encoding": null
}
```

