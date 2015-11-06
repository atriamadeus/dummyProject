###Applying Java Plugin
* Add following line in build.gradle on top.
	```apply plugin: 'java'```

Once the Java plugin is applied to the project, try listing the tasks:
*```$./gradlew tasks```

You'll notice more tasks in the list under section "build tasks", "documentation", "build setup", etc. These came just by applying the java plugin.

###Creating an Eclipse project.
To create the eclipse specific descriptor files, you can simply apply the "eclipse" plugin.

* Add following line in build.gradle.
	```apply plugin: 'eclipse'```

* Run eclipse task, this will amend or overwrite some of the existing Eclipse files.
	```$./gradlew eclipse```
To completely overwrite the exisiting Eclipse files, you can run tasks(in the given order): clean cleanEclipse eclipse

Do the same to list the tasks after applying the plugin and see what new tasks are available now.

Refer to [Eclipse plugin details](https://docs.gradle.org/current/userguide/eclipse_plugin.html) for more details.

###  Project Import
* Open eclipse.
* Open  the git repository view (Window -> Show view -> Other -> Git Repositories).
* Add the repository using "Add an existing local repository".
* Then using "import existing project", import the project. 

You'll notice the project is all set for eclipse.

### Getting dependencies
* To add external dependencies, it's required to specify from which repositories gradle is supposed to get the dependencies. You can do this we following code:
```repositories {
    mavenCentral()
}```
* Once the repository is defined, the next step is to add dependencies for compile and test.
```
dependencies {
    compile([
		  'commons-collections:commons-collections:3.2',
			'joda-time:joda-time:2.6'
		])
			
    testCompile([ 'junit:junit:4.'])
}
```
* Once the dependencies are defined, run "eclipse" task. 
```
$./gradlew eclipse
```

### Updating .gitignore file.
Once the eclipse taskis run, there are some files which are specific to eclipse are created which you don't want to push to the repository. So we'll add them to the .gitignore file.
* Go to git bash and run vi .gitignore
* add following lines:
```
.classpath
.project
.settings/
```
* Commit and push the .gitignore file

These files are updates based on your local eclipse setting and by not pushing them, you make sure that you don't mesh-up others eclipse workspace.

### Running tests.

### Build automation with CircleCi

### Configuring CircleCi build
Cutomization of build can be done through the ```circle.yml``` file. 
