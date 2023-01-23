
# Gists Request 1

## Structure

`GistsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | The description of the gist. | String getDescription() | setDescription(String description) |
| `Files` | [`Map<String, Files53>`]($m/GistsRequest1Files) | Optional | The gist files to be updated, renamed, or deleted. Each `key` must match the current filename<br>(including extension) of the targeted gist file. For example: `hello.py`.<br><br>To delete a file, set the whole file to null. For example: `hello.py : null`. | Map<String, Files53> getFiles() | setFiles(Map<String, Files53> files) |

## Example (as JSON)

```json
{
  "description": "Example Ruby script"
}
```

