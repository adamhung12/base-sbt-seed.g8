import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "$version$"
ThisBuild / organization     := "$organization$"

lazy val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion, organization,buildInfoBuildNumber),
    buildInfoPackage := "app",
	buildInfoObject := "BuildInfo",
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.


libraryDependencies += "me.xethh.utils" % "DateUtils" % "6.0.0.RC8"

// Logging
val log4jVersion = "2.13.3"
libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j18-impl" % s"\${log4jVersion}"
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % s"\${log4jVersion}"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % s"\${log4jVersion}"

// Assembly
mainClass in (Compile, run) := Some("app.Main")
assemblyJarName in assembly := s"\${name.key}.jar"