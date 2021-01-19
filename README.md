# typescript-vue-app [WiP]
Demo app using Vue.js with Typescript. No specific purpose yet, just an exercise/PoC so far.

Maybe adding a demo micro-service, see *Kotlin* below

## Notes 
### Development with Vue
Check out and install with ```npm install```.

Start project with ```npm run serve```.


### Getting started with Vue and Typescript
Good tutorials on getting started with Vue and Typescript
- https://bezkoder.com/vue-typescript-crud/

(But... do you really _need_ Typescript for your specific project? Is it likely to become as complex as Google Maps or Docs, go ahead use it. Are you going for a plain shop frontend, think about development and onboarding speed that come as benefits of lower complexity.)

### Getting started with Kotlin
See official documentation for [Getting Started with Command Line](https://kotlinlang.org/docs/tutorials/command-line.html).

For MacOS:
```shell
$ brew update
$ brew install kotlin
```
Write a simple HelloWorld called ```hello.kt```, 
then compile
```shell
$ kotlinc hello.kt -include-runtime -d hello.jar
```
and run
```shell
$ java -jar hello.jar
```
See [documentation](https://kotlinlang.org/docs) for more.