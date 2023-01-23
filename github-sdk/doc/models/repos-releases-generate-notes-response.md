
# Repos Releases Generate Notes Response

## Structure

`ReposReleasesGenerateNotesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The generated name of the release | String getName() | setName(String name) |
| `Body` | `String` | Required | The generated body describing the contents of the release supporting markdown formatting | String getBody() | setBody(String body) |

## Example (as JSON)

```json
{
  "name": "Release v1.0.0 is now available!",
  "body": null
}
```

