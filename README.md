# Java SDK for GitHub V3 REST API

This repository contains a proof-of-concept for a Java SDK for GitHub's V3 REST API. This SDK was generated using the [APIMatic CodeGen](http://www.apimatic.io/).

There are two projects in this repo:

* [Java SDK Source Code (generated)](https://github.com/apimatic/github-java-app/tree/master/github-sdk)
* [Sample application](https://github.com/apimatic/github-java-app/tree/master/github-sample-app)

## Running the Sample Application

We have setup GitHub workflows to help you quickly test out the sample application.

Go to the actions tab and find the following Actions. Run any action with the required input fields. See the API response in the output of `Run GitHub Application` step.

### Repository Flow ([run](https://github.com/apimatic/github-java-app/actions/workflows/repository-flow.yml)) ([source](github-sample-app/src/main/java/github/sample/app/RepositoryFlow.java))

This example runs multiple endpoints in one flow:

- *Create a Repository* using the [`reposCreateForAuthenticatedUser`](github-sample-app/src/main/java/github/sample/app/RepositoryFlow.java#L30) endpoint.
- *Get the Repository Info* using the [`reposGet`](github-sample-app/src/main/java/github/sample/app/RepositoryFlow.java#L37) endpoint.
- *Delete the Repository* by [`reposDelete`](github-sample-app/src/main/java/github/sample/app/RepositoryFlow.java#L42) endpoint.

### Get Repository Info ([run](https://github.com/apimatic/github-java-app/actions/workflows/get-repo.yml)) ([source](github-sample-app/src/main/java/github/sample/app/GetRepository.java))

This action will get the repository info using the [`reposGet`](github-sample-app/src/main/java/github/sample/app/GetRepository.java#L21) API call using the provided repository name in the workflow inputs.

### List Contributors ([run](https://github.com/apimatic/github-java-app/actions/workflows/repo-contributor.yml)) ([source](github-sample-app/src/main/java/github/sample/app/ReposContributors.java))

This action will print the list of the contributors for a repository using the [`reposListContributors`](github-sample-app/src/main/java/github/sample/app/ReposContributors.java#L25) API.

### Get GH Actions Billing Info ([run](https://github.com/apimatic/github-java-app/actions/workflows/gh-actions-billing.yml)) ([source](github-sample-app/src/main/java/github/sample/app/GithubActionsBilling.java))

This action will get the billing info of GitHub actions usage for a user using the [`billingGetGithubActionsBillingUser`](github-sample-app/src/main/java/github/sample/app/GithubActionsBilling.java#L21) API call using the provided username in the workflow inputs.

### Get GH Packages Billing Info ([run](https://github.com/apimatic/github-java-app/actions/workflows/gh-packages-billing.yml)) ([source](github-sample-app/src/main/java/github/sample/app/GithubPackagesBilling.java))

This action will get the billing info of GitHub packages for a user using the [`billingGetGithubPackagesBillingUser`](github-sample-app/src/main/java/github/sample/app/GithubPackagesBilling.java#L21) API call using the provided username in the workflow inputs.

### Get OctoCat ([run](https://github.com/apimatic/github-java-app/actions/workflows/octocat.yml)) ([source](github-sample-app/src/main/java/github/sample/app/OctoCat.java))

Get an :octocat: using the [`metaGetOctocat`](github-sample-app/src/main/java/github/sample/app/OctoCat.java#L19) API.

## Running the Sample Application Locally

You can also manually setup this application locally after clonning it.

### Prerequisite

JDK 8 should be installed in the system.

### Getting Started
Open the bash command line at the root of this repository.

Build the GitHub Java SDK using the command:
``` bash
mvn -f "github-sdk/pom.xml" --no-transfer-progress clean install
```

Build sample application using command:
``` bash
mvn -f "github-sample-app/pom.xml" --no-transfer-progress clean install
```

### Run the sample application using the command:

Run this command with one of these values for `{MainClassName}`: `GetRepository`, `GithubActionsBilling`, `GithubPakagesBilling`, `OctoCat`, `ReposContributors`, `RepositoryFlow`. 

``` bash
cd github-sample-app && mvn exec:java --no-transfer-progress -Dexec.mainClass="github.sample.app.{MainClassName}"
```
