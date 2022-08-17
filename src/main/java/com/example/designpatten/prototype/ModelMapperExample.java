package com.example.designpatten.prototype;

public class ModelMapperExample {

    public static void main(String[] args) {
        GitHubRepository gitHubRepository = new GitHubRepository();
        gitHubRepository.setUser("whiteship");
        gitHubRepository.setUser("live-study");

        GithubIssue githubIssue = new GithubIssue(gitHubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    }
}
