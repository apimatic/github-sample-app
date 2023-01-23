
# Repos Pages Deployment Request 1

## Structure

`ReposPagesDeploymentRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArtifactUrl` | `String` | Required | The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. | String getArtifactUrl() | setArtifactUrl(String artifactUrl) |
| `Environment` | `String` | Optional | The target environment for this GitHub Pages deployment.<br>**Default**: `"github-pages"` | String getEnvironment() | setEnvironment(String environment) |
| `PagesBuildVersion` | `String` | Required | A unique string that represents the version of the build for this deployment. | String getPagesBuildVersion() | setPagesBuildVersion(String pagesBuildVersion) |
| `OidcToken` | `String` | Required | The OIDC token issued by GitHub Actions certifying the origin of the deployment. | String getOidcToken() | setOidcToken(String oidcToken) |

## Example (as JSON)

```json
{
  "artifact_url": "artifact_url4",
  "environment": null,
  "pages_build_version": "pages_build_version8",
  "oidc_token": "oidc_token6"
}
```

