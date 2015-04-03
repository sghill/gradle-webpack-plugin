gradle-webpack-plugin
==============

Defines some tasks for installing and running [webpack](http://webpack.github.io/) from Gradle.

## Usage

### Applying the Plugin

To include, add the following to your build.gradle

    buildscript {
      repositories { jcenter() }

      dependencies {
        classpath 'com.netflix.nebula:webpack:1.12.+'
      }
    }

    apply plugin: 'webpack'

### Tasks Provided

```
installWebpack
webpack
```
