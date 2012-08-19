import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "momo"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
        "commons-io" % "commons-io" % "1.3.2"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
