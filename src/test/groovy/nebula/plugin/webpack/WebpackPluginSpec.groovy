/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nebula.plugin.webpack

import nebula.test.PluginProjectSpec
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import com.moowork.gradle.node.task.NpmTask

class WebpackPluginSpec extends PluginProjectSpec {

    @Override
    String getPluginName() {
      'webpack'
    }

    def 'defines two NpmTasks'() {
      when:
      Project project = ProjectBuilder.builder().build()
      project.plugins.apply WebpackPlugin

      then:
      project.tasks.installWebpack instanceof NpmTask == true
      project.tasks.webpack instanceof NpmTask == true
    }
}
