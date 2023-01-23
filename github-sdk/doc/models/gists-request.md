
# Gists Request

## Structure

`GistsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the gist | String getDescription() | setDescription(String description) |
| `Files` | [`Map<String, Files4>`](../../doc/models/files-4.md) | Required | Names and content for the files that make up the gist | Map<String, Files4> getFiles() | setFiles(Map<String, Files4> files) |
| `Public` | [`GistsRequestPublic`]($m/GistsRequestPublic) | Optional | - | GistsRequestPublic getPublic() | setPublic(GistsRequestPublic mPublic) |

## Example (as JSON)

```json
{
  "files": {
    "hello.rb": {
      "content": "puts \"Hello, World!\""
    }
  }
}
```

