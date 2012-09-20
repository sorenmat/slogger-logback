name := "Slogger-logback"

version := "1.0"

resolvers += "sgodbillon" at "https://bitbucket.org/sgodbillon/repository/raw/master/snapshots/"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases",
                    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
                    "TypeSafe" at "http://repo.typesafe.com/typesafe/releases/")
                    
libraryDependencies += "org.mongodb" % "casbah_2.9.2" % "2.4.1"

seq(webSettings: _*)


// when using the sbt web app plugin 0.2.4+, use "container" instead of "jetty" for the context
// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "com.google.protobuf" % "protobuf-java" % "2.3.0",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" % "container",
  "org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test", // For specs.org tests
  "junit" % "junit" % "4.8" % "test->default", // For JUnit 4 testing
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138", // In-process database, useful for development systems
  "ch.qos.logback" % "logback-classic" % "0.9.26", // Logging
  "com.basho.riak" % "riak-client" % "1.0.5",
   "com.typesafe" % "config" % "0.5.0",
   "com.typesafe.akka" % "akka-actor" % "2.0",
   "com.typesafe.akka" % "akka-remote" % "2.0",
   "com.typesafe.akka" % "akka-kernel" % "2.0")

// by default, it listens on port 8080; use the following to override
port in container.Configuration := 8081
