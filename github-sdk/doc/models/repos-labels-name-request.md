
# Repos Labels Name Request

## Structure

`ReposLabelsNameRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NewName` | `String` | Optional | The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see "[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet)." | String getNewName() | setNewName(String newName) |
| `Color` | `String` | Optional | The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`. | String getColor() | setColor(String color) |
| `Description` | `String` | Optional | A short description of the label. Must be 100 characters or fewer. | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "new_name": null,
  "color": null,
  "description": null
}
```

