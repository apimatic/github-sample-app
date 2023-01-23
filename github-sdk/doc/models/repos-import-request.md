
# Repos Import Request

## Structure

`ReposImportRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VcsUrl` | `String` | Required | The URL of the originating repository. | String getVcsUrl() | setVcsUrl(String vcsUrl) |
| `Vcs` | [`VcsEnum`](../../doc/models/vcs-enum.md) | Optional | - | VcsEnum getVcs() | setVcs(VcsEnum vcs) |
| `VcsUsername` | `String` | Optional | If authentication is required, the username to provide to `vcs_url`. | String getVcsUsername() | setVcsUsername(String vcsUsername) |
| `VcsPassword` | `String` | Optional | If authentication is required, the password to provide to `vcs_url`. | String getVcsPassword() | setVcsPassword(String vcsPassword) |
| `TfvcProject` | `String` | Optional | For a tfvc import, the name of the project that is being imported. | String getTfvcProject() | setTfvcProject(String tfvcProject) |

## Example (as JSON)

```json
{
  "vcs_url": "vcs_url6",
  "vcs": null,
  "vcs_username": null,
  "vcs_password": null,
  "tfvc_project": null
}
```

