
# Repos Pages Request 5

## Structure

`ReposPagesRequest5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cname` | `String` | Optional | Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)." | String getCname() | setCname(String cname) |
| `HttpsEnforced` | `Boolean` | Optional | Specify whether HTTPS should be enforced for the repository. | Boolean getHttpsEnforced() | setHttpsEnforced(Boolean httpsEnforced) |
| `BuildType` | `Object` | Optional | - | Object getBuildType() | setBuildType(Object buildType) |
| `Source` | [`Source15`]($m/ReposPagesRequest5Source) | Optional | - | Source15 getSource() | setSource(Source15 source) |

## Example (as JSON)

```json
{
  "cname": "octocatblog.com",
  "source": {
    "branch": "main",
    "path": "/"
  }
}
```

