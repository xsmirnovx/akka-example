ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.11.12"

libraryDependencies ++= {
  val akkaVersion = "2.4.12"
  Seq(
    "com.typesafe.akka" %% "akka-actor"                        % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core"                    % "2.4.11",
    "com.typesafe.akka" %% "akka-http-experimental"            % "2.4.11",
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
    "com.typesafe.akka" %% "akka-slf4j"                        % akkaVersion,
    "ch.qos.logback"    %  "logback-classic"                   % "1.1.3",
    "com.typesafe.akka" %% "akka-testkit"                      % akkaVersion   % "test",
    "org.scalatest"     %% "scalatest"                         % "2.2.0"       % "test"
  )
}

lazy val root = (project in file("."))
  .settings(
    name := "akka-example"
  )
