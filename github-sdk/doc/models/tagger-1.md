
# Tagger 1

An object with information about the individual creating the tag.

## Structure

`Tagger1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the author of the tag | String getName() | setName(String name) |
| `Email` | `String` | Required | The email of the author of the tag | String getEmail() | setEmail(String email) |
| `Date` | `LocalDateTime` | Optional | When this object was tagged. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDate() | setDate(LocalDateTime date) |

## Example (as JSON)

```json
{
  "name": "name0",
  "email": "email6",
  "date": null
}
```

