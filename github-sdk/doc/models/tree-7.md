
# Tree 7

## Structure

`Tree7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Optional | The file referenced in the tree. | String getPath() | setPath(String path) |
| `Mode` | [`Mode1Enum`](../../doc/models/mode-1-enum.md) | Optional | - | Mode1Enum getMode() | setMode(Mode1Enum mode) |
| `Type` | [`Type614Enum`](../../doc/models/type-614-enum.md) | Optional | - | Type614Enum getType() | setType(Type614Enum type) |
| `Sha` | `String` | Optional | The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.<br><br>**Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error. | String getSha() | setSha(String sha) |
| `Content` | `String` | Optional | The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.<br><br>**Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error. | String getContent() | setContent(String content) |

## Example (as JSON)

```json
{
  "path": null,
  "mode": null,
  "type": null,
  "sha": null,
  "content": null
}
```

