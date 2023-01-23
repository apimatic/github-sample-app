
# Detector

A description of the detector used.

## Structure

`Detector`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the detector used. | String getName() | setName(String name) |
| `Version` | `String` | Required | The version of the detector used. | String getVersion() | setVersion(String version) |
| `Url` | `String` | Required | The url of the detector used. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "name": "docker buildtime detector",
  "version": "1.0.0",
  "url": "http://example.com/docker-buildtimer-detector"
}
```

