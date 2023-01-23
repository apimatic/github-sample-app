
# Getting Started with GitHub API

## Introduction

GitHub's v3 REST API.

GitHub v3 REST API: [https://docs.github.com/rest/](https://docs.github.com/rest/)

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=import3)

## Installation

The following section explains how to use the GitHubAPILib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *GitHubAPILib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify GitHubAPILib in `Group Id`, git-hub-apilib in `Artifact Id` and 1.1.4 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=GitHub%20API-Java&workspaceName=GitHubAPI&projectName=GitHubAPILib&rootNamespace=com.github.api&groupId=GitHubAPILib&artifactId=git-hub-apilib&version=1.1.4&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project GitHubAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](doc/http-client-configuration.md) | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
GitHubAPIClient client = new GitHubAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | **Default** |
| environment2 | The URL origin (protocol + host name + port) is included in `upload_url` returned in the response of the "Create a release" endpoint |

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Actions](doc/controllers/actions.md)
* [Activity](doc/controllers/activity.md)
* [Apps](doc/controllers/apps.md)
* [Billing](doc/controllers/billing.md)
* [Checks](doc/controllers/checks.md)
* [Code-Scanning](doc/controllers/code-scanning.md)
* [Codes-of-Conduct](doc/controllers/codes-of-conduct.md)
* [Codespaces](doc/controllers/codespaces.md)
* [Emojis](doc/controllers/emojis.md)
* [Enterprise-Admin](doc/controllers/enterprise-admin.md)
* [Dependabot](doc/controllers/dependabot.md)
* [Dependency-Graph](doc/controllers/dependency-graph.md)
* [Gists](doc/controllers/gists.md)
* [Git](doc/controllers/git.md)
* [Gitignore](doc/controllers/gitignore.md)
* [Interactions](doc/controllers/interactions.md)
* [Issues](doc/controllers/issues.md)
* [Licenses](doc/controllers/licenses.md)
* [Markdown](doc/controllers/markdown.md)
* [Meta](doc/controllers/meta.md)
* [Migrations](doc/controllers/migrations.md)
* [Orgs](doc/controllers/orgs.md)
* [Packages](doc/controllers/packages.md)
* [Projects](doc/controllers/projects.md)
* [Pulls](doc/controllers/pulls.md)
* [Rate-Limit](doc/controllers/rate-limit.md)
* [Reactions](doc/controllers/reactions.md)
* [Repos](doc/controllers/repos.md)
* [Search](doc/controllers/search.md)
* [Secret-Scanning](doc/controllers/secret-scanning.md)
* [Teams](doc/controllers/teams.md)
* [Users](doc/controllers/users.md)
* [Oidc](doc/controllers/oidc.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

