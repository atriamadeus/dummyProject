
# Prerequisite

You have followed the 1st tutorial session, or you have forked this project https://github.com/pranav8494/dummyProject

# Github

A few tips to navigate in Github.

##Project history

* Click on # commits (top panel)
* You'll see the list of commits (look at commit message: *getting ready for CI*)
* You can dive in by clicking on the commit message
* Have a look at commit message *getting ready for CI* you'll see the files diff

##Issues

* Optional
  * If you forked a project, you may need to activate GitHub issues
  * Go to settings (right panel) and tick Features -> Issues
 
* Creating/assigning issues
  * Creating issues: describes a bug, an issue, helps keeping track of the clarification
  * Assigning: the responsible of the issue / helps separating the work
  * Setting the milestone: when the issue is due to be delivered
  
* Linking issues
  * Anywhere in the flow of an issue, write ```#1``` to reference the 1st issue
    * the flow can be **comments** or **commit messages**
  * You can reference issues from other projects by writing ```profile/project#issue``` (e.g. ```alexandre-salch/dummyProject#1```)

* [Closing issues via commit messages](https://help.github.com/articles/closing-issues-via-commit-messages/)
  * E.g. if the commit message contains ```fix #1```, this commit will close issue 1 in that repository once the commit is merged into the default branch.

##Assignment

1. Find Pranav's commit with message ```Fixing stupid mistakes``` :wink: , what are the files that have been changed with this commit?
2. Create an issue for adding a method computing the sum of two integers.
3. Create an issue for testing this method, linking the first issue.
  

# Git

##Local git working areas

![local git stages](https://github.com/pranav8494/dummyProject/blob/alex/images/images/git-stages-simple.png)

The local git is composed of 3 working areas:

* The working directory or workspace
  * Contains the files you modified or created
* The staging area or index
  * Contains the files that you want to push to the repository
* The local repository
  * Contains your local, finalized work, ready to be pushed to the remote repository

##Global git working areas

![global git stages](https://github.com/pranav8494/dummyProject/blob/alex/images/images/git-stages-complex.png)

This graph contains the same working areas as before plus the remote repository. It also shows the scope of the different git commands. These commands are executer from Git Bash by typing one of the following:

* ```git status```
* ```git add src/test```
* ```git commit -m "commit message"```
* ```git push```

##Working with branches

**Pros**

* Packaging the features
* Isolating working spaces

**Cons**

* You can feel like you're spending a lot of time moving things around
* Everyone should be aware and confortable with the branching model you use in the project

###Example of branching model

![branching model](https://github.com/pranav8494/dummyProject/blob/alex/images/images/git-model2x.png)

##Assignment

1. Create a branch on your own ```git checkout -b feature/sum```
  * Create a class SumUtils in the hello package with a method in this class to add two integers
    * ```public static int sum(int i, int j) {	return i + j; }```
  * Create a folder sampleProject/src/test/java
  * Go to gitbash and enter the command ```./gradlew eclipse``` so that eclipse adds the test filder to the source folders
  * Hit F5 in Eclipse to refresh the view
  * Create a test class SumUtilsTests 
    * **Source folder:** sampleProject/src/test/java
    * **Package:** hello
  * Add a method to test the sum
    * ```@Test public void test() { Assert.assertEquals(42, SumUtils.sum(20, 22)); }```
  * And commit your work with **2** commits fixing the **2** corresponding issue (```git commit -m "fix #? - your comment"```)
2. On this branch, add an question mark at the end of the "Hello World" string and commit the modification
3. Push your 3 commits to Github 
4. Create a Pull Request to merge your work on master **but don't merge it yet!**
4. On the branch master, add an exclamation mark at the end of the "Hello World" string
5. Merge your branch in master keeping the exclamation mark.

# Bonus

A few handy commands you can try out

* revert: 
  * You pushed a change that you don't want anymore, but you're not sure whether other contributers already checked your code out, you can then revert the unwanted commit and push the reverting commit.
* reset:
  * You made modifications locally that you don't want anymore, or you made a ~~tipo~~ typo in a commit message
  * You may want to read this article first: http://git-scm.com/blog
* rebase:
  * It replays the commits of your branch on top of the ones from another branch. It helps you nicely package a new feature on top of the development branch.

# References

* Git cheatsheet: http://ndpsoftware.com/git-cheatsheet.html#loc=remote_repo;
* Git - Reset Demystified: http://git-scm.com/blog
* Branching model: http://nvie.com/posts/a-successful-git-branching-model/


