name := "jsonapi-scala-example"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.qvantel" %% "jsonapi-scala-core" % "5.1.3",
  "io.spray" %%  "spray-json" % "1.3.3"
)

resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
