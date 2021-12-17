lazy val root = (project in file("."))
  .settings(
    name := "ScalaLab5"
  )
scalaVersion := "2.13.1"
scalacOptions ++= Seq("-deprecation")
libraryDependencies ++= Seq(
  "org.typelevel" %% "jawn-parser" % "1.0.0",
  "org.scalacheck" %% "scalacheck" % "1.14.2" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test
)

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
