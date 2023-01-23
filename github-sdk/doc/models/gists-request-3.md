
# Gists Request 3

## Structure

`GistsRequest3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | The description of the gist. | String getDescription() | setDescription(String description) |
| `Files` | [`Files9`](../../doc/models/files-9.md) | Optional | The gist files to be updated, renamed, or deleted. Each `key` must match the current filename<br>(including extension) of the targeted gist file. For example: `hello.py`.<br><br>To delete a file, set the whole file to null. For example: `hello.py : null`. | Files9 getFiles() | setFiles(Files9 files) |

## Example (as JSON)

```json
{
  "description": null,
  "files": null
}
```

