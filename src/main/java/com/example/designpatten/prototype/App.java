package com.example.designpatten.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GitHubRepository gitHubRepository = new GitHubRepository();
        gitHubRepository.setUser("usa_dev");
        gitHubRepository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(gitHubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바 코드는 어떻게 실행하는 건가?");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
    }
}
