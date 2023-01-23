
# Committer 27

Information about the person who is making the commit. By default, `committer` will use the information set in `author`. See the `author` and `committer` object below for details.

## Structure

`Committer27`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the author (or committer) of the commit | String getName() | setName(String name) |
| `Email` | `String` | Optional | The email of the author (or committer) of the commit | String getEmail() | setEmail(String email) |
| `Date` | `LocalDateTime` | Optional | Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDate() | setDate(LocalDateTime date) |

## Example (as JSON)

```json
{
  "name": null,
  "email": null,
  "date": null
}
```

