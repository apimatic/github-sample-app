
# Files 9

The gist files to be updated, renamed, or deleted. Each `key` must match the current filename
(including extension) of the targeted gist file. For example: `hello.py`.

To delete a file, set the whole file to null. For example: `hello.py : null`.

## Structure

`Files9`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Content` | `String` | Required | The new content of the file. | String getContent() | setContent(String content) |
| `Filename` | `String` | Required | The new filename for the file. | String getFilename() | setFilename(String filename) |

## Example (as JSON)

```json
{
  "content": "content4",
  "filename": "filename2"
}
```

