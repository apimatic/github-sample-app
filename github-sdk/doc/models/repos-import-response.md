
# Repos Import Response

## Structure

`ReposImportResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vcs` | `String` | Required | - | String getVcs() | setVcs(String vcs) |
| `UseLfs` | `Boolean` | Optional | - | Boolean getUseLfs() | setUseLfs(Boolean useLfs) |
| `VcsUrl` | `String` | Required | The URL of the originating repository. | String getVcsUrl() | setVcsUrl(String vcsUrl) |
| `SvcRoot` | `String` | Optional | - | String getSvcRoot() | setSvcRoot(String svcRoot) |
| `TfvcProject` | `String` | Optional | - | String getTfvcProject() | setTfvcProject(String tfvcProject) |
| `Status` | [`Status10Enum`](../../doc/models/status-10-enum.md) | Required | - | Status10Enum getStatus() | setStatus(Status10Enum status) |
| `StatusText` | `String` | Optional | - | String getStatusText() | setStatusText(String statusText) |
| `FailedStep` | `String` | Optional | - | String getFailedStep() | setFailedStep(String failedStep) |
| `ErrorMessage` | `String` | Optional | - | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `ImportPercent` | `Integer` | Optional | - | Integer getImportPercent() | setImportPercent(Integer importPercent) |
| `CommitCount` | `Integer` | Optional | - | Integer getCommitCount() | setCommitCount(Integer commitCount) |
| `PushPercent` | `Integer` | Optional | - | Integer getPushPercent() | setPushPercent(Integer pushPercent) |
| `HasLargeFiles` | `Boolean` | Optional | - | Boolean getHasLargeFiles() | setHasLargeFiles(Boolean hasLargeFiles) |
| `LargeFilesSize` | `Integer` | Optional | - | Integer getLargeFilesSize() | setLargeFilesSize(Integer largeFilesSize) |
| `LargeFilesCount` | `Integer` | Optional | - | Integer getLargeFilesCount() | setLargeFilesCount(Integer largeFilesCount) |
| `ProjectChoices` | [`List<ProjectChoice>`](../../doc/models/project-choice.md) | Optional | - | List<ProjectChoice> getProjectChoices() | setProjectChoices(List<ProjectChoice> projectChoices) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `AuthorsCount` | `Integer` | Optional | - | Integer getAuthorsCount() | setAuthorsCount(Integer authorsCount) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `AuthorsUrl` | `String` | Required | - | String getAuthorsUrl() | setAuthorsUrl(String authorsUrl) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `SvnRoot` | `String` | Optional | - | String getSvnRoot() | setSvnRoot(String svnRoot) |

## Example (as JSON)

```json
{
  "vcs": "vcs2",
  "use_lfs": null,
  "vcs_url": "vcs_url6",
  "svc_root": null,
  "tfvc_project": null,
  "status": "unknown",
  "status_text": null,
  "failed_step": null,
  "error_message": null,
  "import_percent": null,
  "commit_count": null,
  "push_percent": null,
  "has_large_files": null,
  "large_files_size": null,
  "large_files_count": null,
  "project_choices": null,
  "message": null,
  "authors_count": null,
  "url": "url4",
  "html_url": "html_url0",
  "authors_url": "authors_url8",
  "repository_url": "repository_url0",
  "svn_root": null
}
```

