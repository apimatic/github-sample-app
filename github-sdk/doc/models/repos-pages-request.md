
# Repos Pages Request

## Structure

`ReposPagesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BuildType` | [`BuildType1Enum`](../../doc/models/build-type-1-enum.md) | Optional | - | BuildType1Enum getBuildType() | setBuildType(BuildType1Enum buildType) |
| `Source` | [`Source4`](../../doc/models/source-4.md) | Required | - | Source4 getSource() | setSource(Source4 source) |

## Example (as JSON)

```json
{
  "build_type": null,
  "source": {
    "branch": "branch0",
    "path": null
  }
}
```

