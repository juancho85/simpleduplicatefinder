# simpleduplicatefinder
Java command line program to find duplicate siren numbers in a text file.

## How to compile and run the program
Prerequisite: Having java jdk 8 installed

Open a shell in the folder containing DuplicateFinder and compile the program :

```
javac DuplicateFinder.java

```
Run the program. exampleFile.txt is the path to the file containing the siren numbers

```
java DuplicateFinder exampleFile.txt

```

## Prerequisites
### Java 8 installation

```
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update 
sudo apt-get install openjdk-8-jdk
```

Check that the installation was correct by typing "java -version" or alternatively "java --version"

You should get something similar to this

```
openjdk version "1.8.0_45-internal"
OpenJDK Runtime Environment (build 1.8.0_45-internal-b14)
OpenJDK Server VM (build 25.45-b02, mixed mode)
```

### Setting JAVA_HOME
Define the JAVA_HOME environment variable and make it point to the jdk installation folder.
Check that the value was correctly set
```
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-i386/
echo $JAVA_HOME
/usr/lib/jvm/java-8-openjdk-i386
```