import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val liftVersion = "2.1-SNAPSHOT"

  val scalatoolsSnapshot = 
    "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"

  val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"

  val smackRepo = "m2-repository-smack" at "http://maven.reucon.com/public"

  // If you're using JRebel for Lift development, uncomment
  // this line
  override def scanDirectories = Nil

  /*override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "org.scala-tools.testing" %% "specs" % "1.6.5" % "test->default",
    "com.h2database" % "h2" % "1.2.138"
  ) ++ super.libraryDependencies*/
}
