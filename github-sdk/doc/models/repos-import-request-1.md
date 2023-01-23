
# Repos Import Request 1

## Structure

`ReposImportRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VcsUsername` | `String` | Optional | The username to provide to the originating repository. | String getVcsUsername() | setVcsUsername(String vcsUsername) |
| `VcsPassword` | `String` | Optional | The password to provide to the originating repository. | String getVcsPassword() | setVcsPassword(String vcsPassword) |
| `Vcs` | [`Vcs1Enum`](../../doc/models/vcs-1-enum.md) | Optional | - | Vcs1Enum getVcs() | setVcs(Vcs1Enum vcs) |
| `TfvcProject` | `String` | Optional | For a tfvc import, the name of the project that is being imported. | String getTfvcProject() | setTfvcProject(String tfvcProject) |

## Example (as JSON)

```json
{
  "vcs_username": null,
  "vcs_password": null,
  "vcs": null,
  "tfvc_project": null
}
```

