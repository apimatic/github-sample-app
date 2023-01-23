# Dependency-Graph

Endpoints to access Dependency Graph features.

```java
DependencyGraphController dependencyGraphController = client.getDependencyGraphController();
```

## Class Name

`DependencyGraphController`

## Methods

* [Dependency-Graph Diff-Range](../../doc/controllers/dependency-graph.md#dependency-graph-diff-range)
* [Dependency-Graph Create-Repository-Snapshot](../../doc/controllers/dependency-graph.md#dependency-graph-create-repository-snapshot)


# Dependency-Graph Diff-Range

Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.

API method documentation: [https://docs.github.com/rest/reference/dependency-graph#get-a-diff-of-the-dependencies-between-commits](https://docs.github.com/rest/reference/dependency-graph#get-a-diff-of-the-dependencies-between-commits)

```java
CompletableFuture<List<DependencyGraphDiff>> dependencyGraphDiffRangeAsync(
    final String owner,
    final String repo,
    final String basehead,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `basehead` | `String` | Template, Required | The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs. Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be determined. This parameter expects the format `{base}...{head}`. |
| `name` | `String` | Query, Optional | The full path, relative to the repository root, of the dependency manifest file. |

## Response Type

[`List<DependencyGraphDiff>`](../../doc/models/dependency-graph-diff.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String basehead = "basehead4";

dependencyGraphController.dependencyGraphDiffRangeAsync(owner, repo, basehead, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposDependencyGraphCompareBasehead403ErrorException`](../../doc/models/repos-dependency-graph-compare-basehead-403-error-exception.md) |
| 404 | Resource not found | [`ReposDependencyGraphCompareBasehead404ErrorException`](../../doc/models/repos-dependency-graph-compare-basehead-404-error-exception.md) |


# Dependency-Graph Create-Repository-Snapshot

Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to.

API method documentation: [https://docs.github.com/rest/reference/dependency-graph#create-a-snapshot-of-dependencies-for-a-repository](https://docs.github.com/rest/reference/dependency-graph#create-a-snapshot-of-dependencies-for-a-repository)

```java
CompletableFuture<ReposDependencyGraphSnapshotsResponse> dependencyGraphCreateRepositorySnapshotAsync(
    final String owner,
    final String repo,
    final ReposDependencyGraphSnapshotsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposDependencyGraphSnapshotsRequest`](../../doc/models/repos-dependency-graph-snapshots-request.md) | Body, Required | - |

## Response Type

[`ReposDependencyGraphSnapshotsResponse`](../../doc/models/repos-dependency-graph-snapshots-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposDependencyGraphSnapshotsRequest body = new ReposDependencyGraphSnapshotsRequest();
body.setVersion(0);
Job1 job = new Job1();
job.setId("yourrunid");
job.setCorrelator("yourworkflowname_youractionname");

body.setJob(job);
body.setSha("ce587453ced02b1526dfb4cb910479d431683101");
body.setRef("refs/heads/main");
Detector2 detector = new Detector2();
detector.setName("octo-detector");
detector.setVersion("0.0.1");
detector.setUrl("https://github.com/octo-org/octo-repo");

body.setDetector(detector);
body.setScanned(LocalDateTime.parse("2022-06-14T20:25:00Z", DateTimeFormatter.ISO_DATE_TIME));
Map<String, Manifest> manifests = new LinkedHashMap<>();
Manifest manifests0 = new Manifest();
manifests0.setName("package-lock.json");
File file = new File();
file.setSourceLocation("src/package-lock.json");

manifests0.setFile(file);
Map<String, Dependency> resolved = new LinkedHashMap<>();
Dependency resolved0 = new Dependency();
resolved0.setPackageUrl("pkg:/npm/%40actions/core@1.1.9");
List<String> dependencies = new LinkedList<>();
dependencies.add("@actions/http-client");

resolved0.setDependencies(dependencies);

resolved.put("@actions/core", resolved0);
Dependency resolved1 = new Dependency();
resolved1.setPackageUrl("pkg:/npm/%40actions/http-client@1.0.7");
List<String> dependencies = new LinkedList<>();
dependencies.add("tunnel");

resolved1.setDependencies(dependencies);

resolved.put("@actions/http-client", resolved1);
Dependency resolved2 = new Dependency();
resolved2.setPackageUrl("pkg:/npm/tunnel@0.0.6");

resolved.put("tunnel", resolved2);

manifests0.setResolved(resolved);

manifests.put("package-lock.json", manifests0);

body.setManifests(manifests);

dependencyGraphController.dependencyGraphCreateRepositorySnapshotAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 12345,
  "created_at": "2018-05-04T01:14:52Z",
  "message": "Dependency results for the repo have been successfully updated.",
  "result": "SUCCESS"
}
```

