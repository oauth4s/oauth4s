import sbt._

object Dependencies {

  val scalaTestVersion  = "3.1.0"
  val scalacheckVersion = "1.14.3"
  val scalaMeterVersion = "0.19"
  val scalaMockVersion  = "3.6.0"

  // Testing
  val scalaTest  = "org.scalatest"     %% "scalatest"                   % scalaTestVersion  % Test
  val scalaCheck = "org.scalacheck"    %% "scalacheck"                  % scalacheckVersion % Test
  val scalaMeter = "com.storm-enroute" %% "scalameter"                  % scalaMeterVersion % Test
  val scalaCtic  = "org.scalactic"     %% "scalactic"                   % scalaTestVersion  % Test

  val testDependencies: Seq[ModuleID] = Seq(
    scalaTest,
    scalaCheck,
    scalaMeter,
    scalaCtic
  )

}
