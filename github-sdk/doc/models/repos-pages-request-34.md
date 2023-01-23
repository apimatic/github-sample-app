
# Repos Pages Request 34

## Structure

`ReposPagesRequest34`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cname` | `String` | Optional | Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)." | String getCname() | setCname(String cname) |
| `HttpsEnforced` | `boolean` | Required | Specify whether HTTPS should be enforced for the repository. | boolean getHttpsEnforced() | setHttpsEnforced(boolean httpsEnforced) |
| `BuildType` | [`BuildType2Enum`](../../doc/models/build-type-2-enum.md) | Optional | - | BuildType2Enum getBuildType() | setBuildType(BuildType2Enum buildType) |
| `Source` | [`Source22`]($m/ReposPagesRequest34Source) | Optional | - | Source22 getSource() | setSource(Source22 source) |

## Example (as JSON)

```json
{
  "cname": null,
  "https_enforced": false,
  "build_type": null,
  "source": null
}
```

