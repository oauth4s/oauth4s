lazy val commonSettings = Seq(
  organization := "io.oauth4s",
  scalaVersion := "2.13.1",
  scalacOptions ++= List("-unchecked", "-deprecation", "-encoding", "UTF8", "-feature"),
  resolvers ++= Seq(
    Resolver.mavenLocal,
    Resolver.mavenCentral,
    Resolver.typesafeRepo("releases")
  ),
  libraryDependencies ++= Dependencies.testDependencies
)

def oauth4sModule(name: String): Project = Project(id = name, base = file(name))
    .settings(commonSettings)

lazy val root = Project(id = "oauth4s", base = file("."))
  .settings(commonSettings).aggregate(core)

lazy val core = oauth4sModule("oauth4s-core")
