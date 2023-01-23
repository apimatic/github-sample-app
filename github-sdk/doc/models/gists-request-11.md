
# Gists Request 11

## Structure

`GistsRequest11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | The description of the gist. | String getDescription() | setDescription(String description) |
| `Files` | [`Map<String, Files53>`]($m/GistsRequest11Files) | Required | The gist files to be updated, renamed, or deleted. Each `key` must match the current filename<br>(including extension) of the targeted gist file. For example: `hello.py`.<br><br>To delete a file, set the whole file to null. For example: `hello.py : null`. | Map<String, Files53> getFiles() | setFiles(Map<String, Files53> files) |

## Example (as JSON)

```json
{
  "files": {
    "hello.rb": {
      "content": "blah",
      "filename": "goodbye.rb"
    }
  }
}
```

